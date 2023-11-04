package gfg;
//Given an array A of positive integers.
//Your task is to find the leaders in the array.
//An element of array is leader if it is greater
//than or equal to all the elements to its right side.
//The rightmost element is always a leader. 

public class leaderOfArray {
	public static void leader(int[] num) {
		int leadervalue=num[num.length-1];
		System.out.print(leadervalue+"");
		for(int i=num.length-2;i>=0;i--) {
			if(num[i]>leadervalue) {
				leadervalue=num[i];
				System.out.print(" "+leadervalue);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={16,17,4,3,5,2};
		leader(num);

	}

}
