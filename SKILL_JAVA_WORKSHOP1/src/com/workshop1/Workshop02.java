package com.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// ���� 2.
// A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
// ���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//   1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
public class Workshop02 {
    static boolean flag = true;
    public static void main( String[] args ) {
        
    	double sum=0;
        
    	System.out.print( "Computer Science ������ �Է��ϼ��� : " );
        sum+=getUserInput();
        System.out.print( "Java Programming ������ �Է��ϼ��� : " );
        sum+=getUserInput();
        System.out.print( "���м��� ������ �Է��ϼ��� : " );
        sum+=getUserInput();
        System.out.print( "������� ���� ������ �Է��ϼ��� : " );
        sum+=getUserInput();
        System.out.print( "������ ������ �Է��ϼ��� : " );
        sum+=getUserInput();
        System.out.println( "==============================" );
        
        System.out.println( "������ " + sum/5 + "�� �Դϴ�." );
        
        if(flag==true && sum/5 >=3.7)
        	System.out.println("���� �б� ���б� ����� �Դϴ�.");
    }
    
    public static double getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	double value = scanner.nextDouble();
    	if(value<2.5) flag = false;
    	return value;
    }
}
