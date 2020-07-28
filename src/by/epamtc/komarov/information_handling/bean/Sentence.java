package by.epamtc.komarov.information_handling.bean;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> words;

    {
        words = new ArrayList<>();
    }

    public List<Word> getWords(){
        return words;
    }

    public void addWords(Word word){
        this.words.add(word);
    }
}
