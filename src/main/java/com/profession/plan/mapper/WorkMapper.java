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

import com.profession.plan.entity.Work;
import com.profession.plan.vo.work.ressponse.WorkListVo;

import tk.mybatis.mapper.common.Mapper;

/**
 * @ClassName: WorkMapper
 * @Description: 工作mapper接口
 * @author 熊正胜
 * @date 2019年3月20日
 *
 */
public interface WorkMapper extends Mapper<Work> {
	@Select("select w.job_name jobName,c.name categoryName from work w join category c on w.category_id=c.id")
	List<WorkListVo> selectSearchWork();

}
