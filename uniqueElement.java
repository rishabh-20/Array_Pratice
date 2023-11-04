package topQuestion;

public class uniqueElement {
	public static void unique(int[] num) {
		for(int i=0;i<=num.length-1;i++) {
			int count=1;
			for(int j=i+1;j<=num.length-1;j++) {
				if(num[i]==num[j]) {
					count++;
					num[j]=-1;
				}
				
			}
			if(num[i]!=-1 && count==1){
				System.out.print(num[i]+" ");
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] num= {2,3,4,5,2,3,5,6};
		unique(num);
	}

}
