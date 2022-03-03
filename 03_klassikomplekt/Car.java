public class Car {
    Data data;
    int kaal;
    int ratas;

    public Car(Data data, int kaal, int ratas){
        this.data = data;
        this.kaal = kaal;
        this.ratas = ratas;

    }

    public String getInfo() {
        return "Auto on andmed on; " + this.data + ". Auto kaal on: " + this.kaal + ". Ratta diameeter on: " + this.ratas + " sentimeetrit.";
    }
}