/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	try {
	    
	    
	   Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t != 0) {
            int store=0;
            int store1 = 0;
            int p_a = in.nextInt();
            int p_b = in.nextInt();
            int q_a = in.nextInt();
            int q_b = in.nextInt();

            if(p_a<p_b){
                store= p_b;
            }
            else{
                store = p_a;
            }

            if(q_a<q_b){
                store1 = q_b;
            }
            else{
                store1 = q_a;
            }


            if(store<store1){
                System.out.println("P");
            } else if(store1<store){
                System.out.println("Q");
            } else if(store1==store){
                System.out.println("TIE");
            }


            t--;
        }  
	} catch(Exception e) {
	    return ;
	}
	
	}	
		
}

