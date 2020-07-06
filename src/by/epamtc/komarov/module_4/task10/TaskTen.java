package by.epamtc.komarov.module_4.task10;

import java.util.Scanner;

public class TaskTen {

    public static void main(String[] args) {

        int rightNumber = 0;
        int leftNumber = 0;
        int middleNumber;
        boolean flagSeqNum = false;
        boolean flagCharacter = false;

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            middleNumber = rightNumber;
            rightNumber = scanner.nextInt();

            if (rightNumber == 0) {
                break;
            } else {
                if (middleNumber < rightNumber) {
                    flagSeqNum = true;
                }
                if (leftNumber == rightNumber) {
                    System.out.println(leftNumber + " " + middleNumber + " " + rightNumber);
                }
                if ((middleNumber > 0 && rightNumber > 0) || (middleNumber < 0 && rightNumber < 0)) {
                    flagCharacter = true;
                }
            }

            leftNumber = middleNumber;
        }

        System.out.println(getSequence(flagSeqNum));
        System.out.println(getMarkSequence(flagCharacter));
    }

    public static String getMarkSequence(boolean flagCharacter){

        if(flagCharacter)
            return "хаотичные знаки";
        else
            return "знаки чередуются";
    }

    public static String getSequence(boolean flagSeqNum){

        if(flagSeqNum)
            return "не возрастающая";
        else
            return "возрастающая";
    }
}