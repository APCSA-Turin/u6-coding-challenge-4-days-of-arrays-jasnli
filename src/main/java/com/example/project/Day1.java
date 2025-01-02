package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        String input = name;
        int number = (int) (Math.random() * 5);
        if (input.equals("") || input == null) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        } else {
           return elf_names[number] + input;           
        }
    }
}