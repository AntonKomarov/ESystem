package by.epamtc.komarov.information_handling.dao.parser;

import by.epamtc.komarov.information_handling.bean.impl.Numeral;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumeralParser {

    public Numeral numeral(String text) {

        String numeralFinder = "\\d+";
        StringBuilder numeral = new StringBuilder();

        Matcher matcher = Pattern.compile(numeralFinder).matcher(text);

        while (matcher.find()) {
            numeral.append(matcher.group());
        }

        return new Numeral(String.valueOf(numeral));
    }
}

