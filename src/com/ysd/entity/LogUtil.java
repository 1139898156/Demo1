package com.ysd.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class LogUtil {

	//前置通知
	public void before(JoinPoint jp) {//切入点
		Object[] args = jp.getArgs();//获取目标方法的所有参数
		String methodName = jp.getSignature().getName();//获取目标方法名称
		
		if ("buyPhone".equals(methodName)) {
			System.out.println(currenTime() + "即将执行进货前操作数量为" + args[0]+"------1");
		}
		if ("salePhone".equals(methodName)) {
			System.out.println(currenTime() + "即将执行销售前操作数量为" + args[0]);
		}
	}
	//后置通知
		public void afterreturning(JoinPoint jp) {//切入点
			Object[] args = jp.getArgs();//获取目标方法的所有参数
			String methodName = jp.getSignature().getName();//获取目标方法名称
			
			if ("buyPhone".equals(methodName)) {
				System.out.println(currenTime() + "执行进货后操作数量为" + args[0]+"------1");
			}
			if ("salePhone".equals(methodName)) {
				System.out.println(currenTime() + "执行销售后操作数量为" + args[0]);
			}
		}
		//异常通知
	/*
	 * public void afterThrowingMethod(JoinPoint jp, Exception e) {
	 * System.out.println("这是异常通知，出现异常时会执行"); }
	 */
	
	//封装的一个时间获取方法
	public String currenTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());	
	}
	public void after(JoinPoint jp) {
		Object[] args = jp.getArgs();//获取目标方法的所有参数
		System.out.println(currenTime() + "最后玩着" + args[0]+"游戏回家了------1");
	}
	
}
