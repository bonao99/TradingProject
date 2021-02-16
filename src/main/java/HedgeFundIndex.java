
import model.Stock;
import services.StockService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tony
 */
public class HedgeFundIndex {
    public static void main(String[] args) {
        
        
        
        StockService stockServ = new StockService();
        Stock tesla = stockServ.getStockBySymbol("TSLA");
        
        System.out.println("Stock = " + tesla.getCompanyName());
        
        stockServ.changeStockPrice("AAPL", 132.18d);
        
        Stock apple = stockServ.getStockBySymbol("AAPL");
        
         System.out.println("Apple new price = " + apple.getPrice());
        
        
        
      
      
        
        
        
    }
    
}
