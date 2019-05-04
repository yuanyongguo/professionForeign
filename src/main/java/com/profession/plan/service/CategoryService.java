/**
 * @Title: CategoryService.java
 * @Package com.profession.plan.service
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月3日
 * @version V1.0
 */
package com.profession.plan.service;

import java.util.List;

import com.profession.plan.vo.category.response.CategoryListVo;

/**
 * @ClassName: CategoryService
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月3日
 *
 */
public interface CategoryService {

	/**
	 * @Title: listCategorys
	 * @Description: 查询所有的分类信息
	 * @param  参数
	 * @return List<CategoryListVo> 返回类型
	 * @throws
	 */
	public List<CategoryListVo> listCategorys();
}
