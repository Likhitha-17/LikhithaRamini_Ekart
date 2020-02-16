package com.vnr.likhitha.ekart;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Customer{
    Scanner input=new Scanner(System.in);
    List<Integer> priceOfSelectedItems=new ArrayList<>();
    List<String> selectedItems=new ArrayList<>();
    
    public void addItems(final String items[],final int price[])
    {
        char choice;
        do
        {
            int choiceType=input.nextInt();
            priceOfSelectedItems.add(price[choiceType-1]);
            selectedItems.add(items[choiceType-1]);
            System.out.println("Do you want to continue purchasing in this category?(y/n)");
            choice=input.next().charAt(0);
        }while(choice=='y');
    }

    public void EkartMainPage()
    {
        System.out.println("Welcome to Ekart APP!");
        char choice;//for breaking do-while
        do{
            System.out.println("Select category that you wish");
            System.out.println("1.Chocolates 2.IceCream");
            int category=input.nextInt();
            switch(category)
            {
                case 1:Chocolates chobj=new Chocolates();
                        System.out.println("Select chocolates you wish:");
                        chobj.printAllProducts(chobj.chocolates,chobj.chocoprice);
                        addItems(chobj.chocolates,chobj.chocoprice);
                        break;
                case 2:IceCream icecreamobj=new IceCream();
                        System.out.println("Select icecreams you wish:");
                        icecreamobj.printAllProducts(icecreamobj.icecream,icecreamobj.icecprice);
                        addItems(icecreamobj.icecream,icecreamobj.icecprice);
                        break;
                default:System.out.println("Enter correct option");
                        break;
            }   
            System.out.println("Do you want to continue purchasing?(y/n)");
            choice=input.next().charAt(0);
        }while(choice=='y'); 
        final EkartStore ekartStore=new EkartStore();
        ekartStore.billing(selectedItems,priceOfSelectedItems);  
    }
}