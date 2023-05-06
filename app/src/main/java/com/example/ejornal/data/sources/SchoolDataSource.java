package com.example.ejornal.data.sources;

public class SchoolDataSource {
    private static final String schholsNums[] = {"Школа №25", "Школа №1", "Художественная школа №2"};
    public static String getScoolNum(int index){
        return schholsNums[index];
    }
}
