package rotate;

import java.util.Scanner;

public class evenleft_oddright {
	    public static int[] even_odd(int[] num) {
	        int[] res = new int[num.length];
	        int m = 0;
	        int n = num.length - 1;
	        for (int i = 0; i <= num.length - 1; i++) {
	            if (num[i] % 2 == 0) {
	                res[m] = num[i];
	                m++;
	            }
	            if (num[i] % 2 != 0) {
	                res[n] = num[i];
	                n--;
	            }
	        }
	        // Remove the 'j--;' line from here
	        print(res);
	        return res;
	    }

	    public static void print(int[] res) {
	        for (int i = 0; i <= res.length - 1; i++) {
	            System.out.print(res[i] + " ");
	        }
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
		even_odd(num);

	}

}
