package employeeRegistration;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class Main { // default constructor 
	Vector<Object> employeesVec = new Vector<> (); //vector
	EmployeesIT ne = new EmployeesIT(); //objects 
	EmployeesIT e1 = new EmployeesIT();
	EmployeesIT e2 = new EmployeesIT();
	EmployeesIT e3 = new EmployeesIT();
	EmployeesIT e4 = new EmployeesIT();
	EmployeesIT e5 = new EmployeesIT();
	int [] e = new int [6]; //global array 
	
	public Main() {
		e1.setName("Alex Kerrigan"); //employees list 
		e1.setAge(45);
		e1.setIdNumber(30222123);
		e1.setDepartment("IT");
		e2.setName("Dermont Johnson");
		e2.setAge(27);
		e2.setIdNumber(8051652);
		e2.setDepartment("Finance"); 
	    e3.setName("John Smith");
		e3.setAge(18);
		e3.setIdNumber(306589);
		e3.setDepartment("Finance");
		e4.setName("Will Smith");
		e4.setAge(35);
		e4.setIdNumber(301127);
		e4.setDepartment("IT");
		e5.setName("Vincent Price");
		e5.setAge(20);
		e5.setIdNumber(2003);
		e5.setDepartment("IT");
		
		employeesVec.add(e1);
		employeesVec.add(e2); //adding to the vector 
		employeesVec.add(e3);
		employeesVec.add(e4);
		employeesVec.add(e5);
		 
		menu(); // method 
	}
	public void menu() { // this method  is used to call the other methods 
	    boolean menu = false;
	    do { // this loop runs when the user does not  type the input showed on the screen  
			System.out.println (" \n ------Welcome to PrimeTech-----");
			System.out.println("\nEnter [a] to add new employee");
			System.out.println("Enter [b] to view the list of employees");
			System.out.println("Enter [c] to quit the program");
			
		    try { // try to do something
		        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));	
		        String option = br.readLine();
		        if (option.equalsIgnoreCase("a")){
			        addNew(); //methods
			        quit();
		        }
		        else if (option.equalsIgnoreCase("b")){
		           viewList(); //methods 
		           quit();  
		        }
		        else  if (option.equalsIgnoreCase("c")){
			       quit();	//methods 
		        }
		    } catch (Exception e) {menu = false;} //catch any error
		    System.out.println("[Not Found] type the right letter");  
	    } while(menu != true);
	}
	public void addNew() { // this method is used to add a new person into the system 
		try { //try do to something 
			BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Enter employee name:[first letter capitalized]");
			String name = br.readLine();
			
			System.out.println("Enter employee age:");
			int age = Integer.parseInt(br.readLine());
		
			System.out.println("Enter employee ID number:");
			int idNumber = Integer.parseInt(br.readLine());
			
			System.out.println("Enter employee department:");
			String department = br.readLine();
			
     		ne.setName(name);
			ne.setAge(age);
			ne.setIdNumber(idNumber);
			ne.setDepartment(department);
			
		} catch(Exception e){} //catch any error
		employeesVec.add(ne); //adding to the vector 	    	  		
	}	
	public void viewList() { //this method is used to call other methods 
		boolean list = false;
		do { // this loop runs when the user does not  type the input showed on the screen 
		System.out.println("Press [1] to see the employees ID by ascending order");
		System.out.println("Press [2] to see the employees ID by descending order");
		System.out.println("Press [3] to search a employee details by name");
		    try { // try to do something 
		    	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		    	String viewList = br.readLine();
		    	if (viewList.equals("1")){
		    		ascendingOrder(); //methods 
		    		quit();
		    	}
		    	else if (viewList.equals("2")){
		    		descendingOrder(); //methods 
		    		quit();
		    	}
		    	else if (viewList.equals("3")){
		    		search(); //methods 
		    		quit();
		    	}	
		    } catch(Exception e){} //catch any error
		    System.out.println("[Not Found] type the right letter");
		} while(list != true);
	}   
	public void ascendingOrder() { // this method shows the employees list in a ascending order based on IDs
		e[0] = ne.getIdNumber();
		e[1] = e1.getIdNumber(); //adding objects to an array 
		e[2] = e2.getIdNumber();
		e[3] = e3.getIdNumber();
	    e[4] = e4.getIdNumber();
		e[5] = e5.getIdNumber();
	
		 for(int i=0; i < e.length; i++);
		 int j;
			boolean flag = true;   // set flag to true to begin first pass
			int temp;   //holding variable
			while (flag){
			flag= false;    //set flag to false awaiting a possible swap
		        for(j=0;  j < e.length -1;  j++) {
		            if (e[ j ] > e[j+1]){  //  > for ascending sort
		                temp = e[ j ];                //swap elements
		                 e[j] = e[j+1];
		                 e[j+1] = temp;
		                 flag = true;              //shows a swap occurred        
		            } 
		      } 
		 }
		 for(int i=0; i< e.length; i++) {
		     int currentId = e[i];		
		         for(int x=0; x< employeesVec.size(); x++) {		
		             EmployeesIT temp1 = (EmployeesIT)employeesVec.elementAt(x);
		        	     if(temp1.getIdNumber() == currentId) {
		        		     System.out.println( //printing data from the vector 
				        	 "ID:" +temp1.getIdNumber()+
				        	 "\nName: " + temp1.getName()+
				        	 "\nAge: " + temp1.getAge()+
				        	 "\nDepartment: " + temp1.getDepartment()+
				        	 "\n---------------------------------\n");    	
		        		}
		         }
		  }				
	}
	public void descendingOrder() { // this method shows the employees list in a descending order based on IDs
		e[0] = ne.getIdNumber();
		e[1] = e1.getIdNumber(); //adding objects to an array
		e[2] = e2.getIdNumber();
		e[3] = e3.getIdNumber();
	    e[4] = e4.getIdNumber();
		e[5] = e5.getIdNumber();
		
        for(int i=0; i< e.length; i++);
		 int j;
			boolean flag = true;   // set flag to true to begin first pass
			int temp;   //holding variable
			while(flag) {
			flag= false;    //set flag to false awaiting a possible swap
		       	for(j=0; j < e.length -1;  j++) {
		            if (e[j] < e[j+1]){  //  < for descending sort
		                temp = e[j];                //swap elements
		                e[j] = e[j+1];
		                e[j+1] = temp;
		                flag = true;              //shows a swap occurred        
		            } 
		       }
		 }
		 for(int i=0; i< e.length; i++) {
		 int currentId = e[i];  			
		     for(int x=0; x < employeesVec.size(); x++) {			
		         EmployeesIT temp2 = (EmployeesIT)employeesVec.elementAt(x);
		             if(temp2.getIdNumber() == currentId) {
		        	     System.out.println( // printing data from the vector 
		        		 "ID:" +temp2.getIdNumber()+
		        		 "\nName: " + temp2.getName()+
		        	     "\nAge: " + temp2.getAge()+
		        	     "\nDepartament: " + temp2.getDepartment()+
		        	     "\n-----------------------\n");	
		        	}
		      }
		 } 
	}
	public void search() { //this method is used for search a employee by name
		try { // try to do something 
			BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Type employee name:[first letter capitalized]");
			String lookingFor = "";
			lookingFor = br.readLine();
		    for(int x =0; x < employeesVec.size(); x++) {
		        EmployeesIT temp3 = (EmployeesIT)employeesVec.get(x);
			        if(temp3.getName().contains(lookingFor)){
	    	            System.out.println(   //printing data from the vector 
	    			    "\nName : " + temp3.getName()+
	    			    "\nAge : " + temp3.getAge()+
	    			    "\nID : " + temp3.getIdNumber()+
	    			    "\nDepartament : " + temp3.getDepartment()+
	    			    "\n----------------------------------\n"); 
		        }
		    }
	    } catch(Exception e){} // catch any error 
	}
	public void quit() { // this method is used to close the program or come back to  the main menu
		boolean close = false;
		do { // this loop runs when the user does not  type the input showed on the screen 
		System.out.println("Would like to close the program?");
		System.out.println("yes [y] no [n]");
		    try { // try to do something
			    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			    String quit = br.readLine();
			    if(quit.equalsIgnoreCase("y")){
				    System.out.println("Thank you");
				    System.exit(0);  // is used to close the program 
			    }
			    else if (quit.equalsIgnoreCase("n")) {
				    menu(); // method 
			    }
		    } catch(Exception e){close = false;} //catch any error 
		    System.out.println("[Not Found] type the right letter");
	    } while(close!= true);
	}
	public static void main(String[] args) {
		new Main(); // TODO Auto-generated method stub
	}
} 

