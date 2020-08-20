package by.epamtc.komarov.information_handling.dao.parser;

import by.epamtc.komarov.information_handling.bean.impl.PunctuationMark;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PunctuationParser {

    public PunctuationMark punctuation(String text){

        String punctuationFinder = "[-.,!(){}/;\"'%>=<]";
        StringBuilder punctuation = new StringBuilder();

        Matcher matcher = Pattern.compile(punctuationFinder).matcher(text);

        while(matcher.find()){
            punctuation.append(matcher.group());
        }

        return new PunctuationMark(String.valueOf(punctuation));
    }
}
