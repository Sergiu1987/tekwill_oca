package triangle_tester;

public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c){
        return (a>0 && b>0 && c>0 && a+b>c && c+b>a && a+c>b);
    }

    public static void main(String[] args) {
        System.out.println(TriangleTester.isTriangle(7, 2, 8));
    }
}


