package com.quqyu.ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
/*
 * 绘制窗口类
 */
public class Lay {
	/*
	 * 窗口左上角x坐标
	 */
	private int x;
	/*
	 * 窗口左上角y坐标
	 */
	private int y;
	/*
	 * 窗口宽度
	 */
	private int w;
	/*
	 * 窗口高度
	 */
	private int h;
	/*
	 * 边框宽度
	 */
	private static final int SIZE = 7;
	/*
	 * 图片
	 */
	private static Image WINDOW_IMG = new ImageIcon("resource/window/Window.png").getImage();
	/*
	 * 图片宽度
	 */
	private static int WINDOW_W = WINDOW_IMG.getWidth(null);
	/*
	 * 图片高度
	 */
	private static int WINDOW_H = WINDOW_IMG.getHeight(null);
	
	public Lay(int x, int y, int w, int h) {
		
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	/*
	 * 绘制窗口
	 */
	public void createWindow(Graphics g) {
		//左上
		g.drawImage(WINDOW_IMG, x, y, x+SIZE, y+SIZE, 0, 0, SIZE, SIZE, null);
		//中上
		g.drawImage(WINDOW_IMG, x+SIZE, y, x+w-SIZE, y+SIZE, SIZE, 0, WINDOW_W-SIZE, SIZE, null);
		//右上
		g.drawImage(WINDOW_IMG, x+w-SIZE, y, x+w, y+SIZE, WINDOW_W-SIZE, 0, WINDOW_W, SIZE, null);
		//左中
		g.drawImage(WINDOW_IMG, x, y+SIZE, x+SIZE, y+h-SIZE, 0, SIZE, SIZE, WINDOW_H-SIZE, null);
		//中
		g.drawImage(WINDOW_IMG, x+SIZE, y+SIZE, x+w-SIZE, y+h-SIZE, SIZE, SIZE, WINDOW_W-SIZE, WINDOW_H-SIZE, null);
		//右中
		g.drawImage(WINDOW_IMG, x+w-SIZE, y+SIZE, x+w, y+h-SIZE, WINDOW_W-SIZE, SIZE, WINDOW_W, WINDOW_H-SIZE, null);
		//左下
		g.drawImage(WINDOW_IMG, x, y+h-SIZE, x+SIZE, y+h, 0, WINDOW_H-SIZE, SIZE, WINDOW_H, null);
		//中下
		g.drawImage(WINDOW_IMG, x+SIZE, y+h-SIZE, x+w-SIZE, y+h, SIZE, WINDOW_H-SIZE, WINDOW_W-SIZE, WINDOW_H, null);
		//右下
		g.drawImage(WINDOW_IMG, x+w-SIZE, y+h-SIZE, x+w, y+h, WINDOW_W-SIZE, WINDOW_H-SIZE, WINDOW_W, WINDOW_H, null);
		
	}
}
