package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;
import javax.swing.JList;

public class WFPanel extends JPanel {
	private String filePathBase;
	private int yCoordinate;
//	WFFrame frame = new WFFrame();
//	WordFreqFrame frame = new WordFreqFrame();
//	int value;

	/**
	 * Create the panel.
	 */
	public WFPanel(String string, int j) {
		setLayout(null);
		filePathBase=string;
		yCoordinate=j;
	}
	
	public void paintComponent(Graphics g){
		int xCoordinate=yCoordinate*5+30;
		int tmp=yCoordinate;
		super.paintComponent(g);
//		this.setBackground(Color.GRAY);
		DataPreprocess dp =new DataPreprocess();
		dp.readFile(filePathBase);
		List<Map.Entry<String, Integer>> list =dp.sortHash();
		String str=null;
		int barWidth=0;
		FontMetrics fontMetrics = g.getFontMetrics();
		for (Map.Entry<String, Integer> mapping : list){
			
			str=mapping.getKey()+" "+mapping.getValue()+" ";
//			g.setFont("Serif");
			g.setFont(new Font("Serif", Font.PLAIN, 14));
			
			g.drawString(str, xCoordinate-fontMetrics.stringWidth(str), yCoordinate);
			barWidth=mapping.getValue()*20;
			g.fillRect(xCoordinate, yCoordinate-5, barWidth, 10);
			yCoordinate+=13;
			
		
		}
//		xCoordinate=tmp*5;
		yCoordinate=tmp;
//		System.out.println(yCoordinate);
	}
}
