/**
 * @Title: WorkListVo.java
 * @Package com.profession.plan.vo.work.ressponse
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月6日
 * @version V1.0
 */
package com.profession.plan.vo.work.ressponse;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName: WorkListVo
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月6日
 *
 */
public class WorkListVo implements Serializable {

	/**
	 * @Fields field:field:{todo}
	 */
	private static final long serialVersionUID = 7419872425274914303L;

	@ApiModelProperty("岗位名称")
	private String jobName;
	
	@ApiModelProperty("分类名称")
	private String categoryName;
	
	@ApiModelProperty("浏览次数")
	private Integer hits;

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}
}
