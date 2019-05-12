/**
 * @Title: WorkDetailVo.java
 * @Package com.profession.plan.vo.work.ressponse
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月12日
 * @version V1.0
 */
package com.profession.plan.vo.work.ressponse;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName: WorkDetailVo
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月12日
 *
 */
@ApiModel("岗位详情")
public class WorkDetailVo implements Serializable {

	/**
	 * @Fields field:field:{todo}
	 */
	private static final long serialVersionUID = 1565047669324917000L;

	/**
	 * 岗位名称
	 */
	@ApiModelProperty("岗位名称")
	private String jobName;
	
	/**
	 * 岗位要求
	 */
	@ApiModelProperty("岗位要求")
	private String jobRequeire;
	
	/**
	 * 相关专业
	 */
	@ApiModelProperty("相关专业")
	private String relatedMajor;
	
	@ApiModelProperty("岗位技能")
	private List<String> skills;

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobRequeire() {
		return jobRequeire;
	}

	public void setJobRequeire(String jobRequeire) {
		this.jobRequeire = jobRequeire;
	}

	public String getRelatedMajor() {
		return relatedMajor;
	}

	public void setRelatedMajor(String relatedMajor) {
		this.relatedMajor = relatedMajor;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
}
