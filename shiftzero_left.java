package rotate;

import java.util.Scanner;

public class shiftzero_left {
	public static int[] leftrotate(int[] num) {
		int[] res=new int[num.length];
		int j=num.length-1;
		for(int i=num.length-1;i>=0;i--){
			if(num[i]!=0) {
				res[j]=num[i];
				j--;
			}
		}
		for(int i=0;i<=res.length-1;i++) {
			System.out.print(res[i]+" ");
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size: ");
		int n=sc.nextInt();
		int[] num=new int[n];
		System.out.println("Enter The Element: ");
		for(int i=0;i<=n-1;i++) {
			num[i]=sc.nextInt();
		}
		leftrotate(num);

	}

}
