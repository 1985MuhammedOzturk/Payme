
// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

//SalariedProgrammer.java
//SalariedProgrammer concrete class extends abstract class Programmer.
/**
 * @author Muhammed Ozturk
 */
public class SalariedProgrammer extends Programmer  {
private double weeklySalary;

//constructor
public SalariedProgrammer(String firstName, String lastName, 
String socialSecurityNumber,  
double weeklySalary) {
super(firstName, lastName, socialSecurityNumber); 

if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

//set salary
public void setWeeklySalary(double weeklySalary) {
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

//return salary
public double getWeeklySalary() {
return weeklySalary;
} 

//calculate earnings; override abstract method earnings in Programmer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO


@Override                                                           
public double earnings() {                                          
return getWeeklySalary();                                        
}                                             

//return String representation of SalariedProgrammer object   
@Override    
public double getPaymentAmount() {
	return earnings();
}
                                            
//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
public String toString() {
	return String.format(
			"Salaried Programmer: %s\n%s: $%,.2f", 
             	super.toString(), "weekly salary", getWeeklySalary()
			);
}
}

