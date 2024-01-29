package com.springprogram;

public class amazon {
	private product pd;
	
	public amazon(product pd) {
		
		this.pd = pd;
	}

	public String pass()
	{
		return pd.items();
	}

}
