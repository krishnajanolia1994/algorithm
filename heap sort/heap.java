
import java.util.Scanner;


public class heap {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int []ar=new int[n];
        for(i=0;i<n;i++)
            ar[i]=sc.nextInt();
        sorth(ar);
        for(i=0;i<n;i++)
            System.out.print(ar[i]+"  ");
    }

    private static void sorth(int[] ar) {
        int l=ar.length;
        int i;
        for(i=l/2-1;i>=0;i--)
        {
            hipy(ar,l,i);
        }
        for(i=l-1;i>=0;i--)
        {
            int temp=ar[i];
            ar[i]=ar[0];
            ar[0]=temp;
            hipy(ar,i,0);
        }
    }

    private static void hipy(int[] ar, int n, int i) {
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n&&ar[l]>ar[largest])
            largest=l;
        if(r<n&&ar[r]>ar[largest])
            largest=r;
        if(largest!=i)
        {
            int temp=ar[i];
            ar[i]=ar[largest];
            ar[largest]=temp;
            hipy(ar,n,largest);
        }
    }
    
}

