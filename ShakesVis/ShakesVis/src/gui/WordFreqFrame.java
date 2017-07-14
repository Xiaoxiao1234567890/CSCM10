package gui;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ScrollPaneLayout;

public class WordFreqFrame extends JFrame {

	private JScrollPane scrollPanel;
	private JPanel jPanel_1;
	private JPanel jPanel_2;
	
//	public Object[] defaultValues;  
	 private MultiPopup popup; 
//	 private Object[] values; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordFreqFrame frame = new WordFreqFrame();
					frame.setSize(800, 800);
					
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WordFreqFrame() {
		
		int v;
		v=setValue();
		WFPanel wfPanel=new WFPanel("D:\\dataProcess\\SHAKESPEAREbaseText.txt",v);
		WFPanel gundolf=new WFPanel("D:\\dataProcess\\Iiii 011 gundolf.txt",v);
		WFPanel Schroeder=new WFPanel("D:\\dataProcess\\Iiii 014 Schroeder.txt",v);
		WFPanel Flatter=new WFPanel("D:\\dataProcess\\Iiii 016 Flatter.txt",v);
		WFPanel Fried=new WFPanel("D:\\dataProcess\\Iiii 018 Fried.txt",v);
		
		jPanel_2=new JPanel();
		jPanel_2.setPreferredSize(new Dimension(1200, 800));
		jPanel_2.setLayout(null);
		jPanel_2.add(wfPanel);
		jPanel_2.add(gundolf);
		jPanel_2.add(Schroeder);
		jPanel_2.add(Flatter);
		jPanel_2.add(Fried);
		
		
		
		
		scrollPanel=new JScrollPane(jPanel_2);//add a parent panel (pp) which holds 5 WFPanels
		scrollPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPanel.setPreferredSize(new Dimension(700, 600));
		
//		Fried.setPreferredSize(new Dimension(1000, 200));//set PP's size via setPreferredSize
		
		
//		setBounds(100, 100, 150, 800);
//		jPanel_1 = new JPanel();
//		jPanel_1.setBorder(BorderFactory.createLineBorder(Color.black));
//		jPanel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		
//		jPanel_1.setLayout(null);
//		getContentPane().setLayout(null);
		
//		getContentPane().add(wfPanel);
//		getContentPane().add(gundolf);
//		getContentPane().add(Schroeder);
//		getContentPane().add(Flatter);
//		getContentPane().add(Fried);
//		wfPanel.setSize(200, 700);
		wfPanel.setBounds(10, 0, 210, 700);
		gundolf.setBounds(260, 0, 210, 700);
		Schroeder.setBounds(510, 0, 210, 700);
		Flatter.setBounds(710, 0, 210, 700);
		Fried.setBounds(910, 0, 210, 700);
		
		wfPanel.setVisible(true);
		gundolf.setVisible(true);
		Schroeder.setVisible(true);
		Flatter.setVisible(true);
		Fried.setVisible(true);

		scrollPanel.setLayout(new ScrollPaneLayout());
		
		jPanel_1= new JPanel();
		jPanel_1.add(scrollPanel);//add the scrollPanel to a JPanel(JJ)
		
				
		setContentPane(jPanel_1);//add JJ to the parent Frame 
//		
//		JLabel label3 = new JLabel("Media Outlets:");  
//		Object[] value = new String[]{ "Selected All","Base Text" , "Gundolf"};    
//		Object[] defaultValue = new String[]{ "Selected All" };   
//		popup =new  MultiPopup(value,defaultValue);  
//		defaultValue = popup.getSelectedValues();
//		MultiComboBox mulit = new MultiComboBox(value, defaultValue); 
//		getContentPane().add(mulit);
//		mulit.setBounds(510, 10, 300, 200);
//		mulit.setVisible(true);
	}
	
	public void initialFrame(){
		
		
	}
	
	public int setValue(){
		int value=30;
		return value;
	}
}
