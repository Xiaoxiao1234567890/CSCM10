package translationVisualizatonGUI;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ScrollPaneLayout;

import translationVisualization.TranslationVisualization;

public class TransViScrollPane extends JScrollPane{

	private int SCROLL_PANEL_WIDTH=420;
	
	private int SCROLL_PANEL_HEIGHT=330;
	
	public TransViScrollPane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransViScrollPane(Component paramComponent, int paramInt1, int paramInt2) {
		super(paramComponent, paramInt1, paramInt2);
		// TODO Auto-generated constructor stub
	}

	public TransViScrollPane(Component paramComponent) {
		super(paramComponent);
		// TODO Auto-generated constructor stub
	}

	public TransViScrollPane(int paramInt1, int paramInt2) {
		super(paramInt1, paramInt2);
		// TODO Auto-generated constructor stub
	}
	
	public void initialize(){
		
		this.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		this.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		this.setPreferredSize(new Dimension(SCROLL_PANEL_WIDTH, SCROLL_PANEL_HEIGHT));
		//The layout manager used by JScrollPane. JScrollPaneLayout is responsible for nine components: 
		//a viewport, two scrollbars, a row header, a column header, and four "corner" components.
		this.setLayout(new ScrollPaneLayout());
		//the m_ScrollPanel only display after concordance button is clicked
		this.setVisible(false);
	}
	
	public void addComponents(TranslationVisualization transVis){
		transVis.setConcordancePanel(new ConcordancePanel(transVis.getVersionList()));
		this.add(transVis.getConcordancePanel());
	}
	

}