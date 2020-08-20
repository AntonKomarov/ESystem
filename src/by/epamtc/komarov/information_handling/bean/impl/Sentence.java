package by.epamtc.komarov.information_handling.bean.impl;

import by.epamtc.komarov.information_handling.bean.Component;

import java.io.Serializable;
import java.util.*;

public class Sentence implements Serializable, Component {

    private final StringBuilder sentence;

    public Sentence(StringBuilder sentence){
        this.sentence = sentence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence1 = (Sentence) o;
        return sentence.equals(sentence1.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentence);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence=" + sentence +
                '}';
    }

    @Override
    public String getComponent() {
        return String.valueOf(sentence);
    }
}
