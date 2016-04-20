package com.test.SimpleStocks;

import java.math.BigDecimal;

import java.util.ArrayList;



/*It has been assumed that the Ticker Value of a stock is Last Dividend + Par Value*/
public class InitStock {
	static Stock TEA,POP,ALE,GIN,JOE;
	
	public ArrayList<Stock> initializeStock()
	{
		 TEA=new Stock.Builder().stockSymbol("TEA").stockType("Common").
				lastDividend(0).fixedDividend(0).parValue(new BigDecimal(100.00)).
				tickerValue(new BigDecimal(100.00)).build();
		
		 POP=new Stock.Builder().stockSymbol("POP").stockType("Common").
				lastDividend(8).fixedDividend(0).parValue(new BigDecimal(100.00)).
				tickerValue(new BigDecimal(108.00)).build();
		
		 ALE=new Stock.Builder().stockSymbol("ALE").stockType("Common").
				lastDividend(23).fixedDividend(0).parValue(new BigDecimal(60.00)).
				tickerValue(new BigDecimal(83.00)).build();
		
		 GIN=new Stock.Builder().stockSymbol("GIN").stockType("Preferred").
				lastDividend(8).fixedDividend(2).parValue(new BigDecimal(100.00)).
				tickerValue(new BigDecimal(108.00)).build();
		
		 JOE=new Stock.Builder().stockSymbol("JOE").stockType("Common").
				lastDividend(13).fixedDividend(0).parValue(new BigDecimal(250.00)).
				tickerValue(new BigDecimal(263.00)).build();
		

		ArrayList<Stock> stockArrayList=new ArrayList<>(5);
		stockArrayList.add(TEA);
		stockArrayList.add(POP);
		stockArrayList.add(ALE);
		stockArrayList.add(GIN);
		stockArrayList.add(JOE);
	
		return stockArrayList;
		
		}
	
	public void showStock()
	{
		System.out.println("This is the complete list of Stock with their information:");
		System.out.println(initializeStock());
		System.out.println("\n");
	}

}
