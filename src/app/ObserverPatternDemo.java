package app;

import java.util.Scanner;

public class ObserverPatternDemo {

    static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        Subject subject = new Subject();

        new LowTemperatureObserver(subject);
        new HighTemperatureObserver(subject);

        System.out.println("\nFirst demos. Enter temperature:");
        subject.setTemperature(sc.nextInt());

        System.out.println("\nSecond demos. Enter temperature:");
        subject.setTemperature(sc.nextInt());

        sc.close();
    }
}
