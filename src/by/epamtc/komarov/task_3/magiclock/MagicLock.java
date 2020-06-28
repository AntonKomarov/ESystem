package by.epamtc.komarov.task_3.magiclock;

public class MagicLock {

    public static void main(String[] args) {

        int[] array = new int[]{6, 2, 3, 3, 4, 5, 6, 2, 3, 2};
        int sum = 0;

        print(array);

        for (int i = 0; i < array.length-2; i++) {

            sum = array[i] + array[i + 1] + array[i + 2];

            if (sum < 10) {

                do {

                    if (array[i] < 6) {
                        array[i] += 1;
                    } else if (array[i + 1] < 6) {
                        array[i + 1] += 1;
                    } else if (array[i + 2] < 6) {
                        array[i + 2] += 1;
                    }

                    sum += 1;

                    System.out.print("\n" + array[i] + " " + array[i + 1] + " " + array[i + 2] + " sum = " + sum);

                } while (sum != 10);
            }
            if (sum == 10) {
                System.out.print(" the lock is open");
                break;
            }
        }
    }

    public static void print(int[] array){
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
