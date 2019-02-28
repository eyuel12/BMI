package com.LickingHeights;

import  java.util.Scanner ;

public class Bmi {

    public static void main(String[]args){



        Scanner sc = new Scanner(System.in);

        //Initalizing
        double heighInFeet,height,heightInInches,weight,Bmi;


        System.out.println(" What is your height in feet?");
        double heightInFeet = sc.nextDouble();

        System.out.println("what is your height in inches?");
        heightInInches =sc.nextDouble()+heightInFeet*12;
        height=heightInInches*0.0254;

        System.out.println("how much do you weight pounds?");
        weight =sc.nextDouble()*0.453592;



        Bmi = weight / (height * height);

        System.out.println("your bmi is  " + Bmi);
    }


}



