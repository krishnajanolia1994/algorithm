
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class NewMain7 {

    int[] ar;
    
    public static void main(String[] args) {
        int[] a=new int[10];
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        NewMain7 ob=new NewMain7();
        ob.ar=a;
        heap oh=new heap();
        oh.heapsort(ob);
        for(i=0;i<10;i++)
            System.out.print(ob.ar[i]+"  ");
    }
    
}
