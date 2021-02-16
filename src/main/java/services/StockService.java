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
                    return currentStock;
            }
            return null;
 
    }

    
    public void changeStockPrice(String stockSymbol, Double price)
    {

            for(Stock currentStock : availableStockList)
            {

                     if( currentStock.getSymbol().equals(stockSymbol))
                         currentStock.setPrice(price);

            }
 
    }
    
    public Double setStockpricebySymbol(String stockSymbol, Double price)
    {
            for(Stock currentStock : availableStockList)
            {
                if(currentStock.getSymbol().equals(stockSymbol))
                    currentStock.setPrice(price);

            }
            return null;

    }
    
    public void addStock()
    {
        
    }
}
    