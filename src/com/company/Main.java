package com.company;

public class Main {
    private static volatile SumVal sumVal = new SumVal();
    private static Finisher finisher;

    public static void main(String[] args) {
        String resources[] = new String[]{"C:\\Users\\admin\\IdeaProjects\\streamApi\\1.txt", "2.txt", "3.txt"};
        //finisher = new Finisher(resources.length);

        new Summator(resources[0], 0, sumVal, finisher).start();
        /*for (int i = 0; i < resources.length; i++) {
            new Summator(resources[i], i, sumVal, finisher).start();
        }*/
    }
}
