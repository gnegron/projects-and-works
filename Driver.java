/** Author Ryan Spencer, Giselle Negron, Raul Gomez
 * Class: MW; 6:30pm -8pm 270
 * Professor: Dr. Elva
 * 
 * Total hours:  24
 * 
 * 
 * "On my honor, I have not gotten, nor received, nor witnessed any unauthorized assistance on this work"
 * 
 * To simulate a Pharmacy’s interactions between their pharmaceutical transactions and their patients. 
 * These transactions will include patient prescription information and will also update new patient information.  **/


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Driver {
	ArrayList<Doctors> doc = new ArrayList<Doctors>();
	ArrayList<Patient> pat = new ArrayList<Patient>();
	ArrayList<Drugs> drugs = new ArrayList<Drugs>();
	ArrayList<Prescription> scripts = new ArrayList<Prescription>();
	ArrayList<DrugLine> dl = new ArrayList<DrugLine>();

	// Method stores doctor information from file into ArrayList
	public void readDoctors() {
		BufferedReader br;
		String s;
		try {
			br = new BufferedReader(new FileReader("doctors.txt"));

			while ((s = br.readLine()) != null) {
				String[] fields = s.split(", ");

				String name = fields[0];
				String address = fields[1];
				String phoneNum = fields[2];
				String specialty = fields[3];
				String watchlistDrug = fields[4];
				int watchlistNum = Integer.parseInt(fields[5]);
				Doctors doctor = new Doctors(name, address, phoneNum, specialty, watchlistDrug, watchlistNum);
				doc.add(doctor);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
// -------------------------------------------------------------------------------------------------------------

	// Method stores patient information from file into ArrayList
	public void readPatient() {
		BufferedReader br;
		String s;
		try {
			br = new BufferedReader(new FileReader("patients.txt"));

			while ((s = br.readLine()) != null) {
				String[] fields = s.split(", ");

				String ssn = fields[0];
				String name = fields[1];
				String address = fields[2];
				String phoneNum = fields[3];
				String insurance = fields[4];
				String currentMeds = fields[5];
				Patient patient = new Patient(ssn, name, address, phoneNum, insurance, currentMeds);
				pat.add(patient);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
// ----------------------------------------------------------------------------------------------------------

	// Method stores drug information from file into ArrayList
	public void readDrugs() {
		BufferedReader br;
		String s;
		try {
			br = new BufferedReader(new FileReader("drugs.txt"));

			while ((s = br.readLine()) != null) {
				String[] fields = s.split(", ");

				String name = fields[0];
				String chemName = fields[1];
				String ingredients = fields[2];
				String manufComp = fields[3]; // manufacturing company
				String type = fields[4];
				String conditions = fields[5];
				String contra = fields[6]; // contraindications
				Drugs drug = new Drugs(name, chemName, ingredients, manufComp, type, conditions, contra);
				drugs.add(drug);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
// ------------------------------------------------------------------------------------------------------------

	// Method stores prescription information from into ArrayList
	public void readPrescription() {
		BufferedReader br;
		String s;
		try {
			br = new BufferedReader(new FileReader("prescriptions.txt"));

			while ((s = br.readLine()) != null) {
				//stores first half of information on the line into Prescription ArrayList
				String[] fields = s.split(", ");
				
				String iD = fields[0];
				String dateIssued = fields[1];
				String doctor = fields[2];
				Prescription prescription = new Prescription(iD, dateIssued, doctor, new ArrayList<DrugLine>());
				scripts.add(prescription);

				//stores second half of information on the line into DrugLine ArrayList
				String[] f2 = fields[3].split("/"); //splits multiple DrugLines
				String[] f3;
				for (int i = 0; i < f2.length; i++) {
					f3 = f2[i].split(" "); //splits elements of DrugLine
					prescription.getDrugLines()
							.add(new DrugLine(f3[0], f3[1], Integer.parseInt(f3[2]), Integer.parseInt(f3[3])));
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
// --------------------------------------------------------------------------------------------------------------
	
	//returns index of Doctor object in Doctor ArrayList that matches the name
	public int findDoctors(String name) {
		int i;
		for (i = 0; i < doc.size(); i++) {
			if (name.equals(doc.get(i).getName())) {
				return i;
			}
		}
		return -1;
	}

// --------------------------------------------------------------------------------------------------------------
	
	//returns index of Doctor object in Doctor ArrayList that matches the drugName
	public int findDrugInDoctors(String drugName) {
		int i;
		for (i = 0; i < doc.size(); i++) {
			if (drugName.equals(doc.get(i).getWatchlistDrug())) {
				return i;
			}
		}
		return -1;
	}

// ---------------------------------------------------------------------------------------------------------------
	
	//returns index of Drug object in Drug ArrayList that matches the drugName
	public int findContraindications(String drugName) {
		int i;
		for (i = 0; i < drugs.size(); i++) {
			if (drugName.equals(drugs.get(i).getName())) {
				return i;
			}
		}
		return -1;
	}

// ---------------------------------------------------------------------------------------------------------------
	
	//returns index of Prescription object in Prescription ArrayList that matches the prescription ID
	public int findIDInScripts(String id) {
		int i;
		for (i = 0; i < scripts.size(); i++) {
			if (id.equals(scripts.get(i).getPrescriptionID())) {
				return i;
			}
		}
		return -1;
	}

// ----------------------------------------------------------------------------------------------------------------
	
	//returns index of DrugLine object in DrugLine ArrayList that matches the drugName
	public int findDrugInDrugLine(String drugName) {
		int i;
		for (i = 0; i < dl.size(); i++) {
			if (drugName.equals(dl.get(i).getDrugName())) {
				return i;
			}
		}
		return -1;
	}
//----------------------------------------------------------------------------------------------------------------
	
	//returns index of DrugLine object in DrugLine ArrayList that matches both the drugName and scriptID
	public int findDrugLine(String drugName, int scriptID) {
		ArrayList<DrugLine> adl = scripts.get(scriptID).getDrugLines();
		int i;
		for (i = 0; i < adl.size(); i++) {
			if (drugName.equals(adl.get(i).getDrugName())) {
				return i;
			}
		}
		return -1;
	}
// ----------------------------------------------------------------------------------------------------------------
	
	//returns index of Patient object in Patient ArrayList that matches patient name
	public int findNameInPatient(String patName) {
		int i;
		for (i = 0; i < pat.size(); i++) {
			if (patName.equals(pat.get(i).getName())) {
				return i;
			}
		}
		return -1;
	}
//-----------------------------------------------------------------------------------------------------------------
	
	//returns index of Drug object in Drug ArrayList that matches the drugName
	public int findDrugInDrugs(String drugName) {
		int i;
		for (i = 0; i < drugs.size(); i++) {
			if (drugName.equals(drugs.get(i).getName())) {
				return i;
			}
		}
		return -1;
	}
//----------------------------------------------------------------------------------------------------------------

	public void readTrans() {
		BufferedReader br;
		String s;
		try {
			br = new BufferedReader(new FileReader("transactions.txt"));

			while ((s = br.readLine()) != null) {
				String[] fields = s.split(", ");

				String transactionType = fields[0];

				switch (transactionType) {
				case "Fill":
					String scriptID = fields[1];
					String name = fields[2];
					String date = fields[3];
					String doctorName = fields[4];
					String drugName = fields[5];
					String dosage = fields[6];
					int refillsLeft = Integer.parseInt(fields[7]);
					int numRefills = Integer.parseInt(fields[8]);
					
					int patID = findNameInPatient(name);
					int prescriptID = findIDInScripts(scriptID);
					Prescription p;
					if(prescriptID == -1) {
						ArrayList<DrugLine> adl = new ArrayList<DrugLine>();
						adl.add(new DrugLine(drugName, dosage, refillsLeft, numRefills)); //adds information into DrugLine ArrayList to be used for Prescription constructor
						p = new Prescription(scriptID, date, doctorName, adl);
						scripts.add(p); //adds new Prescription to ArrayList
						prescriptID = scripts.size() - 1;
					} else {
						p = scripts.get(prescriptID);
					  }
					
					//prints error message if number of refills left equals zero
					int drugLineID = findDrugLine(drugName, prescriptID);
					DrugLine dl = p.getDrugLines().get(drugLineID);
					if( 0 == dl.getNumOfRefillsLeft()) {
						
						System.out.println("");
						System.out.println("*****************************************************");
						System.out.println("* Error: Cannot fill prescription. No refills left. *");
						System.out.println("*****************************************************");
						System.out.println("");
						break;
					}
					
					//prints error message if patient is on current medication that negatively interacts with the prescription they are attempting to fill
					String currentMed = pat.get(patID).getCurrentMed();
					int drugId = findDrugInDrugs(drugName);
					if(drugId != -1) {
						String contraMed = drugs.get(drugId).getContraindications();
							if(contraMed.equals(currentMed)) {
								System.out.println("");
								System.out.println("************************************************************");
								System.out.println("* Error: Cannot fill due to current medication interaction *");
								System.out.println("************************************************************");
								System.out.println("");
								break;
							}
					}
					
					dl.setNumOfRefillsLeft(dl.getNumOfRefillsLeft() - 1); //decrements number of refills left if prescription was filled successfully
					break;
				
				//processes transaction to determine if named doctor prescribed named drug over a stipulated number of times
				case "Find Doctors":
					String watchlistDrug = fields[1];
					int watchlistNum = Integer.parseInt(fields[2]);
					int a = findDrugInDoctors(watchlistDrug);
					int docNum = doc.get(a).getWatchlistNum();
					String docName = doc.get(a).getName();
					if (docNum > watchlistNum) {
						System.out.println(docName + " exceeded " + watchlistNum + " prescriptions for " + watchlistDrug);
						
					} else {
						System.out.println(docName + " did not exceed " + watchlistNum + " prescriptions for " + watchlistDrug);
					}
					break;
					
				//processes transaction to print contraindicaitions
				case "Find Contraindications":
					String drug = fields[1];
					int j = findContraindications(drug);
					printContraindications(drugs.get(j));
					break;

				//processes transaction to print doctor contact information
				case "Contact Doctor":
					String doctor = fields[1];
					int i = findDoctors(doctor);
					printContactInfo(doc.get(i));
					break;

				}
			}
			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//--------------------------------------------------------------------------
	
	// method writes to prescriptions file with updated ArrayList information
	public void updateScripts() {
		File file = new File("updatedPrescriptions.txt");
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(file));
			for (int i = 0; i < scripts.size(); i++) {

				bw.write(scripts.get(i).toString());

				bw.newLine();
			}
			bw.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

// -------------------------------------------------------------------------
	public void printContactInfo(Doctors d) {
		String name = d.getName();
		String address = d.getAddress();
		String specialty = d.getSpecialty();
		String phone = d.getPhoneNum();
		System.out.println("CONTACT INFORMATION");
		System.out.println("Name: " + name + " | Address: " + address + " | Phone Number: " + phone + " | Specialty: "
				+ specialty);
	}

// --------------------------------------------------------------------------
	public void printContraindications(Drugs drug) {
		String drugName = drug.getName();
		String contraindications = drug.getContraindications();
		System.out.println("CONTRAINDICATIONS FOR: " + drugName);
		System.out.println(contraindications);
	}

// ---------------------------------------------------------------------------
	public static void main(String[] args) throws IOException {
		Driver driver = new Driver();
		driver.readDoctors();
		driver.readDrugs();
		driver.readPatient();
		driver.readPrescription();
		driver.readTrans();
		driver.updateScripts();
	}

}