package calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Inceput de calculare: ");
        int a = 5;
        int b = 12;
        int c = 3;
        int d = 7;
        int e = 6;
        int f = 14;

        int sumResult = sum(a, b );
        System.out.println(a+ " + " +b+ " = " +sumResult);
        System.out.println("Diferenta prin utilizare a argumentelor fara definire ");
        System.out.println("5 + 12 = " +sum(5,12));
        System.out.println("_____________________");

        int scadResult = scaderea(sumResult, c);
        System.out.println(sumResult+ " - " +c+ " = " +scadResult);
        System.out.println("Diferenta prin utilizare a argumentelor fara definire ");
        System.out.println(sum(5,12) + " - 3 = " +scaderea(sum(5,12), 3));
        System.out.println("_____________________");

        int multiResult = multiplay(scadResult, d);
        System.out.println(scadResult+ " * " +d+ " = " +multiResult);
        System.out.println("Diferenta prin utilizare a argumentelor fara definire ");
        System.out.println(scaderea(sum(5,12),3) + " * 7 = " +multiplay(scaderea(sum(5,12),3),7  ));
        System.out.println("_____________________");

        double impaResult = impartirea(multiResult, e);
        System.out.println(multiResult+ " / " +e+ " = " +impaResult);
        System.out.println("Diferenta prin utilizare a argumentelor fara definire ");
        System.out.println(multiplay(scaderea(sum(5,12),3),7)+ " / 6 = "+ impartirea(multiplay(scaderea(sum(5,12),3),7),6));
        System.out.println("_____________________");

        double putereResult = putere(impaResult, f);
        System.out.println(impaResult+ " ^ " +f+ " = " +putereResult);
        System.out.println("Diferenta prin utilizare a argumentelor fara definire ");
        System.out.println("2 ^ 3 = " +Math.pow(2,3));
        System.out.println("_____________________");

        System.out.println("Sfarsit de calculare !");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int scaderea(int c, int d) {
        return c - d;
    }

    static int multiplay(int e, int f) {
        return e * f;
    }

    static double impartirea( int a, double b) {
        return a / b;
    }

    static double putere (double op1, int op2) {
        return Math.pow(op1, op2);
    }

}
