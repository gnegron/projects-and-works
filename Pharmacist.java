
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

public class Pharmacist {

	private String name, ssn, certification, dates;

	public Pharmacist(String n, String ssn, String c, String d) {
		name = n;
		this.ssn = ssn;
		certification = c;
		dates = d;
	}
//--------------------------------------------------------------------------
	public String getName() {
		return name;
	}
//--------------------------------------------------------------------------

	public void setName(String name) {
		this.name = name;
	}
//--------------------------------------------------------------------------

	public String getSsn() {
		return ssn;
	}
//--------------------------------------------------------------------------

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
//--------------------------------------------------------------------------

	public String getCertification() {
		return certification;
	}
//--------------------------------------------------------------------------

	public void setCertification(String certification) {
		this.certification = certification;
	}
//--------------------------------------------------------------------------
	public String getDates() {
		return dates;
	}
//--------------------------------------------------------------------------
	public void setDates(String dates) {
		this.dates = dates;
	}

}
