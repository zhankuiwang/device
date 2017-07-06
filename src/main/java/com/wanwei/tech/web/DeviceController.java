package com.wanwei.tech.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wanwei.tech.domain.Device;
import com.wanwei.tech.service.DeviceService;

@Controller
@RequestMapping("/device")
public class DeviceController {
	
	@Autowired
	private DeviceService deviceService;
	
	@RequestMapping("/createOneDevice")
	@ResponseBody
	public Device createOneDevice(){
		Device device = deviceService.createOneDevice();
		return device;
		
	}

}
