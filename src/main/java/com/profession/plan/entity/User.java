/**
 * @Title: User.java
 * @Package com.profession.plan.entity
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月4日
 * @version V1.0
 */
package com.profession.plan.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @ClassName: User
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月4日
 *
 */
public class User implements Serializable {

	/**
	 * @Fields field:field:{todo}
	 */
	private static final long serialVersionUID = -7698325043908219914L;

	/**
	 * 主键
	 */
	@Id
	@Column(name = "id")
	private Long id;
	
	/**
	 * 用户名
	 */
	@Column(name = "username")
	private String username;
	
	/**
	 * 密码
	 */
	@Column(name = "password")
	private String password;
	
	/**
	 * 昵称
	 */
	@Column(name = "nick_name")
	private String nickName;
	
	/**
	 * 头像
	 */
	@Column(name = "head_portrait")
	private String headPortrait;
	
	/**
	 * 手机号
	 */
	@Column(name = "mobile")
	private String mobile;
	
	/**
	 * 姓名
	 */
	@Column(name = "real_name")
	private String realName;
	
	/**
	 * 性别
	 */
	@Column(name = "sex")
	private Boolean sex;
	
	/**
	 * 学校
	 */
	@Column(name = "school")
	private String school;
	
	/**
	 * 学历
	 */
	@Column(name = "education")
	private String education;
	
	/**
	 * 专业
	 */
	@Column(name = "major")
	private String major;
	
	/**
	 * 入学时间
	 */
	@Column(name = "admission_time")
	private Date admissionTime;
	
	/**
	 * 毕业时间
	 */
	@Column(name = "graduation_time")
	private Date graduationTime;
	
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getHeadPortrait() {
		return headPortrait;
	}

	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Date getAdmissionTime() {
		return admissionTime;
	}

	public void setAdmissionTime(Date admissionTime) {
		this.admissionTime = admissionTime;
	}

	public Date getGraduationTime() {
		return graduationTime;
	}

	public void setGraduationTime(Date graduationTime) {
		this.graduationTime = graduationTime;
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
