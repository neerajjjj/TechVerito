import java.util.*;

public class Theater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);     // object to take input
		boolean seats[][][]=new boolean[3][3][9];  // creating array for 3 shows with 3 types of seats with 9 seats inside
		
		   // initial value set to true means all seats are free
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<9;k++) {
					seats[i][j][k]=true;
				}
			}
			
		}
		
		while(true) {
			double s=0;
			double st=0;
			double sbc=0;
			double kkc=0;
			double total=0;
			System.out.println("Free Seats");
			for(int i=0;i<3;i++) {
				int p=i+1;
				System.out.println("show "+p +" Running in Audi " +p+":");
				System.out.println("All Seats");
				
				for(int j=0;j<3;j++) {
					for(int k=0;k<9;k++) {
						if(j==0) {
							p=k+1;
							if(seats[i][j][k]==true)
							System.out.print("A"+p+" ");
						}
						else if(j==1) {
							p=k+1;
							if(seats[i][j][k]==true)
							System.out.print("B"+p+" ");
						}
						else{
							p=k+1;
							if(seats[i][j][k]==true)
							System.out.print("C"+p+" ");
						}
					}
					System.out.println();
				}
				System.out.println();
				System.out.println();
				System.out.println();
				
				
			}
			
			System.out.println("Inputs");
			System.out.print("Enter Show no: ");
			int i=sc.nextInt();
			System.out.print("Eneter seat like A1,B1 without space :");
			
			String str=sc.next();
			
			int num=0;
			String []string=str.split(",");
			if(i==1) {
				for(int j=0;j<string.length;j++) {
					
					if(string[j].length()==2) {
					 num=(int) string[j].charAt(1) -'0';
					if(string[j].charAt(0)=='A') {
						if(seats[0][0][num-1]==true) {
							System.out.println("Booked Sucessfully show 1");
							seats[0][0][num-1]=false;
							
							s+=320;
							st+=((320*14)/100);
							sbc+= ((320*0.5)/100);
							kkc+= ((320*0.5)/100);
							
							
							
						}
						else {
							System.out.println("One Show is not booked ");
						}
					}
					else if(string[j].charAt(0)=='B') {
						if(seats[0][1][num-1]==true) {
							System.out.println("Booked Sucessfully show 1");
							seats[0][1][num-1]=false;
							
							s+=280;
							st+=((280*14)/100);
							sbc+= ((280*0.5)/100);
							kkc+= ((280*0.5)/100);
						}
						else {
							System.out.println("One Show is not booked ");
						}
						
					}
					else {
						if(seats[0][2][num-1]==true) {
							System.out.println("Booked Sucessfully show 1");
							seats[0][2][num-1]=false;
							s+=240;
							st+=((240*14)/100);
							sbc+= ((240*0.5)/100);
							kkc+= ((240*0.5)/100);
						}
						else {
							System.out.println("One Show is not booked ");
						}
					
						
					}
					}
					
				}
				
			}
			else if(i==2) {
				for(int j=0;j<string.length;j++) {
					if(string[j].length()==2) {
					 num=(int) string[j].charAt(1)-'0';
					if(string[j].charAt(0)=='A') {
						if(seats[1][0][num-1]==true) {
							System.out.println("Booked Sucessfullyshow 2");
							seats[1][0][num-1]=false;
							s+=320;
							st+=((320*14)/100);
							sbc+= ((320*0.5)/100);
							kkc+= ((320*0.5)/100);
							
						}
						else {
							System.out.println("One Show is not booked ");
						}
					}
					
					else if(string[j].charAt(0)=='B') {
						if(seats[1][1][num-1]==true) {
							System.out.println("Booked Sucessfullyshow 2");
							seats[1][1][num-1]=false;
							s+=280;
							st+=((280*14)/100);
							sbc+= ((280*0.5)/100);
							kkc+= ((280*0.5)/100);
							
							
						}
						else {
							System.out.println("One Show is not booked ");
						}
						
					}
					else {
						if(seats[1][2][num-1]==true) {
							System.out.println("Booked Sucessfullyshow 2");
							seats[1][2][num-1]=false;
							s+=240;
							st+=((240*14)/100);
							sbc+= ((240*0.5)/100);
							kkc+= ((240*0.5)/100);
							
						}
						else {
							System.out.println("One Show is not booked ");
						}
						
					}
					}
					
				}
				
			}
			else {
				for(int j=0;j<string.length;j++) {
					if(string[j].length()==2) {
					 num=(int) string[j].charAt(1)-'0';
					if(string[j].charAt(0)=='A') {
						if(seats[2][0][num-1]==true) {
							System.out.println("Booked Sucessfully show 3");
							seats[2][0][num-1]=false;
							s+=320;
							st+=((320*14)/100);
							sbc+= ((320*0.5)/100);
							kkc+= ((320*0.5)/100);
							
						}
						else {
							System.out.println("One Show is not booked ");
						}
					}
					else if(string[j].charAt(0)=='B') {
						if(seats[2][1][num-1]==true) {
							System.out.println("Booked Sucessfully show 3");
							seats[2][1][num-1]=false;
							s+=280;
							st+=((280*14)/100);
							sbc+= ((280*0.5)/100);
							kkc+= ((280*0.5)/100);
							
						}
						else {
							System.out.println("One Show is not booked ");
						}
						
					}
					else {
						if(seats[2][2][num-1]==true) {
							System.out.println("Booked Sucessfully show 3");
							seats[2][2][num-1]=false;
							s+=240;
							st+=((240*14)/100);
							sbc+= ((240*0.5)/100);
							kkc+= ((240*0.5)/100);
						}
						else {
							System.out.println("One Show is not booked ");
						}
						
					}
					
				}
				}
				
			}
			
			System.out.println("Sub total:"+s);
			System.out.println("Service tax: "+st);
			System.out.println("Swachh Bharat Cess: "+sbc);
			System.out.println("Krishi Kalyan Cess: "+ kkc);
			total= s+st+kkc+sbc;
			System.out.println("Total:"+ total);
			System.out.print("print 1 to end  the booking or any number to continue:");
			String end=sc.next();
			if(end.equals("1")) {
				break;
				
			}
			
			
				
			
		}
		
		
	
		
		
		
	}

}
