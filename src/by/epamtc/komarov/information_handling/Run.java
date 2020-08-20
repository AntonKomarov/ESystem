package by.epamtc.komarov.information_handling;

import by.epamtc.komarov.information_handling.bean.impl.PunctuationMark;
import by.epamtc.komarov.information_handling.dao.ReadFile;
import by.epamtc.komarov.information_handling.dao.impl.ReadFileImpl;
import by.epamtc.komarov.information_handling.dao.parser.PunctuationParser;
import by.epamtc.komarov.information_handling.dao.parser.SentenceParser;


import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ReadFile readFile = new ReadFileImpl();
        String text = readFile.read();

            Pattern partSentence = Pattern.compile("^(?:(?!^$)[\\s\\S])+$");

            Matcher matcher = partSentence.matcher(text);
            while (matcher.find()){
                System.out.println(matcher.group());
            }
    }
//        Pattern ab = Pattern.compile("^(?:(?!^$)[\\s\\S])+$");
//        Pattern numeral = Pattern.compile("\\d+");
//        Pattern partSentence = Pattern.compile("(\\d+)|([A-Za-z]+)|(\\W+)");
//        Pattern empty = Pattern.compile("^\\s*$");
//        Pattern sentence = Pattern.compile("(\\.+.+[$\\n])|((\\d+\\.)+.+[$\\n])|((.+?\\n*?)+?[:.!?]\\s?)");
}
