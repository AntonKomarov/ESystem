package by.epamtc.komarov.information_handling.bean.impl;

import by.epamtc.komarov.information_handling.bean.Component;

import java.io.Serializable;
import java.util.*;

public class CodeBlock implements Serializable, Component {

    private StringBuilder codeBlock;

    @Override
    public String getComponent(){
        return String.valueOf(codeBlock);
    }
    public CodeBlock(StringBuilder codeBlock){
        this.codeBlock = codeBlock;
    }

    public StringBuilder getCodeBlock() {
        return codeBlock;
    }

    public void setCodeBlock(StringBuilder codeBlock) {
        this.codeBlock = codeBlock;
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
                "codeBlock=" + codeBlock +
                '}';
    }
}
