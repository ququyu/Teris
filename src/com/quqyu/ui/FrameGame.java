package com.quqyu.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameGame extends JFrame{
	public FrameGame(){
		//设置标题
		this.setTitle("Java俄罗斯方块");
		//设置默认关闭(程序结束）
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗口大小
		this.setSize(1200, 700);
		//设置不允许用户改变窗口大小
		this.setResizable(false);
		//设置居中属性
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screen = toolkit.getScreenSize();
		int x = (screen.width-this.getWidth())/2;
		int y = (screen.height-this.getHeight())/2-32;
		this.setLocation(x, y);
		//设置默认Panel
		this.setContentPane(new PanelGame());
	}
}
