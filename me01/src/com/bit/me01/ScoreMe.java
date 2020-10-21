package com.bit.me01;

import java.util.ArrayList;

class Student {
	int num;
	String name;
	int kor, eng, math;
	
	public Student(){ }
	
	public int sum() {return kor + eng + math; }
	
	public double avg() { 
		return sum()/3;
	}
}

public class ScoreMe {
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		System.out.println("�����������α׷�(ver 0.2.0)");
		
		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.���� >> ");
			String input = sc.nextLine();

			if(input.equals("0")) {
				break;
				
			} else if(input.equals("1")) {
				// ����
				System.out.println("--------------------------------------");
				System.out.println("�й�\t�̸�\t����\t����\t����\t�հ�\t���");
				System.out.println("--------------------------------------");
				
				for(int i=0; i<list.size(); i++) {
					Student stu = list.get(i);
					System.out.println(stu.num + "\t" + stu.name + "\t" + stu.kor+ "\t" + stu.eng+ "\t" + stu.math+ "\t" + stu.sum() + "\t" + stu.avg()+ "\n");
				}
				
				
			} else if(input.equals("2")) {
				// �Է�
				try {
					Student stu =  new Student();
					System.out.print("�й�>");
					stu.num = Integer.parseInt(sc.nextLine());
					System.out.print("�̸�>");
					stu.name = sc.nextLine();
					System.out.print("����>");
					stu.kor = Integer.parseInt(sc.nextLine());
					System.out.print("����>");
					stu.eng = Integer.parseInt(sc.nextLine());
					System.out.print("����>");
					stu.math = Integer.parseInt(sc.nextLine());
					list.add(stu);
				} catch(Exception e) {
					System.out.println("�ٽ� �Է��ϼ���");
				}
				
			} else if(input.equals("3")) {
				// ����
				System.out.print("������ �й�>");
				int reNum = Integer.parseInt(sc.nextLine());
				for(int i=0; i<list.size(); i++) {
					Student stu = list.get(i);
					if(reNum == stu.num) {
						System.out.print("�̸�>");
						stu.name = sc.nextLine();
						System.out.print("����>");
						stu.kor = Integer.parseInt(sc.nextLine());
						System.out.print("����>");
						stu.eng = Integer.parseInt(sc.nextLine());
						System.out.print("����>");
						stu.math = Integer.parseInt(sc.nextLine());
//						list.add(stu);
						break;
					} 
				}
			} else if(input.equals("4")) {
				// ����
				System.out.print("������ �й�>");
				int delNum = Integer.parseInt(sc.nextLine());
				for(int i=0; i<list.size(); i++) {
					Student stu = list.get(i);
					if(delNum == stu.num) { 
						list.remove(i);
						System.out.println(stu.name + "�л��� ������ �����Ǿ����ϴ�");
						break; }
				}
			}
				
		} // while end
	}
}