public class Main {
    public static void main(String[] args) {

        Data data = new Data("Lada", "Oranž", 1970, 820301, 10000);
        Car car = new Car(data,2500, 30);

        System.out.println("Sisesta oma raha kogus: ");

        String carData = car.getInfo();

        data.autoOst();

        System.out.println(carData);

    }
}