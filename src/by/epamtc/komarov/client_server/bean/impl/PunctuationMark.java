package by.epamtc.komarov.client_server.bean.impl;

import by.epamtc.komarov.client_server.bean.Component;

import java.io.Serializable;
import java.util.Objects;

public class PunctuationMark implements Serializable, Component {

    private final String punctuationMark;

    public PunctuationMark(String punctuationMark) {
        this.punctuationMark = punctuationMark;
    }

    @Override
    public String getComponent() {
        return punctuationMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PunctuationMark that = (PunctuationMark) o;
        return punctuationMark.equals(that.punctuationMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(punctuationMark);
    }

    @Override
    public String toString() {
        return "PunctuationMark{" +
                "punctuationMark='" + punctuationMark + '\'' +
                '}';
    }
}
