// HW 3.1. Нужно покрыть тестами метод на 100%
// Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).

public boolean evenOddNumber(int n) {
    if (n % 2 == 0) {
        return true;
    } else {
        return false;
    }
}

@Test
public void testEvenOddNumber() {
// четное число
    boolean result1 = evenOddNumber(2);
    assertTrue(result1);

// нечетное число
    boolean result2 = evenOddNumber(3);
    assertFalse(result2);

// ноль
    boolean result3 = evenOddNumber(0);
    assertTrue(result3);

// отрицательное четное число
    boolean result4 = evenOddNumber(-4);
    assertTrue(result4);

// отрицательное нечетное число
    boolean result5 = evenOddNumber(-5);
    assertFalse(result5);
}
