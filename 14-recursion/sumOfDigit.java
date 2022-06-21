public static void main(String[] args) {
		int n = 12345;
		System.out.println(sumOfDigit(n));
	}
	
	public static int sumOfDigit(int n) {
	    if (n == 0) {
	        return 0;
	    } else {
	        return (n % 10 + sumOfDigit(n/10));
	    }
	}
