package Array;
import java.util.Arrays;
//Merge Two Array
//n1={1,2,3,4}
//n2={5,6,7}
//o/p:- n3={1,2,3,4,5,6,7}
import java.util.Scanner;

//Logic 1

public class mergeArr {
	public static int[] merge(int[]n1,int[]n2) {
		int[] res=new int[n1.length+n2.length];
		int i=0;
		for(;i<=n1.length-1;i++) {
			res[i]=n1[i];
		}
		for(int j=0;j<=n2.length-1;j++) {
			res[i]=n2[j];
			j++;
		}
//		for(int i=0;x<=res.length-1;i++) {
//			System.out.print(res[x]+" ");
//		}
//		return res;
	System.out.println(Arrays.toString(res));
	return res;
	}

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Size: ");
//		int n=sc.nextInt();
//		int[]n1=new int[n];
//		System.out.println("Enter The first Array: ");
//		for(int i=0;i<=n1.length-1;i++) {
//			n1[i]=sc.nextInt();
//		}
//		System.out.println("Enter The Size: ");
//		int b=sc.nextInt();
//		int[]n2=new int[b];
//		System.out.println("Enter the Second Array: ");
//		for(int i=0;i<=n2.length-1;i++) {
//			n2[i]=sc.nextInt();
//		}
//		merge(n1,n2);
//		sc.close();
		int[]n1= {2,3,4,5};
		int[]n2= {6,7,8};
		merge(n1,n2);
	}
}
