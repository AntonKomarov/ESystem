package by.epamtc.komarov.client_server.bean.impl;

import by.epamtc.komarov.client_server.bean.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text implements Serializable, Component {

    private final List<Component> text;

    public Text() {
        this.text = new ArrayList<>();
    }

    public void addTextComponent(Component component) {
        text.add(component);
    }

    public List<Component> getText() {
        return text;
    }

    @Override
    public String getComponent() {
        StringBuilder sb = new StringBuilder();

        for (Component component : text) {
            sb.append(component.getComponent()).append("\n");
        }

        return String.valueOf(sb);
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
