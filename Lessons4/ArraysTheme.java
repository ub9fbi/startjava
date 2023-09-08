package Lessons4;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class ArraysTheme {
    private int[] sumNumbs;

    public static void main(String[] args) {
        reversArray();
        summElementsArray();


        System.out.println("Удаление элементов массива");
        Random random = new Random();
        int delArrayElementSize = 15;
        double[] delArrayElement = new double[delArrayElementSize];
        // заполнение массива
        for (int i = 0; i < delArrayElement.length; i++) {
            delArrayElement[i] = random.nextDouble();
        }
        // средний индекс массива
        int avereg = delArrayElement.length / 2;
        System.out.print("Средний индекс массива: " + avereg + "\nЕго значение: " + delArrayElement[avereg] + "\n");

        // заполнение массива 0 если его элементы больше среднего элемента
        for (int i = 0; i < delArrayElement.length; i++) {
            if (delArrayElement[i] > delArrayElement[avereg]) {
                delArrayElement[i] = 0;
            }
        }

        DecimalFormat df = new DecimalFormat("#,###.###");
        System.out.println("Исходный массив:");
        for (double elem : delArrayElement) {
            System.out.printf("%s ", df.format(elem));
        }

        System.out.println();
        for (double elem : delArrayElement) {
            if (elem > 0) {
                System.out.format("%.3f ", elem);
            } else if (elem == 0) {
                System.out.print("0,000 ");
            } else {
                System.out.print(elem + " ");
            }
        }
        System.out.println();

        System.out.println("4. Вывод алфавита лесенкой");
        char[] arraySimvol = new char[26];
        for (int i = 0; i < arraySimvol.length; i++) {
            arraySimvol[i] = (char) (i + 65);
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println(45);
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    private static void reversArray() {
        System.out.println("1. Реверс значений массива");
        int[] numbs = {1, 7, 4, 5, 2, 6, 3};
        System.out.println("Массив до реверса: " + Arrays.toString(numbs));
        for (int i = 0; i < numbs.length; i++) {
            numbs[0] = 3;
            numbs[1] = 6;
            numbs[2] = 2;
            numbs[4] = 4;
            numbs[5] = 7;
            numbs[6] = 1;
        }
        System.out.print("Массив после реверса: " + Arrays.toString(numbs));
    }
    private static void summElementsArray() {
        System.out.println("2. Произведение элементов массива");
        int numbersSize = 9;
        int[] numbers = new int[numbersSize];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        int R = numbers[0] * numbers[1] * numbers[2] * numbers[3] * numbers[4] * numbers[5] *
                numbers[6] * numbers[7] * numbers[8];
        System.out.print(numbers[0] + " * " + numbers[1] + " * " + numbers[2] + " * " + numbers[3]
                + " * " + numbers[4] + " * " + numbers[5] + " * " +
                numbers[6] + " * " + numbers[7] + " * " + numbers[8] + " = " + R);
    }
}
