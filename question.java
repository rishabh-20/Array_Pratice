package Array;
//count no of notes required to get the required amount

public class question {
	public static int count(int[]notes,int amount) {
		int total=0;
		for(int i=0;i<=notes.length-1;i++) {
			total=total+amount/notes[i];
			if(amount%notes[i]==0) {
				break;
			}
			amount=amount%notes[i];
		}
		return total;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] notes= {1000,500,200,100,50,20,10};
		int amount=3250;
		System.out.println(count(notes,amount));

	}

}
