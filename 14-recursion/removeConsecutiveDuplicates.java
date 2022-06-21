public static void main(String[] args) {
	    String S1 = "geeksforgeeks";
        System.out.println(removeConsDupli(S1));
	}
	
	public static String removeConsDupli(String str) {
	    if (str.length() <= 1) {
	        return str;
	    }
	    if (str.charAt(0) == str.charAt(1)) {
	        return removeConsDupli(str.substring(1));
	    } else {
	        return str.charAt(0) + removeConsDupli(str.substring(1));
	    }
	}
