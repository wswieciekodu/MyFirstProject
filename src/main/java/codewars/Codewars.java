package codewars;

import java.util.Arrays;
import java.util.Random;

public class Codewars {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().maxMemory() / 1_000_000_000 + " GB of memory available.");

        int length = 1_000;
        int[] array = prepareTableFromRandomNumbersFromMinus10To10(length);
        System.out.println("Array of random integers between -100 and 100 of size: " + length);

        long startJunior = System.nanoTime();
        sumLikeJunior(array);
        long endJunior = System.nanoTime();
        System.out.println("Like a Junior elapsed Time in nano seconds: \t" + (endJunior - startJunior));

        long startSenior = System.nanoTime();
        sumLikeSenior(array);
        long endSenior = System.nanoTime();
        System.out.println("Like a Senior elapsed Time in nano seconds: \t" + (endSenior - startSenior));

        long startParallel = System.nanoTime();
        sumLikeSeniorParallel(array);
        long endParallel = System.nanoTime();
        System.out.println("Like a Senior parallel stream elapsed Time in nano seconds: " + (endParallel - startParallel));
    }

    private static int[] prepareTableFromRandomNumbersFromMinus10To10(int length) {
        int[] array = new int[length];
        Random random = new Random();
        int min = -100;
        int max = 100;

        for (int i = 0; i < length - 1; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }

    public static int sumLikeJunior(int[] array) {
        int sum = 0;

        for (int number : array) {
            if (number > 0) {
                sum += number;
            }
        }

        return sum;
    }

    public static int sumLikeSenior(int[] array) {
        return Arrays.stream(array)
                .filter(a -> a > 0)
                .reduce(Integer::sum)
                .getAsInt();
    }

    public static int sumLikeSeniorParallel(int[] array) {
        return Arrays.stream(array)
                .parallel()
                .filter(a -> a > 0)
                .reduce(Integer::sum)
                .getAsInt();
    }
}
