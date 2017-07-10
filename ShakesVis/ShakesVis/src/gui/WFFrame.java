package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowStateListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;

public class WFFrame extends JFrame {
	public WFFrame() {
		getContentPane().setLayout(null);
	}
	int v;
	WFPanel wfPanel=new WFPanel("D:\\dataProcess\\SHAKESPEAREbaseText.txt",v*5,v);
	WFPanel gundolf=new WFPanel("D:\\dataProcess\\Iiii 011 gundolf.txt",v*5*2,v);
	
	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WFFrame frame = new WFFrame();
					frame.initialFrame();
					frame.setSize(500, 800);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void initialFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		v=setValue();
//		WFPanel wfPanel=new WFPanel("D:\\dataProcess\\SHAKESPEAREbaseText.txt",v*5,v);
//		WFPanel gundolf=new WFPanel("D:\\dataProcess\\Iiii 011 gundolf.txt",v*5*2,v);
		getContentPane().add(wfPanel);
		getContentPane().add(gundolf);
		wfPanel.setLayout(null);
//		wfPanel.repaint();
		wfPanel.setVisible(true);
		gundolf.setVisible(true);
	}
	
	public int setValue(){
		int value=10;
		return value;
	}
	
	

}