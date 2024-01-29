package com.settermethod;

public class amazon {
	private payment pay;

	public void setPay(payment pay) {
		this.pay = pay;
	}
	public String dopayment()
	{
		return pay.paybill();
		
	}

}
