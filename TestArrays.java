import java.util.Arrays;
public class TestArrays {
	public static void main(String arg[]){
		int[] a = { 44, 77 ,55, 33, 66 ,99 ,22};
		for(int i = 0 ; i<=6 ; i++){
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		Arrays.sort(a);
		for(int i = 0 ; i<=6 ; i++){
		System.out.print(a[i] + "  ");}
		System.out.println();
		for(int i = 0 ; i<=6 ; i++){
		int p = a[i];	
		int k = Arrays.binarySearch(a, p);
		System.out.print("Arrays.binarySearch(a, a[i]) : " + k);
		System.out.println();
		}
	
		int[] b = new int[8];
		for(int i = 0 ; i<=7 ; i++){
			System.out.print(b[i] +  " ");
		}
		System.out.println();
		Arrays.fill(b , 88);
		for(int i = 0 ; i<=7 ; i++){
		System.out.print(b[i] + " ");}
		System.out.println();
		System.out.print("Arrays.equal(a ,b) : " + Arrays.equals(a,b));
	}
}

