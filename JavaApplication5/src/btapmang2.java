
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
public class btapmang2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doDai = 999 * 999;
        int[] a = new int[doDai];
        for (int i = 0; i < doDai; i++) {
            System.out.println("nhap vao cac phan tu :");
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < doDai; j++) {
            if (a[j] == -1) {
                System.out.println("cac phan tu da nhap: " + a[j]);
                break;
            }
        }
    }

}
