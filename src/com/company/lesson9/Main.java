package com.company.lesson9;

public class Main {

    public static void main() {
        String[] content = getMatrixContent();

        try {
            String[][] matrix = Matrix.getMatrix(5, content);
            System.out.printf("Сумма значений матрицы: %d", Matrix.getSum(matrix));

        } catch (MyArraySizeException exception) {
            System.out.println(exception.getMessage());

        } catch (NumberFormatException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static String[] getMatrixContent() {
        return new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "-"};
    }

}
