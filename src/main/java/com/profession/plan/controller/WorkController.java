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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.profession.plan.vo.ResponseVo;
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
	public ResponseVo<List<WorkListVo>> searchWorks(ListWorkParam workParam) {
		return null;
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
		return null;
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
		return null;
	}
}
