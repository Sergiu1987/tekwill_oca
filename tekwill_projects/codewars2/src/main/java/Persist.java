class Persist {

    public static int persistence(long n) {
        int num = 0;
        int result = (int) n;

        if (n < 10) {
            return num;
        } else {
            while (n >= 10) {
                int interm = 1;
                while (result >= 10){
                    if(result % 10 == 0){
                        result /= 10;
                        continue;
                    }
                    interm *= result % 10;
                    result /= 10;
                }

                interm *= result;
                n = interm;
                result = (int)n;
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(Persist.persistence(999999999));
    }
}