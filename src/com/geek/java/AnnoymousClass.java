package com.geek.java;

public class AnnoymousClass {
    public void print(){
        System.out.println("AnnoymousClass");
    }
}

class Annoymous{
    public static void main(String[] args) {
        AnnoymousClass annoymousClass = new AnnoymousClass(){
          public void print(){
              System.out.println("new AnnoymousClass");
          }
        };
        annoymousClass.print();
    }
}
