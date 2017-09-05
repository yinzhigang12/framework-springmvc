package com.ajiatech.service;

import java.util.List;

import com.ajiatech.pojo.AjiaShipping;

public interface AjiaShippingService {
	public void save(AjiaShipping shipping);
	public List<AjiaShipping> findByUserId(Long userId);
	public void delete(Long addId);
	public void updateDefault(Long addId);
}
