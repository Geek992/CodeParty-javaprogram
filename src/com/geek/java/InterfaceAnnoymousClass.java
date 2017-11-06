package com.geek.java;

interface InterfaceAnnoymousClass {
            public void print();
}
class InterfaceAnnoymous{
    public static void main(String[] args) {
        InterfaceAnnoymousClass interfaceAnnoymousClass = new InterfaceAnnoymousClass() {
            @Override
            public void print() {
                System.out.println("InterfaceAnnoymousClass");
            }
        };
        interfaceAnnoymousClass.print();
    }
}
