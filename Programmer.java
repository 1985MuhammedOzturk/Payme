
// LAB 6: YOU ARE REQUIRED TO MODIFY THIS CODE!!!

//Programmer.java

//Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.

//SOME MODIFICATION ARE REQUIRED IN THIS SECTION OF YOUR HERE - LOOK CLOSELY!!!
/**
 * @author Muhammed Ozturk
 */
public abstract class Programmer implements Payme  {

private String firstName;
private String lastName;
private String socialSecurityNumber;

//three-argument constructor
public Programmer(String first, String last, String ssn) {
 firstName = first;
 lastName = last;
 socialSecurityNumber = ssn;
}

/** CHANGES ARE REQUIRED IN THIS SECTION. 
* THINK OF THE BEST WAY TO ACCESS PRIVATE VARIABLES.
* IN THIS PORTION OF YOUR CODE INCLUDE ALL OF SUCH THAT APPLIES.
*/

/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}



/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}

/**
 * @param socialSecurityNumber the socialSecurityNumber to set
 */
public void setSocialSecurityNumber(String socialSecurityNumber) {
	this.socialSecurityNumber = socialSecurityNumber;
}

/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}

/**
 * @return the socialSecurityNumber
 */
public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}


//return String representation of Programmer object
@Override
public String toString() {
    return String.format("%s %s\nsocial security number: %s", 
      getFirstName(), getLastName(), getSocialSecurityNumber());
}


//Note: We do NOT implement Payme method getPaymentAmount() here. 
// THEREFORE, TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS....?

/**
 * @Override
 */
public abstract double getPaymentAmount();

public abstract double earnings(); /** No implementation here. DO YOU KNOW WHY? What should this method be?*/
} 


