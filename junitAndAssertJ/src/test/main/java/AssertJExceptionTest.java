import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AssertJExceptionTest {

    private final Cafe cafe = new Cafe();

    @Test
    void cantRestockNegativeBeans(){
        assertThatThrownBy(() -> cafe.restockBeans(-1)).isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    void cantRestockNegativeMilk(){
        assertThatThrownBy(() -> cafe.restockMilk(-1)).isInstanceOf(IllegalArgumentException.class);

    }


    @Test
    void cantBrewEspressoWhitLessBeansThatRequired() {
        cafe.restockBeans(6);

        assertThatThrownBy(() -> cafe.brew(CoffeeType.Espresso)).isInstanceOf(IllegalStateException.class);
    }

    @Test
    void cantBrewLatteWhitLessBeansThatRequired() {
        cafe.restockBeans(6);
        cafe.restockMilk(227);

        assertThatThrownBy(() -> cafe.brew(CoffeeType.Latte)).isInstanceOf(IllegalStateException.class);
    }

    @Test
    void cantBrewLatteWhitLessMilkThatRequired() {
        cafe.restockBeans(7*2);
        cafe.restockMilk(227*2-1);

        assertThatThrownBy(() -> cafe.brew(CoffeeType.Latte, 2)).isInstanceOf(IllegalStateException.class);
    }

    @Test
    void cantBrewFilterCoffeeWhitLessBeansThatRequired() {
        cafe.restockBeans(9);

        assertThatThrownBy(() -> cafe.brew(CoffeeType.FilterCoffee)).isInstanceOf(IllegalStateException.class);
    }
}
