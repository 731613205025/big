/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package count;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Count {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             int num;
        System.out.println("enter the no:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
int length = (int) Math.log10(num) + 1;
System.out.println(length);

    }
    
}
   

