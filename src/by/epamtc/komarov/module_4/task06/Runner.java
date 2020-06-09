package by.epamtc.komarov.module_4.task06;

public class Runner {

    public static void main(String[] args) {

        int a1 = 2;
        int d = 3;
        int an;
        int sn = 0;
        int n;


        for (n = 0; ; n += d) {

            an = (a1 + d * (n - 1));
            sn += (a1 + an) * 2 / 2;

            if(sn < Integer.MIN_VALUE )
                break;
        }

        System.out.println("n = " + n);
        System.out.println("an = " + an);
        System.out.println("sn = " + sn);

    }
}