package com.orange.gitworks.temp;

public class Incremental {

    public static void main(String[] args) {

        int column=0;
        column++;
        column++;
        column++;
        column++;
        System.out.println("First Commit");
        System.out.println("Second Commit");
        System.out.println("Third Commit");
        System.out.println("Fourth Commit By Atit");
        System.out.println("Fourth Commit By Atit2");
        System.out.println("Fourth Commit By Atit3");
        

        incColumnValue(column);
        System.out.println("column: "+ column);
    }

    private static void incColumnValue(int column){
        column++;
        column++;
    }

}
