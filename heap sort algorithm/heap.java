
package javaapplication1;

import java.util.Scanner;

public class heap{

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int ar[]=new int [n];
        int i;
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        krishna kn=new krishna();
        kn.heapsort(ar,n);
    }
    
}
