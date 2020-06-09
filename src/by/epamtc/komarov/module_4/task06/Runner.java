package by.epamtc.komarov.module_4.task06;

public class Runner {

    public static void main(String[] args) {
        System.out.println("int = " + getMaxIntBeforeOverflow(2,3));
        System.out.println("long = " + getMaxLongBeforeOverflow(2,3));
    }

    public static int getMaxIntBeforeOverflow(int firstMemberProgression, int difference){

        int memberArithmeticProgression;
        int arithmeticProgression;
        double memberSum;

        for (memberArithmeticProgression = 2 ;; memberArithmeticProgression += difference) {

            arithmeticProgression = (firstMemberProgression + difference * (memberArithmeticProgression - 1));
            memberSum = (firstMemberProgression + arithmeticProgression) * (memberArithmeticProgression / 2.0);

            if (memberSum > Integer.MAX_VALUE)
                break;
            else if (memberSum < Integer.MIN_VALUE)
                break;
        }
        return memberArithmeticProgression;
    }

    public static long getMaxLongBeforeOverflow(int firstMemberProgression, int difference){

        long memberArithmeticProgression;
        long arithmeticProgression;
        double memberSum;

        for (memberArithmeticProgression = 2 ;; memberArithmeticProgression += difference) {

            arithmeticProgression = (firstMemberProgression + difference * (memberArithmeticProgression - 1));
            memberSum = (firstMemberProgression + arithmeticProgression) * (memberArithmeticProgression / 2.0);

            if (memberSum > Long.MAX_VALUE)
                break;
            else if (memberSum < Long.MIN_VALUE)
                break;
        }
        return memberArithmeticProgression;
    }
}