class degreesRadians {
	public static void main(String[] args) {
		double rad = 30.0 * Math.PI/180.0;
		double sine = Math.sin(rad);
		double cosine = Math.cos(rad);
		double sineSquared = sine * sine;
		double cosineSquared = cosine * cosine;
		double answer = sineSquared + cosineSquared;
		System.out.println(answer);
	}
}