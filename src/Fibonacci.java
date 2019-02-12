import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int i=0,j=1;
		int temp=0;
		
		System.out.println("Enter End range of fibonacci:\t");
		Scanner input = new Scanner(System.in);
		int end = input.nextInt();
		if(end==1)
		{
			System.out.println(i+"\t"+j);
		}if(end>1) {
			System.out.print(i+"\t"+j+"\t");
			while(temp<end) {
				temp=i+j;
				i=j;
				j=temp;
				System.out.print(temp+"\t");
			}
		}
		
	}

}
