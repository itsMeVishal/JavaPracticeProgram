import java.util.Arrays;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String input = "count the total number of occurrences";
		StringBuffer reverseString = new StringBuffer("");
		/*String[] words = input.split("\\s");
		for(String word:words) {*/
			reverseString.append(reverse(input));
		/*}*/
		System.out.println(reverseString);
	}

	private static String reverse(String word) {
		char[] chars = word.toCharArray();
		char[] reverseChars = new char[chars.length];
		for(int i=0,j=chars.length-1;i<chars.length;i++,j--) {
			reverseChars[i]=chars[j];
		}
		return Arrays.toString(reverseChars).replaceAll(",","");
	}
}
