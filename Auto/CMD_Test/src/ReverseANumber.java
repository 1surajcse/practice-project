
public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=233;
		
		num=reverseNumber(num);
		System.out.println(num);

	}

	private static int reverseNumber(int num) {
		int reverse=0;
		while(num>0){
			reverse=reverse*10+num%10;
			num=num/10;
		}
		return reverse;
	}

}
