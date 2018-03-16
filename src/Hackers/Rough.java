package Hackers;

public class Rough {

	public static void main(String[] args) {
		divisor_sum(6);
	}
	
	public static int divisor_sum(int n){
		int sum = 0;
		
		for(int i=1;i <=n;i++){
			if(n%i ==0){
				sum = sum + i;
			}
		}	
		System.out.println(sum);
		
		return sum;
	}

}
