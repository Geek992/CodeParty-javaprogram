package com.geek.java;

  interface AnnoumousClass{
        void print();
}
 class ParameterAnnoymousClass {
   void createAnnoymousClass(AnnoymousClass annoymousClass){
       System.out.println("Create Annoymous Class");
   }
}

class testClass{
    public static void main(String[] args) {
        ParameterAnnoymousClass parameterAnnoymousClass = new ParameterAnnoymousClass();
        parameterAnnoymousClass.createAnnoymousClass(new AnnoymousClass(){
            @Override
            public void print() {
                System.out.println("Create Parameter Annoymous Class");
            }
        });

    }

}




