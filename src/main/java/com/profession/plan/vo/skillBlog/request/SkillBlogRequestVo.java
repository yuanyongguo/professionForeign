/**
 * @Title: SkillBlogRequestVo.java
 * @Package com.profession.plan.vo.skillBlog.request
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月12日
 * @version V1.0
 */
package com.profession.plan.vo.skillBlog.request;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName: SkillBlogRequestVo
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月12日
 *
 */
@ApiModel
public class SkillBlogRequestVo implements Serializable {

	/**
	 * @Fields field:field:{todo}
	 */
	private static final long serialVersionUID = 2382220235556041483L;
	
	/**
	 * 技能id
	 */
	@ApiModelProperty("技能id")
	private Long skillId;

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
}
