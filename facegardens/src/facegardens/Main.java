package facegardens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import javax.swing.JFrame;

public class Main {
	
	
	static boolean i=true;
	static boolean j=true;
	static boolean k=true;
	static int roomNO=0;
	static int s=0;
	

	/*public Main(String name, String address, String contactNumber, String email, String proofType,
			String proofID) {

		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.proofType=proofType;
		this.proofID=proofID;
	}*/

	public static void main(String[] args) throws IOException {
		int flag=0;
		int c=0;
		
		
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		int booked[] =new int[25];
		int booked1[] =new int[25];
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
		name= br.readLine();
		address=br.readLine();
		contactNumber=br.readLine();
		email=br.readLine();
		proofType=br.readLine();
		proofID=br.readLine();
		
		//Main customer=new Main(name,address,contactNumber,email,proofType,proofID);
	Customer c1=new Customer();
	c1.setName(name);
	c1.setAddress(address);
	c1.setContactNumber(contactNumber);
	c1.setEmail(email);
	c1.setProofType(proofType);
	c1.setProofID(proofID);
		c1.register(name,address,contactNumber,email,proofType,proofID);
		System.out.println("Do u want to continue? y/n");
		char y = br.readLine().charAt(0);
		if(y=='y')
			i=true;
		else 
		{
		   i=false;
		   System.out.println("Thankyou for your valuable time!!1");
		}
		
		}while(i);  
		//JFrame frame = new JFrame("Sample");
		Roombooking r1=new Roombooking();
do
{
		System.out.println("Menu\n1.Book\n2.Check Status \n3.Exit\nEnter your choice");
		String choice =br.readLine();
		
			
		switch(choice)
		{
		case "1":
	{
		System.out.println("Booking:");
	do
	{
	System.out.println("Please choose the required service");
	System.out.println("ac or non ac(AC/nAC)");
	String type =br.readLine();
	r1.setType(type);
	System.out.println("Cot(Single or Double)");
	String cot=br.readLine();
	r1.setCot(cot);
    System.out.println("With cable connection or without cable connection (c/nC)");
	String cable=br.readLine();
	r1.setCable(cable);
	System.out.println("Wifi needed or not (w/nW)");
	String wifi=br.readLine();
	r1.setWifi(wifi);
	System.out.println("laundary service needed  or not (l/nL)");
	String laundry=br.readLine();
	r1.setLaundry(laundry);
	 r1.Book(type,cot,cable,wifi,laundry);
	 r1.display();
	System.out.println("Do you want to proceed?(yes/no)");
	String op1=br.readLine();
	String op2="yes";
	if(op1.equalsIgnoreCase(op2))
	{
			
	System.out.println("Thank you for booking.Your room number is "+ ++roomNO);
	booked1[c]=roomNO;
	//System.out.println(booked1[c]);
	
		
		booked[c]=1;
		
	c++;
	
	j=false;	
	}
	else
		j=true;
	}while(j);
	}
	
	break;
	case "2":
		{
			System.out.println("Enter room number");
			int  ch=Integer.parseInt(br.readLine());
			for(int i=0;i<ch;i++)
			{
				//System.out.println(booked[i]+" "+booked1[i]+" "+ch);
				if(  booked[ch-1]==1 )
				{
					//System.out.println(booked1[i]);
					System.out.println("Room number "+ch+" is booked");
				//flag=r1.checkstatus(ch,booked[i],flag);
					break;
				}
				else
				{
					System.out.println("Room not available");
					break;
				}
				//System.out.println("\n\n\n"+flag);
				
				
			}
				
		}break;
	case "3":
	{
		System.exit(0);
	}
		break;
		
		}	
		System.out.println("Do you want to continue?(yes/no)");
		String op1=br.readLine();
		String op2="yes";
		if(op1.equalsIgnoreCase(op2))
		{
				
		System.out.println("Thanks");
		
		k=true;	
		}
		else
			k=false;
		
		}while(k);	
		
}
}