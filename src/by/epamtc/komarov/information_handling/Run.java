package by.epamtc.komarov.information_handling;

import by.epamtc.komarov.information_handling.bean.impl.CodeBlock;
import by.epamtc.komarov.information_handling.dao.ReadFile;
import by.epamtc.komarov.information_handling.dao.impl.ReadFileImpl;
import by.epamtc.komarov.information_handling.model.Create;


import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ReadFile readFile = new ReadFileImpl();
        String text = readFile.read();
        Pattern ab = Pattern.compile("(\\d+)|([A-Za-zА-Яа-я]+)|(\\W+)");

        Matcher matcher = ab.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }


//        String[] abza = text.split("^\\s*$\\n");
//
//        for (int i = 0; i < abza.length; i++) {
//            System.out.println(abza[i]);
//            System.out.println("i = " + i);
//        }




    }
//        Pattern ab = Pattern.compile("^(?:(?!^$)[\\s\\S])+$");
//        Pattern empty = Pattern.compile("^\\s*$");

//        Pattern digit = Pattern.compile("\\d+");
//        Pattern partOfSentence = Pattern.compile("(\\d+)|([A-Za-zА-Яа-я]+)|(\\W+)");
//        Pattern sentence = Pattern.compile("(\\.+.+[$\\n])|((\\d+\\.)+.+[$\\n])|((.+?\\n*?)+?[:.!?]\\s?)");



}
