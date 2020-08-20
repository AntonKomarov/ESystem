package by.epamtc.komarov.client_server.bean.impl;

import by.epamtc.komarov.client_server.bean.Component;

import java.io.Serializable;
import java.util.Objects;

public class Numeral implements Serializable, Component {

    private final String numeral;

    public Numeral(String numeral) {
        this.numeral = numeral;
    }

    @Override
    public String getComponent() {
        return numeral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numeral numeral1 = (Numeral) o;
        return numeral.equals(numeral1.numeral);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeral);
    }

    @Override
    public String toString() {
        return "Numeral{" +
                "numeral='" + numeral + '\'' +
                '}';
    }
}
