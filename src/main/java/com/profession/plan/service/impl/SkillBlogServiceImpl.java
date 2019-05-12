/**
 * @Title: SkillBlogServiceImpl.java
 * @Package com.profession.plan.service.impl
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月12日
 * @version V1.0
 */
package com.profession.plan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profession.plan.entity.SkillBlog;
import com.profession.plan.mapper.SkillBlogMapper;
import com.profession.plan.service.SkillBlogService;
import com.profession.plan.vo.skillBlog.request.SkillBlogRequestVo;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

/**
 * @ClassName: SkillBlogServiceImpl
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月12日
 *
 */
@Service
public class SkillBlogServiceImpl implements SkillBlogService {

	@Autowired
	private SkillBlogMapper skillBlogMapper;
	
	/**
	 * @Title: querySkillBlogs
	 * @Description: TODO
	 * @param requestVo
	 * @param @return 参数
	 * @return List<SkillBlog> 返回类型
	 * @throws
	 */
	@Override
	public List<SkillBlog> querySkillBlogs(SkillBlogRequestVo requestVo) {
		Example example = new Example(SkillBlog.class);
		Criteria criteria = example.createCriteria();
		if(requestVo != null) {
			criteria.andEqualTo("SkillId", requestVo.getSkillId());
		}
		return skillBlogMapper.selectByExample(example);
	}

}
