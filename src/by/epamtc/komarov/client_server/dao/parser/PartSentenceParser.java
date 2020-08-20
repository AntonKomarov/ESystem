package by.epamtc.komarov.client_server.dao.parser;

import by.epamtc.komarov.client_server.bean.Component;
import by.epamtc.komarov.client_server.bean.impl.Numeral;
import by.epamtc.komarov.client_server.bean.impl.PunctuationMark;
import by.epamtc.komarov.client_server.bean.impl.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PartSentenceParser {

    private final String partSentence = "(\\d+)|([A-Za-z]+)|(\\W+)";
    private final String parseWord = "[A-Za-z]+";
    private final String parseNumeral = "\\d+";

    public PartSentenceParser(){}

    public List<Component> parsePartSentence(String sentence) {

        List<Component> partsSentence = new ArrayList<>();

        Matcher matcher = Pattern.compile(partSentence).matcher(sentence);

        while (matcher.find()) {

            String part = matcher.group();

            if (part.matches(parseWord)) {
                partsSentence.add(new Word(part));

            } else if (part.matches(parseNumeral)){
                partsSentence.add(new Numeral(part));

            } else {
                partsSentence.add(new PunctuationMark(part));
            }
        }

        return partsSentence;
    }
}