package edu.csp.csc420.week1;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Base64;
import java.util.Random;

/**
 * Function to make password hashes, does not decode the password
 */
public class PasswordHasher {
    public static void main(String[] args) {
        byte[] salt = makeSalt(32);
        makeHashedPassword("Testing", salt);
        makeHashedPassword("NotARealPassword", salt);
    }

    /**
     * Make a Password salt (make sure to save this if you ever want to decode a hashed password
     * @return - a random byte array of specified length
     */
    public static byte[] makeSalt(int size) {
        byte[] salt = new byte[size];
        new Random().nextBytes(salt);
        return salt;
    }

    /**
     * Make a hash of a password
     * @param password - password to hash
     * @param salt - salt to use for password
     * @return - a String of the hashed password
     */
    public static String makeHashedPassword(String password, byte[] salt) {
        Base64.Encoder enc = Base64.getEncoder();
        try {
            KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
            SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            byte[] hash = f.generateSecret(spec).getEncoded();
            //Uncomment to see this code in action
            System.out.printf("salt: %s%n", enc.encodeToString(salt));
            System.out.printf("hash: %s%n", enc.encodeToString(hash));
            return enc.encodeToString(hash);
        } catch (Exception e) {
            System.out.println("Error found>" + e);
            return "BADPASSWORDENCODING";
        }
    }


}
