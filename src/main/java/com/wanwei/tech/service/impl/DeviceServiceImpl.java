package com.wanwei.tech.service.impl;

import org.springframework.stereotype.Service;

import com.wanwei.tech.domain.Device;
import com.wanwei.tech.service.DeviceService;

@Service
public class DeviceServiceImpl implements DeviceService {

	@Override
	public Device createOneDevice() {
		Device device = new Device();
		device.setName("device-001");
		device.setAge(100);
		return device;
	}

}
