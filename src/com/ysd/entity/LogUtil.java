package com.ysd.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class LogUtil {

	//ǰ��֪ͨ
	public void before(JoinPoint jp) {//�����
		Object[] args = jp.getArgs();//��ȡĿ�귽�������в���
		String methodName = jp.getSignature().getName();//��ȡĿ�귽������
		
		if ("buyPhone".equals(methodName)) {
			System.out.println(currenTime() + "����ִ�н���ǰ��������Ϊ" + args[0]+"------1");
		}
		if ("salePhone".equals(methodName)) {
			System.out.println(currenTime() + "����ִ������ǰ��������Ϊ" + args[0]);
		}
	}
	//����֪ͨ
		public void afterreturning(JoinPoint jp) {//�����
			Object[] args = jp.getArgs();//��ȡĿ�귽�������в���
			String methodName = jp.getSignature().getName();//��ȡĿ�귽������
			
			if ("buyPhone".equals(methodName)) {
				System.out.println(currenTime() + "ִ�н������������Ϊ" + args[0]+"------1");
			}
			if ("salePhone".equals(methodName)) {
				System.out.println(currenTime() + "ִ�����ۺ��������Ϊ" + args[0]);
			}
		}
		//�쳣֪ͨ
	/*
	 * public void afterThrowingMethod(JoinPoint jp, Exception e) {
	 * System.out.println("�����쳣֪ͨ�������쳣ʱ��ִ��"); }
	 */
	
	//��װ��һ��ʱ���ȡ����
	public String currenTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());	
	}
	public void after(JoinPoint jp) {
		Object[] args = jp.getArgs();//��ȡĿ�귽�������в���
		System.out.println(currenTime() + "�������" + args[0]+"��Ϸ�ؼ���------1");
	}
	
}
