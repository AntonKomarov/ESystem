package by.epamtc.komarov.task_3.magiclock;

public class MagicLock {

    public static void main(String[] args) {

        int[] array = new int[]{5, 1, 1, 3, 4, 5, 6, 2, 3, 2};
        int sum = 0;

        for (int element : array) {
            System.out.print(element + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length-2; i++) {

            sum = array[i] + array[i + 1] + array[i + 2];

            if (sum < 10) {
                System.out.print(array[i] + " " + array[i + 1] + " " + array[i + 2] + " sum = " + sum);

                for (int j = 0 ;; j++) {

                    if (array[i] < 6)
                        array[i] += 1;
                    else if (array[i + 1] < 6)
                        array[i + 1] += 1;
                    else if (array[i + 2] < 6)
                        array[i + 2] += 1;

                    sum += 1;

                    System.out.print("\n" + array[i] + " " + array[i + 1] + " " + array[i + 2] + " sum = " + sum);

                    if (sum == 10) {
                        System.out.println();

                        break;
                    }
                }
            }
            if (sum == 10) {
                System.out.print(array[i] + " " + array[i + 1] + " " + array[i + 2] + " sum = " + sum);
                System.out.println(" the lock is open");
                break;
            } 
        }
    }
}
