/**
 * @Title: CategoryController.java
 * @Package com.profession.plan.controller
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月3日
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

import com.profession.plan.service.CategoryService;
import com.profession.plan.vo.ResponseVo;
import com.profession.plan.vo.category.response.CategoryListVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: CategoryController
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月3日
 *
 */
@RestController
@Api(description = "类目相关接口文档")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	/**
	 * @Title: listCategorys
	 * @Description: TODO
	 * @param @return 参数
	 * @return ResponseVo<List<CategoryListVo>> 返回类型
	 * @throws
	 */
	@ApiOperation(value="获取类目列表", notes="获取类目列表", position=1)
	@RequestMapping(value = "/listCategorys", method = RequestMethod.GET)
	public ResponseVo<List<CategoryListVo>> listCategorys(){
		List<CategoryListVo> categoryListVos = null;
		try {
			categoryListVos = categoryService.listCategorys();
		} catch (Exception e) {
			logger.error("查询类目异常!", e);
			return ResponseVo.ofFailure(500, "查询类目异常!");
		}
		return ResponseVo.ofSuccess(categoryListVos);
	}
}
