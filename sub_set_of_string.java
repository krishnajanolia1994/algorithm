/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class sub_set_of_string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String s="kr";
       int l=s.length();
       int []nar=new int[l];
       int sl=(int) Math.pow(2, l);
       String[] sar=new String[sl];
       substr(s,0,l,nar,sar,0);
    }

    private static void substr(String s, int i, int l,int []nar, String[] sar, int i0) {
        if(i==l)
        {
            sar[i0]=str(s,nar);
            i0++;
        }
        else
        {
            nar[i]=0;
            substr(s,i++,l,nar,sar,i0);
            nar[i]=1;
            substr(s,i++,l,nar,sar,i0);
        }
    }

    private static String str(String s, int[] nar) {
        String sa= "";
        int l=s.length();
        int i;
        for(i=0;i<l;i++)
        {
            if(nar[i]==1)
                sa+=s.charAt(i);
        }
        return sa;
    }
    
}
