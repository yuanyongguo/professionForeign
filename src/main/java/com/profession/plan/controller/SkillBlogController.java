/**
 * @Title: SkillBlogController.java
 * @Package com.profession.plan.controller
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月12日
 * @version V1.0
 */
package com.profession.plan.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.profession.plan.entity.SkillBlog;
import com.profession.plan.service.SkillBlogService;
import com.profession.plan.vo.ResponseVo;
import com.profession.plan.vo.skillBlog.request.SkillBlogRequestVo;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: SkillBlogController
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月12日
 *
 */
@RestController
public class SkillBlogController {

	@Autowired
	private SkillBlogService skillBlogService;
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	/**
	 * @Title: listSkillBlogs
	 * @Description: TODO
	 * @param requestVo
	 * @param @return 参数
	 * @return ResponseVo<List<SkillBlog>> 返回类型
	 * @throws
	 */
	@ApiOperation(value="获取技能博客列表", notes="获取技能博客列表", position=1)
	@RequestMapping(value = "/listSkillBlogs", method = RequestMethod.GET)
	public ResponseVo<List<SkillBlog>> listSkillBlogs(SkillBlogRequestVo requestVo){
		List<SkillBlog> categoryListVos = null;
		try {
			categoryListVos = skillBlogService.querySkillBlogs(requestVo);
		} catch (Exception e) {
			logger.error("查询技能博客异常!", e);
			return ResponseVo.ofFailure(500, "查询技能博客异常!");
		}
		return ResponseVo.ofSuccess(categoryListVos);
	}
}
