package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello everyone this is sachin..! ");


        String s1 = new String("sachin");

        String s2 = new String("sachin");

        String s3 = "sachin";

        String s4 = "sachin";

        if(s1.equals(s4)){
            System.out.println("same!");
        }else {
            System.out.println("not same");
        }

        if(s3 == s2){
            System.out.println("same!");
        }else {
            System.out.println("not same!");
        }


    }



}
