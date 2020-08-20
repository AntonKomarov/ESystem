package by.epamtc.komarov.client_server.dao.parser;

import by.epamtc.komarov.client_server.bean.Component;
import by.epamtc.komarov.client_server.bean.impl.Sentence;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser {

    private final PartSentenceParser partSentenceParser;
    private final String parseTextBlock = "(.{10}(.*?\\n*?)+?[:.!?]\\s?)";
    private final String parsSentence = "(\\.+.+[$\\n])|((\\d+\\.)+.+[$\\n])|((.+?\\n*?)+?[:.!?]\\s?)";

    public SentenceParser() {
        partSentenceParser = new PartSentenceParser();
    }

    public List<Component> parseSentences(String textBlock) {

        List<Component> sentences = new ArrayList<>();
        Matcher smallTextBlockMatcher = Pattern.compile(parseTextBlock).matcher(textBlock);

        while (smallTextBlockMatcher.find()) {

            Matcher matcher = Pattern.compile(parsSentence).matcher(smallTextBlockMatcher.group());

            while (matcher.find()) {

                Sentence beanSentence = new Sentence();
                String sentence = matcher.group();
                List<Component> partsOfSentence = partSentenceParser.parsePartSentence(sentence);

                for (Component component : partsOfSentence) {
                    beanSentence.addPart(component);
                }

                sentences.add(beanSentence);
            }
        }

        return sentences;
    }
}