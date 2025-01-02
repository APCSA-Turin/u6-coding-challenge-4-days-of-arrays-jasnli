package com.example.project;


public class Day3 {
  public static String[][] generateSnowflake(int size) { //you will be tested on this method
      String[][] grid = new String[size][size];
      System.out.println("Santa");
      for (int i = 0; i < size; i++) {
          for (int j = 0; j < size; j++) {
              grid[i][j]= " ";

          }
      }
      for (int i = 0; i < size; i ++) {
          grid[i][size / 2] = "*";
          grid[size / 2][i] = "*";
          System.out.print(i + " " + i + " \n");
          grid[i][grid.length - 1 - i] = "*";
          grid[i][i] = "*";

      }
      return grid;
  }

  // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
  public static void printSnowflake(String[][] snowflake) {
      for (int i = 0; i < snowflake.length; i++) {
          for (int j = 0; j < snowflake[i].length; j++) {
              System.out.print(snowflake[i][j]);

          }
          System.out.print("\n");
      }
  }

  // Test for the snowflake generation
  public static void main(String[] args) {
      String[][] snowflake = generateSnowflake(11);
      printSnowflake(snowflake);
  }
}
