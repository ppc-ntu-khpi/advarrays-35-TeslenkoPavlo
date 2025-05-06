package matrixsum;

public class MatrixSumCalculatorTest {

    public static void main(String[] args) {
        // Тест 1: Стандартна матриця
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int expected1 = 21;
        int result1 = MatrixSumCalculator.calculateSum(matrix1);
        System.out.println("Test 1: " + (result1 == expected1 ? "True" : "False"));

        // Тест 2: Матриця з негативними числами
        int[][] matrix2 = {{-1, -2}, {-3, -4}};
        int expected2 = -10;
        int result2 = MatrixSumCalculator.calculateSum(matrix2);
        System.out.println("Test 2: " + (result2 == expected2 ? "True" : "False"));

        // Тест 3: Матриця 1x1
        int[][] matrix3 = {{100}};
        int expected3 = 100;
        int result3 = MatrixSumCalculator.calculateSum(matrix3);
        System.out.println("Test 3: " + (result3 == expected3 ? "True" : "False"));

        // Тест 4: Порожній рядок (допустимий в Java)
        int[][] matrix4 = {{}};
        int expected4 = 0;
        int result4 = MatrixSumCalculator.calculateSum(matrix4);
        System.out.println("Test 4: " + (result4 == expected4 ? "True" : "False"));
    }
}