public class PalindromeString {
	public static void main(String[] args) {
		String a=" mom";
		String palindrome="";
		for(int i=a.length()-1;i>=0;i--) {
			palindrome = palindrome + a.charAt(i);
		  }
		if(a.equals(palindrome)) {
			System.out.println("mom is a palindrome");
		}
		
		else {
			System.out.println("mom is not a palindrome");
			
		}
	}

}
