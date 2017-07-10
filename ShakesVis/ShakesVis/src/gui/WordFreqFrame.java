package gui;

import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WordFreqFrame extends JFrame {
	
		int v;
		
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						WordFreqFrame frame = new WordFreqFrame();
						frame.initialFrame();
						frame.setSize(500, 800);
						frame.setVisible(true);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
		
		public void initialFrame(){
			JPanel container = new JPanel();
			container.setLayout(new AbsoluteLayout(container, BoxLayout.X_AXIS));
			WFPanel wfPanel=new WFPanel("D:\\dataProcess\\SHAKESPEAREbaseText.txt",v*5,v);
			WFPanel gundolf=new WFPanel("D:\\dataProcess\\Iiii 011 gundolf.txt",v*5*2,v);
			
			v=setValue();
			
//			wfPanel.setLayout(null);
			wfPanel.setVisible(true);
			gundolf.setVisible(true);
			container.add(wfPanel);
			container.add(gundolf);
			
		}
		
		
		public int setValue(){
			int value=10;
			return value;
		}
		
		
			

}