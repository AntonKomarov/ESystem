package com.komarov.module_4.task10;

import java.util.Scanner;

public class Runner {
    static int next = 0;
    static int previous = 0;
    static int middle;
    static boolean flagSeqNum = false;
    static boolean flagCharacter = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            middle = next;
            next = scanner.nextInt();

            if (next == 0) { break; }
            if(middle < next) { flagSeqNum = true; }
            if(previous == next){ System.out.println(previous + " " + middle + " " + next); }
            if((middle > 0 && next > 0) || (middle < 0 && next < 0)) { flagCharacter = true; }

            previous = middle;
        }
        System.out.println(sequenceUpOrNot(flagSeqNum));
        System.out.println(alternatingCharacter(flagCharacter));
    }

    static String alternatingCharacter(boolean flagCharacter){
        if(flagCharacter)
            return "хаотичные знаки";
        else
            return "знаки чередуются";
    }

    static String sequenceUpOrNot(boolean flagSeqNum){
        if(flagSeqNum)
            return "не возрастающая";
        else
            return "возрастающая";
    }
}