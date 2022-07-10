import java.awt.Color;
import javax.swing.*;

public class LetterFlip
{
    // Instance variables: placing these here allows them to be used
    // in multiple places (like the createWindow() and buttonPressed() methods).
    private JTextField input;
    private JLabel output, U  ,L , O ;
    
    /**
     * Simple main: creates the GeneticsLab object, and runs its methods to do
     * the actual heavy lifting.
     *
     * @param args Not used.
     */
    public static void main( String[] args )
    {
        LetterFlip flipper = new LetterFlip();
        flipper.createWindow();
    }
    
    /**
     * Creates the graphical window and its contents.
     */
    public void createWindow()
    {
        int graphicHeight = 25;
        int windowWidth = 500;
        int windowHeight = 8 * graphicHeight;
        
        JFrame win = new JFrame();
        win.setBounds( 25, 25,  windowWidth, windowHeight );
        win.setTitle( "Capital Flipper" );
        Color blizzardBlue = new Color( 172, 229, 238 );
        win.getContentPane().setBackground( blizzardBlue );
        win.setLayout( null );
        win.setResizable( false );
        win.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        win.setVisible( true );
        
        JLabel inLabel = new JLabel( "Input String" );
        inLabel.setBounds( 0, graphicHeight, 105, graphicHeight );
        inLabel.setHorizontalAlignment( SwingConstants.CENTER );
        win.add( inLabel,0 );
        
        input = new JTextField();
        input.setBounds( 110, graphicHeight, windowWidth - 125,
                        graphicHeight );
        win.add( input,0 );
        
        EventButton calcButton = new EventButton( this );
        calcButton.setLocation( 0, graphicHeight * 3 );
        calcButton.setSize( 105, graphicHeight );
        calcButton.setText( "FLIP" );
        win.add( calcButton,0 );
        
        JLabel uCount = new JLabel ("U:");
        uCount.setBounds( 0 , graphicHeight, 105, graphicHeight*9);
        uCount.setHorizontalAlignment(SwingConstants.CENTER);
        win.add(uCount, 0);
        U = new JLabel();
        U.setBounds(70, 120, 30, 30);
        win.add(U, 0);
        
        JLabel lCount = new JLabel ("L:");
        lCount.setBounds( 80 , graphicHeight, 105, graphicHeight*9);
        lCount.setHorizontalAlignment(SwingConstants.CENTER);
        win.add(lCount, 0);
        L = new JLabel();
        L.setBounds(150, 120, 30, 30);
        win.add(L, 0);
        
        JLabel oCount = new JLabel ("O:");
        oCount.setBounds( 160 , graphicHeight, 105, graphicHeight*9);
        oCount.setHorizontalAlignment(SwingConstants.CENTER);
        win.add(oCount, 0);
        O = new JLabel();
        O.setBounds(230, 120, 30, 30);
        win.add(O, 0);
        
        output = new JLabel();
        output.setBounds( 110, graphicHeight * 3, windowWidth - 125,
                             graphicHeight );
        output.setBackground( Color.white );
        output.setOpaque( true );
        win.add( output,0 );
        

        win.repaint();
    }
    
    /**
     * When a related EventButton is pressed, it will call this method.
     *
     * The code will read in user input and compute the DNA complement, along
     * with counts of each base occurring in the input strand. Non-DNA input
     * results in an error message.
     */
    public void buttonPressed()
    {

    	String inp = input.getText();
    	String output1 = "";
    	int numU = 0;
    	int numL =0;
    	int numO =0;
    	
    	
    	for ( int i =0 ; i < inp.length(); i++) {
    		
    		if (inp.charAt(i) >= 'a' && inp.charAt(i) <= 'z') {
    			
    			output1 = output1 + (char)(inp.charAt(i) - 32);
    			numU++;
    			
    		}
    		
    		else if ( inp.charAt(i) >= 'A' && inp.charAt(i) <= 'Z' ) {
    			
    			output1 = output1 + (char)(inp.charAt(i) + 32);
    			numL++;
    		}
    		
    		else {
    			
    			output1 = output1 + inp.charAt(i);
    			numO++;
    		}
    		
    		
    	}
    		output.setText(output1);
    		U.setText("" + numU);
    		L.setText("" + numL);
    		O.setText("" + numO);
    }
}
