package translationVisualization;

public class MainMethod {
//	private static double m_scaleValue=100;
	/** the width of the ScrollPanel */
	//private final static int SCROLL_PANEL_WIDTH=420;
	
	/** the height of the ScrollPanel */
//	private final static int SCROLL_PANEL_HEIGHT=330;
	
	public static void main(String[] args) throws Exception{
		
		long startTime=System.currentTimeMillis();   
		 
		
		TranslationVisualization transVis=new TranslationVisualization();
		transVis.initiateTransVis();
		transVis.initiateFrame();
		
		long endTime=System.currentTimeMillis(); 
		System.out.println("Time:"+(endTime-startTime)+"ms");  
	}

}