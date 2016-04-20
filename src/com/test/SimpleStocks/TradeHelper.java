package com.test.SimpleStocks;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TradeHelper {
	static Trade T1,T2,T3,T4,T5,T6,T7,T8,T9,T10;
	static ArrayList<Trade> tradeArrayList=new ArrayList<>();

	
	
	InitStock inStock=new InitStock();
	Stock stockTEA =(Stock) inStock.initializeStock().get(0);
	Stock stockPOP =(Stock) inStock.initializeStock().get(1);
	Stock stockALE =(Stock) inStock.initializeStock().get(2);
	Stock stockGIN =(Stock) inStock.initializeStock().get(3);
	Stock stockJOE =(Stock) inStock.initializeStock().get(4);

	private static  LocalDateTime now=LocalDateTime.now();
	
	LocalDateTime tradeTime1 = now.minusMinutes(2);
	LocalDateTime tradeTime2 = now.minusMinutes(5);
	LocalDateTime tradeTime3 = now.minusMinutes(7);
	LocalDateTime tradeTime4 = now.minusMinutes(14);
	LocalDateTime tradeTime5 = now.minusMinutes(45);
	
	
	public void recordTrade()
	{
	 T1=new Trade(stockTEA,100,true,tradeTime1);
	 T2=new Trade(stockPOP,500,true,tradeTime2);
	 T3=new Trade(stockALE,200,true,tradeTime3);
	 T4=new Trade(stockGIN,500,true,tradeTime4);
	 T5=new Trade(stockJOE,250,true,tradeTime5);
	 T6=new Trade(stockTEA,80,false,tradeTime1);
	 T7=new Trade(stockPOP,100,false,tradeTime4);
	 T8=new Trade(stockALE,10,false,tradeTime2);
	 T9=new Trade(stockGIN,50,false,tradeTime3);
	 T10=new Trade(stockJOE,50,false,tradeTime5);
	
	}
public void viewRecordedTrade()
{
	System.out.println("Following is a sequence of trades that have been recorded based on arbitrary data:");
System.out.println(T1);
	System.out.println(T2);
	System.out.println(T3);
	System.out.println(T4);
	System.out.println(T5);
	System.out.println(T6);
	System.out.println(T7);
	System.out.println(T8);
	System.out.println(T9);
	System.out.println(T10);

}

	public static ArrayList<Trade> addTradesToArrayList()
	{
		
		tradeArrayList.add(T1);
		tradeArrayList.add(T2);
		tradeArrayList.add(T3);
		tradeArrayList.add(T4);
		tradeArrayList.add(T5);
		tradeArrayList.add(T6);
		tradeArrayList.add(T7);
		tradeArrayList.add(T8);
		tradeArrayList.add(T9);
		tradeArrayList.add(T10);
		return tradeArrayList;
		
	}
	

}
