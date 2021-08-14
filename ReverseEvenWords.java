package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Watch your actions";
		
		String[] words = input.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			
			if(i%2 == 1) {
				
				int lenOfOddIndexWords = words[i].length();
				
				for (int j = lenOfOddIndexWords-1; j >=0; j--) {
					System.out.println(words[i].charAt(j));
				}
				
			}
		}

	}

}
