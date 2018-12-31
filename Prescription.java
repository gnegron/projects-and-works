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


import java.util.ArrayList;

public class Prescription {

	private String prescribingDR, prescriptionID, dateIssued;
	private ArrayList<DrugLine> drugLines;

// --------------------------------------------------------
	public Prescription(String pid, String di, String pdr, ArrayList<DrugLine> dl) {
		prescriptionID = pid;
		dateIssued = di;
		prescribingDR = pdr;
		drugLines = dl;
	}

// --------------------------------------------------------
	public String getPrescriptionID() {
		return prescriptionID;
	}
// --------------------------------------------------------

	public void setPrescriptionID(String prescriptionID) {
		this.prescriptionID = prescriptionID;
	}
// --------------------------------------------------------

	public String getDateIssued() {
		return dateIssued;
	}
// --------------------------------------------------------

	public void setDateIssued(String dateIssued) {
		this.dateIssued = dateIssued;
	}
// --------------------------------------------------------

	public String getPrescribingDR() {
		return prescribingDR;
	}
// --------------------------------------------------------

	public void setPrescribingDR(String prescribingDR) {
		this.prescribingDR = prescribingDR;
	}
// --------------------------------------------------------

	public ArrayList<DrugLine> getDrugLines() {
		return drugLines;
	}
// --------------------------------------------------------

	public void setDrugLines(ArrayList<DrugLine> drugLines) {
		this.drugLines = drugLines;
	}
// --------------------------------------------------------
	public String toString() {
		String r = "";
		r += prescriptionID + ", " + getDateIssued() + ", " + prescribingDR + ", ";
		for(int i = 0; i < drugLines.size(); i++) {
			if(i != 0) {
				r += "/ ";
			}
			r += drugLines.get(i).toString();
		}
		return r;
	}

}

