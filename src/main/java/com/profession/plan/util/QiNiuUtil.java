/**
 * @Title: QiNiuUtil.java
 * @Package com.profession.plan.util
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月11日
 * @version V1.0
 */
package com.profession.plan.util;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;

/**
 * @ClassName: QiNiuUtil
 * @Description: 七牛服务器文件上传
 * @author 熊正胜
 * @date 2019年5月11日
 *
 */
@Component
public class QiNiuUtil {

	@Value("${qiniu.ak}")
	private String accessKey;
	
	@Value("${qiniu.sk}")
	private String secretKey;
	
	@Value("${qiniu.bucket}")
	private String bucket;
	
	@Value("${qiniu.imgagePrefix}")
	private String imagePreffix;
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	/**
	 * @Title: uploadImage
	 * @Description: 图片文件上传
	 * @param stream
	 * @param @return 参数
	 * @return String 返回类型
	 * @throws
	 */
	public String uploadImage(InputStream stream) {
		//构造一个带指定Zone对象的配置类
		Configuration cfg = new Configuration(Zone.zone1());
		UploadManager uploadManager = new UploadManager(cfg);
		
		//图片文件名
		String key = generateFileName();
		Auth auth = Auth.create(accessKey, secretKey);
		String upToken = auth.uploadToken(bucket);
		try {
		    Response response = uploadManager.put(stream, key, upToken, null, null);
		    //解析上传成功的结果
		    DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
		    String imagePath = imagePreffix + putRet.hash;
		    return imagePath;
		} catch (QiniuException ex) {
		    Response r = ex.response;
		    logger.error("图片上传失败,失败原因:{}!", r.toString());
		}
		return null;
	}
	
	/**
	 * @Title: generateFileName
	 * @Description: 生成图片文件名
	 * @param @return 参数
	 * @return String 返回类型
	 * @throws
	 */
	private String generateFileName() {
		LocalDateTime date = LocalDateTime.now();
        //日期格式化，通用时间表达式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
        int random = ThreadLocalRandom.current().nextInt(1000);
        String fileName = date.format(formatter) + random;
        return fileName;
	}
	
	public static void main(String[] args) {
		int d = ThreadLocalRandom.current().nextInt(1000);
		System.out.println(d);
	}
}
