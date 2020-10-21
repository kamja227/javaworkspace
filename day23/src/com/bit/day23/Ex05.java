package com.bit.day23;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex05 extends Frame implements WindowListener{
	// Event
	public Ex05() {
		addWindowListener(this);
		
		setSize(500, 300);
		setLocation(200, 200);
		setVisible(true);
	}
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated"); // Ȱ��ȭ
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
		// �����Ͻðڽ��ϱ� �� �����۾�
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing"); // x��ư // x���� ���� ��Ұ���
//		System.exit(0); // �����
		dispose(); 
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated"); // ��Ȱ��ȭ (�ٸ� ��)
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified"); // �ٽ� ����(���ּ�ȭ)
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified"); // �ּ�ȭ(������ȭ)
	}
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");		
	}
	public static void main(String[] args) {
		new Ex05();
	}
}