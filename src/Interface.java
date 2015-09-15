import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class Interface {
	
	public static String OS;
	public static String Form;
	public static String HiSpeed;
	public static String Keyboard;
	public static String Color;
	public static String Phone;
	public static double Price;
	public static int OSi=0;
	public static int Formi=0;
	public static int HiSpeedi=0;
	public static int Keyboardi=0;
	public static int Colori=0;
	public static int Pricei=0;
	public int searchstart=0;
	
	public Interface(){
		
		
		
		JFrame Interface = new JFrame();
		Interface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Interface.setTitle("Phone Selector");
		Interface.setSize(700,750);
		Interface.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel Specs = new JLabel("Specs");
		JLabel OS = new JLabel("OS");
		JLabel Form = new JLabel("Form");
		JLabel HiSpeed = new JLabel("Hi Speed");
		JLabel Keyboard = new JLabel("Keyboard");
		JLabel Color = new JLabel("Color");
		JLabel Phone = new JLabel("Phone");
		JLabel Price= new JLabel("Price");
		JLabel Priority = new JLabel("Priority");
		
		final JCheckBox OS1=new JCheckBox("Android");final JCheckBox OS2=new JCheckBox("Windows");final JCheckBox OS3=new JCheckBox("Blackberry");
		
		final JCheckBox Form1=new JCheckBox("Bar");final JCheckBox Form2=new JCheckBox("Flip");final JCheckBox Form3=new JCheckBox("Slide");final JCheckBox Form4=new JCheckBox("Swivel");
		
		final JCheckBox HiSpeed1=new JCheckBox("EDGE");final JCheckBox HiSpeed2=new JCheckBox("GPRS");final JCheckBox HiSpeed3=new JCheckBox("LTE");
		
		final JCheckBox Keyboard1=new JCheckBox("Touch-C");final JCheckBox Keyboard2=new JCheckBox("Touch-R");final JCheckBox Keyboard3=new JCheckBox("QWERTY");final JCheckBox Keyboard4=new JCheckBox("20-KEY");
		
		final JCheckBox Color1=new JCheckBox("Black");final JCheckBox Color2=new JCheckBox("White");final JCheckBox Color3=new JCheckBox("Gray");
		
		final JCheckBox Price1 = new JCheckBox("0 to 50");final JCheckBox Price2 = new JCheckBox("50 to 100");final JCheckBox Price3 = new JCheckBox("100 to 150");final JCheckBox Price4 = new JCheckBox("150 to 200");
		
		JRadioButton PriorityA1 = new JRadioButton("1");JRadioButton PriorityA2 = new JRadioButton("2");JRadioButton PriorityA3 = new JRadioButton("3");JRadioButton PriorityA4 = new JRadioButton("4");JRadioButton PriorityA5 = new JRadioButton("5");JRadioButton PriorityA6 = new JRadioButton("6");
		final ButtonGroup OSB = new ButtonGroup();
		OSB.add(PriorityA1);OSB.add(PriorityA2);OSB.add(PriorityA3);OSB.add(PriorityA4);OSB.add(PriorityA5);OSB.add(PriorityA6);
		//PriorityA1.setSelected(true);
		
		JRadioButton PriorityB1 = new JRadioButton("1");JRadioButton PriorityB2 = new JRadioButton("2");JRadioButton PriorityB3 = new JRadioButton("3");JRadioButton PriorityB4 = new JRadioButton("4");JRadioButton PriorityB5 = new JRadioButton("5");JRadioButton PriorityB6 = new JRadioButton("6");
		final ButtonGroup FormB = new ButtonGroup();
		FormB.add(PriorityB1);FormB.add(PriorityB2);FormB.add(PriorityB3);FormB.add(PriorityB4);FormB.add(PriorityB5);FormB.add(PriorityB6);
		//PriorityB1.setSelected(true);
		
		JRadioButton PriorityC1 = new JRadioButton("1");JRadioButton PriorityC2 = new JRadioButton("2");JRadioButton PriorityC3 = new JRadioButton("3");JRadioButton PriorityC4 = new JRadioButton("4");JRadioButton PriorityC5 = new JRadioButton("5");JRadioButton PriorityC6 = new JRadioButton("6");
		final ButtonGroup HiSpeedB = new ButtonGroup();
		HiSpeedB.add(PriorityC1);HiSpeedB.add(PriorityC2);HiSpeedB.add(PriorityC3);HiSpeedB.add(PriorityC4);HiSpeedB.add(PriorityC5);HiSpeedB.add(PriorityC6);
		//PriorityC1.setSelected(true);
		
		JRadioButton PriorityD1 = new JRadioButton("1");JRadioButton PriorityD2 = new JRadioButton("2");JRadioButton PriorityD3 = new JRadioButton("3");JRadioButton PriorityD4 = new JRadioButton("4");JRadioButton PriorityD5 = new JRadioButton("5");JRadioButton PriorityD6 = new JRadioButton("6");
		final ButtonGroup KeyboardB = new ButtonGroup();
		KeyboardB.add(PriorityD1);KeyboardB.add(PriorityD2);KeyboardB.add(PriorityD3);KeyboardB.add(PriorityD4);KeyboardB.add(PriorityD5);KeyboardB.add(PriorityD6);
		//PriorityD1.setSelected(true);
		
		JRadioButton PriorityE1 = new JRadioButton("1");JRadioButton PriorityE2 = new JRadioButton("2");JRadioButton PriorityE3 = new JRadioButton("3");JRadioButton PriorityE4 = new JRadioButton("4");JRadioButton PriorityE5 = new JRadioButton("5");JRadioButton PriorityE6 = new JRadioButton("6");
		final ButtonGroup ColorB = new ButtonGroup();
		ColorB.add(PriorityE1);ColorB.add(PriorityE2);ColorB.add(PriorityE3);ColorB.add(PriorityE4);ColorB.add(PriorityE5);ColorB.add(PriorityE6);
		//PriorityE1.setSelected(true);
		
		JRadioButton PriorityF1 = new JRadioButton("1");JRadioButton PriorityF2 = new JRadioButton("2");JRadioButton PriorityF3 = new JRadioButton("3");JRadioButton PriorityF4 = new JRadioButton("4");JRadioButton PriorityF5 = new JRadioButton("5");JRadioButton PriorityF6 = new JRadioButton("6");
		final ButtonGroup PriceB = new ButtonGroup();
		PriceB.add(PriorityF1);PriceB.add(PriorityF2);PriceB.add(PriorityF3);PriceB.add(PriorityF4);PriceB.add(PriorityF5);PriceB.add(PriorityF6);
		//PriorityF1.setSelected(true);
		
		
		JButton Search = new JButton("Search");
		
		panel.add(Specs); panel.add(OS); panel.add(Form); panel.add(HiSpeed); panel.add(Keyboard); panel.add(Color); panel.add(Phone); panel.add(Price);panel.add(Priority);
		panel.add(OS1);panel.add(OS2);panel.add(OS3);
		panel.add(Form1);panel.add(Form2);panel.add(Form3);panel.add(Form4);
		panel.add(HiSpeed1);panel.add(HiSpeed2);panel.add(HiSpeed3);
		panel.add(Keyboard1);panel.add(Keyboard2);panel.add(Keyboard3);panel.add(Keyboard4);
		panel.add(Color1);panel.add(Color2);panel.add(Color3);
		panel.add(Price1);panel.add(Price2);panel.add(Price3);panel.add(Price4);
		
		
		
		
		panel.add(PriorityA1);panel.add(PriorityA2);panel.add(PriorityA3);panel.add(PriorityA4);panel.add(PriorityA5);panel.add(PriorityA6);
		panel.add(PriorityB1);panel.add(PriorityB2);panel.add(PriorityB3);panel.add(PriorityB4);panel.add(PriorityB5);panel.add(PriorityB6);
		panel.add(PriorityC1);panel.add(PriorityC2);panel.add(PriorityC3);panel.add(PriorityC4);panel.add(PriorityC5);panel.add(PriorityC6);
		panel.add(PriorityD1);panel.add(PriorityD2);panel.add(PriorityD3);panel.add(PriorityD4);panel.add(PriorityD5);panel.add(PriorityD6);
		panel.add(PriorityE1);panel.add(PriorityE2);panel.add(PriorityE3);panel.add(PriorityE4);panel.add(PriorityE5);panel.add(PriorityE6);
		panel.add(PriorityF1);panel.add(PriorityF2);panel.add(PriorityF3);panel.add(PriorityF4);panel.add(PriorityF5);panel.add(PriorityF6);
		
		panel.add(Search);
		
		Specs.setLocation(30,20);
		
		OS.setLocation(30, 40);
		Form.setLocation(130, 40);
		HiSpeed.setLocation(230, 40);
		Keyboard.setLocation(330, 40);
		Color.setLocation(430, 40);
		Price.setLocation(530, 40);
		Priority.setLocation(30,250);
		Search.setLocation(30, 450);
		
		OS1.setBounds(30,70,100,20);
		OS2.setBounds(30, 100, 100, 20);
		OS3.setBounds(30, 130, 100, 20);
		
		PriorityA1.setBounds(30,280,100,20);PriorityA2.setBounds(30,310,100,20);PriorityA3.setBounds(30,340,100,20);PriorityA4.setBounds(30,370,100,20);PriorityA5.setBounds(30,400,100,20);PriorityA6.setBounds(30,430,100,20);
		
		Form1.setBounds(130,70,100,20);
		Form2.setBounds(130, 100, 100, 20);
		Form3.setBounds(130, 130, 100, 20);
		Form4.setBounds(130, 160, 100, 20);
		
		PriorityB1.setBounds(130,280,100,20);PriorityB2.setBounds(130,310,100,20);PriorityB3.setBounds(130,340,100,20);PriorityB4.setBounds(130,370,100,20);PriorityB5.setBounds(130,400,100,20);PriorityB6.setBounds(130,430,100,20);

		
		HiSpeed1.setBounds(230,70,100,20);
		HiSpeed2.setBounds(230, 100, 100, 20);
		HiSpeed3.setBounds(230, 130, 100, 20);
		
		PriorityC1.setBounds(230,280,100,20);PriorityC2.setBounds(230,310,100,20);PriorityC3.setBounds(230,340,100,20);PriorityC4.setBounds(230,370,100,20);PriorityC5.setBounds(230,400,100,20);PriorityC6.setBounds(230,430,100,20);

		
		Keyboard1.setBounds(330,70,100,20);
		Keyboard2.setBounds(330, 100, 100, 20);
		Keyboard3.setBounds(330, 130, 100, 20);
		Keyboard4.setBounds(330, 160, 100, 20);
		
		PriorityD1.setBounds(330,280,100,20);PriorityD2.setBounds(330,310,100,20);PriorityD3.setBounds(330,340,100,20);PriorityD4.setBounds(330,370,100,20);PriorityD5.setBounds(330,400,100,20);PriorityD6.setBounds(330,430,100,20);

		
		Color1.setBounds(430,70,100,20);
		Color2.setBounds(430, 100, 100, 20);
		Color3.setBounds(430, 130, 100, 20);
		
		PriorityE1.setBounds(430,280,100,20);PriorityE2.setBounds(430,310,100,20);PriorityE3.setBounds(430,340,100,20);PriorityE4.setBounds(430,370,100,20);PriorityE5.setBounds(430,400,100,20);PriorityE6.setBounds(430,430,100,20);

		
		Price1.setBounds(530,70,100,20);
		Price2.setBounds(530, 100, 100, 20);
		Price3.setBounds(530, 130, 100, 20);
		Price4.setBounds(530, 160, 100, 20);
		
		PriorityF1.setBounds(530,280,100,20);PriorityF2.setBounds(530,310,100,20);PriorityF3.setBounds(530,340,100,20);PriorityF4.setBounds(530,370,100,20);PriorityF5.setBounds(530,400,100,20);PriorityF6.setBounds(530,430,100,20);

		
		Specs.setSize(86,14);
		
		OS.setSize(80, 14);
		Form.setSize(80, 14);
		HiSpeed.setSize(80, 14);
		Keyboard.setSize(80, 14);
		Color.setSize(80, 14);
		Price.setSize(80, 14);
		Priority.setSize(80, 14);
		Search.setSize(80,14);
		
		
		Search.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                //System.out.println("You clicked the button");
            	
                if(OS1.isSelected())
                {
                	//System.out.println(OS1.getText());
                	Database.OS[OSi]=OS1.getText();
                	OSi++;
                	
                }
                if(OS2.isSelected())
                {
                	//System.out.println(OS2.getText());
                	Database.OS[OSi]=OS2.getText();
                	OSi++;
                }
                if(OS3.isSelected())
                {
                	//System.out.println(OS3.getText());
                	Database.OS[OSi]=OS3.getText();
                	OSi++;
                }
                if(Form1.isSelected())
                {
                	//System.out.println(Form1.getText());
                	Database.Form[Formi]=Form1.getText();
                	Formi++;
                	
                }
                if(Form2.isSelected())
                {
                	//System.out.println(Form2.getText());
                	Database.Form[Formi]=Form2.getText();
                	Formi++;
                }
                if(Form3.isSelected())
                {
  //              	System.out.println(Form3.getText());
                	Database.Form[Formi]=Form3.getText();
                	Formi++;
                }
                if(Form4.isSelected())
                {
//                	System.out.println(Form4.getText());
                	Database.Form[Formi]=Form4.getText();
                	Formi++;
                }
                if(HiSpeed1.isSelected())
                {
                	//System.out.println(HiSpeed1.getText());
                	Database.HiSpeed[HiSpeedi]=HiSpeed1.getText();
                	HiSpeedi++;
                }
                if(HiSpeed2.isSelected())
                {
                	//System.out.println(HiSpeed2.getText());
                	Database.HiSpeed[HiSpeedi]=HiSpeed2.getText();
                	HiSpeedi++;
                }
                if(HiSpeed3.isSelected())
                {
                	//System.out.println(HiSpeed3.getText());
                	Database.HiSpeed[HiSpeedi]=HiSpeed3.getText();
                	HiSpeedi++;
                }
                if(Keyboard1.isSelected())
                {
                	//System.out.println(Keyboard1.getText());
                	Database.Keyboard[Keyboardi]=Keyboard1.getText();
                	Keyboardi++;
                }
                if(Keyboard2.isSelected())
                {
                	//System.out.println(Keyboard2.getText());
                	Database.Keyboard[Keyboardi]=Keyboard2.getText();
                	Keyboardi++;
                }
                if(Keyboard3.isSelected())
                {
                	//System.out.println(Keyboard3.getText());
                	Database.Keyboard[Keyboardi]=Keyboard3.getText();
                	Keyboardi++;
                }
                if(Keyboard4.isSelected())
                {
                	//System.out.println(Keyboard4.getText());
                	Database.Keyboard[Keyboardi]=Keyboard4.getText();
                	Keyboardi++;
                }
                if(Color1.isSelected())
                {
                	//System.out.println(Color1.getText());
                	Database.Color[Colori]=Color1.getText();
                	Colori++;
                }
                if(Color2.isSelected())
                {
                	//System.out.println(Color2.getText());
                	Database.Color[Colori]=Color2.getText();
                	Colori++;
                }
                if(Color3.isSelected())
                {
                	//System.out.println(Color3.getText());
                	Database.Color[Colori]=Color3.getText();
                	Colori++;
                }
                if(Price1.isSelected())
                {
                	//System.out.println(Price1.getText());
                	Database.PriceLow[Pricei]=0.0;
                	Database.PriceHigh[Pricei]=50.0;
                	Pricei++;
                }
                if(Price2.isSelected())
                {
                	//System.out.println(Price2.getText());
                	Database.PriceLow[Pricei]=50.0;
                	Database.PriceHigh[Pricei]=100.0;
                	Pricei++;
                }
                if(Price3.isSelected())
                {
                	//System.out.println(Price3.getText());
                	Database.PriceLow[Pricei]=100.0;
                	Database.PriceHigh[Pricei]=150.0;
                	Pricei++;
                }
                if(Price4.isSelected())
                {
                	//System.out.println(Price4.getText());
                	Database.PriceLow[Pricei]=150.0;
                	Database.PriceHigh[Pricei]=200.0;
                	Pricei++;
                }
                for (Enumeration<AbstractButton> buttons = OSB.getElements(); buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();

                    if (button.isSelected()) {
                        //System.out.println(button.getText());
                    	String pri =button.getText();
                    	int p = Integer.parseInt(pri);
                    	
                    	GreedyBestFirst.Priority[0]=p;
                    	//System.out.println(GreedyBestFirst.Priority[0]);
                    }
                }
                for (Enumeration<AbstractButton> buttons = FormB.getElements(); buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();

                    if (button.isSelected()) {
                        //System.out.println(button.getText());
                    	String pri =button.getText();
                    	int p = Integer.parseInt(pri);
                    	GreedyBestFirst.Priority[1]=p;
                    }
                }
                for (Enumeration<AbstractButton> buttons = HiSpeedB.getElements(); buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();

                    if (button.isSelected()) {
                        //System.out.println(button.getText());
                    	String pri =button.getText();
                    	int p = Integer.parseInt(pri);
                    	GreedyBestFirst.Priority[2]=p;
                    }
                }
                for (Enumeration<AbstractButton> buttons = KeyboardB.getElements(); buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();

                    if (button.isSelected()) {
                        //System.out.println(button.getText());
                    	String pri =button.getText();
                    	int p = Integer.parseInt(pri);
                    	GreedyBestFirst.Priority[3]=p;
                    }
                }
                for (Enumeration<AbstractButton> buttons = ColorB.getElements(); buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();

                    if (button.isSelected()) {
                        //System.out.println(button.getText());
                    	String pri =button.getText();
                    	int p = Integer.parseInt(pri);
                    	GreedyBestFirst.Priority[4]=p;
                    }
                }
                for (Enumeration<AbstractButton> buttons = PriceB.getElements(); buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();

                    if (button.isSelected()) {
                        //System.out.println(button.getText());
                    	String pri =button.getText();
                    	int p = Integer.parseInt(pri);
                    	GreedyBestFirst.Priority[5]=p;
                    }
                }
                AStar.flagtoAdd=0;
                GreedyBestFirst.adjustPriorities();
                if(searchstart==0)
                {
                GreedyBestFirst.matchPriorities();
                }
                GreedyBestFirst.printPriorities();
                
                GreedyBestFirst.mainFunc();
                GreedyBestFirst.greedy();
                AStar.mainFunc();
                AStar.secondFunc();
                AStar.restart();
                searchstart++;
                
            }
        });      
		
		
		
		Interface.add(panel);
		
		Interface.setVisible(true);
	}
	
/*	public static void main(String []args)
	{
		Interface i = new Interface();
		Database.readFromDataset();
		Database.readFromHeuristic();
		
	}
*/
}
