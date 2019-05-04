/**
 * @Title: UserController.java
 * @Package com.profession.plan.controller
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月4日
 * @version V1.0
 */
package com.profession.plan.controller;

import javax.validation.constraints.NotBlank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.profession.plan.service.UserService;
import com.profession.plan.vo.ResponseVo;
import com.profession.plan.vo.user.request.CertifyUserParam;
import com.profession.plan.vo.user.response.UserDetailVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年5月4日
 *
 */
@RestController
@RequestMapping("/user")
@Api(description = "用户中心相关接口文档")
public class UserController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserService userService;
	
	@ApiOperation(value="用户登录", notes="用户登录", position=1)
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ResponseVo<Long> login(@ApiParam(name = "username") String username, @ApiParam(name = "password") String password) {
		Long userId = null;
		try {
			userId = userService.login(username, password);
		} catch (Exception e) {
			logger.error("用户名:{},密码:{}用户登陆失败!", username, password, e);
			return ResponseVo.ofFailure("用户登陆失败!");
		}
		return ResponseVo.ofSuccess(userId);
	}
	
	@ApiOperation(value="用户详情", notes="用户详情", position=2)
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ResponseVo<UserDetailVo> queryUserDetail(Long userId) {
		UserDetailVo userDetailVo = null;
		try {
			userDetailVo = userService.queryUserDetail(userId);
		} catch (Exception e) {
			logger.error("用户id:{}对应的用户详情获取失败!", userId, e);
			return ResponseVo.ofFailure("获取用户详情失败!");
		}
		return ResponseVo.ofSuccess(userDetailVo);
	}
	
	@ApiOperation(value="用户认证", notes="用户认证", position=3)
	@RequestMapping(value = "/certify", method = RequestMethod.POST)
	public ResponseVo<Boolean> certifyUser(@NotBlank CertifyUserParam param) {
		Boolean flag = null;
		try {
			flag = userService.certifyUser(param);
		} catch (Exception e) {
			logger.error("认证参数:{}对应的用户认证失败!", JSON.toJSONString(param), e);
			return ResponseVo.ofFailure("用户认证失败!");
		}
		return ResponseVo.ofSuccess(flag);
	}
}
