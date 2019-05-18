/**
 * @Title: Jobcontroller.java
 * @Package com.profession.plan.controller
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月6日
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

import com.profession.plan.service.WorkService;
import com.profession.plan.vo.ResponseVo;
import com.profession.plan.vo.category.response.CategoryListVo;
import com.profession.plan.vo.work.request.ListWorkParam;
import com.profession.plan.vo.work.ressponse.WorkDetailVo;
import com.profession.plan.vo.work.ressponse.WorkListVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: WorkController
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月6日
 *
 */
@RestController
@RequestMapping("/work")
@Api(description = "岗位相关接口文档")
public class WorkController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private WorkService workService;
	
	/**
	 * @Title: searchWorks
	 * @Description: TODO
	 * @param workParam
	 * @param @return 参数
	 * @return ResponseVo<List<WorkListVo>> 返回类型
	 * @throws
	 */
	@ApiOperation(value="搜索岗位列表", notes="搜索岗位列表", position=1)
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ResponseVo<List<WorkListVo>> searchWorks() {
		List<WorkListVo> workListVos = null;
		try {
			workListVos = workService.listWorks();
		} catch (Exception e) {
			logger.error("搜索岗位列表!", e);
			return ResponseVo.ofFailure(500, "搜索岗位列表!");
		}
		return ResponseVo.ofSuccess(workListVos);
	}
	
	/**
	 * @Title: recommendWorks
	 * @Description: TODO
	 * @param @return 参数
	 * @return ResponseVo<List<WorkListVo>> 返回类型
	 * @throws
	 */
	@ApiOperation(value="推荐岗位列表", notes="推荐岗位列表", position=2)
	@RequestMapping(value = "/recommend", method = RequestMethod.GET)
	public ResponseVo<List<WorkListVo>> recommendWorks() {
		List<WorkListVo> workListVos = null;
		try {
			workListVos = workService.listRecommendWorks();
		} catch (Exception e) {
			logger.error("推荐岗位列表!", e);
			return ResponseVo.ofFailure(500, "推荐岗位列表!");
		}
		return ResponseVo.ofSuccess(workListVos);
	}
	
	/**
	 * @Title: queryWorkDetail
	 * @Description: TODO
	 * @param workId 岗位id
	 * @param @return 参数
	 * @return ResponseVo<WorkDetailVo> 返回类型
	 * @throws
	 */
	@ApiOperation(value="岗位详情", notes="岗位详情", position=3)
	@RequestMapping(value = "/workDetail", method = RequestMethod.GET)
	public ResponseVo<WorkDetailVo> queryWorkDetail(Long workId) {
		WorkDetailVo workDetailVo=null;
		try {
			workDetailVo = workService.findWorkById(workId);
		} catch (Exception e) {
			logger.error("查询岗位详情!", e);
			return ResponseVo.ofFailure(500, "查询岗位详情!");
		}
		return ResponseVo.ofSuccess(workDetailVo);
	}
}
