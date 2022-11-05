
public class firstDigitlastDigit {
	
	
	    public static void main(String args[])
	    {  
	        int number = 502356997;
	        int firstDigit = 3;
	        int lastDigit = 6;
	 
	        lastDigit = number%10;
	        System.out.println("Last digit: "+lastDigit);
	 
	        while(number!=0) {
	            firstDigit = number%10;
	            number /= 10;
	        }
	        System.out.println("First digit: "+firstDigit);
	    }
	}

