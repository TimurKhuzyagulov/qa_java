import com.example.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
//.
@RunWith(Parameterized.class)
public class GetFoodParameterizedTest {

      final private String food1;
      final private String food2;
      final private String food3;


    public GetFoodParameterizedTest(String food1, String food2, String food3) {
        this.food1=food1;
        this.food2=food2;
        this.food3=food3;
    }

    @Parameterized.Parameters(name="Набор данных: {0},{1},{2}")
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Животные","Птицы","Рыба"},
                {"Рыба","Животные","Птицы"},
        };
    }

    @Test
    public void testCatGetFood() throws Exception{
        Feline feline = new Feline();
        Cat barsik = new Cat(feline);
        Assert.assertTrue(barsik.getFood().contains(food1)
                && barsik.getFood().contains(food2)
                && barsik.getFood().contains(food3));
    }

    @Test
    public void testFelineEatMeat() throws Exception{
        Feline feline = new Feline();
        Assert.assertTrue(feline.eatMeat().contains(food1)
                && feline.eatMeat().contains(food2)
                && feline.eatMeat().contains(food3));
    }

    @Test
    public void testLionGetFood() throws Exception{
        FelineGetKittens felineGetKittens = new Feline();
        FelineGetFood felineGetFood = new Feline();
        Lion simba = new Lion("Самец",felineGetKittens,felineGetFood);
        Assert.assertTrue(simba.getFood().contains(food1)
                && simba.getFood().contains(food2)
                && simba.getFood().contains(food3));
    }
}
