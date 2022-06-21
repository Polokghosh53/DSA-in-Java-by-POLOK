public static void main(String[] args) {
		String str = "GeeksForGeeks";
		System.out.println(recurLen(str));
	}
	
	public static int recurLen(String str) {
	    if (str.equals("")) {
	        return 0;
	    } else {
	        return recurLen(str.substring(1)) + 1;
	    }
	}
