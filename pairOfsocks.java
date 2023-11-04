package topQuestion;

public class pairOfsocks {
	public static void pair(int[] num) {
		int pair=0;
		for(int i=0;i<=num.length-1;i++) {
			int count=0;
			for(int j=i+1;j<=num.length-1;j++) {
				if(num[i]==num[j]) {
					count++;
					num[j]=-1;
				}
			}
			if(num[i]!=-1 && count>0) {
				pair= pair + count/2;
			}
		}
		System.out.println(pair);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {2,3,4,5,2,3,5,6};
		pair(num);

	}

}
