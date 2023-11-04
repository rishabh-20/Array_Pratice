package rotate;

public class left_rotate {
	public static int[] leftrotate(int[]num) {
		int first=num[0];
		for(int i=0;i<=num.length-2;i++) {
			num[i]=num[i+1];
		}
		num[num.length-1]=first;
		for(int i=0;i<=num.length-1;i++) {
			System.out.print(num[i]+" ");
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {3,4,2,6,7,5};
		leftrotate(num);

	}

}
