package com.workshop2;

public class BBSItem {
	static int counter;
	int seqNo; 			//일련번호 필드
	String writer; 			//작성자 필드
	String writtenDate;			//작성일자 필드
	String title;			//제목필드
	String content;			//내용필드
	BBSItem(int seqNo, String writer, String writtenDate, 
			String title, String content){//생성자
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

