import java.util.*;
public class duplicatingArrays{
	public static void main(String arg[]){
		int []a = { 22 , 44 , 66 , 88};
		print(a);
		int []b = (int[])a.clone();
		print(b);
	}
		public static void print(int []a){
			System.out.print( " { " +a[0]);
			for(int i = 1 ; i < a.length ; i++){
				System.out.print( a[i]);
			}
		System.out.print( " } ");
			}
			
	    	
}

	