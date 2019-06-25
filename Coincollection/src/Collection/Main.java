package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Coin>c=new HashSet();
		//c.add(new Coin());
//		c.add(new Coin("USA","xyz",1955,1000,2015));
//		c.add(new Coin("india","rs",1944,100,2010));
		 Scanner sc= new Scanner(System.in);
		 int sz,ch;
		 String chr;
		 Iterator<Coin>itr1=null;
		 List<Coin> list = new ArrayList<Coin>();
		do
		{ 
			System.out.println("1.Add\n2.Search\n3.Exit");
			System.out.println("enter choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("no of coin u want to enter:");
			sz=sc.nextInt();
			
			//Iterator<Coin> itr = c.iterator();
			//while(itr.hasNext())
			//{ 
				
			//Coin ref=itr.next();
			for(int i=0;i<sz;i++)
			{
				Coin ref=new Coin();
			ref.Accept();
				c.add(ref);
			
			}
			
		Iterator<Coin>itr = c.iterator();
		while(itr.hasNext())
		{ 
			Coin ref=itr.next();
			 //System.out.print(itr.next());
			 //System.out.println(ref); 
		 
		
			ref.display();
		}
		
		break;
	case 2:do{
		System.out.println("\n1.Country\n2.YearofMinting\n3.Current value");
		System.out.println("enter choice");
		ch=sc.nextInt();
		switch(ch)
		{
		
		case 1:String st;
		System.out.println("enter the country u want to search:");
		st=sc.next();
		itr1 = c.iterator();
		
		while(itr1.hasNext())
		{
			Coin ref=itr1.next();
			if(ref.getCountry().equals(st))
			{
				//ref.display();
				list.add(ref);
			}
		}
			
			
			
			System.out.println("ArrayList contains: "+ list);
			break;
		case 2:System.out.println("enter the year u want to search:");
		ch=sc.nextInt();
		
		itr1 = c.iterator();
		while(itr1.hasNext())
		{
			Coin ref=itr1.next();
			if(ref.getYearofminting()==(ch))
			{
				
				ref.display();
			}
		}
		 
			
				
			
		 
			break;
		case 3:
		
		}
		System.out.println("do u want to continue:");
		chr=sc.next();
	}while(chr.equals("y")||chr.equals("Y"));
		
	
	case 3: 
	
			}
			System.out.println("do u want to continue:");
		chr=sc.next();
		}while(chr.equals("y")||chr.equals("Y"));
		
	}
	}

	
	


