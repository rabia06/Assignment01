/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volume_cylinder;

import java.util.Scanner;

/**
 *
 * @author minahilbse173075
 */
public class Volume_cylinder {

    /**
     * @param args the command line arguments
     */
    public static double volume_c(double radius, double height){
        double  volume=((22*radius*radius*height)/7);
        
        return volume;
    }
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the radius:");
         double r=s.nextDouble();
         System.out.println("Enter the height:");
         double h=s.nextDouble();
         Volume_cylinder v=new Volume_cylinder();
            System.out.println("volume of Cylinder is: " +v.volume_c(r,h));
    }
    
}
