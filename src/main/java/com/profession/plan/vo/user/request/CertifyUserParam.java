/**
 * @Title: CertifyUserParam.java
 * @Package com.profession.plan.vo.user.request
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月4日
 * @version V1.0
 */
package com.profession.plan.vo.user.request;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: CertifyUserParam
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月4日
 *
 */
public class CertifyUserParam implements Serializable {

	/**
	 * @Fields field:field:{todo}
	 */
	private static final long serialVersionUID = 5665594948681414747L;
	
	/**
	 * 用户id
	 */
	private Long userId;

	/**
	 * 姓名
	 */
	private String realName;
	
	/**
	 * 性别
	 */
	private Boolean sex;
	
	/**
	 * 学校
	 */
	private String school;
	
	/**
	 * 学历
	 */
	private String education;
	
	/**
	 * 专业
	 */
	private String major;
	
	/**
	 * 入学时间
	 */
	private Date admissionTime;
	
	/**
	 * 毕业时间
	 */
	private Date graduationTime;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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
}
