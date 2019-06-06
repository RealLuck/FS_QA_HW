import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JunitFilterCoffeeTest {

    private final Cafe cafe = new Cafe();






    @Test
    void filterCoffeBrewDontTakeMilk() {


        cafe.restockBeans(10);
        cafe.restockMilk(111);


        cafe.brew(CoffeeType.FilterCoffee);

        assertEquals(0,cafe.getBeansInStock());
        assertEquals(111,cafe.getMilkInStock());

    }

    @Test
    void filterCoffeeBrewDontTakeAllBeans() {


        cafe.restockBeans(11);



        cafe.brew(CoffeeType.FilterCoffee);

        assertEquals(1,cafe.getBeansInStock());


    }



    @Test
    void filterCoffeeStrenghtWorkCorrect() {


        cafe.restockBeans(10*3);


        cafe.brew(CoffeeType.FilterCoffee, 3);

        Assertions.assertEquals(0,cafe.getBeansInStock());

    }

    @Test
    void filterCoffeeStrenghtDontTakeAllBeans() {


        cafe.restockBeans(10*2+1);


        cafe.brew(CoffeeType.FilterCoffee, 2);

        Assertions.assertEquals(1,cafe.getBeansInStock());

    }

    @Test
    void filterCoffeStrenghtDontTakeMilk() {


        cafe.restockBeans(10*2);
        cafe.restockMilk(111);

        cafe.brew(CoffeeType.FilterCoffee, 2);

        Assertions.assertEquals(0,cafe.getBeansInStock());
        Assertions.assertEquals(111,cafe.getMilkInStock());
    }





}
