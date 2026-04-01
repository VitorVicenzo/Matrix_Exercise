package matrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] mat = new int[M][N];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int pos_matrix = sc.nextInt();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (pos_matrix == mat[i][j]) {
                    System.out.println("Position: " + i  + "," + j);
                    if (mat[i][j-1] != 0 ) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                }
            }
        }
        sc.close();
    }

    
}