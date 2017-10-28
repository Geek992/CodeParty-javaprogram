package com.geek.java;

public class TottiStaticDemo {
  public static  TottiStaticDemo demo = null;
  public synchronized static TottiStaticDemo getInstance(){
       if(demo == null){
           demo = new TottiStaticDemo();
       }
       return demo;
  }
  private TottiStaticDemo(){}

  public void output(){
      System.out.println("Create Instance");
  }
}
