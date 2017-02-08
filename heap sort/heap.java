/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class heap {
    public void heapsort(NewMain7 ob)
    {
        int j;
        int l=ob.ar.length;
        for(j=0;j<l;j++)
        {
            hipify(ob,j);
            
        }
    }

    public int hipify(NewMain7 ob, int j) {
        int l=ob.ar.length;
        if(j>=l)
            return 0;
        else
        {
            int li,m;
            li=2*j+1;
            m=2*j+2;
            hipify(ob,li);
            hipify(ob,m);
           
            if(li<l)
            {
                if(ob.ar[li]>ob.ar[j])
                {
                    int temp=ob.ar[li];
                    ob.ar[li]=ob.ar[j];
                    ob.ar[j]=temp;
                }
            }
            if(m<l)
            {
                if(ob.ar[m]>ob.ar[j])
                {
                    int temp=ob.ar[m];
                    ob.ar[m]=ob.ar[j];
                    ob.ar[j]=temp;
                }
            }
            
            return 0;
        }
        
    }
    
}
