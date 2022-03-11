//Algarvud
//
//* Teata, kas kasutaja sisestatud arv jagub kahe, kolme viie või seitsmega.
//* Teata, kas kasutaja sisestatud arv on algarv.
//* Koosta massiiv esimese tuhande algarvuga. Leia selle sõela abil, millised on kümme suurimat algarvu, mis on väiksemad, kui tuhandenda algarvu ruut.
import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Arrays;

public class Algarvud {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta endale sobiv arv: ");
        int arv = scanner.nextInt();
        System.out.println(algArv(arv));
        System.out.println(arvuJagumine(arv));

    }

    public static int arvuJagumine(int arv) {
        if (arv % 2 == 0) {
            System.out.println("Arv " + arv + " jagub kahega!");
        }
        if (arv % 3 == 0) {
            System.out.println("Arv " + arv + " jagub kolmega!");
        }
        if (arv % 5 == 0) {
            System.out.println("Arv " + arv + " jagub viiega!");
        }
        if (arv % 7 == 0) {
            System.out.println("Arv " + arv + " jagub seitsmega!");
        } else {
            if (arv % 2 != 0 && arv % 3 != 0 && arv % 5 != 0 && arv % 7 != 0) {
                System.out.println("See arv jagub millegi muuga!!");
            }
        }
        return arv;
    }

    public static String algArv(int arv) {
        int temp;
        boolean onalgarv = true;
        for (int i = 2; i <= arv / 2; i++) {
            temp = arv % i;
            if (temp == 0) {
                onalgarv = false;
                break;
            }
        }
        if (onalgarv)
            return arv + " on algarv!";
        else
            return arv + " ei ole algarv!";
    }
}