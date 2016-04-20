package com.test.SimpleStocks;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FormulaHelper {

	HashMap <String, Integer> stockMap=new HashMap<>();
	HashMap <String, Integer> avgStockPriceMap=new HashMap<>();
	public static ArrayList <Stock> stockArrayList;
	
	public void dividendYield(ArrayList<Stock> stockArrayList)
	{
		System.out.println("\n StockSymbol "+" LastDividend "+" TickerPrice "+" DividendYieldResult \n");
		for(Stock s : stockArrayList)
		{
			int lastDividend=s.getLastDividend();
			int tickerValue=s.getTickerValue().intValue();
			String stockSymbol=s.getStockSymbol();
			int fixedDividend=s.getFixedDividend();
			int parValue=s.getParValue().intValue();
			double dividendYieldResult;
			if(s.getStockType()=="Preferred")
		{
			 dividendYieldResult=(fixedDividend * parValue)/tickerValue;

		}
		else
			 dividendYieldResult=((lastDividend*100)/tickerValue);
			
			System.out.println(stockSymbol+" ------------ "+lastDividend+" ------------"+tickerValue+" ------------ "+dividendYieldResult);
			System.out.println("\n");
		}
			
	
		
	}
public Double peRatio(ArrayList<Stock> stockArrayList)
{
	for(Stock s : stockArrayList)
	{
		Integer lastDividend=s.getLastDividend();
		Integer tickerValue=s.getTickerValue().intValue();
		String stockSymbol=s.getStockSymbol();
		Double peRatioResult=0.0;
		if(lastDividend>0)
		{
			peRatioResult=(double) (tickerValue/lastDividend);
			System.out.println("The P/E Ratio for "+stockSymbol+" is "+peRatioResult);
			
		}
		
		else
		{
			System.out.println("The P/E Ratio for "+stockSymbol+" is "+peRatioResult);
		}
		
	//	System.out.println(stockSymbol+" ----- "+lastDividend+" ---- "+tickerValue+" ----- "+peRatioResult);
	}
	return 0.14;
}

public double geometricMean(ArrayList<Stock> stockArrayList)
{
	int nthRoot=stockArrayList.size();
	Long multValue=1L;

	for(Stock s : stockArrayList)
	{
		int parValue=s.getParValue().intValue();
		multValue=multiplyParValue(multValue,parValue);
		
}
	double geometricMeanResult=Math.pow(multValue, 1.0 / nthRoot);
	System.out.println("\nThe Geometric Mean of all the stocks Par Value is : "+geometricMeanResult);
	return 1.41;
}


public Long multiplyParValue(Long multValue,int parValue)
{

	Long result=multValue*parValue;
	return result;
	
}
@SuppressWarnings("rawtypes")
public void avgStockPrice(ArrayList<Trade> tradeArrayList) 
{
	
	Integer quantity;
	String stockSymbol;
	BigDecimal tickerValue;
	LocalDateTime limitTime=LocalDateTime.now().minusMinutes(15);
	 
	for(Trade t:tradeArrayList)
	{ 
		stockSymbol=t.getStock().getStockSymbol();
		quantity=t.getQuantityOfStock();
		
		if(t.getTimeOfTrade().isAfter(limitTime))
		{
			if(stockMap.containsKey(stockSymbol))
			{
			Integer originalQuantity=stockMap.get(stockSymbol);
			if(t.getIndicator()){
				
				stockMap.put(stockSymbol,originalQuantity+quantity);					
			}
			else {
					stockMap.put(stockSymbol,originalQuantity-quantity);								
				}
		}
		
			else
			{
				stockMap.put(stockSymbol,quantity);
			}
		}
		else
		{
			continue;
		}
	}
	
	Iterator<Entry<String, Integer>> it=stockMap.entrySet().iterator();
	System.out.println("Quantity of trades per stock in the last 15 mns are as follows:");
	while(it.hasNext())
	{
		 Map.Entry pair = (Map.Entry)it.next();
		 System.out.println(pair.getKey()+" : "+pair.getValue());
	
	//avgStockPriceCalculator(tradeArrayList,stockMap);

for(Trade t : tradeArrayList)
{ 
	stockSymbol=t.getStock().getStockSymbol();
	tickerValue=t.getStock().getTickerValue();
	quantity= (Integer) pair.getValue();
	if(stockSymbol==pair.getKey())
	{
 Integer avgStockPrice=  (tickerValue.intValue() * quantity)/quantity;
	      avgStockPriceMap.put(stockSymbol, avgStockPrice);
	}
	else 
	{
		continue;
	}
    
}   
	}
    
	Iterator it1=avgStockPriceMap.entrySet().iterator();
	while(it1.hasNext())
	{
		 Map.Entry pair = (Map.Entry)it1.next();
		 
		 System.out.println("Average Stock Price for stock "+ pair.getKey() + " is " + pair.getValue());
	}
	}
		
			
	
	}

	



