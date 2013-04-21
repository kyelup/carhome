package com.divcloud.carshome.controller.web;

import com.divcloud.carshome.entity.ModelCarEntity;
import com.divcloud.carshome.service.BrandModelManageService;
import com.divcloud.carshome.service.ModelCarManageService;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping({ "/car" })
public class ModelCarManageController {

	@Autowired
	private BrandModelManageService brandModelManagerService;

	@Autowired
	private ModelCarManageService modelCarService;
	public SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmsss");
	public String currentPath = null;
	public String commonFolder = "commonfiles/car/";

	@RequestMapping(value = { "/addform" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String renderToModelCar(Map<String, Object> map) {
		map.put("modelList",
				this.brandModelManagerService.getAllBrandModelList());
		map.put("modelCarEntity", new ModelCarEntity());
		return "carshome/addcar";
	}

	@RequestMapping(value = { "/add" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	public String addContact(
			@ModelAttribute("modelCarEntity") ModelCarEntity modelCarEntity,
			@RequestParam("file") MultipartFile file, HttpServletRequest request) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmsss");
		this.currentPath = request.getRealPath("/");
		String usualPath = this.currentPath + "/" + this.commonFolder;

		if (!file.isEmpty()) {
			StringBuffer fileRealName = new StringBuffer();
			fileRealName.append(sdf.format(new Date()));
			fileRealName.append(file.getOriginalFilename());
			try {
				byte[] bytes = file.getBytes();
				FileOutputStream fos = new FileOutputStream(usualPath
						+ fileRealName.toString());
				fos.write(bytes);
				modelCarEntity.setCarIconPath(fileRealName.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		modelCarEntity.setCreateTime(new Date());
		this.modelCarService.addModelCar(modelCarEntity);

		return "carshome/commonsuccess";
	}

	@RequestMapping(value = { "/list" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String listModelCar(Map<String, Object> map) {
		map.put("modelCarList", this.modelCarService.listModelCarList());
		return "carshome/modelcarlist";
	}
}
