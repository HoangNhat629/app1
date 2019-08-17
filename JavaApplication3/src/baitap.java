
import static java.lang.Math.pow;
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
//nhap vaof 2 so a va b tonh tong hieu thuong tich luy thua
public class baitap {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a  ,b , c , d , x;
    float y;
    double z;
    System.out.println("nhap vao gia tri a:");
    a = sc.nextInt();
    System.out.println("nhap vao gia tri b:");
    b = sc.nextInt();
    c = a + b;
    d = a - b;
    x = a*b;
    y = a/b;
    z =  pow(a,b);
    System.out.println("tong hai so la:" + c);
    System.out.println("hieu hai so la:" + d);
    System.out.println("thuong hai so la:" + y);
    System.out.println("tich hai so la:" + x);
    System.out.println("luy thua hai so la:" + z);
    
        
        
    }
    
}
