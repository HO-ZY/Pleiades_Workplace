package com.myspring.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String config ="ApplicationResources.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		SomeService aa = (SomeService) ac.getBean("service");
		aa.doSome();

	}

}
