import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Testid {

    @Test
    public void Kontrolli_kas_auto_mootorit_on_vaja_vahetada() {
        Car Car = new Car("Lada", "Oranž", 1970, 10000, 2000001);
        assertEquals("Autol on vaja mootori vahetust.", Car.mootoriVahetus());
    }

    @Test
    public void Kontrolli_kas_auto_mark_on_ikka_Lada() {
        Car Car = new Car("Lada", "Oranž", 1970, 10000, 2000001);
        assertEquals("Auto mark on Lada.", Car.õigeMark());
    }
    @Test
    public void Kontrolli_kas_auto_väljalaskmisest_on_moodas_40_aastat() {
        Car Car = new Car("Lada", "Oranž", 1970, 10000, 2000001);
        assertEquals("Väljalaskmisest on möödas 40 aastat.", Car.aastadMoodas());
    }



    }