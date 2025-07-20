package array;

import java.util.Scanner;

public class SprialMatrix {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            // Step 1: Read matrix dimensions
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();

            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            int[][] matrix = new int[rows][cols];

            // Step 2: Read matrix elements
            System.out.println("Enter matrix elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Step 3: Spiral Traversal
            int top = 0, bottom = rows - 1;
            int left = 0, right = cols - 1;

            while (left <= right) {

                // top print

                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i] + " ");
                }

                top++;

                // right print

                for (int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right] + " ");
                }
                right--;

                // bottom print

                // if(top<=bottom){

                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
                // }

                // left
                // if(left<=right){
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
                // }

            }
        }

    }

}
