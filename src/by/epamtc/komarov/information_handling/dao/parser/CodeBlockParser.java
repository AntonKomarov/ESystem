package by.epamtc.komarov.information_handling.dao.parser;

import by.epamtc.komarov.information_handling.bean.impl.CodeBlock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeBlockParser {

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
