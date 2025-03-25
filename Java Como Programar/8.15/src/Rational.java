public class Rational {
    private int numerator;   // Numerador
    private int denominator; // Denominador

    // Construtor sem argumentos: valores padrão 0/1
    public Rational() {
        this(0, 1);
    }

    // Construtor com parâmetros
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominador não pode ser zero!");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce(); // Reduzir a fração
    }

    // Método para somar dois números Rational
    public static Rational add(Rational r1, Rational r2) {
        int num = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
        int den = r1.denominator * r2.denominator;
        return new Rational(num, den);
    }

    // Método para subtrair dois números Rational
    public static Rational subtract(Rational r1, Rational r2) {
        int num = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
        int den = r1.denominator * r2.denominator;
        return new Rational(num, den);
    }

    // Método para multiplicar dois números Rational
    public static Rational multiply(Rational r1, Rational r2) {
        int num = r1.numerator * r2.numerator;
        int den = r1.denominator * r2.denominator;
        return new Rational(num, den);
    }

    // Método para dividir dois números Rational
    public static Rational divide(Rational r1, Rational r2) {
        if (r2.numerator == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        int num = r1.numerator * r2.denominator;
        int den = r1.denominator * r2.numerator;
        return new Rational(num, den);
    }

    // Método para reduzir a fração
    private void reduce() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator)); // Máximo Divisor Comum
        numerator /= gcd;
        denominator /= gcd;

        // Garante que o denominador seja positivo
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Método para calcular o MDC
    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    // Representação String na forma a/b
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Representação no formato de ponto flutuante
    public String toDecimal(int precision) {
        double value = (double) numerator / denominator;
        return String.format("%." + precision + "f", value);
    }

    // Programa de teste
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2); // 1/2
        Rational r2 = new Rational(2, 3); // 2/3

        // Testar operações
        System.out.println("R1: " + r1);
        System.out.println("R2: " + r2);

        Rational sum = Rational.add(r1, r2);
        System.out.println("Soma: " + sum);

        Rational diff = Rational.subtract(r1, r2);
        System.out.println("Subtração: " + diff);

        Rational product = Rational.multiply(r1, r2);
        System.out.println("Multiplicação: " + product);

        Rational quotient = Rational.divide(r1, r2);
        System.out.println("Divisão: " + quotient);

        // Representação decimal com precisão
        System.out.println("R1 como decimal (2 casas): " + r1.toDecimal(2));
        System.out.println("R2 como decimal (3 casas): " + r2.toDecimal(3));
    }
}