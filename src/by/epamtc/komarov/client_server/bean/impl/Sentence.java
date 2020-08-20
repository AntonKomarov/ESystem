package by.epamtc.komarov.client_server.bean.impl;

import by.epamtc.komarov.client_server.bean.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence implements Serializable, Component {

    private final List<Component> partsSentence;

    public Sentence() {
        partsSentence = new ArrayList<>();
    }

    @Override
    public String getComponent() {

        StringBuilder part = new StringBuilder();

        for (Component component : partsSentence) {
            part.append(component.getComponent());
        }

        return String.valueOf(part);
    }

    public void addPart(Component component) {
        partsSentence.add(component);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return this.partsSentence.equals(sentence.partsSentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partsSentence);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "partsSentence=" + partsSentence +
                '}';
    }
}