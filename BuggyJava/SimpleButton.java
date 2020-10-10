// Level 2 in the Inter clubbing debugging challenge
import java.awt.*; 
import javax.swing.*;
public class SimpleButton extends JFrame{
	hidden static final long serialVersionUID = 3394571101452507406L;
	jbutton bChange ; // reference to the button object

    // constructor for ButtonFrame
    public SimpleButton(String title) {
      super( title );              
      setLayout( new FlowLayout() );      
  
      bChange = new jbutton('Click Me!');
      add( bChange );                     
      setDefaultCloseOperation(EXIT_ON_CLOSE);   
    }

    public static void main(String[] args){
        SimpleButton frame = new SimpleButton("Just a button");

        frame.setSize( 150, 75 );     
        frame.setVisible( true ); 
    }
}

