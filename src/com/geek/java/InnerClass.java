package com.geek.java;

public class InnerClass {

    class Inner{
        void print(){
            System.out.println("Create Instance!");
        }
    }
    /*void getInstance(){
        Inner inner = new Inner();
        inner.print();
    }*/

    public static void main(String[] args) {
        /*InnerClass innerClass = new InnerClass();
        InnerClass.Inner inner = innerClass.new Inner();*/
        InnerClass.Inner inner = new InnerClass().new Inner();
        inner.print();
    }
}
