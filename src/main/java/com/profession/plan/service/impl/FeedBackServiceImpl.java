/**
 * @Title: FeedBackServiceImpl.java
 * @Package com.profession.plan.service.impl
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月3日
 * @version V1.0
 */
package com.profession.plan.service.impl;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.profession.plan.entity.FeedBack;
import com.profession.plan.mapper.FeedBackMapper;
import com.profession.plan.service.FeedBackService;
import com.profession.plan.util.DateUtil;
import com.profession.plan.vo.feedback.request.FeedBackParam;

/**
 * @ClassName: FeedBackServiceImpl
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月3日
 *
 */
@Service
public class FeedBackServiceImpl implements FeedBackService {

	@Autowired
	private FeedBackMapper feedBackMapper;
	
	/**
	 * @Title: saveFeedBack
	 * @Description: 保存反馈内容
	 * @param feedBackParam
	 * @param @return 参数
	 * @return boolean 返回类型
	 * @throws
	 */
	@Override
	@Transactional
	public boolean saveFeedBack(FeedBackParam feedBackParam) {
		FeedBack feedBack = new FeedBack();
		if(StringUtils.isNotBlank(feedBackParam.getUserId()) && feedBackParam.getUserId().matches("^\\d+$")) {
			feedBack.setUserId(Long.parseLong(feedBackParam.getUserId()));
		}
		feedBack.setTitle(feedBackParam.getTitle());
		feedBack.setContent(feedBackParam.getContent());
		Date date = DateUtil.getNow();
		feedBack.setCreateTime(date);
		feedBack.setUpdateTime(date);
		feedBack.setVersion(1);
		int record = feedBackMapper.insert(feedBack);
		if(record != 1) {
			throw new RuntimeException();
		}
		return true;
	}

}
