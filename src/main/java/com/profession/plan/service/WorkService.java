/**
 * @Title: WorkService.java
 * @Package com.profession.plan.service
 * @Description: TODO
 * @author 袁永国
 * @date 2019年5月17日
 * @version V1.0
 */
package com.profession.plan.service;

import java.util.List;

import com.profession.plan.vo.work.request.ListWorkParam;
import com.profession.plan.vo.work.ressponse.WorkDetailVo;
import com.profession.plan.vo.work.ressponse.WorkListVo;

/**
 * @ClassName: WorkService
 * @Description: TODO
 * @author 袁永国
 * @date 2019年5月17日
 *
 */
public interface WorkService {

	/**
	 * @Title: listWorks
	 * @Description: 搜索岗位列表
	 * @param  参数
	 * @return List<WorkListVo> 返回类型
	 * @throws
	 */
	List<WorkListVo> listWorks();
	
	List<WorkListVo> listRecommendWorks();
	
	WorkDetailVo findWorkById(Long id);
	
	
}
