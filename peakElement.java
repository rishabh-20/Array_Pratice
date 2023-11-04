package gfg;

public class peakElement {
	public static int peak(int[] num) {
		if(num.length==1) 
		{
			return 0;
		}
		if(num[0]>num[1]) 
		{
			return 0;
		}
		if(num[num.length-1]>num[num.length-2]) 
		{
			return num[num.length-1];
		}
		for(int i=1;i<=num.length-2;i++) {
			if(num[i]>num[i-1] && num[i]>num[i+1]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num={3,4,2};
		int[] num={1,2,3};
		System.out.println(peak(num));

	}

}
