package JavaProgram2;

import java.util.ArrayList;

public class SumofMidArray {

	public static void main(String[] args) {
	
		int arr[] = { 1,0,3,1,-1,4,1};
		ArrayList<Integer> ar=new ArrayList<>();
		 
		int sumCurrent=0;
		int sumNext=0;
		      for(int i=0;i<=arr.length-1;i++) {
		          for(int j=i+1;j<=arr.length-1;j++){
		          sumNext=sumNext+arr[j];
		      }
		      
		      ar.add(arr[i]);
		      
		      for(int k=0;k<ar.size()-1;k++){
		      sumCurrent=sumCurrent+ar.get(k);
		      }
		    
		      		if(sumCurrent==sumNext){
		      			System.out.println("Mid Number: "+ arr[i] + " : " + i);
		      		}
		      		sumNext=0;
		      		sumCurrent=0;  
		      }
	}
}
