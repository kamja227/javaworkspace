package com.bit.me01;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Memo extends Frame{

	public Memo() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		java.awt.Menu mn1 = new Menu();
		mn1.setLabel("����");
		java.awt.MenuItem mn1_1 = new MenuItem();
		mn1_1.setLabel("������");
		mn1.add(mn1_1);
		java.awt.MenuItem mn1_2 = new MenuItem();
		mn1_2.setLabel("����");
		mn1.add(mn1_2);
		java.awt.MenuItem mn1_3 = new MenuItem();
		mn1_3.setLabel("����");
		mn1.add(mn1_3);
		java.awt.MenuItem mn1_4 = new MenuItem();
		mn1_4.setLabel("����");
		mn1.add(mn1_4);
		
		java.awt.Menu mn2 = new Menu();
		mn2.setLabel("����");
		java.awt.MenuItem mn2_1 = new MenuItem();
		mn2_1.setLabel("����");
		mn2.add(mn2_1);
		
		java.awt.MenuBar mb =  new MenuBar();
		mb.add(mn1);
		mb.add(mn2);
		
		setMenuBar(mb);
		
		
		
		
		
		setSize(500, 500);
		setLocation(400, 400);
		setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		new Memo();
	}

}