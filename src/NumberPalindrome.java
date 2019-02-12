
public class NumberPalindrome {

	public static void main(String[] args) {
		
		Integer number = 12121;//221;
		
		int divisor=1;
		Boolean flag=false;
		for(int i =10; number/i>=1;i*=10) {
			
			divisor*=10;
			
		}
		int right = divisor;
		int left = 10;
		System.out.println(divisor);
		if(right>left) {
			while(right>left) {
				if((number/right)%left==number%left) {
					right/=10;
					left*=10;
					number = number-right;
					flag=true;
				} else {
					flag=false;
					break;
				}
			}
		}else {
			
			if(number/right==number%left) {
				flag= true;
			}
		}
		System.out.println(flag);
	}

	private static boolean isPalindrome(Integer number, int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}

}
