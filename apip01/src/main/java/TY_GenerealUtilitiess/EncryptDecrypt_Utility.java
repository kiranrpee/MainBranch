package TY_GenerealUtilitiess;

import java.util.Base64;
/**
 * This class is used to encrypt and decrypt String
 * @author Kiran
 *
 */

public class EncryptDecrypt_Utility
{
	/**
	 * This method is used encrypt the String and this method takes String as argument
	 * * @param 
	 * @return
	 */

	public String encrypt(String s)
	{
	
		String encrypted=new String(Base64.getEncoder().encode(s.getBytes()));
		
		return encrypted;
	}
	
	
	/**
	 * This method is used encrypt the String and this method takes String as argument
	 * @param value
	 * @return
	 */
	public String decrypt(String value)
	{
		String s=""+value+"";
		byte[] a = s.getBytes();
		byte[] b = Base64.getDecoder().decode(a);
		
		String s1=new String(b);
		return s1;
	}
	
}
