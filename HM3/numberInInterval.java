// HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
// покрыть тестами метод на 100%


public boolean numberInInterval(int n) {
    return n > 25 && n < 100;
}


@Test
public void testNumberInInterval() {
    // Test with number within the interval
    assertTrue(numberInInterval(50));

    // Test with number below the lower bound
    assertFalse(numberInInterval(10));

    // Test with number above the upper bound
    assertFalse(numberInInterval(120));

    // Test with number equal to the lower bound
    assertFalse(numberInInterval(25));

    // Test with number equal to the upper bound
    assertFalse(numberInInterval(100));
}
