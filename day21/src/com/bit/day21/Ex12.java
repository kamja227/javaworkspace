package com.bit.day21;

public class Ex12 {
	
	public static void main(String[] args) {
		// 배치관리자
		// 컴포넌트 구성요소들 확인
		// 기능부여 (이벤트 처리)
		
		
		java.awt.Frame frame = new java.awt.Frame();
//		javax.swing.JFrame frame = new javax.swing.JFrame(); // awt -> swing Frame ->JFrame
		
		java.awt.Button btn01 = new java.awt.Button();
		btn01.setLabel("버튼입니다");
		frame.add(btn01);
		
		java.awt.Button btn02 = new java.awt.Button();
		btn02.setLabel("두번째 버튼");
		frame.add(btn02);
		
		
		frame.setSize(500, 300); //픽셀단위
		frame.setLocation(500, 500);
		frame.setVisible(true); // 화면보이기
		
	}
}


