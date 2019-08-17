
import static java.lang.Math.sqrt;
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
//giai phuong trinh bac hai ax^2+bx+c=0
public class baitap2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float a  ,b, c, denta, x1, x2 ;
    System.out.println("nhap vao gia tri a:");
    a = sc.nextFloat();
    System.out.println("nhap vao gia tri b:");
    b = sc.nextFloat();
    System.out.println("nhap vao gia tri c:");
    c = sc.nextFloat();   
    denta = b*b - 4*a*c;
    if (a == 0) {
        if (b == 0){
            System.out.println("phuong trinh co nghiem la:" + c);}
        else { System.out.println("phuong trinh co nghiem la" + -c/b );}
        return;
    }
    if (denta > 0){
        x1 = (float) (-b + sqrt(denta)/(2*a));
        x2 = (float) (-b - sqrt(denta)/(2*a));
        System.out.println("phuong trinh co 2 nghiem la x1:" + x1 + "va x2:" + x2);}
    else if (denta == 0){
        System.out.println("phuong trinh co nghiem kep la:" + (-b)/(2*a) );}
    else System.out.println("[huong trinh vo nghiem");
    
        
        }
    }
    


