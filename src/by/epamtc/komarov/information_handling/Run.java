package by.epamtc.komarov.information_handling;

import by.epamtc.komarov.information_handling.bean.CodeBlock;
import by.epamtc.komarov.information_handling.dao.ReadFile;
import by.epamtc.komarov.information_handling.dao.ReadFileImpl;
import by.epamtc.komarov.information_handling.model.Create;


import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ReadFile readFile = new ReadFileImpl();
        String text = String.valueOf(readFile.
                readToStringBuilder("src/by/epamtc/komarov/information_handling/resources/text.txt"));

        CodeBlock outputCodeBlock = new Create().codeBlock(text);

        String fileName = "src/by/epamtc/komarov/information_handling/resources/textCodeBlock.txt";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(outputCodeBlock);
        System.out.println("Object has been written to file");
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        CodeBlock inputCodeBlock = (CodeBlock)ois.readObject();
        System.out.println("Object has been read from file");
        System.out.println(inputCodeBlock);
        ois.close();
    }

    public static void printWord(String text){
        Pattern pattern = Pattern.compile("[A-Za-zА-Яа-я]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }


//        Pattern digit = Pattern.compile("\\d+");
//        Pattern partOfSentence = Pattern.compile("(\\d+)|([A-Za-zА-Яа-я]+)|(\\W+)");
//        Pattern sentence = Pattern.compile("(\\.+.+[$\\n])|((\\d+\\.)+.+[$\\n])|((.+?\\n*?)+?[:.!?]\\s?)");



}
