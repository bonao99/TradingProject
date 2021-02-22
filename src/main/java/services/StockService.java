/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import model.Stock;

/**
 *
 * @author Tony
 */
public class StockService {
    
   private  List<Stock> availableStockList = new ArrayList<Stock>();
    
    public StockService()
    {
      Stock teslaStock = new Stock();
      teslaStock.setCompanyName("Tesla");
      teslaStock.setSymbol("TSLA");
      teslaStock.setPrice(0d);
        
      Stock appleStock = new Stock();
      appleStock.setCompanyName("Apple");
      appleStock.setSymbol("AAPL");
      appleStock.setPrice(0d);
        
      
      Stock amazonStock = new Stock();
      amazonStock.setCompanyName("Amazon");
      amazonStock.setSymbol("AMZN");
      amazonStock.setPrice(0d);
        
      
      Stock snowStock = new Stock();
      snowStock.setCompanyName("SnowFlakes");
      snowStock.setSymbol("SNOW");
      snowStock.setPrice(0d);
        
      Stock NvidiaStock = new Stock();
      NvidiaStock.setCompanyName("Nvidia");
      NvidiaStock.setSymbol("NVDA");
      NvidiaStock.setPrice(0d);
        
      availableStockList.add(teslaStock);
      availableStockList.add(amazonStock);
      availableStockList.add(snowStock);
      availableStockList.add(NvidiaStock);
      availableStockList.add(appleStock);

    }
    
    public Stock getStockBySymbol(String id)
    {
            for(Stock currentStock : availableStockList)
            {

                if (currentStock.getSymbol().equals(id))
                    return currentStock; // return here finish method and return value
            }
            
            return null;
 
    }

    
    public void changeStockPrice(String stockSymbol, Double price)
    {

            for(Stock currentStock : availableStockList)
            {

                     if( currentStock.getSymbol().equals(stockSymbol))
                     {
                         currentStock.setPrice(price);
                         break; // break here finish for loop and continue execution after for loop
                     }

            }
 
    }
    
    public void setStockpricebySymbol(String stockSymbol, Double price)
    {
            for(Stock currentStock : availableStockList)
            {
                if(currentStock.getSymbol().equals(stockSymbol))
                {
                    currentStock.setPrice(price);
                    break;
                }

            }
            

    }
    
    public void addStock(String companyName , String stockSymbol)
    {
        Stock newStocktoadd = new Stock();
        newStocktoadd.setCompanyName(companyName);
        newStocktoadd.setSymbol(stockSymbol);
        newStocktoadd.setPrice(0d);
        
        availableStockList.add(newStocktoadd);
        
        
    }
    
    public void removeStockbySymbol(String stockSymbol)
    {
        
            for(Stock currentStock : availableStockList)
            {
                if(currentStock.getSymbol().equals(stockSymbol))
                {
                    availableStockList.remove(currentStock);
                    break;
                }
            }
    }
    
    
    
    
}
    