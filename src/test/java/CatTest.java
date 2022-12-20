import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;
    Cat felix = new Cat(feline);

    @Test
    public void testGetFood() throws Exception {
        Cat barsik = new Cat(feline);
        barsik.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();

    }

    @Test
    public void testCatGetSoundPositive() {
        Assert.assertEquals("Мяу", felix.getSound());
    }

    @Test
    public void testCatGetSoundNegative() {
        Assert.assertNotEquals("Гав", felix.getSound());
    }

}
