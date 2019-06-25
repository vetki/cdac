package Collection;

import java.util.Scanner;

public class Coin {
	 String Country;
	 String Denomination;
	 int Yearofminting;
	 float Currentvalue;
	 int Acquireddate;
	 
	 Scanner sc= new Scanner(System.in);
	
	

     /**
	 * @param country
	 * @param denomination
	 * @param yearofminting
	 * @param currentvalue
	 * @param acquireddate
	 * @param sc
	 */
	protected Coin(String country, String denomination, int yearofminting, float currentvalue, int acquireddate
			) {
	
		Country = country;
		Denomination = denomination;
		Yearofminting = yearofminting;
		Currentvalue = currentvalue;
		Acquireddate = acquireddate;
		
	}


	public Coin() {
		// TODO Auto-generated constructor stub
	}


	public void Accept()
     {
    System.out.println("enter country:");	
    Country =sc.next();
    System.out.println("enter Denomination :");	
    Denomination  =sc.next();
    System.out.println("enter Yearofminting :");	
    Yearofminting  =sc.nextInt();
    
    System.out.println("enter Currentvalue :");	
    Currentvalue =sc.nextFloat();
    System.out.println("enter Acquireddate :");	
    Acquireddate =sc.nextInt();
    
     }
	public void display()
	{
		System.out.println("Country:"+Country);
		System.out.println("Denomination:"+Denomination);
		System.out.println("Yearofminting:"+Yearofminting);
		System.out.println("Currentvalue:"+Currentvalue);
		System.out.println("Acquireddate:"+ Acquireddate);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "country= "+this.Country+"\n Denomination="+this.Denomination+"\nYearofminting="+this.Yearofminting+"\nCurrentvalue="+this.Currentvalue+"\nAcquireddate"+this.Acquireddate;
	}
	public void setCountry(String country) {
		Country = country;
	}


	public String getCountry() {
		return Country;
	}


	public String getDenomination() {
		return Denomination;
	}


	public void setDenomination(String denomination) {
		Denomination = denomination;
	}


	public int getYearofminting() {
		return Yearofminting;
	}


	public void setYearofminting(int yearofminting) {
		Yearofminting = yearofminting;
	}


	public int getAcquireddate() {
		return Acquireddate;
	}


	public void setAcquireddate(int acquireddate) {
		Acquireddate = acquireddate;
	}


	

	
}
