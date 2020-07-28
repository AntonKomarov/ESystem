package by.epamtc.komarov.information_handling.bean;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    private List<Sentence> sentences;

    {
        sentences = new ArrayList<>();
    }

    public List<Sentence> getSentences(){
        return sentences;
    }

    public void addSentences(Sentence sentence){
        this.sentences.add(sentence);
    }
}
