/**
 * @Title: WorkServiceImpl.java
 * @Package com.profession.plan.service.impl
 * @Description: TODO
 * @author 袁永国
 * @date 2019年5月17日
 * @version V1.0
 */
package com.profession.plan.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profession.plan.entity.Category;
import com.profession.plan.entity.Skill;
import com.profession.plan.entity.Work;
import com.profession.plan.mapper.CategoryMapper;
import com.profession.plan.mapper.RecommendWorkMapper;
import com.profession.plan.mapper.SkillMapper;
import com.profession.plan.mapper.WorkMapper;
import com.profession.plan.service.WorkService;
import com.profession.plan.vo.work.ressponse.WorkDetailVo;
import com.profession.plan.vo.work.ressponse.WorkListVo;

import tk.mybatis.mapper.entity.Example;
/**
 * @ClassName: WorkServiceImpl
 * @Description: TODO
 * @author 袁永国
 * @date 2019年5月17日
 *
 */
@Service
public class WorkServiceImpl implements WorkService {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private WorkMapper workMapper;
	@Autowired
	private CategoryMapper categoryMapper;
	@Autowired
	private RecommendWorkMapper recommendworkMapper;
	@Autowired
	private SkillMapper skillMapper;
	

	/**
	 * @Title: listWorks
	 * @Description: 搜索岗位列表
	 * @param  参数
	 * @return List<WorkListVo> 返回类型
	 * @throws
	 */
	@Override
	public List<WorkListVo> listWorks() {
		// TODO Auto-generated method stub
		List<WorkListVo> workListVos=workMapper.selectSearchWork();
		return workListVos;
	}


	/**
	 * @Title: listWorks
	 * @Description: 搜索岗位详情
	 * @param  参数 workId 岗位id
	 * @return WorkDetailVo 返回类型
	 * @throws
	 */
	@Override
	public WorkDetailVo findWorkById(Long id) {
		// TODO Auto-generated method stub
		WorkDetailVo workDetailVo=new WorkDetailVo();
		Work w=workMapper.selectByPrimaryKey(id);
		workDetailVo.setJobName(w.getJobName());
		workDetailVo.setJobRequeire(w.getJobRequeire());
		workDetailVo.setRelatedMajor(w.getRelatedMajor());
		String skillstr=w.getSkillId();
		List<String> skills=new ArrayList();
		if(skillstr!=null&&!(skillstr.equals(""))){
			String[] strs=skillstr.split(",");
			int len=strs.length;
			Long[] longs=new Long[len];
			for(int i=0;i<len;i++) {
				longs[i]=Long.parseLong(strs[i]);
			}
			List<Long> skillIds=Arrays.asList(longs);
			Example example=new Example(Skill.class);
			Example.Criteria criteria = example.createCriteria();
			criteria.andIn("id", skillIds);
			List<Skill> listSkill=skillMapper.selectByExample(example);
			if(listSkill!=null&&!(listSkill.isEmpty())) {
				for(Skill s:listSkill) {
					skills.add(s.getName());
				}
			}
			workDetailVo.setSkills(skills);
		}
		return workDetailVo;
	}

	/**
	 * @Title: listRecommendWorks
	 * @Description: 推荐岗位列表
	 * @param  
	 * @return List<WorkListVo> 返回类型
	 * @throws
	 */
	@Override
	public List<WorkListVo> listRecommendWorks() {
		// TODO Auto-generated method stub
		List<WorkListVo> workListVos= null;
		workListVos=recommendworkMapper.selectRecommendWorkAll();
		return workListVos; 
	}

}
