package com.krisstelargueta.project_companyx;

import java.util.LinkedList;
import java.util.Queue;

public class Project_CompanyX {

    private Queue <Orders> orderList;
    
    public Project_CompanyX(){
        orderList = new LinkedList <> ();
    }
    
    public void placeOrder (Orders order){
        orderList.add(order);
    }
    
    int priority = 1;
    Orders order;
    public void processOrders (){
      while(!orderList.isEmpty() && priority < 5){
          while(remainingPOrders(orderList, priority)){
              order = find(priority);
              System.out.println("The system has processed the order for: "  + order.getClient() + "\nPriority: " + priority);
              orderList.remove(order);
          }
          priority++;
      } 
    }
    
    public Orders find(int priority){
        for(Orders o: orderList){
            if(o.getPriority() == priority){
                return o;
            }
        }
        return null;
    }
    
    public boolean remainingPOrders (Queue <Orders> orderQ, int priority){
        for(Orders o: orderQ){
            if(o.getPriority() == priority){
                return true;
            }
        }
        return false;
    }
}
