package by.epamtc.komarov.information_handling.dao.parser;

import by.epamtc.komarov.information_handling.bean.impl.Word;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordParser {

    public Word word(String text){

        String wordParser = "[A-Za-z]+";
        StringBuilder word = new StringBuilder();

        Matcher matcher = Pattern.compile(wordParser).matcher(text);

        while(matcher.find()){
            word.append(matcher.group()).append("\n");
        }

        return new Word(String.valueOf(word));
    }
}
