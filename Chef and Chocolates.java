/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	int store;
	while(t!=0) {
		int x = in.nextInt();
		int y=in.nextInt();
		int cost =in.nextInt();
		x =x*5;
		y=y*10;
		 store = y+x;
		store = store/cost;
		System.out.println(store);
		t--;
	}
		
	}
}
