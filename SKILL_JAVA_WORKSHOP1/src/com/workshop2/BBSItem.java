package com.workshop2;

public class BBSItem {
	static int counter;
	int seqNo; 			//�Ϸù�ȣ �ʵ�
	String writer; 			//�ۼ��� �ʵ�
	String writtenDate;			//�ۼ����� �ʵ�
	String title;			//�����ʵ�
	String content;			//�����ʵ�
	BBSItem(int seqNo, String writer, String writtenDate, 
			String title, String content){//������
		++counter;
		this.seqNo=counter;
		this.writer=writer;
		this.writtenDate=writtenDate;
		this.title=title;
		this.content=content;
	}
	BBSItem(){
		++counter;
		this.seqNo=counter;
	}
	public static void main(String[]args) {
		BBSItem i = new BBSItem();
		BBSItem i2= new BBSItem();
		
		System.out.println(i.seqNo);
		System.out.println(i2.seqNo);
	}
}

