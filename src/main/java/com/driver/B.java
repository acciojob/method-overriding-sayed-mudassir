package com.driver;

public class B extends A{
    public void meth(){
        System.out.println("Method is overridden in Extendend class B");
    }
    public static void main(String[] args) {

        B b = new B();

        b.meth();
    }
}
