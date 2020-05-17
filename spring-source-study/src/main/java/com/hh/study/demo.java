package com.hh.study;

import com.hh.study.entity.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.AbstractErrors;

public class demo {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("META-INF/dependency.xml");
		System.out.println(beanFactory.getBean(User.class));
		System.out.println(AbstractErrors.NESTED_PATH_SEPARATOR);
	}
}
