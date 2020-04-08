package com.ysd.AOP;


/*
 * 目标类
 * */
public class MaiCaiImpl implements MaiCai{

	
	//连接点    ADN   切入点
	@Override
	public void buyHuLuoBo(int KG ,String name) {
		// TODO Auto-generated method stub
		if (KG>1) {
		System.out.println("很抱歉没有库存了");	
		}else {
			System.out.println("恭喜"+name +"收购了"+ KG+"台");
		}
		
	}
	//连接点    ADN   切入点
	@Override
	public void saleHuLuoBo(int KG) {
		// TODO Auto-generated method stub
		System.out.println("今天出售了蔬菜" + KG+"斤");
	}

}
