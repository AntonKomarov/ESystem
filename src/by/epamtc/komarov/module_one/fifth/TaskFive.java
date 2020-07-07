package by.epamtc.komarov.module_one.fifth;

public class TaskFive {

    public static void main(String[] args) {

        System.out.println("summa: " + getSum(137));
        System.out.println("multiplication: " + getMult(137));
        System.out.println("last to begin: " + setLastToBeginThousand(137));
    }

    public static int getHundred(int number){
        return number / 100;
    }

    public static int getTenth(int number){
        return ((number % 100)) / 10;
    }

    public static int getUnit(int number){
        return number % 10;
    }

    public static int getSum(int number){
        return getHundred(number) + getTenth(number) + getUnit(number);
    }

    public static int getMult(int number){
        return getHundred(number) * getTenth(number) * getUnit(number);
    }

    public static int setLastToBeginThousand(int number){
        return (getUnit(number) * 1000) + number;
    }
}
