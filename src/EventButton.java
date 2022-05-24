/**
 * An extension to JButton that binds the button action to a GeneticsLab object,
 * which must feature a method called buttonPressed().
 *
 * @author M. Allen
 */
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings( "serial" )
public class EventButton extends JButton implements ActionListener
{
    private LetterFlip flip;
    
    /**
     * pre: GeneticsLab lab must be instantiated && must contain a method called
     * buttonPressed().
     * post: This button can respond to action events and run the GeneticsLab method
     * buttonPressed().
     *
     * @param lab GeneticsLab with which this button communicates.
     */
    public EventButton( LetterFlip lab )
    {
        super();
        addActionListener( this );
        flip = lab;
    }
    
    /**
     * post: If this button is pressed, the genetics method buttonPressed() is
     * called to respond to the button presss event.
     *
     * @param e : ActionEvent from associated objects
     */
    public void actionPerformed( ActionEvent e )
    {
        flip.buttonPressed();
    }
}
