package com.company;


    public class PretPiese {

        private static PretPiese instance = new PretPiese();
        private PretPiese(){}
        public static PretPiese getInstance(){
            return instance;
        }
        public void TotalPiese(int a, int b){

            int total = a+b ;

            System.out.println("Totalul pieselor : "+ total + " lei");
        }
    }

