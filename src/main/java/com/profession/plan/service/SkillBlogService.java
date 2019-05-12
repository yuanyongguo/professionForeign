/**
 * @Title: SkillBlogService.java
 * @Package com.profession.plan.service
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月12日
 * @version V1.0
 */
package com.profession.plan.service;

import java.util.List;

import com.profession.plan.entity.SkillBlog;
import com.profession.plan.vo.skillBlog.request.SkillBlogRequestVo;

/**
 * @ClassName: SkillBlogService
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月12日
 *
 */
public interface SkillBlogService {

	/**
	 * @Title: querySkillBlogs
	 * @Description: TODO
	 * @param requestVo
	 * @param @return 参数
	 * @return List<SkillBlog> 返回类型
	 * @throws
	 */
	public List<SkillBlog> querySkillBlogs(SkillBlogRequestVo requestVo);
}
