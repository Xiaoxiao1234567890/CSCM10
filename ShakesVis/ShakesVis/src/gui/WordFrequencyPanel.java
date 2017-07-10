package gui;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;


public class WordFrequencyPanel extends JPanel{
	private String filePathBase;
	private int xCoordinate;
	private int yCoordinate;
	public WordFrequencyPanel(String string, int i, int j) {
		// TODO Auto-generated constructor stub
		filePathBase=string;
		xCoordinate=i;
		yCoordinate=j;
	}

	public void paintComponent(Graphics g){
		System.out.println("wo he ni");
		
		System.out.println("wo he ni");
		
		
		System.out.println("wo he ni");
		this.setBackground(Color.GRAY);
		DataPreprocess dp =new DataPreprocess();
		dp.readFile(filePathBase);
		List<Map.Entry<String, Integer>> list =dp.sortHash();
		String str=null;
		int barWidth=0;
		FontMetrics fontMetrics = g.getFontMetrics();
		for (Map.Entry<String, Integer> mapping : list){
			str=mapping.getKey()+" "+mapping.getValue()+" ";
			g.drawString(str, xCoordinate-fontMetrics.stringWidth(str), yCoordinate);
			barWidth=mapping.getValue()*20;
			g.fillRect(xCoordinate, yCoordinate-5, barWidth, 10);
			yCoordinate+=13;
		}
		
	
		
	}

}