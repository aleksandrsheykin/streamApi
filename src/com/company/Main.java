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

        for (int i = 0; i < res.length; i++) {
            new Summator(res[i], i, sumVal, finisher).start();
        }
    }
}
