package com.ysd.AOP;


/*
 * Ŀ����
 * */
public class MaiCaiImpl implements MaiCai{

	
	//���ӵ�    ADN   �����
	@Override
	public void buyHuLuoBo(int KG ,String name) {
		// TODO Auto-generated method stub
		if (KG>1) {
		System.out.println("�ܱ�Ǹû�п����");	
		}else {
			System.out.println("��ϲ"+name +"�չ���"+ KG+"̨");
		}
		
	}
	//���ӵ�    ADN   �����
	@Override
	public void saleHuLuoBo(int KG) {
		// TODO Auto-generated method stub
		System.out.println("����������߲�" + KG+"��");
	}

}
