import java.util.Scanner;

public class Data {
    String mark;
    String värv;
    int väljalase;
    double läbisõit;
    int hind;


    public Data(String mark, String värv, int väljalase, double läbisõit, int hind) {
        this.mark = mark;
        this.värv = värv;
        this.väljalase = väljalase;
        this.läbisõit = läbisõit;
        this.hind = hind;
    }

    public void autoOst() {
        Scanner scanner = new Scanner(System.in);
        int raha = scanner.nextInt();
        System.out.println("Sulle jääb alles peale ostu " + (raha -  hind) + " eurot" );
    }

    @Override
    public String toString() {
        return "Andmed{" +
                "mark='" + mark + '\'' +
                ", värv='" + värv + '\'' +
                ", väljalase=" + väljalase +
                ", läbisõit=" + läbisõit +
                ", hind=" + hind +
                '}';
    }
}