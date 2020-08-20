package by.epamtc.komarov.information_handling.dao.parser;

import by.epamtc.komarov.information_handling.bean.Component;
import by.epamtc.komarov.information_handling.bean.impl.Numeral;
import by.epamtc.komarov.information_handling.bean.impl.PartSentence;
import by.epamtc.komarov.information_handling.bean.impl.PunctuationMark;
import by.epamtc.komarov.information_handling.bean.impl.Word;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PartSentenceParser {

    public PartSentence partSentence (String sentence){

        List<Component> partsSentence = new ArrayList<>();

        Pattern pattern = Pattern.compile("(\\d+)|([A-Za-z]+)|(\\W+)");
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {

            String part = matcher.group();

            if (part.intern().matches("[A-Za-z]+")) {
                partsSentence.add(new Word(part));

            } else if (part.intern().matches("\\d+")){
                partsSentence.add(new Numeral(part));

            } else {
                partsSentence.add(new PunctuationMark(part));
            }
        }
        return new PartSentence(partsSentence);

    }
}
