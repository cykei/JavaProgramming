package com.workshop2;

public class SubscriberInfoTest {
	public static void main(String[] args)
	{
		SubscriberInfo obj1, obj2,obj3;
		obj1=new SubscriberInfo("������","1017db","daewi");
		obj2=new SubscriberInfo("���","baekom","white", 			"200-000-0000","north pole");
		obj3=new SubscriberInfo();
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
		printSubscriberInfo(obj3);
		obj1.setAddress("������1����");
		obj1.setPhoneNo("133-1234-5678");
		printSubscriberInfo(obj1);
	}
	static void printSubscriberInfo(SubscriberInfo obj){
		System.out.println("�̸�:"+obj.name);
		System.out.println("���̵�:"+obj.id);
		System.out.println("�н�����:"+obj.password);
		System.out.println("��ȭ��ȣ:"+obj.phoneNo);
		System.out.println("�ּ�:"+obj.address);
		System.out.println();
	}

}