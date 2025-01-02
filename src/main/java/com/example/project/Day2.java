
package com.example.project;
import java.util.Random;
public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        boolean[] naughtyList = new boolean[names.length];
        boolean[] niceList = new boolean[names.length];
        int naughtyCount = 0;
        int niceCount = 0;
        for (int i = 0; i < names.length; i ++) {
            if ((int) (Math.random() * 2) + 1 == 1) {
                naughtyList[i] = true;
                naughtyCount++;
            } else {
                niceList[i] = true;
                niceCount++;
            }
        }
        int naughtyIndex = 0;
        int niceIndex = 0;
        String[][] list = {new String[niceCount], new String[naughtyCount]};
        for (int i = 0; i < names.length; i++) {
            if (naughtyList[i] == true) {
                list[1][naughtyIndex] = names[i];
                naughtyIndex++;
            }
            if (niceList[i] == true) {
                list[0][niceIndex] = names[i];
                niceIndex++;
            }
        }
        return list; //you must return a two dimensional string array
    }

    public static void main(String[] args) {
        String[] names = {"Alexa", "Candance", "RAYMOND C'HEN", "MS TURIN", "ANDREI TURIN"};
        String[][] list = Day2.nameSort(names);
        for (int i = 0; i < list.length; i ++ ) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.println(list[i][j]);
            }
            System.out.println("---------");
        }
    }
}