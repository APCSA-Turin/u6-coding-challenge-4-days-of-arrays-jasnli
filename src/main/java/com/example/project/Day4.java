package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
            private String name;
            private int distanceTraveled;
            private int speed;
            private int runDuration;
            private int restDurationAttribute;

            private int runTimeRemaining;
            private int restTimeRemaining;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
                this.name = name;
                this.speed = speed;
                this.runDuration = runDuration;
                restDurationAttribute = restDuration;
                runTimeRemaining = runDuration;
                restTimeRemaining = restDuration;
        }

        public int getDistanceTraveled(){ // this method is required
            return distanceTraveled;
        }

        public String getName() {
            return name;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            if (runDuration > 0) {
                distanceTraveled += speed;
                runTimeRemaining --;
            } else if (restDurationAttribute > 0) {
                restTimeRemaining --;
                if (restTimeRemaining == 0){ 
                    runTimeRemaining = runDuration;
                    restTimeRemaining = restDurationAttribute;
                }
            }
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        for (int i = 0; i < time; i++ ) {
            for (int j = 0; j < reindeers.length; i++) {
                reindeers[j].simulateSecond();
            }
        }

        int highestDistanceTraveled = -100;
        int winnerIndex = -100;
        for (int reindeer = 0; reindeer < reindeers.length; reindeer++) {
            if (reindeers[reindeer].getDistanceTraveled() > highestDistanceTraveled) {
                highestDistanceTraveled = reindeers[reindeer].getDistanceTraveled();
                winnerIndex = reindeer;
            }
        }
        return reindeers[winnerIndex].getName();
    }

    
    public static void main(String[] args) { // for testing purposed
        Reindeer[] reindeers = {new Reindeer("Dasher", 3,4, 2), new Reindeer("Dixon", 5,8, 1), new Reindeer("Cupid", 1,3, 8)};
        System.out.println(simulateRace(10, reindeers));
    }

 
}



