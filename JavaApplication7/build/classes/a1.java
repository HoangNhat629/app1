
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class a1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kich thuc mang :");
        int n = sc.nextInt();
        int[] matrix = new int[n];
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("a [" + i + "]");
            matrix[i] = sc.nextInt();
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < matrix.length; i++) {
            if ((matrix[i] / 100) % 2 != 0 && matrix[i] <= 999 && matrix[i] >= 100) {
                System.out.println(matrix[i]);
            }
            if ((matrix[i] / 10) % 2 != 0 && matrix[i] <= 99 && matrix[i] >= 10) {
                System.out.println(matrix[i]);
            }
            if (matrix[i] % 2 != 0 && matrix[i] <= 9 && matrix[i] >= 1) {
                System.out.println(matrix[i]);
            }
        }
    }
}
