package com.company;

public class Main {

    public static void main(String[] args) {
        double b[] = {1,2,4,5,2};
        double c[] = {1,6,1,-5,-1};
        double h=8;
        Polynom x=new Polynom(b);
        Polynom y=new Polynom(c);
        Polynom c3=Polynom.sum(x,y);
        System.out.println(x);
        System.out.println(y);
        System.out.println(y.getValue(4));
        System.out.println(Polynom.sum(x,y));
        System.out.println(Polynom.sub(x,y));
        System.out.println(Polynom.multiplication(x,y));
        System.out.println(Polynom.multiplication(h,y));
    }
}
