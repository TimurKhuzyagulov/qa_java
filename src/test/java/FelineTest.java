import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class FelineTest {
    Feline feline = new Feline();


    @Test
    public void testFelineGetFamilyPositive() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testFelineGetFamilyNegative() {
        Assert.assertNotEquals("Собачьи", feline.getFamily());
    }

    @Test
    public void testFelineGetKittensNoParamsPositive() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testFelineGetKittensNoParamsNegative() {
        Assert.assertNotEquals(2, feline.getKittens());
    }

    @Test
    public void testFelineGetKittensWithParamsPositive() {
        int kittensCounts = 2;
        Assert.assertEquals(kittensCounts, feline.getKittens(kittensCounts));
    }

    @Test
    public void testFelineGetKittensWithParamsNegative() {
        int kittensCounts = 2;
        Assert.assertNotEquals(kittensCounts, feline.getKittens(kittensCounts + 1));
    }
}
