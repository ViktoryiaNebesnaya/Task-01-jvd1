package by.epam.tr.main;

import java.util.Scanner;

public class step3{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
          System.out.println("Введите значение длины b>");
          double b = sc.nextDouble();
          System.out.println("Введите значение длины c>");
          double c = sc.nextDouble();
          sc.close();
          System.out.println("Периметр  равен: "+ P(b,c));
          System.out.print("Площадь равна: "+ S(b,c));
            }
     public static double S (double b, double c){
      return b + c + Math.sqrt(Math.pow(b,2.0)+Math.pow(c,2.0));
        }
   public static double P (double a, double b){
      return (a*b)/2;
       }
}
