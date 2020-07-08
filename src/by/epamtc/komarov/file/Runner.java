package by.epamtc.komarov.file;

import by.epamtc.komarov.file.helper.Print;
import by.epamtc.komarov.file.helper.ReadFile;

public class Runner {

    public static void main(String[] args) {

        String[] good = String.valueOf(ReadFile.toStringBuilder("App.txt")).split("\n");

        Print.printGood(good, new Oven(), "height 40");
        Print.printGood(good, new Laptop(), "memory rom 8000");
        Print.printGood(good, new Speakers(), "FREQUENCY RANGE = 2-4");
        Print.printGood(good, new TabletPC(), "color");
        Print.printGood(good, new Refrigerator(), "WEIGHT 30");
        Print.printGood(good, new VacuumCleaner(), "motor SPEED-REGuLATION=2900");

    }
}
