/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.Arrays;

/**
 *
 * @author student
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     
        int i;
        int a[]=new int[1000];
        for(i=0;i<1000;i++)
            a[i]=i+2;
        boolean f[]=new boolean[1000];
        int j;
        char ch=1;
        boolean flag;
        for(i=0;i<1000;i++)
        {
            if(f[i])
              flag=false;
            else
            {
                flag=true;
                System.out.println(a[i]);
                for(j=i;j<1000;j++)
                {
                    if(a[j]%a[i]==0)
                        f[j]=true;
                }
            }
        }
    }
    
}
