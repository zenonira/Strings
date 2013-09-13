class Strings {
	public static void main(String[] args) {
		String str = new String("A string");
		String s = "A string";

		// if (s.equals(str)) {
		// 	System.out.println("A");
		// } else {
		// 	System.out.println("B");
		// }

		// for (int i = 0; i<str.length(); i++) {
		// 	System.out.println(str.charAt(i));
		// }

		// for (int i=0; i<str.length()-1; i++) {
		// 	System.out.println(str.substring(i, i+2));
		// }

		// if (contains("baseball", "ball")) {
		// 	System.out.println("Yes");
		// } else {
		// 	System.out.println("No");
		// }

		//System.out.println(count("people", "e"));
		// if (Palindrome("ssss")) {
		// 	System.out.println("Yes");
		// } else {
		// 	System.out.println("No");
		// }
		
		// if (hasAnA("aaaa")) {
		// 	System.out.println("Yes");
		// } else {
		// 	System.out.println("No");
		// }
		
		if (abecedarian("fawka")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static boolean abecedarian(String s) {
		for (int i= 0; i < s.length(); i++) {
			if ((s.charAt(i) - s.charAt(i+1)) < 0) {
				return true;
			}
		}

		return false;
	}

	public static boolean hasAnA(String s) {
		for (int i = 0; i<s.length(); i++) {
			if (s.substring(i, i+1).equals('a')) {
				return true;
			}
		}
		return false;
	}

	public static int count(String s, String t){
		int total= 0;
		for (int i =0; i<=s.length()-t.length(); i++) {
			if (s.substring(i, i + t.length()).equals(t)) {
				total++;
			}
		}
		return total;
	}

	// public static boolean Palindrome(String s) {
	// 	for (int i=0; i<s.length(); i++) {
	// 		if (s.charAt(i).equals(s.charAt(s.length()-i))) {
	// 			return true;
	// 		} else {
	// 				return false;
	// 			}
	// 		}	
	// 	}

		

	public static boolean contains(String s, String t) {
		for (int i=0; i<s.length()-t.length()+1; i++) {
			if (s.substring(i, i+t.length()).equals(t) ) {
				return true;
			}
		}

		return false;
	}
}