package com.vnr.likhitha.ekart;
//import java.util.ArrayList;
import java.util.List;

public class EkartStore
{
    //prints the item and thier prices
    public void printAllProducts(String[] args,int[] arg)
    {
        System.out.println("Items:");
        for(int i=0;i<args.length;i++)
        {
            System.out.println((i+1)+"-->"+args[i]+"-"+arg[i]);
        }
    }
    public void billing(List<String> selectedItems,List<Integer> priceOfSelectedItems)
    {
        int totalPrice=0;
        for(int i=0;i<selectedItems.size();i++)
        {
            System.out.println((i+1)+" "+selectedItems.get(i)+" "+priceOfSelectedItems.get(i));
            totalPrice+=priceOfSelectedItems.get(i);
        }
        System.out.println("Total Price of Items: "+totalPrice);
    }

}