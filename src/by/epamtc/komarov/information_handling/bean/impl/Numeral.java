package by.epamtc.komarov.information_handling.bean.impl;

import by.epamtc.komarov.information_handling.bean.Component;

import java.io.Serializable;
import java.util.Objects;

public class Numeral implements Serializable, Component {

    private final String digit;

    public Numeral(String digit) {
        this.digit = digit;
    }

    @Override
    public String getComponent() {
        return digit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numeral numeral = (Numeral) o;
        return digit.equals(numeral.digit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(digit);
    }

    @Override
    public String toString() {
        return "Numeral{" +
                "digit='" + digit + '\'' +
                '}';
    }
}
