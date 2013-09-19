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
		// if (Palindrome("sssy")) {
		//  	System.out.println("Yes");
		// } else {
		//  	System.out.println("No");
		// }
		
		// if (hasAnA("aaaa")) {
		// 	System.out.println("Yes");
		// } else {
		// 	System.out.println("No");
		// }
		// ji
		
		// if (abecedarian("dabdz")) {
		//  	System.out.println("Yes");
		// } else {
		//  	System.out.println("No");
		// }

		// if (isDupledrome("llaammaa")) {
		// 	System.out.println("Yes");
		// } else {
		// 	System.out.println("No");
		// }
		System.out.println(decoder("xYajruwl"));

	}

	public static String decoder(String s) {
		String code = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > 96 && s.charAt(i) < 123) {
				if (s.charAt(i) < 110) {
					code = code + (char)(s.charAt(i) + 13);
				}
				if (s.charAt(i) >= 110) {
					code = code + (char)(s.charAt(i) - 13);
				}
			}
			if (s.charAt(i) > 64 && s.charAt(i) < 91) {
				if (s.charAt(i) < 78) {
					code = code + (char)(s.charAt(i) + 13);
				}
				if (s.charAt(i) >= 78) {
					code = code + (char)(s.charAt(i) - 13);
				}
			}
		}
		return code;
	}

	public static boolean isDupledrome(String s) {
		for (int i = s.length() - 1; i >= 0; i = i - 2) {
			if (i == 0) {
				return false;
			}
			if (s.charAt(i) != (s.charAt(i-1))) {
				return false;
			}
		}
		return true;
	}
	public static boolean abecedarian(String s) {
		for (int i=s.length() - 1; i > 0; i--) {
			if (s.charAt(i - 1) > s.charAt(i)) {
				return false;
			}
		}

		return true;
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

	public static boolean Palindrome(String s) {
	 	String reverse = "";
	 	for (int i = s.length() - 1; i>=0; i--) {
	 		reverse=reverse + s.charAt(i);
	 	}
	 	if (reverse.equals(s)) {
	 		return true;
	 	}
	 	return false;

	}

		

	public static boolean contains(String s, String t) {
		for (int i=0; i<s.length()-t.length()+1; i++) {
			if (s.substring(i, i+t.length()).equals(t) ) {
				return true;
			}
		}

		return false;
	}
}