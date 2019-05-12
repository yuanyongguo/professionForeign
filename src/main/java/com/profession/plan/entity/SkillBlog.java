/**
 * @Title: SkillBlog.java
 * @Package com.profession.plan.entity
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月12日
 * @version V1.0
 */
package com.profession.plan.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @ClassName: SkillBlog
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月12日
 *
 */
@Table(name = "skill_blog")
public class SkillBlog implements Serializable {

	/**
	 * @Fields field:field:{todo}
	 */
	private static final long serialVersionUID = -1813838930619722138L;

	/**
	 * 分类名称
	 */
	@Column(name = "category_name")
	private String categoryName;
	
	/**
	 * 技能id
	 */
	@Column(name = "skill_id")
	private String SkillId;
	
	/**
	 * 标题
	 */
	@Column(name = "title")
	private String title;
	
	/**
	 * 内容
	 */
	@Column(name = "content")
	private String content;
	
	/**
	 * 用户id
	 */
	@Column(name = "user_id")
	private String userId;
	
	/**
	 * 访问量
	 */
	@Column(name = "visits")
	private String visits;
	
	/**
	 * 最后访问时间
	 */
	@Column(name = "visit_time")
	private String visitTime;
	
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

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getSkillId() {
		return SkillId;
	}

	public void setSkillId(String skillId) {
		SkillId = skillId;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVisits() {
		return visits;
	}

	public void setVisits(String visits) {
		this.visits = visits;
	}

	public String getVisitTime() {
		return visitTime;
	}

	public void setVisitTime(String visitTime) {
		this.visitTime = visitTime;
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
