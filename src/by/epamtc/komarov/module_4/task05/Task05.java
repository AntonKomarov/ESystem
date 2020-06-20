package by.epamtc.komarov.module_4.task05;

public class Task05 {

    public static void main(String[] args) {
        System.out.println("summa: " + getSumNumber(137));
        System.out.println("multiplication: " + getMultNumber(137));
        System.out.println("last to begin: " + getLastElementToTheBeginThousand(137));
    }

    public static int getHundredPart(int number){
        return number / 100;
    }

    public static int getTenthPart(int number){
        return ((number % 100)) / 10;
    }

    public static int getUnitPart(int number){
        return number % 10;
    }

    public static int getSumNumber(int number){
        return getHundredPart(number) + getTenthPart(number) + getUnitPart(number);
    }

    public static int getMultNumber(int number){
        return getHundredPart(number) * getTenthPart(number) * getUnitPart(number);
    }

    public static int getLastElementToTheBeginThousand(int number){
        return (getUnitPart(number) * 1000) + number;
    }
}
