/** 
 * @author	Husna Maulana
 * @version	1.0
 * @since	2022-02-12
 */

public class FloatingPoint {
	
	/**
	 * This main method will be run once the program runs.
	 * @param args Unused.
	 */

	public static void main(String[] args) {
		double x = 92.98;
		
		int nx = (int) Math.round(x);
		System.out.print(nx); //print the rounded number to the screen
	}

}


/* 
1. nilai dari nx yang asalnya 92.98 akan dibulatkan menjadi 93

2. cast (int)digunakan untuk mengubah tipe data atau tipe object mnajadi tipe int 
*/