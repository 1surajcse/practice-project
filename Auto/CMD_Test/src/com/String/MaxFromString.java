package com.String;

public class MaxFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="15abc20dc2";
		int largest=0;
		int secondLargest=0;
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				System.out.println(s.charAt(i));
				int no=Character.getNumericValue(s.charAt(i));
				if(no>largest) {	
				largest=no;
				
				}
				else if(largest<secondLargest){
					secondLargest=largest;
				}

			}
		}
		System.out.println("largest::"+largest);
		System.out.println("Secondlargest::"+secondLargest);
		
		
		
		
	

	}

}
