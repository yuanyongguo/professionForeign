/**
 * @Title: UserServiceImpl.java
 * @Package com.profession.plan.service.impl
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月4日
 * @version V1.0
 */
package com.profession.plan.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.profession.plan.entity.User;
import com.profession.plan.mapper.UserMapper;
import com.profession.plan.service.UserService;
import com.profession.plan.util.AESStrategyUtil;
import com.profession.plan.vo.user.request.CertifyUserParam;
import com.profession.plan.vo.user.response.UserDetailVo;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月4日
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * @Title: login
	 * @Description: 用户登录
	 * @param username
	 * @param password
	 * @param @return 参数
	 * @return Long 返回类型
	 * @throws
	 */
	@Override
	public Long login(String username, String password) {
		if(StringUtils.isBlank(username)) {
			return 0L;
		}
		if(StringUtils.isBlank(password)) {
			return 0L;
		}
		String encodePassword = AESStrategyUtil.encode(password);
		User param = new User();
		param.setUsername(username);
		param.setPassword(encodePassword);
		User user = userMapper.selectOne(param);
		if(user != null) {
			return user.getId();
		}
		return null;
	}

	/**
	 * @Title: queryUserDetail
	 * @Description: 查询用户详情
	 * @param userId
	 * @param @return 参数
	 * @return UserDetailVo 返回类型
	 * @throws
	 */
	@Override
	public UserDetailVo queryUserDetail(Long userId) {
		User user = userMapper.selectByPrimaryKey(userId);
		if(user == null) {
			return null;
		}
		UserDetailVo userDetailVo = new UserDetailVo();
		BeanUtils.copyProperties(user, userDetailVo);
		return userDetailVo;
	}

	/**
	 * @Title: certifyUser
	 * @Description: 用户认证
	 * @param param
	 * @param @return 参数
	 * @return Boolean 返回类型
	 * @throws
	 */
	@Override
	@Transactional
	public Boolean certifyUser(CertifyUserParam param) {
		if(param.getUserId() != null) {
			return false;
		}
		User user = new User();
		BeanUtils.copyProperties(param, user);
		int execRecord = userMapper.updateByPrimaryKeySelective(user);
		if(execRecord != 1) {
			throw new RuntimeException();
		}
		return true;
	}

}
