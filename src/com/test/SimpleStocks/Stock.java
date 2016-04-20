package com.test.SimpleStocks;

import java.math.BigDecimal;

class Stock {
	private final String stockSymbol;
	private final String stockType;
	private final Integer lastDividend;
	private final Integer fixedDividend;
	private final BigDecimal parValue;
	
	public String getStockSymbol() {
		return stockSymbol;
	}
	public String getStockType() {
		return stockType;
	}
	public Integer getLastDividend() {
		return lastDividend;
	}
	public Integer getFixedDividend() {
		return fixedDividend;
	}
	public BigDecimal getParValue() {
		return parValue;
	}
	public BigDecimal getTickerValue() {
		return tickerValue;
	}

	

/*Ticker Value is assumed to be sum of last dividend and par value of each stock*/
	private final BigDecimal tickerValue; 
	
		public static class Builder
	{
		private  String stockSymbol;
		private  String stockType;
		private  Integer lastDividend;
		private  Integer fixedDividend;
		private  BigDecimal parValue;
		private  BigDecimal tickerValue;
		
		public Builder stockSymbol(String stockSymbol)	{
			this.stockSymbol=stockSymbol;
			return this;
		}
		public Builder stockType(String stockType)	{
			this.stockType=stockType;
			return this;
		}
		public Builder lastDividend(int lastDividend)	{
			this.lastDividend=lastDividend;
			return this;
		}
		public Builder fixedDividend(int fixedDividend){
			this.fixedDividend=fixedDividend;
			return this;
		}
		public Builder parValue(BigDecimal parValue){
			this.parValue=parValue;
			return this;
		}
		public Builder tickerValue(BigDecimal tickerValue){
			this.tickerValue=tickerValue;
			return this;
		}
		public Stock build()
		{
			return new Stock(this);
		}
	}
	
	private Stock(Builder builder)
	{
		this.stockSymbol=builder.stockSymbol;
		this.stockType=builder.stockType;
		this.lastDividend=builder.lastDividend;
		this.fixedDividend=builder.fixedDividend;
		this.parValue=builder.parValue;
		this.tickerValue=builder.tickerValue;
	}
	public String toString(){
		return "{" + " stockSymbol= " +stockSymbol+", stockType= "+stockType+", lastDividend= "+lastDividend+
				", fixedDividend= "+fixedDividend+", parValue= "+parValue+", tickerValue= "+tickerValue+" }";
	}

}
