/**
 * @Title: FeedBackController.java
 * @Package com.profession.plan.controller
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月3日
 * @version V1.0
 */
package com.profession.plan.controller;

import javax.validation.constraints.NotBlank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.profession.plan.service.FeedBackService;
import com.profession.plan.vo.ResponseVo;
import com.profession.plan.vo.feedback.request.FeedBackParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: FeedBackController
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月3日
 *
 */
@RestController
@Api(description = "意见反馈相关接口文档")
public class FeedBackController {

	@Autowired
	private FeedBackService feedBackService;
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	/**
	 * @Title: getUserList
	 * @Description: TODO
	 * @param @return 参数
	 * @return ResponseVo<List<CategoryListVo>> 返回类型
	 * @throws
	 */
	@ApiOperation(value="保存反馈意见", notes="保存反馈意见", position=1)
	@RequestMapping(value = "/saveFeedBack", method = RequestMethod.POST)
	public ResponseVo<Boolean> saveFeedBack(@NotBlank FeedBackParam feedBackParam){
		boolean result = false;
		try {
			result = feedBackService.saveFeedBack(feedBackParam);
		} catch (Exception e) {
			logger.error("保存反馈意见异常!", e);
			return ResponseVo.ofFailure(500, "保存反馈意见异常!");
		}
		return ResponseVo.ofSuccess(result);
	}
}
