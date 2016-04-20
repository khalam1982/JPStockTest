package com.test.SimpleStocks;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GBCExchange {
	
	
public static ArrayList<Stock> stockArrayList;
public static ArrayList<Trade> tradeArrayList;
	public static void main(String [] args) 
	{
/********************Initialise Stock OBJECT as specified in the stock test document******************************************************************************/
		System.out.println("\n********************** Initialising Stock Object with 5 stock Information as specified in the test doc *****************************\n");
		InitStock initStock=new InitStock();
		stockArrayList=initStock.initializeStock();
		initStock.showStock();
		

		
		
/*************************Initialise Trade object with 10 arbitrary transactions ***********************************************************************************/
		System.out.println("\n************************************* Initialising Trade Object with arbitrary 10 transactions***************************************\n");
		TradeHelper TH=new TradeHelper();
		TH.recordTrade();
		TH.viewRecordedTrade();
		tradeArrayList=TH.addTradesToArrayList();
	
		
		
/**************************Adding a new Trade to the existing Trade List *******************************************************************************************/
		System.out.println("\n********************** Trade Object with arbitrary 10 arbitrary and 1 new transaction ***********************************************\n");
		Trade TNew=new Trade(InitStock.ALE,300,true,LocalDateTime.now());
		tradeArrayList.add(TNew);
		for(int i=0;i<tradeArrayList.size();i++){
			System.out.println(tradeArrayList.get(i));
			System.out.println("\n");
		}

		
/*************************Calculating Dividend Yield on the above Stock and Transaction Data *********************************************************************/	
		FormulaHelper formulaHelper=new FormulaHelper();
		System.out.println("\n \n \n ************************** Calculating Dividend Yeild ********************************************************************** \n");
		formulaHelper.dividendYield(stockArrayList);

		
		
/*************************Calculating PE Ratio on the above Stock and Transaction Data *****************************************************************************/
		System.out.println("\n \n \n *********************** Calculating P/E Ratio Yeild ************************************************************************** \n");
		formulaHelper.peRatio(stockArrayList);

		
/*************************Calculating Geometric Mean for the above Stock and Transaction Data ************************************************************************/
		System.out.println("\n \n \n ********************** Calculating Geometric Mean ***************************************************************************** \n");
		formulaHelper.geometricMean(stockArrayList);

		
/*************************Calculating Average Stock Price on the above Stock and Transaction Data *********************************************************************/
		System.out.println("\n \n \n ************************ Calculating Average Stock Price *********************************************************************** \n");
		formulaHelper.avgStockPrice(tradeArrayList);
		
		
	
		

		
		
		
	
		
	}
	
	
	}
	


