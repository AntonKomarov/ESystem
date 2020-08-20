package by.epamtc.komarov.information_handling.bean.impl;

import by.epamtc.komarov.information_handling.bean.Component;

import java.io.Serializable;
import java.util.*;

public class Text implements Serializable, Component {

    // Text creates with codeblock and sentences
    // Object creates with components not only read text from file

    private final List<Component> text = new ArrayList<>();

    @Override
    public String getComponent() {
        StringBuilder com = new StringBuilder();
        for (Component element : text) {
            com.append(element);
        }

        return String.valueOf(com);
    }

    public void addComponent(Component component){
        text.add(component);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return text.equals(text1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "Text{" +
                "text=" + text +
                '}';
    }
}
