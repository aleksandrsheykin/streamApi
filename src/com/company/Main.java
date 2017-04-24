package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private static volatile SumVal sumVal = new SumVal();
    private static Finisher finisher;

    public static void main(String[] args) {
        String resources[] = new String[]{"C:\\Users\\admin\\IdeaProjects\\streamApi\\1.txt", "2.txt", "3.txt"};
        //finisher = new Finisher(resources.length);

        Stream streamFromString = Arrays.stream("1 -23 2".split("\\s+"))
                .filter((s)->Integer.valueOf(s) > 0)
                .filter((s)->Integer.valueOf(s) %2 == 0);
        //streamFromString.peek((e) -> System.out.print("," + e));
        streamFromString.forEach(System.out::println);


        //new Summator(resources[0], 0, sumVal, finisher).start();
        /*for (int i = 0; i < resources.length; i++) {
            new Summator(resources[i], i, sumVal, finisher).start();
        }*/
    }
}
