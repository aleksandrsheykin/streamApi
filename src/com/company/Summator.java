package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
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
            File file = new File(res);
            String word;
            Integer digit = 0;

            Stream<String> stream = Files.lines(Paths.get(res));
            stream.filter((s)->Integer.valueOf(s) > 0).filter((s)->Integer.valueOf(s) %2 != 0);

            stream.forEach(System.out::println);


        } catch (IllegalArgumentException e) {
            System.out.println("'"+res+"' is not file");
        } catch (SecurityException e) {
            System.out.println("file '" + res + "' is not available");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
