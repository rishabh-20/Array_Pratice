package rotate;
import java.util.Scanner;
public class rightzero {
	public static int[] right(int[] num) {
		int last=num[num.length-1];
		for(int i=num.length-1;i>=1;i--) {
			num[i]=num[i-1];
		}
		num[0]=last;
		for(int i=0;i<=num.length-1;i++) {
			System.out.print(num[i]+" ");
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size: ");
		int n=sc.nextInt();
		int[] num=new int[n];
		System.out.println("Enter The Element: ");
		for(int i=0;i<=n-1;i++) {
			num[i]=sc.nextInt();
		}
		right(num);

	}

}
