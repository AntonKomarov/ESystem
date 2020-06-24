package by.epamtc.komarov.topic_9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String line = "I have a cat Sonya. She is very nice and funny cat. She is 4 years old";

//        System.out.println("even = " + getEvenSymbol(line));
//        System.out.println("uneven = " + getUnEvenSymbol(line));
//        System.out.println("calculation the same symbols = " + calcIteration(line));
//        System.out.println("percent of lowercase and uppercase = " + percentLowerUppercase(line));
//        System.out.println("upheaval = " + getUpheaval(line));
//        System.out.println("substring = " +  insert(line, 5, "HHHH"));
//        System.out.println("remove substring = " + remove(line, "our"));
//        System.out.println("copy = " + copySequence(line, 11, 12));
//        System.out.println("length of line = " + getLength(line));
//        System.out.println("value of input = " + calcInput(line, "is"));
//        inverse(line);
//        System.out.println("replace space on '*' = " + replaceSpace(line));
//        System.out.println("change symbol = " + change(line, 'a', 'b'));
//        System.out.println("find shortest word = " + findShortWord(line));
//        System.out.println("words = " + quantityWord(line));
//        System.out.println("change place for words = " + Arrays.toString(changePlace(line)));
//        System.out.println(findLong(line));
//        System.out.println("add space = " + addSpace(line, 6));
//
//        String palindrome = "А луна канула";
//        System.out.println(palindrome(palindrome));
//
//        System.out.println("change substring = " + exchangeSubstring(line, "good", "Technology"));
//
//        String number = "31212434123123+5132412351315215";
//        System.out.println("sum = " + calc(number));
//
//        System.out.println("delete words by length = " + deleteByLength("delete = " + line, 3));
//        System.out.println("delete Extra space = " + deleteExtraSpace(line));
//        System.out.println("highlight words = " + Arrays.toString(highlightWords(line)));

    }

    public static Map calcIteration(String line){
              Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < line.length(); ++i) {
            char c = line.charAt(i);

            if (Character.isLetter(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        return map;
    }

    public static StringBuilder getEvenSymbol(String line) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length(); i += 2) {
            sb.append(line.charAt(i));
        }

        return sb;
    }

    public static StringBuilder getUnEvenSymbol(String line) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < line.length(); i += 2) {
            sb.append(line.charAt(i));
        }

        return sb;
    }

    public static String percentLowerUppercase(String line){

        String str = line.replaceAll("\\W", "");
        String lowercase = str.replaceAll("[A-Z]", "");
        String uppercase = str.replaceAll("[a-z]", "");

        int hundredPercent = str.length();
        int lowercasePercent = (lowercase.length() * 100) / hundredPercent;
        int uppercasePercent = (uppercase.length() * 100) / hundredPercent;

        return "Uppercase: " + uppercasePercent + "%" + "\n" + "Lowercase: " + lowercasePercent + "%";
    }

    public static StringBuilder deleteIteration(String line){

        StringBuilder sb = new StringBuilder(line);
        int index;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            index = line.indexOf(c, i);
            if (index == -1){
                sb.append(c);
            }
        }
        return sb;
    }

    public static StringBuilder getUpheaval(String line){
        StringBuilder sb = new StringBuilder(line);
        return sb.reverse();
    }

    public static StringBuilder insert(String line, int index, String word){
        StringBuilder sb = new StringBuilder(line);
        return sb.insert(index, word);
    }

    public static String remove(String line, String word){
        return line.replaceAll(word, "");
    }

    public static String copySequence(String line, int start, int end){
        StringBuilder sb = new StringBuilder(line);
        return sb.substring(start, end+1);
    }

    public static int getLength(String line) {
        return line.length();
    }

    public static int calcInput(String line, String substring){

        String[] lineArray = line.split(" ");
        int count = 0;

        for (String word : lineArray){
            if(word.equalsIgnoreCase(substring)){
                count++;
            }
        }

        return count;
    }

    public static void inverse(String line){
        String[] strArr = line.split(" ");
        System.out.print("inverse string = ");
        for (int i = strArr.length-1; i >=0 ; i--) {
            System.out.print(strArr[i] + " ");
        }
    }

    public static String replaceSpace(String line){
        return line.replaceAll(" {2,}", "*");
    }

    public static String change(String line, char letter, char toLetter){
        String longestWord = findLong(line);
        char[] arr = longestWord.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == letter){
                arr[i] = toLetter;
            }
        }
        return String.valueOf(arr);
    }

    public static int findShortWord(String line){
        String[] strArr = line.split(" ");
        String shortestWord = strArr[0];

        for (String word:strArr){
            if(word.length() < shortestWord.length()){
                shortestWord = word;
            }
        }
        return getLength(shortestWord);
    }

    public static int quantityWord(String line){
        String str = replaceSpace(line);
        String[] strArr = str.split(" ");
        int count = 0;
        for (String word: strArr)
            count++;

        return count;
    }

    public static String[] changePlace(String line){
        String[] strArr = line.split(" ");

        for (int i = 0; i < strArr.length-1; i+=2) {
            String safe = strArr[i];
            strArr[i] = strArr[i+1];
            strArr[i+1] = safe;
        }
        return strArr;
    }

    public static String removeLast(String line) {
        return line.substring(0, line.lastIndexOf(" "));
    }

    public static StringBuilder addSpace(String line, int index){
        StringBuilder sb = new StringBuilder(line);
        return sb.insert(index, " ");
    }

    public static boolean palindrome(String line){
        String firstPart = line.replaceAll("\\W", "");
        StringBuilder secondPart = new StringBuilder(line.replaceAll("\\W", ""));
        secondPart.reverse();
        return firstPart.equalsIgnoreCase(String.valueOf(secondPart));
    }

    public static String exchangeSubstring(String line, String target, String replacement){
        return line.replace(target, replacement);
    }

    public static long calc(String line){
        long sum = 0;
        String[] strArr = line.split("\\W");
        long[] l = new long[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            l[i] = Long.parseLong(strArr[i]);
            sum += l[i];
        }

        return sum;
    }

    public static StringBuilder deleteByLength(String line, int length){
        StringBuilder sb = new StringBuilder();
        String[] strArr = line.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            if (!(strArr[i].length() == length)){
                sb.append(strArr[i]).append(" ");
            }
        }
        return sb;
    }

    public static String deleteExtraSpace(String line){
        return line.replaceAll(" {2,}", " ");
    }

    public static String[] highlightWords(String line){
        String s = deleteExtraSpace(line);
        String[] strArray = s.split(" ");
        return strArray;
    }

    public static String findLong(String line){
        String[] strArr = line.split(" ");
        String empty = "";

        for (String word: strArr){
            if(word.length() > empty.length()){
                empty = word;
            }
        }
        return empty;
    }






}