/**
 * @Title: AESStrategyUtil.java
 * @Package com.profession.plan.util
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月4日
 * @version V1.0
 */
package com.profession.plan.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
/**
 * @ClassName: AESStrategyUtil
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月4日
 *
 */
public class AESStrategyUtil {
	
	static Logger logger = LoggerFactory.getLogger(AESStrategyUtil.class);
	
	/**
	 * @Title: encode
	 * @Description: TODO
	 * @param content
	 * @param @return 参数
	 * @return String 返回类型
	 * @throws
	 */
    public static String encode(String content) {
        try{
            MessageDigest md = MessageDigest.getInstance("SHA");
            md.update(content.getBytes());
            return Hex.encodeHexString(md.digest());
        }catch (NoSuchAlgorithmException e){
        	logger.error("加密字符串{}异常!", content, e);
        }
        return null;
    }
}