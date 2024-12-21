public class Lab2 {
    public static void main(String[] args) {
        // Завдання 24
        double a24 = 0.345;
        double b24 = -2.25;
        double c24 = 2.65;
        double d24 = 3.99;

        double result24;
        if (c24 <= 0 || a24 < 0) {
            result24 = Double.NaN; // Некоректні дані
        } else {
            double numerator24 = Math.cos(b24) + Math.sin(Math.sqrt(a24));
            double denominator24 = 2 * Math.log10(c24) + Math.exp(d24);
            result24 = numerator24 / denominator24;
        }
        System.out.println("Результат завдання 24: " + (Double.isNaN(result24) ? "Некоректні дані" : result24));

        // Завдання 15
        double a15 = 1.25;
        double b15 = 3.09;
        double c15 = 4.25;
        double d15 = 0.56;

        double result15;
        if (b15 < -1 || b15 > 1) {
            result15 = Double.NaN; // Некоректні дані
        } else {
            double firstTerm15 = 2 * Math.sqrt(Math.tan(a15) / Math.abs(Math.acos(b15)));
            double secondTerm15 = 3 * Math.cbrt(Math.pow(Math.E, c15 - a15) * Math.sinh(d15));
            result15 = firstTerm15 - secondTerm15;
        }
        System.out.println("Результат завдання 15: " + (Double.isNaN(result15) ? "Некоректні дані" : result15));

        // Завдання 6
        double a6 = -1.23;
        double b6 = -0.34;
        double c6 = 0.707;
        double d6 = 2.312;

        double result6;
        if (a6 == 0 || b6 == 0 || (Math.sin(c6) + Math.exp(d6)) < 0) {
            result6 = Double.NaN; // Некоректні дані
        } else {
            double logTerm6 = Math.log10(Math.abs(b6 / a6));
            double sqrtTerm6 = Math.sqrt(Math.sin(c6) + Math.exp(d6));
            result6 = 3 * (logTerm6 + sqrtTerm6);
        }
        System.out.println("Результат завдання 6: " + (Double.isNaN(result6) ? "Некоректні дані" : result6));
    }
}
