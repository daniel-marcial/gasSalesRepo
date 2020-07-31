package com.gasSales.utils;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class Encrypt {
	private final String CIPHER_NAME = "AES/ECB/PKCS5Padding";

	byte[] encrypt(SecretKey key, long num) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
	    BigInteger bignum = BigInteger.valueOf(num);
	    Cipher cipher = Cipher.getInstance(CIPHER_NAME);
	    cipher.init(Cipher.ENCRYPT_MODE, key);
	    return cipher.doFinal(bignum.toByteArray());
	}

	long decrypt(SecretKey key, byte[] ct) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
	    Cipher cipher = Cipher.getInstance(CIPHER_NAME);
	    cipher.init(Cipher.DECRYPT_MODE, key);
	    byte[] pt = cipher.doFinal(ct);
	    BigInteger bignum = new BigInteger(pt);
	    return bignum.longValue();
	}

	SecretKey keyGen(String algorithm, int keySize) throws NoSuchAlgorithmException {
	    KeyGenerator keygen = KeyGenerator.getInstance(CIPHER_NAME);
	    keygen.init(keySize);
	    return keygen.generateKey();
	}
}
