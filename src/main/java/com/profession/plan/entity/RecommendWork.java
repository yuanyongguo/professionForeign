package com.profession.plan.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName: Work
 * @Description: 推荐岗位实体
 * @author 袁永国
 * @date 2019年5月18日
 *
 */
@Table(name = "recommend_work")
public class RecommendWork implements Serializable {

	private static final long serialVersionUID = 6754337464600169818L;
	
	@Id
	@Column(name = "id")
	private Long id;
	
	/**
	 * 岗位id
	 */
	@Column(name = "work_id")
	private Long workId;
	
	/**
	 * 点击量
	 */
	@Column(name = "hits")
	private Integer hits;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getWorkId() {
		return workId;
	}

	public void setWorkId(Long workId) {
		this.workId = workId;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}
	
	

}
