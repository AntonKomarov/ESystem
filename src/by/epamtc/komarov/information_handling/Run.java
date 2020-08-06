package by.epamtc.komarov.information_handling;

import by.epamtc.komarov.information_handling.dao.ReadFile;
import by.epamtc.komarov.information_handling.dao.ReadFileImpl;


import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) throws IOException {

        ReadFile readFile = new ReadFileImpl();

        System.out.println();
        // не хардкодить путь через src
        String text = String.valueOf(readFile.
                readToStringBuilder("src/by/epamtc/komarov/information_handling/resources/text.txt"));




        String codeBlockFinder = "(\\s.*\\{)(?<=\\{)([^\\,]+)(?=\\})(})";
        Pattern pattern = Pattern.compile(codeBlockFinder);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }


}
