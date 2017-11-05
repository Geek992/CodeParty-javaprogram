package com.geek.java;
//创建ExtendsAbstract类继承自抽象类AbstractDemo
public class ExtendsAbstract extends AbstractDemo {
    @Override
     void CodeParty() {
        System.out.println("Welcome to the CodeParty!");
    }

    @Override
    String Geek() {
        return "CodeParty";
    }

    public static void main(String[] args) {
        ExtendsAbstract extendsAbstract = new ExtendsAbstract();
        extendsAbstract.CodeParty();
        System.out.println(extendsAbstract.Geek());
    }
}
