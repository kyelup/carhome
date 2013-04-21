package com.divcloud.carshome.controller.web;

import com.divcloud.carshome.service.BrandManageService;
import com.divcloud.carshome.service.BrandModelManageService;
import com.divcloud.carshome.service.CountryTypeService;
import com.divcloud.carshome.service.ModelCarManageService;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/select" })
public class SelectByFilterController {

	@Autowired
	private BrandManageService brandManageService;

	@Autowired
	private CountryTypeService countryTypeService;

	@Autowired
	private BrandModelManageService brandModelManagerService;

	@Autowired
	private ModelCarManageService modelCarService;

	@RequestMapping(value = { "/countrylist" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String renderToCountryList(Map<String, Object> map) {
		map.put("countryTypeList", this.countryTypeService.listCountryType());
		return "carshome/countrylist";
	}

	@RequestMapping(value = { "/brandlist/{countryId}" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String renderToBrandList(@PathVariable int countryId,
			Map<String, Object> map) {
		System.out.print("\n---------------------------" + countryId);
		map.put("brandList",
				this.brandManageService.getBrandListByCountryId(countryId));
		return "carshome/brandlist";
	}

	@RequestMapping(value = { "/modellist/{brandId}" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String renderToModelList(@PathVariable int brandId,
			Map<String, Object> map) {
		System.out.print("\n---------------------------" + brandId);
		map.put("modelList",
				this.brandModelManagerService.getModelListByBrandId(brandId));
		return "carshome/modellist";
	}

	@RequestMapping(value = { "/carlist/{modelId}" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String renderToCarList(@PathVariable int modelId,
			Map<String, Object> map) {
		System.out.print("\n---------------------------" + modelId);
		map.put("modelCarList",
				this.modelCarService.listModelCarByModelId(modelId));
		return "carshome/modelcarlist";
	}
}
