package us.adarsh_agrahara;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {
      private final Map<String, StockItem> list;
      
      
      
      public StockList() {
            this.list = new HashMap<>();
      }
      
      public int addStockItem(StockItem item){
            if(item != null){
                  StockItem instock = list.getOrDefault(item.getName(), item);
                  //check if it is already in the Map
                  if(instock != item){
                        item.adjustStock(instock.quantityInStock());
                  }
                  list.put(item.getName(),item);
                  return item.quantityInStock();
            }
            return 0;
      }
      
      public int sellStock(String item, int quantity){
            StockItem instock = list.getOrDefault(item,null);
            if((instock != null) && (instock.quantityInStock() >= quantity) && (quantity >0)){
                  instock.adjustStock(-quantity);
                  return quantity;
            }
            return 0;
      }
      
      public StockItem get(String key){
            return list.get(key);
      }
      
      public Map<String,StockItem> Items(){
            return Collections.unmodifiableMap(list);
      }
      
      @Override
      public String toString() {
            String s  = "\n Stock List\n";
            double totalCost = 0.0;
            for(Map.Entry<String ,StockItem> item:list.entrySet()){
                  StockItem stockItem = item.getValue();
                  double itemValue = stockItem.getPrice()* stockItem.quantityInStock();
                  s = s+stockItem +". There are "+stockItem.quantityInStock()+" in stock. Value of items: ";
                  s = s + itemValue + "\n";
                  totalCost +=itemValue;
                  
            }
            return s+ "Total Stock Value "+totalCost;
      }
}
