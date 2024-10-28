package richardlab21g01project2.auth;

import org.mindrot.jbcrypt.BCrypt;

public class Auth {
    private static final int WORKLOAD = 12;

    /**
     * Hash a password with salt for storage.
     * @param password_plaintext user's password
     * @return the hashed password
    */
    public static String hashPassword(String password_plaintext) {
        String salt = BCrypt.gensalt(WORKLOAD);
        String hashed_password = BCrypt.hashpw(password_plaintext, salt);

        return hashed_password;
    }

    /**
     * @param plaintext_pwd The account's plaintext password
     * @param hashed_pwd The account's password hash value
     * @return boolean indicating if the password is correct
     */
    public static boolean verifyPassword(String plaintext_pwd, String hashed_pwd) {
        return BCrypt.checkpw(plaintext_pwd, hashed_pwd);
    }
}