package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WordFreqFrame extends JFrame {

	private JPanel contentPane;
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
		
		
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().add(wfPanel);
		getContentPane().add(gundolf);
		wfPanel.setSize(300, 700);
		gundolf.setBounds(310, 0, 200, 700);
		wfPanel.setVisible(true);
		gundolf.setVisible(true);
		
		 
		
		JLabel label3 = new JLabel("Media Outlets:");  
		Object[] value = new String[]{ "Selected All","Base Text" , "Gundolf"};    
		Object[] defaultValue = new String[]{ "Selected All" };   
		popup =new  MultiPopup(value,defaultValue);  
		defaultValue = popup.getSelectedValues();
		
//		String tmp=defaultValue.toString();
//		System.out.println(tmp);
		MultiComboBox mulit = new MultiComboBox(value, defaultValue);  
		getContentPane().add(mulit);
		mulit.setBounds(510, 10, 300, 200);
		mulit.setVisible(true);
		
	}
	
	public void initialFrame(){
		
		
	}
	
	public int setValue(){
		int value=10;
		return value;
	}
	

}
