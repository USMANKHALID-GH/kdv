package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input= new Scanner(System.in);
        System.out.println("enter the price");
        double price=input.nextDouble();
        if(price<=1000){
            double kdv=price*0.18;
            double KDVli=kdv+price;
            System.out.println("tutar= "+price+ "\nkdv= "+kdv+"\nkdv'li= "+KDVli);
        }
        else if(price>1000){
            double kdv=price*0.08;
            double KDVli=kdv+price;
            System.out.println("tutar= "+price+ "\nkdv= "+kdv+"\nkdv'li= "+KDVli);
        }
        else{
            System.out.println("wrong entry");
        }


    }
}
