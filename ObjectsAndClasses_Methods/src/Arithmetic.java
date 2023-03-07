public class Arithmetic {
    private int a;
    private int b;
    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int sumNum() {
        return a + b;
    }
    public int multiPlicationNum() {
        return a*b;
    }
    public int maxInTwoNum() {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
    public int minInTwoNum() {
        if (a <= b) {
            return b;
        } else {
            return a;
        }
    }
    public String print() {
        return ("Сумма чисел: " + sumNum() + "\n" +
        "Произведение чисел: " + multiPlicationNum() + "\n" +
        "Максимальное из чисел: " + maxInTwoNum() + "\n" +
        "Минимальное из чисел: " + minInTwoNum());
    }
}