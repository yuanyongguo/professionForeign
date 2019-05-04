/**
 * @Title: FeedBackParam.java
 * @Package com.profession.plan.vo.feedback.request
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月3日
 * @version V1.0
 */
package com.profession.plan.vo.feedback.request;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName: FeedBackParam
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月3日
 *
 */
@ApiModel
public class FeedBackParam implements Serializable {

	/**
	 * @Fields field:field:{todo}
	 */
	private static final long serialVersionUID = -2577427243129456663L;

	/**
	 * 用户id
	 */
	@ApiModelProperty(value = "用户id")
	private String userId;
	
	/**
	 * 反馈标题
	 */
	@ApiModelProperty("反馈标题")
	private String title;
	
	/**
	 * 反馈内容
	 */
	@ApiModelProperty("反馈内容")
	private String content;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
