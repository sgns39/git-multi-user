package com.orange.gitworks.temp;

public class Incremental {

    public static void main(String[] args) {

        int column=0;
        column++;
        column++;
        column++;
        column++;
        incColumnValue(column);
        System.out.println("column: "+ column);
    }

    private static void incColumnValue(int column){
        column++;
        column++;
    }

}
