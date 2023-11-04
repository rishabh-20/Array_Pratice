package topQuestion;

public class printfrequency {
	public static void frequency(int[] num)
	{
		for(int i=0;i<=num.length-1;i++) {
			int count=0;
			for(int j=i+1;j<=num.length-1;j++) {
				if(num[i]==num[j]) {
					count++;
					num[j]=-1;
					
				}
			}
			if(count>=0 && num[i]!=-1) {
				count++;
				System.out.println(num[i]+"---> "+count);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {2,3,4,5,2,3,5,6};
		frequency(num);

	}

}
