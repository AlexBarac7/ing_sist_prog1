package Laborator5;

public class AppLab5 {
    public static void main() {
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator
                .add(5)
                .subtract(3)
                .multiply(2)
                .result();
        System.out.println("a) " + result);
        AdvancedCalculator calc = new AdvancedCalculator(3);
        int res = calc
                .subtract(2)
                .power(10)
                .add(26)
                .root(3)
                .result();

        System.out.println("b) " + res);

    }
}
