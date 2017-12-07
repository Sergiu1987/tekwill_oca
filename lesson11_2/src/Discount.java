public class Discount {
    public static void main(String[] args) {
        System.out.println(calcDiscount(1, 500));
        System.out.println(calcDiscount(1, 1000));
        System.out.println(calcDiscount(2, 500));
        System.out.println(calcDiscount(2, 1000));
        System.out.println(calcDiscount(3, 400));
        System.out.println(calcDiscount(3, 600));
        System.out.println(calcDiscount(4, 600));

    }

    /**
     * public static int calcDiscount(int type, int amount){
     * int discount =0;
     * if (type == 1){
     * discount = 5;
     * if (amount > 900){
     * discount = 10;
     * }
     * <p>
     * } else if (type == 2){
     * discount = 0;
     * if (amount > 900){
     * discount = 7;
     * }
     * } else if (type == 3){
     * discount = 5;
     * if (amount < 500){
     * discount = 8;
     * }
     * } else
     * System.out.println("Type > 3 nu exista");
     * <p>
     * <p>
     * <p>
     * <p>
     * <p>
     * return (amount*discount)/100;
     * <p>
     * }
     */
    public static int calcDiscount(int type, int amount) {
        int discount = 0;
        switch (type) {
            case 1:
                if (type == 1) {
                    discount = 5;
                    if (amount > 900) {
                        discount = 10;
                    }
                    }
                break;
            case 2:
                if (type == 2) {
                    discount = 0;
                    if (amount > 900) {
                        discount = 7;
                    }
                }
                break;
            case 3:
                if (type == 3) {
                    discount = 5;
                    if (amount > 500) {
                        discount = 8;
                    }
                }
                break;
            default:
                System.out.println("Type > 3 nu exista");


        }
        return (amount*discount)/100;
    }


}

