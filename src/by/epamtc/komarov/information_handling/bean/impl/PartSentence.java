package by.epamtc.komarov.information_handling.bean.impl;

import by.epamtc.komarov.information_handling.bean.Component;

import java.io.Serializable;
import java.util.*;

public class PartSentence implements Serializable, Component{

    private final List<Component> partSentence;

    public PartSentence(List<Component> partSentence){
        this.partSentence = partSentence;
    }

    public void addPartSentence(Component component){
        partSentence.add(component);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartSentence that = (PartSentence) o;
        return partSentence.equals(that.partSentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partSentence);
    }

    @Override
    public String toString() {
        return "PartSentence{" +
                "partSentence=" + partSentence +
                '}';
    }

    @Override
    public String getComponent() {
        StringBuilder com = new StringBuilder();
        for (Component element : partSentence) {
            com.append(element);
        }

        return String.valueOf(com);
    }
}
