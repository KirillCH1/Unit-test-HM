import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public void testCalculatingDiscount() {
        // Проверяем корректность расчета скидки
        double purchaseAmount = 100.0;
        int discountAmount = 10;
        double expectedAmount = 90.0;

        double actualAmount = Calculator.calculatingDiscount(purchaseAmount, discountAmount);

        assertThat(actualAmount).isEqualTo(expectedAmount);
    }
    public void testCalculatingDiscountWithZeroAmount() {
        // Проверяем случай, когда сумма покупки равна нулю
        double purchaseAmount = 0.0;
        int discountAmount = 10;
        double expectedAmount = 0.0;

        double actualAmount = Calculator.calculatingDiscount(purchaseAmount, discountAmount);

        assertThat(actualAmount).isEqualTo(expectedAmount);
    }
    
    public void testCalculatingDiscountWithZeroDiscount() {
        // Проверяем случай, когда скидка равна нулю
        double purchaseAmount = 100.0;
        int discountAmount = 0;
        double expectedAmount = 100.0;

        double actualAmount = Calculator.calculatingDiscount(purchaseAmount, discountAmount);

        assertThat(actualAmount).isEqualTo(expectedAmount);
    }
    
    public void testCalculatingDiscountWithMaximumDiscount() {
        // Проверяем случай, когда скидка равна 100%
        double purchaseAmount = 100.0;
        int discountAmount = 100;
        double expectedAmount = 0.0;

        double actualAmount = Calculator.calculatingDiscount(purchaseAmount, discountAmount);

        assertThat(actualAmount).isEqualTo(expectedAmount);
    }
    
    public void testCalculatingDiscountWithInvalidArguments() {
        // Проверяем случай, когда передаются недопустимые значения аргументов
        double purchaseAmount = -100.0;
        int discountAmount = 50;

        assertThatThrownBy(() -> Calculator.calculatingDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }

}
