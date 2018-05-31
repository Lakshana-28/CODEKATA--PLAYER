/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camel;

import java.util.Scanner;

/**
 *
 * @author Lakshana Sampath
 */
public class Camel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
       String c;
        
        c = camelcase(s);
        System.out.println(c);
    }
    public static  String camelcase(String input)
    {
        String r="";
        if(input.length()==0)
        {
            return r;
        }
        char cur=input.charAt(0);
        char cur_up=Character.toUpperCase(cur);
        r=r+cur_up;
        for(int i=1;i<input.length();i++)
        {
            char curr=input.charAt(i);
            char pre=input.charAt(i-1);
            if(pre==' ')
            {
                char currup=Character.toUpperCase(curr);
                r=r+currup;
            }
            else
            {
                char currl=Character.toLowerCase(curr);
                r=r+currl;
                
            }
            
        }
        return r;
    
}
}

