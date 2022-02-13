/** 
 * @author	Husna Maulana
 * @version	1.0
 * @since	2022-02-12
 *
 */

public class ConvertDataType {
	
	/**
	 * This method is used to convert the whole-number-related data type.
	 * @param l This is the first and only parameter to methodOne method, with long data type
	 * @return short This method returns the number that type-casted as short
	 */
	
	static short methodOne(long l) {
		int i = (int) l;
		return (short) i;
	}
	
	/**
	 * @param args Unused.
	 */

	public static void main(String[] args) {
		double d = 10.25;
		float f = (float) d;
		byte b = (byte) methodOne((long) f); //the short return type from methodOne should be type-casted to byte
		System.out.println(b);
		
		double nomorGede = 1234567890123456789.0;
		System.out.println((long)nomorGede);
		
		byte nomorKecil = 12;
		System.out.println((long)nomorKecil);
	}

}


/*
1   output dari b bernilai 10 bertipe byte
2.  pertama mengkonversi variabel d ke variabel f menggunakan cas(float)
    lalu mengkonversi variabel f ke ke f menggunakan cast(long)
    lalu mengkonversi variabel f ke ke f menggunakan cast(short)
    lalu mengkonvers variabel f ke b menggunakan cast(byte)
    



*/

