class AllDataTypes{

	public static void main (String args[]){

		boolean isOn =false;                //size=1 bit   (1byte=8bits)
		byte byteValue =11;                 //size=1 bit       
		short shortValue = 777;             //size=2 byte / 16 bits  
		int intValue = 1234;                //size=4 byte / 32 bits
		long longValue =1234567890;         //size=8 byte / 64 bits    
		float pi =3.14f;                    //size=4 byte / 32 bits
		double gravity =9.8;                //size=8 byte / 64 bits
		char letter = 'Y';                  //size=2 byte / 16 bits

		System.out.println(isOn);
		System.out.println(byteValue);
		System.out.println(shortValue);
		System.out.println(intValue);
		System.out.println(longValue);
		System.out.println(pi);
		System.out.println(gravity);
		System.out.println(letter);

	}
	
}