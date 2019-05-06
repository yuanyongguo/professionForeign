/**
 * @Title: ListWorkParam.java
 * @Package com.profession.plan.vo.work.request
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月6日
 * @version V1.0
 */
package com.profession.plan.vo.work.request;

import com.profession.plan.vo.RequestVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName: ListWorkParam
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月6日
 *
 */
@ApiModel("岗位查询对象")
public class ListWorkParam extends RequestVo {

	/**
	 * @Fields field:field:{todo}
	 */
	private static final long serialVersionUID = -8778145559345596307L;

	/**
	 * 岗位名称
	 */
	@ApiModelProperty(value = "岗位名称")
	private String jobName;
	
	/**
	 * 分类id
	 */
	@ApiModelProperty(value = "分类id")
	private Long categoryId;

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
}
