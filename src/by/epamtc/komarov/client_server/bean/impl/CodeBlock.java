package by.epamtc.komarov.client_server.bean.impl;

import by.epamtc.komarov.client_server.bean.Component;


import java.io.Serializable;
import java.util.Objects;

public class CodeBlock implements Serializable, Component {

    private final String codeBlock;

    public CodeBlock(String codeBlock) {
        this.codeBlock = codeBlock;
    }

    @Override
    public String getComponent() {
        return codeBlock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodeBlock codeBlock1 = (CodeBlock) o;
        return codeBlock.equals(codeBlock1.codeBlock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeBlock);
    }

    @Override
    public String toString() {
        return "CodeBlock{" +
                "codeBlock='" + codeBlock + '\'' +
                '}';
    }
}
