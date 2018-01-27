public class TestTime {
	public static void main (String[] args) {
	    /* Testing for illegal arguments 
		TimeObject p1 = new TimeObject(24, 30, 28); 
		TimeObject p2 = new TimeObject(1, 02, 88); */
		
		TimeObject p3 = new TimeObject(4, 20, 30);
		System.out.println("p3 is '4:20:30");
		System.out.println("p3.getHour() " + p3.getHour());
		
		TimeObject p4 = new TimeObject(1, 11, 11);
		System.out.println("p4 is 1:11:11");
		System.out.println(p4.toString());
	}
    
}

//TestTime.java is missing tests for same, before, after