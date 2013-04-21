package com.divcloud.carshome.controller.web;

import com.divcloud.carshome.entity.BrandModelEntity;
import com.divcloud.carshome.service.BrandManageService;
import com.divcloud.carshome.service.BrandModelManageService;
import java.util.Date;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/model" })
public class ModelManageController {

	@Autowired
	private BrandManageService brandManageService;

	@Autowired
	private BrandModelManageService brandModelManagerService;

	@RequestMapping(value = { "/addform" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String renderToAddBand(Map<String, Object> map) {
		map.put("brandList", this.brandManageService.getAllBrandList());
		map.put("model", new BrandModelEntity());
		return "carshome/addmodel";
	}

	@RequestMapping(value = { "/add" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	public String addContact(@ModelAttribute("model") BrandModelEntity model) {
		model.setCreateTime(new Date());
		this.brandModelManagerService.addModel(model);
		return "redirect:/model/list";
	}

	@RequestMapping(value = { "/list" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String listBrand(Map<String, Object> map) {
		map.put("modelList",
				this.brandModelManagerService.getAllBrandModelList());
		return "carshome/modellist";
	}
}
