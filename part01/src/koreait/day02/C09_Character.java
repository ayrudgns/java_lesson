package koreait.day02;

public class C09_Character {
	public static void main(String[] args) {
	
		char c1 = 'a';
		char c2 = 97;		// ¹®ÀÚ ÄÚµå°ªÀº Á¤¼ö°ª.
		// a´Â 97, A´Â 65, ´ë/¼Ò¹®ÀÚ 32 Â÷ÀÌ
		System.out.println("c1 = " + c1);		// a
		System.out.println("c2 = " + c2);		// a
		System.out.println();
		
		// ¹®ÀÚÄÚµåÀÇ Á¤¼ö°ªÀ» Ãâ·ÂÇÏ·Á¸é? -> int·Î casting, printf()·Î Ãâ·Â
//		System.out.printf("c1= %d\n", c1);	// ¿À·ù : char ÇüÀº %d°¡ ¾Æ´Ï´Ù.
		System.out.printf("c1 = %d\n", (int)c1);		//97
		System.out.printf("c2 = %d\n", (int)c2);		//97
		System.out.println();
		
		c1 = (char)(c1 + 1);	// µ¡¼À ¿¬»ê °¡´É, ¿¬»ê °á°ú¸¦ ´ëÀÔÇÒ ¶§´Â casting ÇÊ¿äÇÔ.
		System.out.println("c1 = " + c1);
		
		c1++;		// ++¿¬»êÀº c1 = c1 + 1, charÇü¿¡¼­´Â castingÀÌ ÇÊ¿äÇÏÁö ¾Ê´Ù. (int ¸®ÅÍ·²À» »ç¿ëÇÑ °è»êÀÌ ¾Æ´Ï±â ¶§¹®)
		System.out.println("c1 = " + c1);
		System.out.println();
		
		// ÇÑ±Û ¹®ÀÚ Å×½ºÆ® : ÇÑ±Û ¹®ÀÚ ÄÚµå´Â 10Áø¼ö°ªÀ¸·Î 44032 ~ 55203, 16Áø¼ö(2Áø¼ö) ac00 ~ d7a3
		char h1 = '°¡';
		char h2 = 44032;		//
		char h3 = '\uac00';		// \\u´Â 16Áø¼ö À¯´ÏÄÚµå, ac00Àº 16Áø¼ö °ª
		System.out.println("h1 = " + h1);	
		System.out.println("h2 = " + h2);
		System.out.println("h3 = " + h3);
		
		System.out.printf("h1 = %d\n", (int)h1);	
		System.out.printf("h2 = %d\n", (int)h2);
		System.out.printf("h3 = %d\n", (int)h3);
		
		h1++;
		System.out.println("h1 = " + h1);
		h1++;
		System.out.println("h1 = " + h1);
		System.out.println();
		
		// ÇÑ±ÛÀÇ ¸¶Áö¸· ¹®ÀÚ
		char h4 = 55203;		// 10Áø¼ö Ç¥Çö ¹æ½Ä
		char h5 = '\ud7a3';		// 16Áø¼ö Ç¥Çö ¹æ½Ä
		System.out.println("h4 = " + h4);		// ÆR
		System.out.println("h5 = " + h5);		// ÆR
		
		h4++;
		System.out.println("h4 = " + h4);	// ÇØ´çµÇ´Â ¸ð¾çÀÇ ¹®ÀÚ°¡ ¾øÀ½==> ? Ç¥½Ã
		h5--;
		System.out.println("h5 = " + h5);	// ÆQ
		System.out.println();
		System.out.println('H' + 'e' + 'l' + 'l' + 'o' );	// °¢ ¹®ÀÚÄÚµåÀÇ °ªÀ» ´õÇÑ °á°ú
		// Hello¸¦ Ãâ·ÂÇÏ·Á¸é charÀÇ ¹è¿­·Î Ã³¸®ÇØ¾ß ÇÔ.

	}
	
	// charÀÌ ¸ð¿©¼­ ÇÑÁÙ·Î ³ª¶õÈ÷ ³ª¿­µÇ¸é ==> ¹®ÀÚ¿­
	// "Hello"´Â 'H', 'e', 'l', 'l', 'o' °¢°¢ÀÇ ¹®ÀÚµéÀÌ ¸ðÀÎ °ÍÀÌ´Ù.
	// ¹®ÀÚ¿­Àº ±âº»ÇüÀÌ ¾Æ´Ï°í, ¹®ÀÚ´Â ±âº»Çü

}
/*	
 * 	µ¥ÀÌÅÍ ±âº»Çü½Ä : ¹®ÀÚÇü char
 * 		¹®ÀÚ µ¥ÀÌÅÍ¸¦ ÀúÀåÇÏ´Â 2byte Çü½Ä. Á¤¼ö°ª 0 ~ 65535 ¹üÀ§ ÀúÀåµµ °¡´ÉÇÏ´Ù.
 * 		ÄÄÇ»ÅÍ¿¡¼­ ´Ù·ç´Â ¹®ÀÚ´Â ¹®ÀÚÄÚµå·Î Ã³¸®µÇ´Âµ¥, ÄÚµå´Â Á¤¼ö°ªÀÌ´Ù.
 *		¹®ÀÚµ¥ÀÌÅÍ´Â ' ' ±âÈ£¸¦ »ç¿ëÇÑ´Ù. (' '¾È¿¡´Â ¹®ÀÚ  1°³¸¸ ½á¾ßÇÔ)
 *		
 *		¿µ¹®ÀÚ, ¼ýÀÚ, Æ¯¼ö¹®ÀÚ´Â ASCII(¾Æ½ºÅ°) ÄÚµå·Î Ç¥ÇöµÈ´Ù.
 *		¿µ¹®ÀÚ, ¼ýÀÚ, Æ¯¼ö¹®ÀÚ ¿ÜÀÇ ´Ù±¹¾î¹®ÀÚ´Â ¹®ÀÚ¸¦ Ã³¸®ÇÏ´Â ÀÎÄÚµù ¹æ½Ä¿¡ µû¶ó ¹®ÀÚÄÚµå°ªÀÌ ´Ù¸£´Ù.
 *		±¹Á¦È­ ÀÎÄÚµùÀ¸·Î, UTF-8 ¹æ½ÄÀ» ÁÖ·Î »ç¿ëÇÑ´Ù.
 *
 *		°£ : ¤¡ ¤¿ ¤¤ 
 *		ÃÊ¼º, Áß¼º, Á¾¼º °¢°¢ÀÇ ÄÚµå°ªÀ¸·Î Á¶ÇÕÇÏ´Â Á¶ÇÕÇü
 *		ÇÑ±Û¿¡¼­ ³ª¿Ã ¼ö ÀÖ´Â ¸ðµç ÃÊ¼º, Áß¼º, Á¾¼ºÀÇ ¸ðµç Ç¥ÇöÀ» ¸¸µé¾î¼­ °¢°¢ ÄÚµå°ªÀ» ºÎ¿©ÇÏ´Â ¿Ï¼ºÇü.
 */
