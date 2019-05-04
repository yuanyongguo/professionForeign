/**
 * @Title: CategoryServiceImpl.java
 * @Package com.profession.plan.service.impl
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月3日
 * @version V1.0
 */
package com.profession.plan.service.impl;

import java.util.List;

import javax.websocket.server.ServerEndpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.google.common.collect.Lists;
import com.profession.plan.entity.Category;
import com.profession.plan.mapper.CategoryMapper;
import com.profession.plan.service.CategoryService;
import com.profession.plan.vo.category.response.CategoryListVo;

/**
 * @ClassName: CategoryServiceImpl
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月3日
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private CategoryMapper categoryMapper;
	
	/**
	 * @Title: listCategorys
	 * @Description: 查询所有的分类信息
	 * @param  参数
	 * @return List<CategoryListVo> 返回类型
	 * @throws
	 */
	@Override
	public List<CategoryListVo> listCategorys() {
		Category param = new Category();
		param.setEnable(true);
		List<Category> categorys = categoryMapper.select(param);
		if(CollectionUtils.isEmpty(categorys)) {
			return null;
		}
		List<CategoryListVo> categoryListVos = Lists.newArrayList();
		for (Category category : categorys) {
			CategoryListVo categoryListVo = new CategoryListVo();
			categoryListVo.setId(category.getId());
			categoryListVo.setName(category.getName());
			categoryListVos.add(categoryListVo);
		}
		return categoryListVos;
	}

}
