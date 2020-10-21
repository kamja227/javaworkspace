package com.bit.day23;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex07 extends Frame implements MouseListener {
	//Mouse
	
	public Ex07() {
		Panel p = new Panel();
		
		Button btn = new Button("��ư");
//		btn.addMouseListener(this);
		p.addMouseListener(this);
		p.add(btn);
		
		add(p);
		setSize(500, 500);
		setLocation(200, 200);
		setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Click"); // ������ �ۿ��� ���� Ŭ�� �ƴ� Released�� ������
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("in mouse");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("out mouse");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("��ư ������ ����");		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("��ư ���� ����");		
		}

	public static void main(String[] args) {
		new Ex07();
	}
}