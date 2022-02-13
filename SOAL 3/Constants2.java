/**
 * @author	Husna Maulana
 * @version	1.0
 * @since	2022-02-11
 */

public class Constants2 {
	public static final double CM_PER_INCH = 2.54;
	
	
         /*variabel final doubel CM_PER_INCH 
            dinayatakan sebagai konstanta
	 * This main method will be run once the program runs.
	 * @param args Unused.
	*/
	
	public static void main(String[] args) {
		double paperWidth = 8.5;
		double paperHeight = 11;
		
		System.out.println("Paper size in centimeters: " +
				paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}
}
