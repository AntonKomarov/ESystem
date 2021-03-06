package by.epamtc.komarov.module_one.eighth;

public class TaskEight {

    public static void main(String[] args) {
        System.out.println(getFunctionResultOnTheSegment(5, 40, 3, 7));
    }

    public static int getFunctionResultOnTheSegment(int fromA, int toB, int step, int valueC){

        int functionResult = 0;

        for (int x = fromA; x <= toB; x += step) {

            if(x == 15) {
                functionResult = (x + valueC) * 2;
            }
            else {
                functionResult = (x - valueC) + 6;
            }
        }

        return functionResult;
    }
}