package com.orange.gitworks.temp;

public class Incremental {

    public static void main(String[] args) {

        int column=0;
        column++;
        column++;
        System.out.println("First Commit");
        System.out.println("Second Commit");
        System.out.println("Third Commit");
        System.out.println("Fourth Commit");

        incColumnValue(column);
        System.out.println("column: "+ column);
    }

    private static void incColumnValue(int column){
        column++;
        column++;
    }

}
