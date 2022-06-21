public static void main(String[] args) {
	    int n = 15;
	    if (primeNum(n,2)) {
	        System.out.println("Prime");
	    } else {
	        System.out.println("Not prime");
	    }
	}
	
	public static boolean primeNum(int num, int i) {
	    if (num <= 2) {
	        return (num == 2) ? true : false; // 1 is not a prime, since 1 has only 1 factor. Prime no. has 2 factors
	    } 
	    if (num % i == 0) {
	        return false;
	    }
	    // here if the divisor is multiplied to be greater than the num, hence prime which is 
	    // generally i * i meaning it does not have more than 2 factors
	    if (i * i > num) {
	        return true;
	    }
	    return primeNum(num, i + 1);
	}
