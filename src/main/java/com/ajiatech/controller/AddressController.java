package com.ajiatech.controller;

import java.util.Date;
import java.util.List;

import com.ajiatech.pojo.AjiaShipping;
import com.ajiatech.service.AjiaShippingService;
import com.ajiatech.service.impl.AjiaShippingServiceImpl;

@Controller
@RequestMapping("/addr")
public class AddressController {
	AjiaShippingService shippingService = new AjiaShippingServiceImpl();

	@RequestMapping("/addressAdmin")
	public String addressAdmin(Model model)
	{
		Long userId = 14L;
		List<AjiaShipping> shippings = shippingService.findByUserId(userId);
		model.addAttribut("shippings",shippings);
		return "addressAdmin";
	}
	
	@RequestMapping("/saveAddress")
	public String saveAddress(AjiaShipping shipping)
	{
		shipping.setCreated(new Date());
		shipping.setUpdated(new Date());
		shipping.setIsDefault(false);
		shipping.setStatus((byte)1);
		shipping.setUserId(14L);
		shippingService.save(shipping);
		return "redirect:/addr/addressAdmin.html";
	}
	
	@RequestMapping("delete")
	public String delete(Long addId)
	{
		shippingService.delete(addId);
		return "redirect:/addr/addressAdmin.html";
	}
	
	
	public AjiaResult
}
