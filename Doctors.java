

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

public class Doctors {

	private String name, address, phoneNum, watchlistDrug, specialty;
	private int watchlistNum;

	public Doctors(String n, String a, String pn, String sp, String watchDrug, int watchNum) {
		name = n;
		address = a;
		phoneNum = pn;
		specialty = sp;
		watchlistDrug = watchDrug;
		watchlistNum = watchNum;
		setWatchlistNum(watchNum);
	}
//------------------------------------------------------------------------------------------------
	public String getName() {
		return name;
	}
//------------------------------------------------------------------------------------------------

	public void setName(String name) {
		this.name = name;
	}
//------------------------------------------------------------------------------------------------

	public String getAddress() {
		return address;
	}
//------------------------------------------------------------------------------------------------

	public void setAddress(String address) {
		this.address = address;
	}
//------------------------------------------------------------------------------------------------

	public String getPhoneNum() {
		return phoneNum;
	}
//------------------------------------------------------------------------------------------------

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
//------------------------------------------------------------------------------------------------

	public String getWatchlistDrug() {
		return watchlistDrug;
	}
//------------------------------------------------------------------------------------------------

	public void setWatchlistDrug(String watchlistDrug) {
		this.watchlistDrug = watchlistDrug;
	}
//------------------------------------------------------------------------------------------------

	public int getWatchlistNum() {
		return watchlistNum;
	}
//------------------------------------------------------------------------------------------------

	public void setWatchlistNum(int watchlistNum) {
		this.watchlistNum = watchlistNum;
	}
//------------------------------------------------------------------------------------------------

	public String getSpecialty() {
		return specialty;
	}
//------------------------------------------------------------------------------------------------
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

}
