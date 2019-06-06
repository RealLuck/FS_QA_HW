import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class JunitCoffeLatteTest {


        private final Cafe cafe = new Cafe();






    @Test
    void latteBrewWorks() {


        cafe.restockBeans(7);
        cafe.restockMilk(227);


        cafe.brew(CoffeeType.Latte);

        assertEquals(0,cafe.getBeansInStock());
        assertEquals(0,cafe.getMilkInStock());

    }

    @Test
    void latteBrewDontTakeAllBeans() {


        cafe.restockBeans(8);
        cafe.restockMilk(227);


        cafe.brew(CoffeeType.Latte);

        assertEquals(1,cafe.getBeansInStock());
        assertEquals(0,cafe.getMilkInStock());

    }

    @Test
    void latteBrewDontTakeAllMilk() {


        cafe.restockBeans(7);
        cafe.restockMilk(228);


        cafe.brew(CoffeeType.Latte);

        assertEquals(0,cafe.getBeansInStock());
        assertEquals(1,cafe.getMilkInStock());

    }



    @Test
    void latteStrenghtWorkCorrect() {


        cafe.restockBeans(21);
        cafe.restockMilk(227*3);

        cafe.brew(CoffeeType.Latte, 3);

        Assertions.assertEquals(0,cafe.getBeansInStock());
        Assertions.assertEquals(0,cafe.getMilkInStock());
    }

    @Test
    void latteStrenghtDontTakeAllBeans() {


        cafe.restockBeans(15);
        cafe.restockMilk(227*2);

        cafe.brew(CoffeeType.Latte, 2);

        Assertions.assertEquals(1,cafe.getBeansInStock());
        Assertions.assertEquals(0,cafe.getMilkInStock());
    }

    @Test
    void latteStrenghtDontTakeAllMilk() {


        cafe.restockBeans(14);
        cafe.restockMilk(227*3);

        cafe.brew(CoffeeType.Latte, 2);

        Assertions.assertEquals(0,cafe.getBeansInStock());
        Assertions.assertEquals(227,cafe.getMilkInStock());
    }





}
