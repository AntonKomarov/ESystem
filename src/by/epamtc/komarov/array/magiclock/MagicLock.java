package by.epamtc.komarov.array.magiclock;

public class MagicLock {

    public static void main(String[] args) {

        int[] array = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1} ;
        int sum = 0;
        int first = 0;
        int index = 0;
        int element = 0;

        for (int i = 0; i < 2; i++) {
            index = (int) (Math.random() * 9);
            element = array[index] = 1 + (int) (Math.random() * 6);
            sum += element;
            first = element;
        }

        int second = sum - first;
        int addElement = 10 - sum;

        System.out.println("add: " + addElement);
        System.out.println("first: " + first);
        System.out.println("second: " + second);

        print(array);


        for (int i = 0; i < array.length; i++) {
            if (i < (array.length / 2)) {
                sum = array[i] + array[i + 1] + array[i + 2];
                System.out.println("sum = " + sum);
                if(sum != 10){
                    array[i] = addElement;
                    if(sum != 10){

                    }
                }
            } else {
                sum = array[i] + array[i - 1] + array[i - 2];
            }
        }





    }


    public static void print(int[] array){
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}


