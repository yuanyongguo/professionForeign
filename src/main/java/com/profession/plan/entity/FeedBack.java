/**
 * @Title: FeedBack.java
 * @Package com.profession.plan.entity
 * @Description: 反馈
 * @author 熊正胜
 * @date 2019年5月3日
 * @version V1.0
 */
package com.profession.plan.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName: FeedBack
 * @Description: 反馈
 * @author 熊正胜
 * @date 2019年5月3日
 *
 */
@Table(name = "feed_back")
public class FeedBack implements Serializable {

	/**
	 * @Fields field:field:{todo}
	 */
	private static final long serialVersionUID = 3992619192344190989L;

	/**
	 * id
	 */
	@Id
	@Column(name = "id")
	private Long id;
	
	/**
	 * 用户id
	 */
	@Column(name = "user_id")
	private Long userId;
	
	/**
	 * 反馈标题
	 */
	@Column(name = "title")
	private String title;
	
	/**
	 * 反馈内容
	 */
	@Column(name = "content")
	private String content;
	
	/**
	 * 创建时间
	 */
	@Column(name = "create_time")
	private Date createTime;
	
	/**
	 * 更新时间
	 */
	@Column(name = "update_time")
	private Date updateTime;
	
	/**
	 * 版本号
	 */
	@Column(name = "version")
	private Integer version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
