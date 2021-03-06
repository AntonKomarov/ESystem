package by.epamtc.komarov.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String line = "I have a cat Sonya. She is very nice and funny cat. She is 4 years old";

        System.out.println("even: " + evenSymbol(line));
        System.out.println("uneven: " + unevenSymbol(line));
        System.out.println("calculation the same symbols: " + calcIteration(line));
        System.out.println("percent of lowercase and uppercase: " + percentLowerUppercase(line));
        System.out.println("upheaval: " + reverse(line));
        System.out.println("insert substring: " +  insert(line, 5, "HHHH"));
        System.out.println("remove substring: " + remove(line, "is"));
        System.out.println("copy substring: " + copySubstring(line, 11, 12));
        System.out.println("length of line: " + length(line));
        System.out.println("value of input: " + calcInput(line, "is"));
        System.out.println("inverse: " + inverse(line));
        System.out.println("change symbol: " + change(line, 'a', 'b'));
        System.out.println("find shortest word: " + findShortest(line));
        System.out.println("words: " + quantityWord(line));
        System.out.println("change place for words: " + changePlace(line));
        System.out.println("longest word: " + findLongest(line));
        System.out.println("add space: " + addSpace(line, 6));
        System.out.println("change substring: " + exchangeSubstring(line, "is", "are"));
        System.out.println("delete words by length: " + deleteByLength(line, 3));
        System.out.println("highlight words: " + Arrays.toString(highlightWord(line)));
        System.out.println("delete iteration: " + deleteIteration(line));
        System.out.println("remove last word: " + removeLast(line));

        System.out.println();
        String lineWithExtraSpace = "   Hello     World   !  ";
        System.out.println("delete Extra space: " + deleteExtraSpace(lineWithExtraSpace));
        System.out.println("replace space on '*': " + exchangeSpace(lineWithExtraSpace));

        System.out.println();
        String palindrome = "А луна канула";
        System.out.println(palindrome + "\nis palindrome: " + isPalindrome(palindrome));

        System.out.println();
        String number = "31212434123123+5132412351315215";
        System.out.println(number + "\nsum: " + calc(number));
    }

    public static Map<Character, Integer> calcIteration(String line){

        Map<Character, Integer> element = new HashMap<>();

        for (int i = 0; i < line.length(); ++i) {

            char c = line.charAt(i);

            if (Character.isLetter(c)) {
                if (element.containsKey(c)) {
                    element.put(c, element.get(c) + 1);
                } else {
                    element.put(c, 1);
                }
            }
        }
        return element;
    }

    public static StringBuilder evenSymbol(String line) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length(); i += 2) {
            sb.append(line.charAt(i));
        }

        return sb;
    }

    public static StringBuilder unevenSymbol(String line) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < line.length(); i += 2) {
            sb.append(line.charAt(i));
        }

        return sb;
    }

    public static String percentLowerUppercase(String line){

        String solidLine = line.replaceAll("\\W", "");
        String lowercase = solidLine.replaceAll("[A-Z]", "");
        String uppercase = solidLine.replaceAll("[a-z]", "");

        int hundredPercent = solidLine.length();
        int lowercasePercent = (lowercase.length() * 100) / hundredPercent;
        int uppercasePercent = (uppercase.length() * 100) / hundredPercent;

        return "\nUppercase: " + uppercasePercent + "%\nLowercase: " + lowercasePercent + "%";
    }

    public static StringBuilder deleteIteration(String line){

        StringBuilder sb = new StringBuilder(line);
        int index;

        for (int i = 0; i < line.length(); i++) {
            char symbol = line.charAt(i);
            index = line.indexOf(symbol, i);

            if (index == -1){
                sb.append(symbol);
            }
        }
        return sb;
    }

    public static StringBuilder reverse(String line){
        return new StringBuilder(line).reverse();
    }

    public static StringBuilder insert(String line, int index, String word){
        return new StringBuilder(line).insert(index, word);
    }

    public static String remove(String line, String word){
        return line.replaceAll(word, "");
    }

    public static String copySubstring(String line, int start, int end){
                return new StringBuilder(line).substring(start, end+1);
    }

    public static int length(String line) {
        return line.length();
    }

    public static int calcInput(String line, String substring){

        String[] lineArray = toStringArray(line);
        int count = 0;

        for (String word : lineArray){
            if(word.equalsIgnoreCase(substring)){
                count++;
            }
        }

        return count;
    }

    public static StringBuilder inverse(String line){

        StringBuilder sb = new StringBuilder();
        String[] strArr = toStringArray(line);

        for (int i = strArr.length-1; i >=0 ; i--) {
            sb.append(strArr[i]).append(" ");
        }

        return sb;
    }

    public static String exchangeSpace(String line){
        return deleteExtraSpace(line).replaceAll(" ", "*");
    }

    public static String change(String line, char letter, char toLetter){

        String longestWord = findLongest(line);
        char[] symbol = longestWord.toCharArray();

        for (int i = 0; i < symbol.length; i++) {

            if(symbol[i] == letter){
                symbol[i] = toLetter;
            }
        }
        return String.valueOf(symbol);
    }

    public static String findShortest(String line){

        StringBuilder sb = new StringBuilder();
        String[] strArr = toStringArray(line);
        String shortestWord = strArr[0];

        for (String word : strArr){
            if(word.length() < shortestWord.length()){
                shortestWord = word;
            }
        }

        for (String word : strArr){
            if(shortestWord.length() == word.length()){
                sb.append(word).append(" ");
            }
        }
        return String.valueOf(sb);
    }

    public static int quantityWord(String line){

        String[] strArr = toStringArray(line);
        int count = 0;

        for (int index = 0; index < strArr.length; index++)
            count++;

        return count;
    }

    public static StringBuilder changePlace(String line){

        String[] strArr = toStringArray(line);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strArr.length-1; i+=2) {
            sb.append(strArr[i+1]).append(" ").append(strArr[i]).append(" ");
        }

        if (strArr.length % 2 != 0)
        sb.append(strArr[strArr.length-1]);

        return sb;
    }

    public static String removeLast(String line) {
        return line.substring(0, line.lastIndexOf(" "));
    }

    public static StringBuilder addSpace(String line, int index){
        return new StringBuilder(line).insert(index, " ");
    }

    public static boolean isPalindrome(String line){

        String first = line.replaceAll("\\W", "");
        String reverseFirst = String.valueOf(reverse(first));

        return first.equalsIgnoreCase(reverseFirst);
    }

    public static String exchangeSubstring(String line, String target, String replacement){
        return line.replace(target, replacement);
    }

    public static long calc(String line){

        long sum = 0;
        String[] strArr = line.split("\\W");

        for(String element : strArr){
            sum += Long.parseLong(element);
        }

        return sum;
    }

    public static StringBuilder deleteByLength(String line, int length){

        StringBuilder sb = new StringBuilder();
        String[] strArr = toStringArray(line);

        for (String word : strArr) {
            if (!(word.length() == length)) {
                sb.append(word).append(" ");
            }
        }
        return sb;
    }

    public static String deleteExtraSpace(String line){
        return line.trim().replaceAll(" {2,}", " ");
    }

    public static String[] highlightWord(String line){
        return line.replaceAll("\\.", "").split("\\W");
    }

    public static String findLongest(String line){

        StringBuilder sb = new StringBuilder();
        String[] strArr = toStringArray(line);
        String longestWord = "";

        for (String word : strArr){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }

        for (String word : strArr){
            if(longestWord.length() == word.length()){
                sb.append(word).append(" ");
            }
        }
        return String.valueOf(sb);
    }

    public static String[] toStringArray(String line){
        return deleteExtraSpace(line).replaceAll("\\.", "").split(" ");
    }
}