package by.epamtc.komarov.client_server.bean.impl;

import by.epamtc.komarov.client_server.bean.Component;

import java.io.Serializable;
import java.util.Objects;

public class Word implements Serializable, Component {

    private final String word;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String getComponent() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word1 = (Word) o;
        return word.equals(word1.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                '}';
    }
}