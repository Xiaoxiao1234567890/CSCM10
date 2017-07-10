package gui;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;

public class WFPanel extends JPanel {
	private String filePathBase;
	private int xCoordinate;
	private int yCoordinate;
	WFFrame frame = new WFFrame();
	int eatdrink=frame.setValue();

	/**
	 * Create the panel.
	 */
	public WFPanel(String string, int i, int j) {
		setLayout(null);
		filePathBase=string;
		xCoordinate=i;
		yCoordinate=j;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
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
		xCoordinate=eatdrink*5;
		yCoordinate=eatdrink;
//		System.out.println(yCoordinate);
	}
}