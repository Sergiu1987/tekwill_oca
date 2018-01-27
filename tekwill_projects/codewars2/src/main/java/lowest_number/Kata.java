package lowest_number;

public class Kata {
    public static int sum(int[] numbers) {
        int sumTotala = 0;
        int minNumber = numbers[0];
        int maxNumber = numbers[0];
        for (int number : numbers) {
            sumTotala += number;
            if (number < minNumber) {
                minNumber = number;
            } else if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return sumTotala - minNumber - maxNumber;
    }
}