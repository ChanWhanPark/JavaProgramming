public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p1 = "A barking dog";
		String p2 = "A barking Dog";
		
		char s1 = p1.charAt(5);
		int s2 = p1.compareTo(p2);
		String s3 = p1.concat(" never Bites!");
		boolean s4 = p1.equals(p2);
		boolean s5 = p1.equalsIgnoreCase(p2);
		boolean s6 = p1.isEmpty();
		int s7 = p1.length();
		String s8 = p1.replace(s1, 'A');
		String s9 = p1.substring(2, 7);
		String s10 = p1.toLowerCase();
		String s11 = p1.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s10);
		System.out.println(s11);
	}

}
