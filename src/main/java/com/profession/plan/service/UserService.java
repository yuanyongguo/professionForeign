/**
 * @Title: UserService.java
 * @Package com.profession.plan.service
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月4日
 * @version V1.0
 */
package com.profession.plan.service;

import com.profession.plan.vo.user.request.CertifyUserParam;
import com.profession.plan.vo.user.response.UserDetailVo;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月4日
 *
 */
public interface UserService {

	/**
	 * @Title: login
	 * @Description: 用户登录
	 * @param username
	 * @param password
	 * @param @return 参数
	 * @return Long 返回类型
	 * @throws
	 */
	public Long login(String username, String password);
	
	/**
	 * @Title: queryUserDetail
	 * @Description: 查询用户详情
	 * @param userId
	 * @param @return 参数
	 * @return UserDetailVo 返回类型
	 * @throws
	 */
	public UserDetailVo queryUserDetail(Long userId);
	
	/**
	 * @Title: certifyUser
	 * @Description: 用户认证
	 * @param param
	 * @param @return 参数
	 * @return Boolean 返回类型
	 * @throws
	 */
	public Boolean certifyUser(CertifyUserParam param);
}
