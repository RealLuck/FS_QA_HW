import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ParamEspressoTest {

    private final Cafe cafe = new Cafe();




    @ParameterizedTest
    @MethodSource("espressoTestBeansStr")

    void espressoDontNeedMilk(int beans, int str,int expected) {


        cafe.restockBeans(beans);
        cafe.restockMilk(10);

        cafe.brew(CoffeeType.Espresso, str);

        Assertions.assertEquals(expected,cafe.getBeansInStock());
        Assertions.assertEquals(10,cafe.getMilkInStock());
    }

    static Stream<Arguments> espressoTestBeansStr(){
        return Stream.of(
                arguments(7, 1,0),
                arguments(8,1,1),
                arguments(14, 2,0),
                arguments(20, 2,6)

        );
    }
}
