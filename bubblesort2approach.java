package Array;

import java.util.Arrays;

public class bubblesort2approach {
	public static int[] bubble(int[] num) {
		for(int i=0;i<=num.length-1;i++) {
			boolean b=false;
			//if j+1 have to go to last index so j to last-1
			for(int j=0;j<=num.length-2;j++) {
				if(num[j]>num[j+1]) {
					b=true;
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
			if(b==false) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(num));
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {4,3,1,2,5};
		bubble(num);

	}

}
