package Array;

import java.util.Arrays;
//logic 2
public class merge2 {
	public static int[] merge(int[]n1,int[]n2) {
		int[]res=new int[n1.length+n2.length];
		int j=0;
		for(int i=0;i<=res.length-1;i++) {
			if(i<=n1.length-1) {
				res[i]=n1[i];
			}else {
				res[i]=n2[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(res));
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]n1= {2,3,4,5};
		int[]n2= {6,7,8};
		merge(n1,n2);

	}

}
