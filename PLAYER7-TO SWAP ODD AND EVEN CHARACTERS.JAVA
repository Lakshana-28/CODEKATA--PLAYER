/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddeven;

import java.util.Scanner;

/**
 *
 * @author Lakshana Sampath
 */
public class Oddeven {
    //private static boolean c;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a;
        char c = 0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        char b[]=a.toCharArray();
        int l=b.length;
        for(int i=0;i<l;i+=2)
        {
            if(i==l-1)
            {
                 c=b[i];
            }
            else
            {
            char temp=b[i];
            b[i]=b[i+1];
            b[i+1]=temp;
            
        }
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(b[i]);
        }
       //System.out.print(l);
        
        
        
        
        
    }
        // TODO code application logic here
    }
    

