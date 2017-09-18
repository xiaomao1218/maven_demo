package com.idea.maven.commons.utils;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

/**
 * 通用工具类
 * 
 * @author martin_duan@yeah.net
 * @since 2017-03-19
 *
 */
public class Utils {
	
	/**
	 * copy对象属性，包括null值
	 * 
	 * @param dest
	 * @param src
	 */
	public static void copyObject(Object src, Object dest) {
		try {
			BeanUtils.copyProperties(src, dest);
		} catch (Exception e) {
			throw new RuntimeException("对象参数复制异常", e);
		}
	}	
	
	/**
	 * copyList对象，包括null值
	 * 
	 * @param <T>
	 * 
	 * @param srcs
	 * @param dests
	 * @param clazz
	 *            目标类型
	 */
	public static <S, T> void copyListObject(List<S> srcs, List<T> dests, Class<T> clazz) {
		try {
			for (S src : srcs) {
				T dest = clazz.newInstance();
				copyObject(src, dest);
				dests.add(dest);
			}
		} catch (Exception e) {
			throw new RuntimeException("对象参数复制异常", e);
		}
	}

	/**
	 * copy对象属性，不包括null值
	 * 
	 * @param dest
	 * @param src
	 */
	public static void copyNotNullObject(Object src, Object dest) {
		if (dest != null && src != null) {
			final BeanWrapper wrapper = new BeanWrapperImpl(src);
			PropertyDescriptor[] pds = wrapper.getPropertyDescriptors();
			Set<String> emptyNames = new HashSet<String>();
			for (PropertyDescriptor pd : pds) {
				Object srcValue = wrapper.getPropertyValue(pd.getName());
				if (srcValue == null) {
					emptyNames.add(pd.getName());
				}
			}
			BeanUtils.copyProperties(src, dest, emptyNames.toArray(new String[] {}));
		}
	}


	/**
	 * copy对象属性，不包括null值
	 *
	 * @param dest
	 * @param src
	 */
	public static void copyNotBlankObject(Object src, Object dest) {
		if (dest != null && src != null) {
			final BeanWrapper wrapper = new BeanWrapperImpl(src);
			PropertyDescriptor[] pds = wrapper.getPropertyDescriptors();
			Set<String> emptyNames = new HashSet<String>();
			for (PropertyDescriptor pd : pds) {
				Object srcValue = wrapper.getPropertyValue(pd.getName());
				if (srcValue == null || ((srcValue instanceof String)&& ((String) srcValue).isEmpty())) {
					emptyNames.add(pd.getName());
				}
			}
			BeanUtils.copyProperties(src, dest, emptyNames.toArray(new String[] {}));
		}
	}

}
