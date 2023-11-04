package Array;

import java.util.Scanner;

public class check_equalsArray {
	public static boolean check(int[]n1,int[]n2) {
//		if(n1.length==n2.length) {
//			for(int i=0;i<=n1.length-1;i++) {
//				if(n1[i]!=n2[i]) {
//					return false;
//				}
//				else {
//					return true;
//				}
//			}
//		}
//		return false;
		if(n1.length!=n2.length) {
			return false;
		}
		for(int i=0;i<=n1.length-1;i++) {
			if(n1[i]!=n2[i]) {
				return false;
			}
		}
		return true;
		
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
//		System.out.println(check(n1,n2));
		int n1[]= {3,4,5,6,7};
		int n2[]= {3,4,5,6,7};
		System.out.println(check(n1,n2));
//	
		

	}

}
