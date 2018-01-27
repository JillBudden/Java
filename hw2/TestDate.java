public class TestDate {
	public static void main (String[] args){
		/* testing impossibilities 
		DateObject p1 = new DateObject(10, 64, 1999); 
		DateObject p2 = new DateObject(4, 31, 1999);
		DateObject p3 = new DateObject(02, 29, 2015); */
		
		DateObject p4 = new DateObject(11, 21, 1980);
		System.out.println("p4 is '11.31.1980");
		
		DateObject p5 = new DateObject(12, 12, 2012);
		System.out.println(p5.toString());
		
		DateObject p6 = new DateObject(02, 27, 2015);
		System.out.println(p6.toString()); 
	}
}

//TestDate.java is missing tests for same, before, after