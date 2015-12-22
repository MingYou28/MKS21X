import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class TempConversionWindow  extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;
    
    public TempConversionWindow() {
	this.setTitle("Degree Conversion");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation( EXIT_ON_CLOSE);
	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
	
	JButton b = new JButton("Convert from C to F");
	b.addActionListener(this);
	b.setActionCommand("ToF");
	JButton b2 = new JButton("Convert from F to C");
	b2.addActionListener(this);
	b2.setActionCommand("ToC");
	
	
	t = new JTextField(10);
	
	
	j = new JLabel("Temperature ");
	pane.add(t);
	pane.add(j);
	pane.add(b);
	pane.add(b2);
    }
    
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	double degrees;
	if(event.equals("ToF")){
	    j.setText(""+CtoF(Double.parseDouble(t.getText())));}
    
	
	if(event.equals("ToC")){
	    j.setText(""+FtoC(Double.parseDouble(t.getText())));}
  
	
    }
    public double CtoF(double x){
	return x * 9 / 5 + 32;
    }
    public double FtoC(double x){
	return (x -32) * 5 / 9;
    }
}
