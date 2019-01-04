package com.dsj.wms.utils;

import org.apache.commons.codec.binary.Hex;
import java.security.MessageDigest;
import java.util.Random;
/**
 * MD5加盐加密
 */
public class Md5Util {
        /**
         * 获取十六进制字符串形式的MD5摘要
         */
        public static String md5Hex(String src) {
            try {
                MessageDigest md5 = MessageDigest.getInstance("MD5");
                byte[] bs = md5.digest(src.getBytes());
                return new String(new Hex().encode(bs));
            } catch (Exception e) {
                return null;
            }
        }

        /**
         * 生成含有随机盐的密码
         */
        public static String generate(String password) {
            Random r = new Random();
            StringBuilder sb = new StringBuilder(16);
            sb.append(r.nextInt(99999999)).append(r.nextInt(99999999));
            int len = sb.length();
            if (len < 16) {
                for (int i = 0; i < 16 - len; i++) {
                    sb.append("0");
                }
            }
            String salt = sb.toString();
            password = md5Hex(password + salt);
            //System.out.println("加密+盐："+password+"，长度："+password.length());
            char[] cs = new char[48];
            for (int i = 0; i < 48; i += 3) {
                cs[i] = password.charAt(i / 3 * 2);
                char c = salt.charAt(i / 3);
                cs[i + 1] = c;
                cs[i + 2] = password.charAt(i / 3 * 2 + 1);
            }
            return new String(cs);
        }

        /**
         * 校验密码是否正确
         */
        public static boolean verify(String password, String md5) {
            char[] cs1 = new char[32];
            char[] cs2 = new char[16];
            for (int i = 0; i < 48; i += 3) {
                cs1[i / 3 * 2] = md5.charAt(i);
                cs1[i / 3 * 2 + 1] = md5.charAt(i + 2);
                cs2[i / 3] = md5.charAt(i + 1);
            }
            String salt = new String(cs2);
            return md5Hex(password + salt).equals(new String(cs1));
        }



        public static void main(String[] args) {
            // 加密+加盐
            String password1= generate("admin");
            System.out.println("结果：" + password1 + "   长度："+ password1.length());
            // 解码
            System.out.println(verify("admin", password1));

		 	/*String s1 =  generate("abc");
		 	System.out.println("加密后："+s1);

		 	boolean flag = verify("abc", s1);

	        System.out.println("密码是否匹配"+flag);*/
            //String password1 = generate("admin");
	        /*
	        // 加密+加盐
	        String password2= generate("admin");
	        System.out.println("结果：" + password2 + "   长度："+ password2.length());
	        // 解码
	        System.out.println(verify("admin", password2));*/


        }
    }

