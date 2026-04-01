package matrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        Integer[][] mat = new Integer[M][N];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int pos_matrix = sc.nextInt();
        for (Integer i = 0; i < mat.length; i++) {
            for (Integer j = 0; j < mat[i].length; j++) {
                if (pos_matrix == mat[i][j]) {
                    System.out.println("Position: " + i  + "," + j);
                    if (j > 0 ) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (j < mat.length) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i > 0){
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (i < mat.length) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }

    
}