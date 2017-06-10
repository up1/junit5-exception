public class Calculator {
    public void divide(int divisor, int dividend) {
        if(dividend == 0) {
            throw new DivideByZeroException("กากนะ");
        }
    }
}
