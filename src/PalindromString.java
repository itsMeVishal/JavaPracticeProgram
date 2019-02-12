
public class PalindromString {

	public static void main(String[] args) {
		
		String input="aba";
		
		char[] inputArray = input.toCharArray();
		boolean flag=true;
				
		for(int i=0,j=inputArray.length-1;i<j;i++,j--) {
			
			if(inputArray[i]==inputArray[j])
			{
				continue;
				
				
			}else {
				flag=false;
			}
		}
		System.out.println(flag?"Palindrom":"Not Palindrom");
		
	}

}
