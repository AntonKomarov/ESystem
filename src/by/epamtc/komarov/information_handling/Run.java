package by.epamtc.komarov.information_handling;

import by.epamtc.komarov.information_handling.dao.ReadFile;
import by.epamtc.komarov.information_handling.dao.ReadFileImpl;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) throws IOException {

        ReadFile readFile = new ReadFileImpl();
        // не хардкодить путь через src
        String text = String.valueOf(readFile.
                readToStringBuilder("src/by/epamtc/komarov/information_handling/resources/text.txt"));


        List<String> sentenses = new ArrayList<>();

        Pattern digit = Pattern.compile("\\d+");
        Pattern words = Pattern.compile("[A-Za-zА-Яа-я]+");
        Pattern partOfSentence = Pattern.compile("(\\d+)|([A-Za-zА-Яа-я]+)|(\\W+)");
        Pattern sentence = Pattern.compile("(\\.+.+[$\\n])|((\\d+\\.)+.+[$\\n])|((.+?\\n*?)+?[:.!?]\\s?)");

        Matcher matcher = sentence.matcher(text);

        while(matcher.find()){
            sentenses.add(matcher.group());
        }

        System.out.println(sentenses.get(6));



    }

    public static void printWord(String text){
        Pattern pattern = Pattern.compile("[A-Za-zА-Яа-я]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

    public static void printCodeBlock(String text){
        String codeBlockFinder = "(\\s.*\\{)(?<=\\{)([^\\,]+)(?=\\})(})";
        Pattern pattern = Pattern.compile(codeBlockFinder);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }




}
