package week1.day2;

public class CharOccurenceofEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Positive";
		char[] arr = input.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
				count++;
				arr[j] = '0';
				
			}
			
		}
		
if(arr[i]!='0') {
	System.out.println(arr[i]+": "+count);
}
	}

	}
}
