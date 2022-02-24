public class Main {
    public static void main(String[] args) {
        Car one = new Car("BMW", "must", 1997, 254233, 4000);
        Car two = new Car("Lada", "Oranž", 1970, 820301, 1000000);

        System.out.println(one);
        System.out.println(two);

        System.out.println("Sisesta oma raha summa: ");

        one.autoOst();
        two.autoOst();


    }
}
