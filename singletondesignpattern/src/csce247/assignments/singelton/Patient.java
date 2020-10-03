package csce247.assignments.singelton;

import java.util.ArrayList;
/**
 * Patient class, represents a patient in a hospital.
 * Each patient has an id, used to indicate their position in the patients ArrayList
 * of HospitalSystem, a first and last name String, and an ArrayList
 * of Strings representing a patient's allergies. 
 * @author zacharystthomas
 *
 */
public class Patient {

	
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<String> allergies;
	/**
	 * Constructor. Initializes each variable.
	 * @param id: Given from HospitalSystem, represents the position in the patients ArrayList.
	 * @param firstName: Given from HospitalSystem, represents the patients first name.
	 * @param lastName: Given from HospitalSystem, represents the patient's last name.
	 */
	public Patient(int id, String firstName, String lastName) {
		this.allergies = new ArrayList<String>();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	/**
	 * Simply adds a String to the allergies ArrayList.
	 * @param allergy: Given from HospitalSystem, represents an allergy of a patient.
	 */
	public void addAllergy(String allergy) {
		
		this.allergies.add(allergy);
	}
	/**
	 * Returns a String containing the position of the patient,
	 * their first and last name, and a specially printed list of their allergies.
	 * The allergies are separated by commas, except for the last one which does not 
	 * have a comma. A for loop is used to ensure there are commas for each allergy except
	 * the last one.
	 */
	public String toString() {
		String allergiesString = "";
		for(int i = 0; i < allergies.size(); i++) {
			if(i == allergies.size()-1){
				allergiesString += allergies.get(i);
			} else {
				allergiesString += allergies.get(i) + ", ";
			}
		}
			
		
		return "Patient "+ (id+1) +": "+firstName+" "+lastName+"\n Allergies: "+allergiesString;
	}
	
}
