/**
 * @Title: ImgUploadController.java
 * @Package com.profession.plan.controller
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月4日
 * @version V1.0
 */
package com.profession.plan.controller;

import java.io.File;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.profession.plan.vo.ResponseVo;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: ImgUploadController
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月4日
 *
 */
@RestController
public class ImgUploadController {

	/**
	 * @Title: uploadImg
	 * @Description: 上传文件
	 * @param img
	 * @param @return 参数
	 * @return ResponseVo<String> 返回类型
	 * @throws
	 */
	@RequestMapping(value="/uploadImg", method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="上传图片文件", notes="上传图片文件", position=1)
	public ResponseVo<String> uploadImg(@RequestParam(value="img")MultipartFile img){
	    File file = new File("/data/images");
	    try{
//	        FileUtils.copyInputStreamToFile(img.getInputStream(), f);
	    }catch(Exception e){
	        e.printStackTrace();
	    }
	    return ResponseVo.ofSuccess("success");
	}
}
