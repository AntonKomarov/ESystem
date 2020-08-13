package by.epamtc.komarov.information_handling.model;

import by.epamtc.komarov.information_handling.bean.CodeBlock;
import by.epamtc.komarov.information_handling.bean.Component;
import by.epamtc.komarov.information_handling.bean.Word;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Create {

    public Component word(String text){
        String wordParser = "[A-Za-z]";
        StringBuilder word = null;

        Matcher matcher = Pattern.compile(wordParser).matcher(text);

        while(matcher.find()){
            word.append(matcher.group());
        }

        return new Word(String.valueOf(word));
    }

    public CodeBlock codeBlock(String text){

        String codeBlockFinder = "(\\s.*\\{)(?<=\\{)([^\\,]+)(?=\\})(})";
        StringBuilder block = new StringBuilder();

        Matcher matcher = Pattern.compile(codeBlockFinder).matcher(text);

        while(matcher.find()){
            block.append(matcher.group());
        }

        return new CodeBlock(block);
    }
}
