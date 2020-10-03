package csce247.assignments.singelton;

import java.util.ArrayList;

/**
 * 
 * HospitalSystem is made to only have one instance, otherwise
 * known as a singleton. Uses a private constructor. Holds ArrayList
 * of Patients, and an instance of itself, the only instance to be accessed.
 * Used to hold, modify, and print the patients.
 * @author zacharystthomas
 *
 */
public class HospitalSystem {
	private ArrayList<Patient> patients;
	private static HospitalSystem hospitalSystem;
	/**
	 * Constructor.
	 * Private, only to be called by getInstance.
	 * Initalizes the patients ArrayList.
	 */
	private HospitalSystem() {
		patients = new ArrayList<Patient>();
	}
	/**
	 * Called by the driver, to create an instance of the class,
	 * if there is no other one, and if there is,
	 * return the previous one.
	 * @return Returns the instance of HospitalSystem.
	 */
	public static HospitalSystem getInstance() {
		if (hospitalSystem == null) {
			hospitalSystem = new HospitalSystem();

		}

		return hospitalSystem;		
	}
	
	/**
	 * Adds a patient to the patients ArrayList, using the 
	 * firstName and lastName parameters given from the driver.
	 * Adds the patient to the end of the list, and returns
	 * the size of the ArrayList minus one to indicate the position
	 * of the added patient.
	 * @param firstName: Given from Driver, represents the first name of the patient.
	 * @param lastName: Given from Driver, represents the last name of the patient.
	 * @return Returns the position of the patient in the patients ArrayList
	 */
	public int addPatient(String firstName, String lastName) {
		Patient patient = new Patient(patients.size(), firstName, lastName);
		patients.add(patient);
		return patients.size()-1;
	}
	/**
	 * Returns a patient at a given id.
	 * @param id: Given from the driver, used as the index to 
	 * select a patient from the ArrayList.
	 * @return Returns the patient at the id index.
	 */
	public Patient getRecord(int id) {
		
		return patients.get(id);
	}
	/**
	 * Adds an allergy to the patient at the given id.
	 * @param id: Given from the driver, used as the index to 
	 * select a patient from the ArrayList.
	 * @param allergy: Given from the driver, the String to be added as an allergy
	 * to the patient.
	 */
	public void addAllergy(int id, String allergy) {
		
		patients.get(id).addAllergy(allergy);
	}
	/**
	 * Used to return information on every patient, separating each patient's toString with a new line.
	 * @return Returns a String which contains every toString of the patients, seperated by a newline character.
	 */
	public String getAllPatientsData() {
		String patientsdata = "";
		for(Patient patient : patients) 
			patientsdata += patient.toString() + "\n";
		
		
		
		return patientsdata;
	}





}
