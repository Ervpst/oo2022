import java.util.Scanner;

public class Car {
    String mark;
    String värv;
    int väljalase;
    double läbisõit;
    int hind;


    public Car(String mark, String värv, int väljalase, double läbisõit, int hind) {
        this.mark = mark;
        this.värv = värv;
        this.väljalase = väljalase;
        this.läbisõit = läbisõit;
        this.hind = hind;
    }
    Scanner scanner = new Scanner(System.in);
    int raha = scanner.nextInt();


    public void autoOst() {
        System.out.println("Sulle jääb alles peale ostu" + (raha -  hind) + " eurot" );
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", värv='" + värv + '\'' +
                ", väljalase=" + väljalase +
                ", läbisõit=" + läbisõit +
                ", hind=" + hind +
                '}';
    }
}
