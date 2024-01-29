package com.collegeapplication;

public class university {
	private college clg;

	public university(college clg) {
		
		this.clg = clg;
	}
	public String pass()
	{
		return clg.info();
		
	}

}
