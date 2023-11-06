package gfg;

public class MissingNumber {
	public static int missing(int[] num,int n) {
		int expectedno=(n*(n+1))/2;//{1,2,3,4}--10
		int actualsum=0;
		int missingno=0;
		for(int i=0;i<=num.length-1;i++)
		{
			actualsum+=num[i]; //i=0 as=1 i=1 as=5 i=2 as as=8 
		}
		missingno=expectedno-actualsum;
		
		return missingno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,2,3,4};
		int n=5;
		System.out.println(missing(num,n));

	}

}
