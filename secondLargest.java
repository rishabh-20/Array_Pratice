package gfg;

public class secondLargest {
	public static int slargest(int[] num) {
		int max=num[0];
		int smax=0;
		for(int i=1;i<=num.length-1;i++)
		{
			if(num[i]>max) {
				smax=max;
				max=num[i];
			}
			else if(num[i]<max && num[i]>smax) {
				smax=num[i];	
			}
		}
		return smax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int[] num={10, 20, 30, 20, 40, 10, 50};
		System.out.println(slargest(num));

	}

}
