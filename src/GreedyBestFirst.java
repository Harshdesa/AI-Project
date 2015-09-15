import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;


public class GreedyBestFirst {

	static int Priority[] = new int[6];
	static int PriorityStack[] = new int[6];
	String features[];
	public static ArrayList<String> phoneList = new ArrayList<String>();
	public GreedyBestFirst()
	{
		
		
	}
	
	public static void adjustPriorities()
	{
		int low=0;int low2=0;int low3=0;int low4=0;
		// If 1 or 2 or more of the priorities are the same, give default priorities
				for(int i=0;i<5;i++)
				{
					for(int k=i+1;k<6;k++)
					{
					if(Priority[i]!='\0')
					{
					if(Priority[i] == Priority[k])
					{
						if(Priority[k]==6)
						{
							Priority[k]=5;
							low=1;
						}
						else if((Priority[k]==5)&&(low==1))
						{
							Priority[k]=4;
							low2=1;
						}
						else if((Priority[k]==4)&&(low2==1))
						{
							Priority[k]=3;
							low3=1;
						}
						else if((Priority[k]==3)&&(low3==1))
						{
							Priority[k]=2;
							low4=1;
						}
						else if((Priority[k]==2)&&(low4==1))
						{
							Priority[k]=1;
						}
						else
							Priority[k]++;
					}
					}
						
					}
					
				}
		//check assigned priorities
		int j=0;
		int assigned[] =new int[6];
		for(int i=0;i<6;i++)
		{
			if(Priority[i]!='\0')
			{
				
				assigned[j]=Priority[i];
				j++;
			}
		}
		//assign to unassigned priorities
		int p=1;
		for(int i=0;i<6;i++)
		{
			if(Priority[i]=='\0')
			{
				
				for(int ko=0;ko<j;ko++)
				{
					for(int k=0;k<j;k++)
					{
						if(assigned[k]==p)
						{
							p++;
						}
					
					
					}
				}
					Priority[i]=p;
					p++;
					
					
					
					
				}
			}
		}
	
	
	public static int num=0;
	public static void matchPriorities()
	{
		num=0;
		for(int i=0;i<6;i++)
		{
			if(PriorityStack[i]==Priority[i])
			{
				num++;
				
				
			}
			
		}
		if(num<5)
		{
			AStar.flagtoAdd=1;
			
		}
		
		
	}
	
	
	
	public static void printPriorities()
	{
		for(int i=0;i<6;i++)
		{
			PriorityStack[i]=Priority[i];
			//System.out.println(Priority[i]);
		}
		
	}
	/*The mainFunc of GreedyBestFirst
	 * 
	 * Use : If many checkboxes are checked, it will filter out the most optimal checkbox by using the cost function in the heuristic.
	 * 
	 * 
	 */
	
	public static void mainFunc()
	{
		int keyFinal=100;
		Double tempCost=100.0;
		Double currentCost=0.0;
		 for(int i=0;i<Interface.OSi;i++)
		 {
			 for(int j=0;j<Database.gI2;j++)
			 {
			 if(Database.HeuristicData[j].equals(Database.OS[i]))
			 {
				 currentCost = (double) Integer.parseInt(Database.CostData[j]);
				 if(currentCost<tempCost)
					 {tempCost=currentCost; keyFinal=j;
					 Interface.OS = Database.OS[i];
					 }
				 
			 }
			 }
		 }
		// System.out.println(Interface.OS);
		 tempCost=100.0;
		 for(int i=0;i<Interface.Formi;i++)
		 {
			 for(int j=0;j<Database.gI2;j++)
			 {
			 if(Database.HeuristicData[j].equals(Database.Form[i]))
			 {
				 currentCost = (double) Integer.parseInt(Database.CostData[j]);
				 if(currentCost<tempCost){
					 tempCost=currentCost;
				 Interface.Form = Database.Form[i];
				 }
			 }
			 }
		 }
		// System.out.println( Interface.Form);
		
		 tempCost=100.0;
		 for(int i=0;i<Interface.HiSpeedi;i++)
		 {
			 for(int j=0;j<Database.gI2;j++)
			 {
			 if(Database.HeuristicData[j].equals(Database.HiSpeed[i]))
			 {
				 currentCost = (double) Integer.parseInt(Database.CostData[j]);
				 if(currentCost<tempCost){
					 tempCost=currentCost;
				 Interface.HiSpeed = Database.HiSpeed[i];
				 }
			 }
			 }
		 }
		// System.out.println(Interface.HiSpeed);
		 
		 tempCost=100.0;
		 for(int i=0;i<Interface.Keyboardi;i++)
		 {
			 for(int j=0;j<Database.gI2;j++)
			 {
			 if(Database.HeuristicData[j].equals(Database.Keyboard[i]))
			 {
				 currentCost = (double) Integer.parseInt(Database.CostData[j]);
				 if(currentCost<tempCost){
					 tempCost=currentCost;
				 Interface.Keyboard = Database.Keyboard[i];
				 }
			 }
			 }
		 }
		 //System.out.println(Interface.Keyboard);
		
		 tempCost=100.0;
		 for(int i=0;i<Interface.Colori;i++)
		 {
			 for(int j=0;j<Database.gI2;j++)
			 {
			 if(Database.HeuristicData[j].equals(Database.Color[i]))
			 {
				 currentCost = (double) Integer.parseInt(Database.CostData[j]);
				 if(currentCost<tempCost)
				 {
					 tempCost=currentCost;
				 Interface.Color = Database.Color[i];
				 }
			 }
			 }
		 }
		// System.out.println(Interface.Color);
		
		/* tempCost=100.0;
		 for(int i=0;i<Interface.Pricei;i++)
		 {
			 for(int j=0;j<Database.gI2;j++)
			 {
			 if(Database.HeuristicData[j].equals(Database.Price[i]))
			 {
				 currentCost = (double) Integer.parseInt(Database.CostData[j]);
				 if(currentCost<tempCost)
					 tempCost=currentCost;
				 
			 }
			 }
		 }
		 System.out.println(tempCost);
		*/
		
	}
	
	public static double idealPrice[] = new double[500];			// Contains all the ideal price 
	static int priceIterator=0;
	
	
	/*
	 * 
	 * Use : If the Price Priority is checked, then it will filter out the records according to the price and will assign values to the null values. 
	 * 
	 * 
	 * 
	 */
	static Double pricedata;
	
	public static void greedy()					// To get according to cost 
	{
		priceIterator=0;
		for(int i=0;i<500;i++)
		{
			idealPrice[i]=0.0;
		}
		if((Priority[5]!='\0')||(Database.PriceLow[0]!=null))
		{
			for(int i=0;i<Interface.Pricei;i++)
			{
				for(int j=1;j<Database.gI;j++)
				{
					pricedata =(double) Integer.parseInt(Database.PriceData[j]);
				if((Database.PriceLow[i]<=pricedata)&&(pricedata<=Database.PriceHigh[i]))
				{
					idealPrice[priceIterator]=pricedata;
					priceIterator++;
					
				}
				}
			}
		}
		int flagforI=1;							// Flag to get the record
		int flagtoChange=0;
		for(int i=1;i<Database.gI;i++)
		{
			for(int j=0;j<priceIterator;j++)
			{
			double pricedata =(double) Integer.parseInt(Database.PriceData[i]);
			if(idealPrice[j]==pricedata)
			{
				flagforI=1;
				if(Interface.OS!=null)
				{
					if(Interface.OS.equals(Database.OSData[i]))
					{
						//System.out.println("Yo");
					}
					else
						flagforI=0;
				}
				
				if(Interface.Form!=null)
				{
					if(Interface.Form.equals(Database.FormData[i]))
					{
						//System.out.println("man");
					}
					else
						flagforI=0;
				}
				if(Interface.HiSpeed!=null)
				{
					if(Interface.HiSpeed.equals(Database.HiSpeedData[i]))
					{
					}
					else
						flagforI=0;
				}
				if(Interface.Keyboard!=null)
				{
					if(Interface.Keyboard.equals(Database.KeyboardData[i]))
					{
					}
					else
						flagforI=0;
				}
				if(Interface.Color!=null)
				{
					if(Interface.Color.equals(Database.ColorData[i]))
					{
					}
					else
						flagforI=0;
				}
				
				if(flagforI==1)
				{
					if(Interface.OS==null)
					{
						Interface.OS=Database.OSData[i];
						//System.out.println(Interface.OS);
					}
					
					if(Interface.Form==null)
					{
						Interface.Form=Database.FormData[i];
						//System.out.println(Interface.Form);
					}	
					if(Interface.HiSpeed==null)
					{
						Interface.HiSpeed=Database.HiSpeedData[i];
						//System.out.println(Interface.HiSpeed);
					}
					if(Interface.Keyboard==null)
					{
						Interface.Keyboard=Database.KeyboardData[i];
						//System.out.println(Interface.Keyboard);
					}
					if(Interface.Color==null)
					{
						Interface.Color=Database.ColorData[i];
						//System.out.println(Interface.Color);
					}
				}
				
				
			}
			
			}
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	public void createTree()
	{
		for(int i=0;i<6;i++)
		{
			if(1==Priority[i])
			{
				
				
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
