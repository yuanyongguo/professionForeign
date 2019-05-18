/**
 * @Title: WorkMapper.java
 * @Package com.profession.plan.mapper
 * @Description: 工作mapper接口
 * @author 熊正胜
 * @date 2019年3月20日
 * @version V1.0
 */
package com.profession.plan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.profession.plan.entity.RecommendWork;
import com.profession.plan.vo.work.ressponse.WorkListVo;

import tk.mybatis.mapper.common.Mapper;

/**
 * @ClassName: RecommendWorkMapper
 * @Description: 推荐岗位mapper接口
 * @author 袁永国
 * @date 2019年5月18日
 *
 */
public interface RecommendWorkMapper extends Mapper<RecommendWork> {
	@Select("select w.job_name jobName,c.name categoryName,rw.hits hits from work w join recommend_work rw on rw.work_id=w.id join category c on w.category_id=c.id order by rw.hits desc")
	List<WorkListVo> selectRecommendWorkAll();

}
