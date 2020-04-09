/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import java.util.Scanner;



/**
 *
 * @author Zainab Jaffar
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static double area(double rad, double pie){
        double area = pie * rad * rad;
        return area;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here 9
        
        double rad;
  double pie = 3.14;
  Scanner s = new Scanner(System.in);
  System.out.print("Enter radius of circle:");
  rad = s.nextDouble();
  Circle c=new Circle();
  System.out.println("Area of circle:" + c.area(rad,pie));
    }
    
}
