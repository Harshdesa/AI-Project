
public class AStar {

	public static double totalCost=0.0;
	public static double tempCost;
	public static double finalCost=200.0;
	public static int flagtoAdd=0;
	public AStar()
	{
		
		
	}
	public static void secondFunc()
	{
		for(int i=0;i<Database.gI;i++)
		{
			
			int flag=1;
			if(Database.OSData[i].equals(Interface.OS)&&Database.FormData[i].equals(Interface.Form)&&Database.KeyboardData[i].equals(Interface.Keyboard)&&Database.HiSpeedData[i].equals(Interface.HiSpeed)&&Database.ColorData[i].equals(Interface.Color))
			{
				if(Database.PhoneData[i].equals("N/A"))
				{
					i=i+144;
					flag=0;
				}
				System.out.println("The phone is : " + Database.PhoneData[i+flagtoAdd] + " It's price is: " + Database.PriceData[i+flagtoAdd]);
				if(flag==0)
				i=i-144;
			}
			
			
		}
	}
	
	
	public static void restart()
	{
		Interface.OSi=0;
		Interface.Formi=0;
		Interface.HiSpeedi=0;
		Interface.Keyboardi=0;
		Interface.Colori=0;
		Interface.Pricei=0;
		for(int i=0;i<5;i++)
		{
			Database.OS[i]=null;
			Database.Form[i]=null;
			Database.Keyboard[i]=null;
			Database.Color[i]=null;
			Database.PriceHigh[i]=0.0;
			Database.PriceLow[i]=0.0;
			
		}
		for(int i=0;i<6;i++)
		{
			GreedyBestFirst.Priority[i]=0;
			
		}
		Interface.OS=null;
		Interface.Form=null;
		Interface.HiSpeed=null;
		Interface.Keyboard=null;
		Interface.Color=null;
		
		
	}
	
	
	
	public static void mainFunc()
	{
		//for(int i=0;i<6;i++)
		//{
			//if(GreedyBestFirst.Priority[i]==1)
			//{
		totalCost=0.0;
				if((Interface.OS==null))
				{
					for(int j=14;j<17;j++)
					{
						
						double cost=Integer.parseInt(Database.CostData[j]);
						double heuristic=Integer.parseInt(Database.StraightLineData[j]);
						tempCost=cost+heuristic;
						if(tempCost<finalCost)
						{
							finalCost=tempCost;
							Interface.OS=Database.HeuristicData[j];
						}
						
						
					}
					totalCost=totalCost+finalCost;
				//	 System.out.println(Interface.OS);
				}
				finalCost=200.0;
				if(Interface.Form==null)
				{
					for(int j=10;j<14;j++)
					{
						
						double cost=Integer.parseInt(Database.CostData[j]);
						double heuristic=Integer.parseInt(Database.StraightLineData[j]);
						tempCost=cost+heuristic;
						if(tempCost<finalCost)
						{
							finalCost=tempCost;
							Interface.Form=Database.HeuristicData[j];
						}
						
						
					}
					totalCost=totalCost+finalCost;
					// System.out.println(Interface.Form);
					
					
				}
				finalCost=200.0;
				if(Interface.HiSpeed==null)
				{
					for(int j=7;j<9;j++)
					{
						
						double cost=Integer.parseInt(Database.CostData[j]);
						double heuristic=Integer.parseInt(Database.StraightLineData[j]);
						tempCost=cost+heuristic;
						if(tempCost<finalCost)
						{
							finalCost=tempCost;
							Interface.HiSpeed=Database.HeuristicData[j];
						}
						
						
					}
					totalCost=totalCost+finalCost;
				//	 System.out.println(Interface.HiSpeed);
					
					
				}
				finalCost=200.0;
				if(Interface.Keyboard==null)
				{
					for(int j=3;j<7;j++)
					{
						
						double cost=Integer.parseInt(Database.CostData[j]);
						double heuristic=Integer.parseInt(Database.StraightLineData[j]);
						tempCost=cost+heuristic;
						if(tempCost<finalCost)
						{
							finalCost=tempCost;
							Interface.Keyboard=Database.HeuristicData[j];
						}
						
						
					}
					totalCost=totalCost+finalCost;
				//	 System.out.println(Interface.Keyboard);
					
					
				}
				finalCost=200.0;
				if(Interface.Color==null)
				{
					for(int j=0;j<2;j++)
					{
						
						double cost=Integer.parseInt(Database.CostData[j]);
						double heuristic=Integer.parseInt(Database.StraightLineData[j]);
						tempCost=cost+heuristic;
						if(tempCost<finalCost)
						{
							finalCost=tempCost;
							Interface.Color=Database.HeuristicData[j];
						}
						
						
					}
					totalCost=totalCost+finalCost;
				//	 System.out.println(Interface.Color);
					
					
				}
				
				
				
			}
		//}
		
		
	//}
	
	
	
}
