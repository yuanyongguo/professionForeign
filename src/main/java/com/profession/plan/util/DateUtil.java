/**
 * @Title: DateUtil.java
 * @Package com.profession.plan.util
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年4月15日
 * @version V1.0
 */
package com.profession.plan.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName: DateUtil
 * @Description: TODO
 * @author 熊正胜
 * @date 2019年4月15日
 *
 */
public class DateUtil {

	/**
	 * @Title: convertDateToString
	 * @Description: TODO
	 * @param @return 参数
	 * @return String 返回类型
	 * @throws
	 */
	public static String convertDateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	
	/**
	 * @Title: getNow
	 * @Description: 获取当前时间
	 * @return Date 返回类型
	 * @throws
	 */
	public static Date getNow(){
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}
}
