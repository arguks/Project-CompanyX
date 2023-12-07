/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.krisstelargueta.project_companyx;

/**
 *
 * @author diesa
 */
public class Main {
    
    public static void main(String[] args) {
        Orders o1 = new Orders("Jerry", true, true, true);
        Orders o2 = new Orders("Belle", false, true, false);
        Orders o3 = new Orders("Cameron", false, false, false);
        Orders o4 = new Orders("Annie", false, false, false);
        Orders o5 = new Orders("Fred", true, true, false);
        Orders o6 = new Orders("George", true, true, false);
        Orders o7 = new Orders("Kiara", true, false, true);
        Orders o8 = new Orders("Regina", false, true, true);
    
        Project_CompanyX newCompany  = new Project_CompanyX();
        newCompany.placeOrder(o1);
        newCompany.placeOrder(o2);
        newCompany.placeOrder(o3);
        newCompany.placeOrder(o4);
        newCompany.placeOrder(o5);
        newCompany.placeOrder(o6);
        newCompany.placeOrder(o7);
        newCompany.placeOrder(o8);
        
        newCompany.processOrders();
    }
}
