import com.example.Feline;
import com.example.FelineGetFood;
import com.example.FelineGetKittens;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
//..
import java.io.IOException;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    @Mock
    private FelineGetKittens felineGetKittens;
    FelineGetFood felineGetFood = new Feline();

    @Test
    public void testLionGetKittensPositive() throws Exception{
        Lion simba = new Lion("Самец",felineGetKittens,felineGetFood);
        Mockito.when(felineGetKittens.getKittens()).thenReturn(5);
        Assert.assertEquals(5,simba.getKittens());
    }

    @Test
    public void testLionGetKittensNegative() throws Exception{
        Lion simba = new Lion("Самец",felineGetKittens,felineGetFood);
        Mockito.when(felineGetKittens.getKittens()).thenReturn(6);
        Assert.assertNotEquals(4,simba.getKittens());
    }

    @Test
    public void testLionDoesHaveManeYes() throws Exception{
        Lion simba = new Lion("Самец",felineGetKittens,felineGetFood);
        Assert.assertTrue(simba.doesHaveMane());
    }

    @Test
    public void testLionDoesHaveManeNo() throws Exception{
        Lion nalla = new Lion("Самка", felineGetKittens, felineGetFood);
        Assert.assertFalse(nalla.doesHaveMane());
    }

}
