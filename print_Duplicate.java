package pratice1;

import java.util.Scanner;

public class print_Duplicate {
	public static void duplicate(int[] num) {
		int pair=0;
		for(int i=0;i<=num.length-1;i++) {
			int count=1;//(1)(2)(3)(4)
			for(int j=i+1;j<=num.length-1;j++)
			{
				if(num[i]==num[j])
				{
					count++;
					num[j]=-1;
				}
			}
			if(num[i]!=-1 && count>1)//-->print Duplicate
			//if(num[i]!=-1 && count==1)--> print unique
			//if(num[i]!=-1)-->print frequency
			//if(num[i]!=-1) --> remove Dupliacte
			{
				//System.out.println(num[i]+" ");
				pair=pair+count/2;
				
			}
			
		}
		System.out.println(pair);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Size: ");
		int n=sc.nextInt();
		int[] num=new int[n];
		System.out.println("Enter The Element: ");
		for(int i=0;i<=n-1;i++) {
			num[i]=sc.nextInt();
		}
		duplicate(num);

	}

}
