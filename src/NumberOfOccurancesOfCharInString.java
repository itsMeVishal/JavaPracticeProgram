
public class NumberOfOccurancesOfCharInString {

	public static void main(String[] args) {
		String input = "count the total number of occurrences";
		
		char ch = 'c';
		char[] list= input.toCharArray();
		int count = list.length - (input.replace(""+ch,"")).length();
		System.out.println("Count:"+count);
	}
}
