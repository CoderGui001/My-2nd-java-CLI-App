import java.util.Scanner;
class Coursework3{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);	
			System.out.println("\n\n");
			System.out.println("						    COURSEWORK3");
			System.out.println("				             Tharaka Gihan Dhananjaya");
			System.out.println("	                                            iCM 104011");
			
			
		        System.out.print("\n\n");
								
			System.out.println(" 			    _____                      _     ______        _     _  ");           
			System.out.println("			   / ____|                    | |   |  ____|      | |   (_)  ");          
			System.out.println("			  | (___  _ __ ___   __ _ _ __| |_  | |__ __ _ ___| |__  _  ___  _ __     "); 
			System.out.println("			  \\____ \\| '_ ` _ \\ / _` | '__| __| |  __/ _` / __| '_ \\| |/ _ \\| '_ \\      ");
			System.out.println("  		           ____) | | | | | | (_| | |  | |_  | | | (_| \\__ \\ | | | | (_) | | | |     ");
			System.out.println("			  |_____/|_| |_| |_|\\__,_|_|   \\__| |_|  \\__,_|___/_| |_|_|\\___/|_| |_|     ");
                                                                       
                                                                      
			System.out.print("\n\n");
			
            System.out.print("		          Date :");
            String Date=input.nextLine();
            
            System.out.print("\n");
            System.out.print("                          Customer Name :");
            String Name=input.nextLine();                                                        
            System.out.print("\n\n");           
            System.out.println("                          ______________________________________________________________________");                                                          
                                                                                                                  
            System.out.print("\n\n");
            
            System.out.println("\r\n\t\t\t\t\t      _____    ___ _    _     _      \r\n\t\t\t\t\t     |_   _|__/ __| |_ (_)_ _| |_ ___\r\n\t\t\t\t\t       | ||___\\__ \\ \' \\| | \'_|  _(_-<\r\n\t\t\t\t\t       |_|    |___/_||_|_|_|  \\__/__/\r\n                                 \r\n");
			
            //System.out.print("\n\n");
                                         
			System.out.print("		          Number of T-Shirts :");
            int a1=input.nextInt();
            System.out.print("\n");
                                                                      
			System.out.print("		          Unit Price of T-Shirts :");
            double a2=input.nextInt();
             System.out.print("\n");
            
            System.out.print("		          Discount Rate (%) :");
            double a3=input.nextDouble();
            System.out.print("\n");
            
            double Discount1= (a2*a1)*(a3/100);
            double A1=(a2*a1) - (Discount1);
            
            
            System.out.println("                          +--------------------+-----------+------------------+----------------+");
            System.out.println("                          | Description        |    QTY    |    Unit Price    |      Amount    |");
            System.out.println("                          +--------------------+-----------+------------------+----------------+");
            System.out.println("                          | T-Shirt            |     "+a1+"     |       "+a2+"      |      "+A1+"    |");
            System.out.println("                          +--------------------+-----------+------------------+----------------+");
            
             
            System.out.print("\n\n");
            System.out.println("                          ______________________________________________________________________");
            System.out.println("\n\n");
            
            
            System.out.println("\r\n\t\t\t\t\t      _____                            \r\n\t\t\t\t\t     |_   _| _ ___ _  _ ___ ___ _ _ ___\r\n\t\t\t\t\t       | || \'_/ _ \\ || (_-</ -_) \'_(_-<\r\n\t\t\t\t\t       |_||_| \\___/\\_,_/__/\\___|_| /__/\r\n                                   \r\n");
            
            
                                         
			System.out.print("		          Number of Trousers :");
            int b1=input.nextInt();
            System.out.print("\n");
                                                                      
			System.out.print("		          Unit Price of Trouser :");
            double b2=input.nextInt();
             System.out.print("\n");
            
            System.out.print("		          Discount Rate (%) :");
            double b3=input.nextDouble();
            System.out.print("\n");
            
            double Discount2= (b2*b1)*(b3/100);
            double A2=(b2*b1) - (Discount2);
            
            //System.out.print("                          ______________________________________________________________________");
            System.out.println("                          +--------------------+-----------+------------------+----------------+");
            System.out.println("                          | Description        |    QTY    |    Unit Price    |      Amount    |");
            System.out.println("                          +--------------------+-----------+------------------+----------------+");
            System.out.println("                          | Trouser            |     "+b1+"     |       "+b2+"     |      "+A2+"    |");
            System.out.println("                          +--------------------+-----------+------------------+----------------+");
            
             
            System.out.print("\n\n");
            System.out.print("                          ______________________________________________________________________");
            System.out.print("\n\n");
            
            System.out.println("\r\n\t\t\t\t\t        ___ _    _     _      \r\n\t\t\t\t\t       / __| |_ (_)_ _| |_ ___\r\n\t\t\t\t\t       \\__ \\ \' \\| | \'_|  _(_-<\r\n\t\t\t\t\t       |___/_||_|_|_|  \\__/__/\r\n                        \r\n");
            System.out.print("\n");
                                         
			System.out.print("		          Number of Shirts :");
            int c1=input.nextInt();
            System.out.print("\n");
                                                                      
			System.out.print("		          Unit Price of Shirt :");
            double c2=input.nextInt();
             System.out.print("\n");
            
            System.out.print("		          Discount Rate (%) :");
            double c3=input.nextDouble();
            System.out.print("\n");
            
            double Discount3= (c2*c1)*(c3/100);
            double A3=(c2*c1) - (Discount3);
            
            System.out.println("                          +--------------------+-----------+------------------+----------------+");
            System.out.println("                          | Description        |    QTY    |    Unit Price    |      Amount    |");
            System.out.println("                          +--------------------+-----------+------------------+----------------+");
            System.out.println("                          | Shirt              |     "+c1+"     |       "+c2+"     |      "+A3+"    |");
            System.out.println("                          +--------------------+-----------+------------------+----------------+");
            
             
            System.out.print("\n\n");
            System.out.print("                          ______________________________________________________________________");
            System.out.print("\n\n");                                                                                                      
   
            System.out.println("\r\n\r\n\t\t\t\t\t          ___ _            _      \r\n\t\t\t\t\t         / __| |_  ___ _ _| |_ ___\r\n\t\t\t\t\t         \\__ \\ \' \\/ _ \\ \'_|  _(_-<\r\n\t\t\t\t\t         |___/_||_\\___/_|  \\__/__/\r\n                          \r\n");
        
			System.out.print("		          Number of Shorts :");
            int d1=input.nextInt();
            System.out.print("\n");
                                                                      
			System.out.print("		          Unit Price of Short :");
            double d2=input.nextInt();
             System.out.print("\n");
            
            System.out.print("		          Discount Rate (%) :");
            double d3=input.nextDouble();
            System.out.print("\n");
            
            double Discount4= (d2*d1)*(d3/100);
            double A4=(d2*d1) - (Discount4);
            
            System.out.println("                          +--------------------+-----------+------------------+----------------+");
            System.out.println("                          | Description        |    QTY    |    Unit Price    |      Amount    |");
            System.out.println("                          +--------------------+-----------+------------------+----------------+");
            System.out.println("                          | Short              |     "+d1+"     |       "+d2+"      |      "+A4+"    |");
            System.out.println("                          +--------------------+-----------+------------------+----------------+");
            
             
            System.out.print("\n\n");
            System.out.print("                          ______________________________________________________________________");
            System.out.print("\n\n"); 
   
            double A5= A1+A2+A3+A4;
   
			
            System.out.println("		          +---------------------------------------------------------------------+  ");
	    System.out.println("		          |                                                                     |   ");
            System.out.println("		          |            ___ _ _ _   ___                                          |    ");
            System.out.println("		          |           | _ |_) | | / __|_  _ _ __  _ __  __ _ _ _ _  _           |      ");
            System.out.println("		          |           | _ \\ | | | \\__ \\ || | '  \\| '  \\/ _` | '_| || |          | ");
            System.out.println("		          |           |___/_|_|_| |___/\\_,_|_|_|_|_|_|_\\__,_|_|  \\_, |          | ");
            System.out.println("		          |                                                      |__/           |    ");
            System.out.println("		          |                                                                     |    ");
	    System.out.println("		          |                                                                     |     ");
            System.out.println("		          |  Customer: "+Name+"                           Date : "+Date+"    |         ");
            System.out.println("		          |                                                                     |     ");
            System.out.println("		          +--------------------+-------------+----------------+-----------------+    ");
            System.out.println("		          | Description        |     QTY     |    Unit Price  |      Amount     |     ");
            System.out.println("	                  +--------------------+-------------+----------------+-----------------+       ");
            System.out.println("		          | T-Shirt            |      "+a1+"      |       "+a2+"    |      "+A1+"     | ");
	    System.out.println("		          | Trousers           |      "+b1+"      |       "+b2+"   |      "+A2+"     |  ");
            System.out.println("		          | Shirt              |      "+c1+"      |       "+c2+"   |      "+A3+"     |  ");
            System.out.println("		          | Short              |      "+d1+"      |       "+d2+"    |      "+A4+"     | ");
            System.out.println("		          +---------------------------------------------------------------------+       ");
            System.out.println("		          | Total                                             |      "+A5+"     |       ");
            System.out.println("		          +---------------------------------------------------------------------+       ");		

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   }    
}
