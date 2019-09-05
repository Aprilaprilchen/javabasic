package com.ascending.training.basic.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static String line = "How are you? I'm cool good, thank you! And you?";

    public static boolean splitline(String line){
        String pattern = "(.*)(you\\?)(.+)";
        Pattern p = Pattern. compile(pattern);
        Matcher m = p.matcher(line);

        if (m.find()) {
            System.out.println("Found value:" + m.group(1));
            System.out.println("Found value:" + m.group(2));
            System.out.println("Found value:" + m.group(3));
        }else{
            System.out.println("No Match");
        }
        return m.find();
    }

    public static List<String> findAllMatches(String input){
        List<String> allMatches = new ArrayList<String>();
        Matcher m = Pattern.compile("you\\?")
                .matcher(input);
        while (m.find()) {
            allMatches.add(m.group());
        }
        return allMatches;
    }

    public static void main(String[] args){
        splitline(line);
        findAllMatches(line);
    }
}
