/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author student
 */
class krishna {

    void heapsort(int[] ar, int n) {
        for(int i=n/2-1;i>=0;i--)
        {
            hipyfy(ar,i);
        }
        for(int i=n-1;i>=0;i--)
        {
            swap(ar[i],ar[0]);
            hipyfy(ar,i);
        }
    }

    private void hipyfy(int[] ar, int i) {
        
        int l,r;
        l=i*2+1;
        r=i*2+2;
        int largest;
        largest=i;
        if(ar[l]>ar[largest])
            largest=l;
        if(ar[r]>ar[largest])
            largest=r;
        if(largest!=i)
        {
            swap(ar[i],ar[largest]);
            hipyfy(ar,largest);
        }
        
    }

    private void swap(int i, int i0) {
    }
    
}
