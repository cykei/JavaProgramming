package com.workshop1;

import java.util.Scanner;

// ���� 1.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop01 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        int sum = 0;
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int coffee = getUserInput();
        coffee *=2000;
        sum+=coffee;
        
        System.out.print( " ī��� �ֹ� ���� : " );
        int latte = getUserInput();
        latte *= 3000;
        sum+=latte;
        
        System.out.print( " ���̱� �ֹ� ���� : " );
        int bagle = getUserInput();
        bagle *= 1500;
        sum+=bagle;
        
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int cream = getUserInput();
        cream *= 500;
        sum+=cream;
        
        System.out.println( "========= �ݾ� =========" );
        System.out.println( " �Ƹ޸�ī�� : " +  coffee +"��");
        
        System.out.println( " ī��� : " + latte + "��" );
        
        System.out.println( " ���̱� : " + bagle + "��" );
        
        System.out.println( " ũ��ġ�� : " + cream + "��");
        

        System.out.println( "=====================" );
        System.out.println( "�� ���� �ݾ� : " + sum +"��");
        double point = 0;

        if(sum>=30000) point = sum*0.02;
        else if(sum>=12000) point = sum * 0.01;
        System.out.println("����Ʈ ���� : "+ (int)point + "��");
        
        
        
    }
    
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
}
