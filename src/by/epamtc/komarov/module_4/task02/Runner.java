package by.epamtc.komarov.module_4.task02;

public class Runner {

    public static void main(String[] args) {
        System.out.println(findDateByNumber(128));
    }

    public static int findDateByNumber (int number){
        int date = 0;

        if(number <= 31){
            date = 31 - number;
            System.out.println("January");
        }

        if(number > 31 && number <= 59 ){
            date = number - 31;
            System.out.println("February");
        }

        if(number > 59 && number <= 90){
            date = number - 59;
            System.out.println("March");
        }

        if(number > 90 && number <= 120){
            date = number - 90;
            System.out.println("April");
        }

        if(number > 120 && number <= 151){
            date = number - 120;
            System.out.println("May");
        }

        if(number > 151 && number <= 181){
            date = number - 151;
            System.out.println("June");
        }

        if(number > 181 && number <= 212){
            date = number - 181;
            System.out.println("July");
        }

        if(number > 212 && number <= 243){
            date = number - 212;
            System.out.println("August");
        }

        if(number > 243 && number <= 273){
            date = number - 243;
            System.out.println("September");
        }

        if(number > 273 && number <= 304){
            date = number - 273;
            System.out.println("October");
        }

        if(number > 304 && number <= 334){
            date = number - 304;
            System.out.println("November");
        }

        if(number > 334 && number <= 365){
            date = number - 334;
            System.out.println("December");
        }

        return date;
    }
}