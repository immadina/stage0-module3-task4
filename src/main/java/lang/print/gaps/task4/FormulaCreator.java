package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        byte a = 5;
        byte b = 3;
        int formula = (9 * (a^2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);

        System.out.println(formula);
    }
}
