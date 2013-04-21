package com.divcloud.carshome.controller.web;

import com.divcloud.carshome.entity.BrandEntity;
import com.divcloud.carshome.service.BrandManageService;
import com.divcloud.carshome.service.CountryTypeService;
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
@RequestMapping({ "/brand" })
public class BrandManageController {

	@Autowired
	private CountryTypeService countryTypeService;

	@Autowired
	private BrandManageService brandManageService;
	public SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmsss");
	public String currentPath = null;
	public String commonFolder = "commonfiles/";

	@RequestMapping(value = { "/addform" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String renderToAddBand(Map<String, Object> map) {
		map.put("countryTypeList", this.countryTypeService.listCountryType());
		map.put("brand", new BrandEntity());
		return "carshome/addbrand";
	}

	@RequestMapping(value = { "/add" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	public String addContact(@ModelAttribute("brand") BrandEntity brand,
			@RequestParam("file") MultipartFile file, HttpServletRequest request) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmsss");
		this.currentPath = request.getRealPath("/");
		String usualPath = this.currentPath + "/" + this.commonFolder;

		System.out.print("\n" + request.getParameter("brandDescription")
				+ "ttttt");

		if (!file.isEmpty()) {
			StringBuffer fileRealName = new StringBuffer();
			fileRealName.append(sdf.format(new Date()));
			fileRealName.append(file.getOriginalFilename());
			try {
				byte[] bytes = file.getBytes();
				FileOutputStream fos = new FileOutputStream(usualPath
						+ fileRealName.toString());
				fos.write(bytes);
				brand.setBrandIconPath(fileRealName.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		brand.setCreateTime(new Date());
		this.brandManageService.addBrand(brand);
		return "carshome/commonsuccess";
	}

	@RequestMapping(value = { "/list" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String listBrand(Map<String, Object> map) {
		map.put("brandList", this.brandManageService.getAllBrandList());
		return "carshome/brandlist";
	}
}
