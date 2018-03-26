/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author ajeet
 */
import java.io.*;
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void star(int n) 
    {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
        }System.out.print(" ");
    }
    public static void main(String arg[])
    {
        int n=5;
        star(n);
    }
    
}
