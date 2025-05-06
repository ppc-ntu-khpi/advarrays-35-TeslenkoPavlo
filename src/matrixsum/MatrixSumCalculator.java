package matrixsum;

import java.util.Arrays;

/**
 * Утилітарний клас для обчислення суми елементів матриці.
 * <p>
 * Клас використовує потоки Java (Streams API) для оптимізації коду
 * та уникнення явних циклів.
 */
public class MatrixSumCalculator {

    /**
     * Обчислює суму всіх елементів матриці.
     * 
     * @param matrix Вхідна матриця розміром N x M
     * @return Сума всіх елементів матриці
     * @throws NullPointerException якщо матриця або її рядки дорівнюють null
     */
    public static int calculateSum(int[][] matrix) {
        return Arrays.stream(matrix)
                     .flatMapToInt(Arrays::stream)
                     .sum();  // Використовуємо IntStream для ефективного підсумовування
    }
}