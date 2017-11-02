public class Hello {

    public static void main(String[] args){
        System.out.println("Hello World");
        int a = 5;
        int b = 10;
        int result = sum(a, b);
        System.out.println("Sum of " + a + " + " +b+ " = "+result);
    }

    private static int sum(int a, int b){
        return a + b ;
    }


}
