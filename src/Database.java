import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Database {
	
	public static String filedata="Dataset.csv";
	public static String fileheuristic="Heuristic.csv";
	public static Hashtable<Integer,Hashtable<String,Hashtable<String,Hashtable<String,Hashtable<String,Hashtable<String,Hashtable<String,Double>>>>>>> data;
	public static String[] OS =new String[5];
	public static String[] Form=new String[5];
	public static String[] HiSpeed=new String[5];
	public static String[] Keyboard=new String[5];
	public static String[] Color=new String[5];
	public static Double[] PriceLow=new Double[5];
	public static Double[] PriceHigh=new Double[5];
	
	public static String[] OSData = new String[500];
	public static String[] FormData=new String[500];
	public static String[] HiSpeedData=new String[500];
	public static String[] KeyboardData=new String[500];
	public static String[] ColorData=new String[500];
	public static String[] PriceData=new String[500];
	public static String[] PhoneData = new String[500];
	
	public static String[] HeuristicData = new String[500];
	public static String[] CostData = new String[500];
	public static String[] StraightLineData = new String[500];
	
	public static int gI2=0;
	public static int gI=0;									// GlobalIterator
	public static Hashtable<String,Hashtable<Double,Double>> heuristic;
	
	
	public Database()
	{
		data = new Hashtable<Integer,Hashtable<String,Hashtable<String,Hashtable<String,Hashtable<String,Hashtable<String,Hashtable<String,Double>>>>>>>();
		heuristic = new Hashtable<String,Hashtable<Double,Double>>();
	}
	
	
	public static void main(String [] args)
	{
		//readFromDataset();
		//readFromHeuristic();
	}
	
	
	public static void readFromDataset()
	{
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		Hashtable<Integer,Hashtable<String,Hashtable<String,Hashtable<String,Hashtable<String,Hashtable<String, Hashtable<String, Double>>>>>>> hash7 =new Hashtable<Integer,Hashtable<String,Hashtable<String,Hashtable<String,Hashtable<String,Hashtable<String, Hashtable<String, Double>>>>>>>();

		try {
	 
			br = new BufferedReader(new FileReader(filedata));
			while ((line = br.readLine()) != null) {
	 
			        // use comma as separator
				String[] phone = line.split(cvsSplitBy);
	 
				//System.out.println("OS= " + phone[0] + " , Form=" + phone[1] + " , Hi Speed=" + phone[2] +" , Keyboard=" + phone[3] + " , Color=" + phone[4] + " ,Phone=" + phone[5] + " ,Price=" + phone[6] );
				Hashtable<String, Double> hash1 = new Hashtable<String,Double>();
				//double x=(double) Integer.parseInt(phone[6]);
				hash1.put(phone[6],(double)10);
				Hashtable<String, Hashtable<String, Double>> hash2=new Hashtable<String,Hashtable<String,Double>>();
				hash2.put(phone[5],hash1);
				Hashtable<String,Hashtable<String, Hashtable<String, Double>>> hash3=new Hashtable<String,Hashtable<String, Hashtable<String, Double>>>();
				hash3.put(phone[4], hash2);
				
				Hashtable<String,Hashtable<String,Hashtable<String, Hashtable<String, Double>>>> hash4 = new Hashtable<String,Hashtable<String,Hashtable<String, Hashtable<String, Double>>>>();
				hash4.put(phone[3], hash3);
				
				Hashtable<String,Hashtable<String,Hashtable<String,Hashtable<String, Hashtable<String, Double>>>>> hash5=new Hashtable<String,Hashtable<String,Hashtable<String,Hashtable<String, Hashtable<String, Double>>>>>();
				hash5.put(phone[2], hash4);
				
				Hashtable<String,Hashtable<String,Hashtable<String,Hashtable<String,Hashtable<String, Hashtable<String, Double>>>>>> hash6 = new Hashtable<String,Hashtable<String,Hashtable<String,Hashtable<String,Hashtable<String, Hashtable<String, Double>>>>>>();
				hash6.put(phone[1],hash5);
				
				int x=Integer.parseInt(phone[0]);
				hash7.put(x,hash6);
				
				OSData[gI]=phone[1];
				FormData[gI]=phone[2];
				HiSpeedData[gI]=phone[3];
				KeyboardData[gI]=phone[4];
				ColorData[gI]=phone[5];
				PriceData[gI]=phone[7];
				PhoneData[gI]=phone[6];
				gI++;
				//System.out.println(x+ ":"+data.get(x));
			}
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(NullPointerException e){
			e.printStackTrace();
		}
		
		finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		data = hash7;
		Enumeration<Integer> keys = data.keys();
        while(keys.hasMoreElements()){
            Integer key = keys.nextElement();
          //  System.out.println("Value of "+key+" is: "+data.get(1));
        }
        for(int i=0;i<gI;i++)
        {
        	//System.out.println("OS= " + OSData[i] + " , Form=" + FormData[i] + " , Hi Speed=" + HiSpeedData[i] +" , Keyboard=" + KeyboardData[i] + " , Color=" + ColorData[i] + " ,Phone=" + PriceData[i] + " ,Price=" + PhoneData[i]);
        }
		//System.out.println("Done");
	  }
		
	
	public static void readFromHeuristic()
	{
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		Hashtable<String,Hashtable<Double, Double>> hash2 = new Hashtable<String,Hashtable<Double,Double>>();
		try {
	 
			br = new BufferedReader(new FileReader(fileheuristic));
			while ((line = br.readLine()) != null) {
	 
			        // use comma as separator
				String[] heuristic = line.split(cvsSplitBy);
	 
				//System.out.println("Attribute= " + heuristic[0] + " , Weight=" + heuristic[1] + " , Straight line" + heuristic[2]);
				Hashtable<Double, Double> hash1 = new Hashtable<Double,Double>();
				
				double heur1doub=(double)Integer.parseInt(heuristic[2]);
				double heur2doub=(double)Integer.parseInt(heuristic[1]);
				
				hash1.put(heur2doub,heur1doub);
				hash2.put(heuristic[0], hash1);
				
				HeuristicData[gI2]=heuristic[0];
				CostData[gI2]=heuristic[1];
				StraightLineData[gI2]=heuristic[2];
				gI2++;
			}
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		heuristic = hash2;
		Enumeration<String> keys = heuristic.keys();
        while(keys.hasMoreElements()){
            String key = keys.nextElement();
           // System.out.println("Value of "+key+" is: "+heuristic.get(key));
        }
		
        for(int i=0;i<gI2;i++)
        {
        	//System.out.println("Attribute= " + HeuristicData[i] + " , Weight=" + CostData[i] + " , Straight line" + StraightLineData[i]);
        }
        
		//System.out.println("Done");
	  }
		
	
	
	
		
	}
	

