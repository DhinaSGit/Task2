package org.add;

public class GreensTech {

	public void greensOmr(String l1, String l2, String l3, String l4) {
		
		System.out.println("Loaction 1"+'\t'+":"+l1+'\n'+"Location 2"+'\t'+":"+l2+'\n'+"Location 3"+'\t'+":"+l3+'\n'+"Location 4"+'\t'+":"+l4);
		
	}
	
	private void test() {
		System.out.println("test");
	}
	public static void main(String[] args) {
		
		GreensTech g = new GreensTech();
		
		g.greensOmr("OMR", "Tambaram", "Anna Nagar", "Velacherry");
		
	}
}
