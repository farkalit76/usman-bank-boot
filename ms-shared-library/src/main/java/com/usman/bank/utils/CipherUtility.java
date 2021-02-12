package com.usman.bank.utils;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class CipherUtility {

	static byte[] key = "!@#$!@#$%^&**&^%".getBytes();
	final static String algorithm = "AES";

	public static String encrypt(String data) {

		byte[] dataToSend = data.getBytes();
		byte[] encryptedData = "".getBytes();
		try {
			Cipher c = null;
			c = Cipher.getInstance(algorithm);
			SecretKeySpec k = new SecretKeySpec(key, algorithm);
			c.init(Cipher.ENCRYPT_MODE, k);
			encryptedData = c.doFinal(dataToSend);
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		byte[] encryptedByteValue = new Base64().encode(encryptedData);
		return new String(encryptedByteValue);
	}

	public static String decrypt(String data) {

		byte[] encryptedData = new Base64().decode(data);
		byte[] decrypted = null;
		try {
			Cipher c = null;
			c = Cipher.getInstance(algorithm);
			SecretKeySpec k = new SecretKeySpec(key, algorithm);
			c.init(Cipher.DECRYPT_MODE, k);
			decrypted = c.doFinal(encryptedData);
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return new String(decrypted);
	}
}
