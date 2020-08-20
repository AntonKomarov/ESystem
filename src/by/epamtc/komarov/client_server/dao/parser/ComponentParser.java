package by.epamtc.komarov.client_server.dao.parser;

import by.epamtc.komarov.client_server.bean.Component;
import by.epamtc.komarov.client_server.bean.impl.CodeBlock;
import by.epamtc.komarov.client_server.bean.impl.Text;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComponentParser {

    private final SentenceParser sentenceParser = new SentenceParser();
    private final String componentsRegExp = "(?<TextBlock>[^{}]+\\n)|(?<CodeBlock>.*\\{\\n(.*\\n)+?\\n*}\\n)";
    private final Pattern pattern = Pattern.compile(componentsRegExp);

    public Text createText(String allText) {

        Text text = new Text();

        Matcher matcher = pattern.matcher(allText);

        while (matcher.find()) {
            String textBlock = matcher.group("TextBlock");
            String codeBLock = matcher.group("CodeBlock");

            if (textBlock != null) {

                List<Component> sentences = sentenceParser.parseSentences(textBlock);

                for (Component c : sentences) {
                    text.addTextComponent(c);
                }
            }

            if (codeBLock != null) {
                text.addTextComponent(new CodeBlock(codeBLock));
            }
        }

        return text;
    }
}
