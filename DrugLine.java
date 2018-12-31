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


public class DrugLine {
	
	private String drugName, dosage;
	private int numOfRefillsLeft, maxRefills;

	public DrugLine(String dn, String d, int nrl, int nor) {
		drugName = dn;
		dosage = d;
		numOfRefillsLeft = nrl;
		maxRefills = nor;
	}
// -----------------------------------------------------------------

	public String getDrugName() {
		return drugName;
	}
// -----------------------------------------------------------------

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
// -----------------------------------------------------------------

	public String getDosage() {
		return dosage;
	}
// -----------------------------------------------------------------

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
// -----------------------------------------------------------------

	public int getNumOfRefillsLeft() {
		return numOfRefillsLeft;
	}
// -----------------------------------------------------------------

	public void setNumOfRefillsLeft(int numOfRefillsLeft) {
		this.numOfRefillsLeft = numOfRefillsLeft;
	}
// -----------------------------------------------------------------

	public int getMaxRefills() {
		return maxRefills;
	}
// -----------------------------------------------------------------

	public void setMaxRefills(int maxRefills) {
		this.maxRefills = maxRefills;
	}
// -----------------------------------------------------------------
	public String toString() {
		return drugName + " " + dosage + " " + numOfRefillsLeft + " " + maxRefills;
	}

}