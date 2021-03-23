package com.rjo.vendor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rjo.vendor.entities.Vendor;
import com.rjo.vendor.service.VendorService;

@Controller
public class VendorController {

	@Autowired
	VendorService service;
	
	@RequestMapping("/showCreateVendor")
	public String showCreate() {
		return "createVendor";
	}
	
	@RequestMapping("/saveVendor")
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		Vendor vendorSaved = service.saveVendor(vendor);
		String msg = "Vendor Saved with Id: " + vendorSaved.getId();
		modelMap.addAttribute("msg", msg);		
		return "createVendor";
	}
	
	@RequestMapping("/displayVendors")
	public String displayVendors(ModelMap modelMap) {
		System.out.println("entrou no /displayVendors...");
		List<Vendor> allVendors = service.getAllVendors();
		System.out.println("Saiu do metodo getAllVendors()");
		modelMap.addAttribute("vendors", allVendors);
		return "displayVendors";
	}
	
	@RequestMapping("/deleteVendor")
	public String deleteVendor(@RequestParam("id") int id, ModelMap modelMap) {
		System.out.println("deleteVendor id = " + id);		
		//Vendor vendor = service.getVendorById(id);
		Vendor vendor = new Vendor();
		vendor.setId(id);
		service.deleteVendor(vendor);
		List<Vendor> allVendors = service.getAllVendors();
		modelMap.addAttribute("vendors", allVendors);		
		return "displayVendors";
	}

	@RequestMapping("/showUpdateVendor")
	public String showUpdateVendor(@RequestParam("id") int id, ModelMap modelMap) {
		Vendor vendor = service.getVendorById(id);
		modelMap.addAttribute("vendor", vendor);
		return "updateVendor";
	}
	
	@RequestMapping("/updateVendor")
	public String updateVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap ) {
		System.out.println("entrou no updateVendor...");
		service.updateVendor(vendor);
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}

	
}
