package by.epamtc.module_4.task06;

public class Runner {

    public static void main(String[] args) {
        // Обязательно просмотреть и решить.

        int a1 = 1000000;
        int d = -1000;
        int n = 1;
        int an = (a1 + d * (n-1));
        double sn = 0;
        System.out.println("annnnnn = " + an);

        for (n = 0; ; n += d) {
            an = (a1 + d * (n-1));
            sn += (a1 + an) * 2 / 2;

            if(sn > Integer.MAX_VALUE)
                break;

            System.out.println("n = " + n);
            System.out.println("an = " + an);
            System.out.println("sn = " + sn);

        }

        System.out.println("n = " + n);
        System.out.println("an = " + an);
        System.out.println("sn = " + sn);
    }
}