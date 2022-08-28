package com.company;

public class StringsManage {
    public static void main(String[] args) {

        var sb = new StringBuilder("Welcome");
        sb.append(" to california!");

        System.out.println(sb);

        var s = sb.toString();

        System.out.println(s);

        StringBuilder b = new StringBuilder();
        b.append("shirt size: ")
                .append("M")
                .append(", Qty: ")
                .append(4);

        var s2 = b.toString();
        System.out.println(s2);


    }
}
