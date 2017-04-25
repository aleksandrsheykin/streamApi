package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by admin on 24.04.2017.
 */
public class Summator extends Thread {
    private String res;
    private Integer threadInd;
    private SumVal sumVal;
    private Finisher finisher;

    public Summator(String res, Integer threadInd, SumVal sumVal, Finisher finisher) {
        this.threadInd = threadInd;
        this.res = res;
        this.sumVal = sumVal;
        this.finisher = finisher;
        Thread t = new Thread(this);
    }

    @Override
    public void run() {
        try {

            Stream<String> streamLine = Files.lines(Paths.get(res));
            Stream str = streamLine.map(
                    (line) -> Arrays.stream(line.split("\\s+"))
                            .mapToInt((a) -> Integer.parseInt(a))
                            .filter((j)->j > 0 && j %2 == 0)
                            .sum()
            );
            //str.forEach(System.out::println);
            str.forEach((val) -> SumVal.sum(val) );

        } catch (IOException e) {
            System.out.println("IOException in'" + res + "");
            e.printStackTrace();
        }
    }
}
