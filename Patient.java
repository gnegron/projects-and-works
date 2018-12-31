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


public class Patient {

	private String ssn, name, address, phoneNum, insuranceProvider, currentMed;

	public Patient(String ssn, String n, String a, String pn, String ip, String med) {

		this.ssn = ssn;
		phoneNum = pn;
		name = n;
		address = a;
		insuranceProvider = ip;
		currentMed = med;
	}
// ----------------------------------------------------------------------------

	public String getCurrentMed() {
		return currentMed;
	}
// ----------------------------------------------------------------------------

	public void setCurrentMed(String currentMed) {
		this.currentMed = currentMed;
	}
// ----------------------------------------------------------------------------

	public String getSsn() {
		return ssn;
	}
// ----------------------------------------------------------------------------

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
// ----------------------------------------------------------------------------

	public String getPhoneNum() {
		return phoneNum;
	}
// ----------------------------------------------------------------------------

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
// ----------------------------------------------------------------------------

	public String getName() {
		return name;
	}
// ----------------------------------------------------------------------------

	public void setName(String name) {
		this.name = name;
	}
// ----------------------------------------------------------------------------

	public String getAddress() {
		return address;
	}
// ----------------------------------------------------------------------------

	public void setAddress(String address) {
		this.address = address;
	}
// ----------------------------------------------------------------------------

	public String getInsuranceProvider() {
		return insuranceProvider;
	}
// ----------------------------------------------------------------------------

	public void setInsuranceProvider(String insuranceProvider) {
		this.insuranceProvider = insuranceProvider;
	}
// ----------------------------------------------------------------------------

}
