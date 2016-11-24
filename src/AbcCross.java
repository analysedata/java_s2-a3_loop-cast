
public class AbcCross {

	public static void main(String[] args) {
		for (int x = 0; x < 5; x++) {
			String indentFormat1 = "%14s";
			String indentFormat2 = "%11s";
			String indentFormat3 = "%10s";
			
			char aLower = (char)97;
			char bLower = (char)98;
			char cLower = (char)99;
			
			if (x == 0) {
				format1(indentFormat1, aLower);
			} else if (x == 1) {
				format2(indentFormat2, aLower, bLower);
			} else if (x == 2) {
				format3(indentFormat3, aLower, bLower, cLower);
			} else if (x == 3) {
				format2(indentFormat2, aLower, bLower);
			} else if (x == 4) {
				format1(indentFormat1, aLower);
			}
		}
	}
	
	public static void format1 (String x, char y) {
		System.out.format(x, y + "\n");
	}
	
	public static void format2 (String x, char y, char z) {
		 System.out.format(x + " %1s %1s", y, z, y + "\n");
	}
	
	public static void format3 (String x, char y, char z, char zz) {
		System.out.format(x + " %1s %1s %1s", y, z, zz, y + "\n");
	}

}
