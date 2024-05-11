package oops.stock;

class Stock {
	
     int initialQuantity;
      int currentQuantity;

     void stock(int i) {
         initialQuantity = i;
         currentQuantity =i;
     }
     
    void addStock(int stock) {
         currentQuantity += stock;
     }

   
    
     void reduceStock(int amount) {
        if (currentQuantity >= amount)
        {
        	currentQuantity -= amount;
        } 
        else {
            System.out.println("Not enough stock available.");
        }
    }
    
    
     public int getInitialQuantity() {
         return initialQuantity;
     }

     public int getCurrentQuantity() {
         return currentQuantity;
     }
    
    void display(){
    	System.out.println("Stock is :"+currentQuantity);
    	
    }

   
}