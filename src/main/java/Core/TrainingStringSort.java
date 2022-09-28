package Core;

import java.util.*;
import java.util.stream.Collectors;

public class TrainingStringSort {
//    private final static String str = "zsd";
    private final static String str = "I+have already gotten this job";

    public static void main(String[] args) {
        System.out.println("##########################################        isUnique VERSION 1          ################################");
        isUnique1(str);
        System.out.println("##########################################        isUnique VERSION 2          ################################");
        isUnique2(str);
        System.out.println("##########################################        removeSameChar VERSION 1        ############################");
        leaveUniqCharsInString(str);
        System.out.println("##########################################        removeSameChar VERSION 2        ############################");
        removeSameChar(str, ' ');
        System.out.println("##########################################        sum int from str VERSION 2        ############################");
    }

    public static void isUnique1(String str) {
        var l = str.length();
        char[] chars = str.toCharArray();
        int countSameChars = 0;

        for (int i = 0; i < chars.length; i++) {
            var t = chars[i];
            for (int j = i+1; j < chars.length; j++) {
              if(t == chars[j]) {
                  countSameChars++;
              }
            }
        }
        if (countSameChars > 0) {
            System.out.println("has found " + countSameChars + " same chars");
        } else {
            System.out.println("has found same chars");
        }
    }
    public static void isUnique2(String str) {
        HashSet<String> set = new HashSet<>();
        str.chars().forEach(elem -> set.add(Character.toString(elem)));

        if (str.length() == set.size()) {
            System.out.println("Only uniq characters presents");
        } else {
            System.out.println("Has found same chars");
        }
    }

    public static void leaveUniqCharsInString(String str) {
        HashSet<String> set = new HashSet<>();
        str.chars().forEach(elem -> set.add(Character.toString(elem)));
        String s = set.toString();
        System.out.println(s.replace(",", ""));
    }

//    public static void removeSameChar(String str, Character character) {
    public static void removeSameChar(String str, char character) {
            String s = str.chars()
                    .filter(ch -> ch != character)
                    .mapToObj(Character::toString)
                    .collect(Collectors.joining());
        System.out.println(s);
    }

}
