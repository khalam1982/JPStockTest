package com.test.SimpleStocks;


import java.time.LocalDateTime;

public class Trade {
	LocalDateTime timeOfTrade;
	private Integer quantityOfStock;
	private Boolean indicator; //Buying if true and selling if false
	private Stock stock;
	private String stringIndicator;
	
	public LocalDateTime getTimeOfTrade() 
	{
		return timeOfTrade;
	}
	
	public Integer getQuantityOfStock() 
	{
		return quantityOfStock;
	}
	
	public Stock getStock() 
	{
		return stock;
	}
	
	public Boolean getIndicator()
	{
		return indicator;
	}
	
	public Trade(Stock stock, Integer quantityofStock, Boolean indicator,LocalDateTime timeOfTrade ) 
	{
		this.stock=stock;
		this.quantityOfStock=quantityofStock;
		this.indicator=indicator;
		this.timeOfTrade=timeOfTrade;
		
	}
	
	public String indicator()
	{
		if (indicator==true)
			stringIndicator="Buy";
		else
			stringIndicator="Sell";
		return stringIndicator;
	}
	
	public String toString()
	{
		return "{ Stock = "+stock+" , quantityofStock= "+quantityOfStock+", indicator= "+indicator()+
			", timeOfTrade= "+timeOfTrade+" }";
	}
	

}
