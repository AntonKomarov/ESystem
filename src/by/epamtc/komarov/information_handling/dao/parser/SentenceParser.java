package by.epamtc.komarov.information_handling.dao.parser;

import by.epamtc.komarov.information_handling.bean.Component;
import by.epamtc.komarov.information_handling.bean.impl.CodeBlock;
import by.epamtc.komarov.information_handling.bean.impl.Sentence;
import by.epamtc.komarov.information_handling.bean.impl.Text;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser {

    public Sentence parseSentence(String text){

        List<Component> se = new ArrayList<>();
        String sentenceFinder = "(\\.+[$\\n])|((\\d+\\.)+.+[$\\n])|((.+?\\n*?)+?[:.!?]\\s?)";
        StringBuilder sentence = new StringBuilder();

        Matcher matcher = Pattern.compile(sentenceFinder).matcher(text);

        while(matcher.find()){
            sentence.append(matcher.group());
        }

        return new Sentence(sentence);
    }
}
