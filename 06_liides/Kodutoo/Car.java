package Kodutoo;
import java.util.Scanner;

public class Car implements CarObject{
    String mark;
    String värv;
    int väljalase;
    int hind;

    public Car(String mark, String värv, int väljalase, int hind) {
        this.mark = mark;
        this.värv = värv;
        this.väljalase = väljalase;
        this.hind = hind;
    }
    public void autoOst() {
        Scanner scanner = new Scanner(System.in);
        int raha = scanner.nextInt();
        System.out.println("Sulle jääb alles peale ostu " + (raha - hind) + " eurot");
    }

    @Override
    public String getmark() {
        return mark;
    }

    @Override
    public String getvärv() {
        return värv;
    }

    @Override
    public int getväljalase() {
        return väljalase;
    }


    @Override
    public int gethind() {
        return hind;
    }
}
