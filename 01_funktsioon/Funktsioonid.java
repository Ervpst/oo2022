import java.util.Scanner;


public class Funktsioonid {
    public static void main(String[] args) {
        //while funktsioon
        Scanner arv = new Scanner(System.in);
        System.out.println("Sisesta korduste arv:");
        double kordused = arv.nextDouble();
        prindiWhileTsükkel(kordused);

        //matemaatika punktide funktsioon
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta matemaatika punktid:");
        double punktid = scanner.nextDouble();
        System.out.println(punktidMatemaatikas(punktid));

        //lugemine massiivist
        Scanner koht = new Scanner(System.in);
        System.out.println("Sügis, Talv, Kevad, Suvi:");
        System.out.println("Sisesta mitmendat aastaaega soovid:");
        double mitmes = koht.nextDouble();
        System.out.println(massiiviLugemine(mitmes));

    }

    public static void prindiWhileTsükkel(double kordused) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < kordused);
    }

    public static String punktidMatemaatikas(double punktid) {
        if (punktid < 50) {
            return "Sa ei saa ikka üldse hakkama!!! :(";
        } else if (punktid < 60) {
            return "Arenemise ruumi on veel küllaga";
        } else if (punktid < 70) {
            return "Midagi nagu oskaksid";
        } else if (punktid < 80) {
            return "Natukene peaksid rohkem õppima";
        } else if (punktid < 90) {
            return "Kuule päris hea juba";
        } else if (punktid < 100 || punktid == 100) {
            return "Matemaatika on sul ikka käpas";
        } else {
            return "Kuule kuule sellist tulemust sa küll ei saanud";
        }
    }


    public static String massiiviLugemine (double mitmes){
        String[] aastaaeg = {"Sügis", "Talv", "Kevad", "Suvi"};
        return aastaaeg[(int) mitmes -1];
    }

}