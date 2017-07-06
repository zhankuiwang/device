package com.wanwei.tech.domain;

public class Device {
	
	private String name;
	private Integer age;
	
	
	public Device() {
		super();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Device [name=" + name + ", age=" + age + "]";
	}
	
	

}
