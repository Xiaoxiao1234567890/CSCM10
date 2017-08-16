import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

	private static JFrame frame;
	//	DataPreprocess dp =new DataPreprocess();
	//	List<Map.Entry<String, Integer>> list =dp.sortHash();
	public JPanel P;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		ShakesVisFrame FRAME = new ShakesVisFrame();  
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//		FRAME.getContentPane().setLayout(null);
		FRAME.setVisible(true); 
	}
}

class ShakesVisFrame extends JFrame {
	private static final int DEFAULT_WIDTH = 800;  
	private static final int DEFAULT_HEIGHT = 800;  
	public ShakesVisFrame() {
		setTitle("ShakesVis");  
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);  
		WordFrequencyPanel wfpanel = new WordFrequencyPanel(); 
		add(wfpanel);
		//        add(wfpanel);
		wfpanel.setVisible(true);
		wfpanel.setBounds(0, 0, 400, 600);
		wfpanel.paintMyCanvas(80, 20, 10,  "D:\\dataProcess\\SHAKESPEAREbaseText.txt");
//		WordFrequencyPanel gundolfPanel = new WordFrequencyPanel(160, 10,20, "D:\\dataProcess\\SHAKESPEAREbaseText.txt"); 
		
		

		
//		getContentPane().add(gundolfPanel);
//		gundolfPanel.setBounds(500, 0, 400, 600);

	}  
}  

class WordFrequencyPanel extends JPanel {

	public WordFrequencyPanel() {

	}

	public void paintMyCanvas(int x1, int y1, int y2, String filePathBase){
		
		Graphics g = this.getGraphics();

		// TODO Auto-generated method stub  
		DataPreprocess dp =new DataPreprocess();
		dp.readFile(filePathBase);
		List<Map.Entry<String, Integer>> list =dp.sortHash();
	
		//        System.out.println(list);
//		super.paintComponent(g);
//		int x1=10;
//		int y1=10;
//		int y2=10;
		String str=null;
		int y0=30;
		int barWidth=0;
		System.out.println("eee");
		FontMetrics fontMetrics = g.getFontMetrics();
		System.out.println("eee");
		for (Map.Entry<String, Integer> mapping : list) {     
			str=mapping.getKey()+" "+mapping.getValue()+" ";


			g.drawString(str, x1 - fontMetrics.stringWidth(str),y1);

			y2=(5-mapping.getValue())*150+30;
			//			g.drawLine(x1+70, y1-5, 300, y2-5);

			barWidth=mapping.getValue()*20;
			g.fillRect(x1, y1-5, barWidth, 10);
			y1+=13;
		}
		g.drawLine(x1, 0, 80, y1);
		g.drawLine(300, 0, 300, y1);
		paint(g);
	}
	
	
//	@Override
//	public void paint(Graphics g){
//        super.paint(g);
//        g.setColor(Color.BLACK);
//        g.fillOval(100, 100, 50, 50);
//    }

}  
