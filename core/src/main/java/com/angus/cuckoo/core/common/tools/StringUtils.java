package com.angus.cuckoo.core.common.tools;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * 字符串工具类
 * 
 * @author angus.gao
 *
 */
public class StringUtils {
	/**
	 * 判断两个字符串是否相等
	 * 
	 * @param s1
	 * @param s2
	 * @return true,字符串相等;false,字符串不相等
	 */
	public static boolean isEquals(String s1, String s2) {
		if (s1 != null) {
			return s1.equals(s2);
		}
		if (s2 != null) {
			return false;
		}
		// 两个字符串都是null
		return true;
	}

	/**
	 * 判断两个数值是否相等
	 * 
	 * @param s1
	 * @param s2
	 * @return true,字符串相等;false,字符串不相等
	 */
	public static boolean isEquals(Integer s1, Integer s2) {
		if (s1 != null) {
			return s1.equals(s2);
		}
		if (s2 != null) {
			return false;
		}
		// 两个字符串都是null
		return true;
	}

	public static boolean isEmpty(String str) {
		return str == null || str.isEmpty();
	}

	/**
	 * 分隔字符串，并返回分隔字符串数组<br />
	 * 当str为null或者""时，则返回数组长度为0的字符串数组
	 *
	 * @param str
	 *            字符串
	 * @param regex
	 *            分隔符
	 * @return 分隔后的字符串数组
	 */
	public static String[] split(String str, String regex) {
		if (isEmpty(str)) {
			return new String[0];
		}
		return str.split(regex);
	}

	/**
	 * 判断字符串是否可以转换成整数
	 *
	 * @param str  字符串
	 * @return 是否可以
	 */
	public static Boolean canConvertInt(String str) {
		Pattern pattern = Pattern.compile("[0-9]*");
		return pattern.matcher(str).matches();
	}

	/**
	 * 分隔字符串，并返回分隔后的整数数组<br />
	 * <b>该方法不检查是否非整数，请保证穿进来的字符串分隔后都是整数</b> 当str为null或""时，则返回数组长度为0的整数数组
	 *
	 * @param str
	 *            字符串
	 * @param regex
	 *            分隔符
	 * @return 分隔的整数数组
	 */
	public static Integer[] splitInt(String str, String regex) {
		String[] strs = split(str, regex);
		if (strs.length == 0) {
			return new Integer[0];
		}
		Integer[] arr = new Integer[strs.length];
		for (int i = 0, len = strs.length; i < len; i++) {
			arr[i] = Integer.valueOf(strs[i]);
		}
		return arr;
	}

	/**
	 * 生成UUID
	 * 
	 * @return
	 */
	public static String getUUID() {
		String id = UUID.randomUUID().toString().replaceAll("-", "");
		return id;
	}

	public static List<String> getListBySplit(String str, String split) {
		List<String> list = new ArrayList<String>();
		if (str == null || str.trim().equalsIgnoreCase(""))
			return null;
		String[] strs = str.split(split);
		for (String temp : strs) {
			if (temp != null && !temp.trim().equalsIgnoreCase("")) {
				list.add(temp.trim());
			}
		}
		return list;
	}

	/**
	 * 将字符串首字母大写
	 * 
	 * @param s
	 * @return
	 */
	public static String upperCaseFirstCharOnly(String s) {
		if (s == null || s.length() < 1) {
			return s;
		}
		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	}
}
