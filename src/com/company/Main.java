package com.company;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private static volatile SumVal sumVal = new SumVal();
    private static Finisher finisher;

    public static void main(String[] args) {
        String res[] = new String[]{"C:\\Users\\admin\\IdeaProjects\\streamApi\\1.txt",
                "C:\\Users\\admin\\IdeaProjects\\streamApi\\2.txt",
                "C:\\Users\\admin\\IdeaProjects\\streamApi\\3.txt"};

       /* try {
            Stream<String> streamLine = Files.lines(Paths.get(res[0]));
            Stream str = streamLine.map(
                    (line) -> Arrays.stream(line.split("\\s+"))
                            .mapToInt((a) -> Integer.parseInt(a))
                            .filter((j)->j > 0 && j %2 == 0).sum()
            );
            //str.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        for (int i = 0; i < res.length; i++) {
            new Summator(res[i], i, sumVal, finisher).start();
        }
    }
}
