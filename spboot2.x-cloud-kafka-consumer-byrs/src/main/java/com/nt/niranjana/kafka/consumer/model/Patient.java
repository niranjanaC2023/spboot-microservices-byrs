package com.nt.niranjana.kafka.consumer.model;

import lombok.Data;

@Data
public class Patient 
{
	private int pid;  
	private String name;  
	private String gender;   
	private String mobile;  
	private int age;

}
