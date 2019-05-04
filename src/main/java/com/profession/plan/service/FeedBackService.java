/**
 * @Title: FeedBackService.java
 * @Package com.profession.plan.service
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月3日
 * @version V1.0
 */
package com.profession.plan.service;

import com.profession.plan.vo.feedback.request.FeedBackParam;

/**
 * @ClassName: FeedBackService
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月3日
 *
 */
public interface FeedBackService {

	/**
	 * @Title: saveFeedBack
	 * @Description: 保存反馈内容
	 * @param feedBackParam
	 * @param @return 参数
	 * @return boolean 返回类型
	 * @throws
	 */
	public boolean saveFeedBack(FeedBackParam feedBackParam);
}
