package day5;

public class TypeConversion {
	public static void main(String args[] ){
		//implicit casting
		System.out.println("IMPLICIT CASTING\n");
		System.out.println("..................");
		byte a = 123;
		System.out.println("BYTE NO: "+a);
		short b = a;
		System.out.println("BYTE TO SHORT: "+ b);
		short c = 32767;
		System.out.println("SHORT NO: "+c);
		int d = c;
		System.out.println("SHORT TO INT: "+ d);
		int e = 23456789;
		System.out.println("INT NO: "+e);
		long f = e;
		System.out.println("INT TO LONG: "+ f);
		char h = 's';
		System.out.println("CHAR: "+ h);
		int g = h;
		System.out.println("CHAR TO INT: "+ g);
		System.out.println("..................\n");
		System.out.println("");
		//explicit casting
		System.out.println("EXPLICIT CASTING\n");
		System.out.println("..................");
		long j = 456789673;
		System.out.println("LONG NO: "+j);
		int k = (int)j;
		System.out.println("LONG TO INT: "+ k);
		int l = 23456789;
		System.out.println("INT NO: "+l);
		short m = (short)l;
		System.out.println("SHORT TO INT: "+ m);
		short n = 32767;
		System.out.println("SHORT NO: "+n);
		byte y = (byte)n;
		System.out.println("SHORT TO BYTE: "+ y);
		int u = 97;
		System.out.println("CHAR: "+ u);
		char v = (char)u;
		System.out.println("CHAR TO INT: "+ v);
		System.out.println("THE END.");
		System.out.println("..................");
		
		
		
	}

}
