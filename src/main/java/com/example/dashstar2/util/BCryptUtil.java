package com.example.dashstar2.util;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptUtil {
    /**
     * 加密一串密码
     * @param plainPassword 要被加密的密码
     * @return 被加密后的密码
     */
    public static String hashPassword(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }

    /**
     * 检查密码是否匹配
     * @param plainPassword 明文密码
     * @param hashedPassword 加密后的密码
     * @return 是否匹配
     */
    public static boolean checkPassword(String plainPassword, String hashedPassword) {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }
}