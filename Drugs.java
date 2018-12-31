
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


public class Drugs {

	private String name;
	private String chemicalName;
	private String ingredients;
	private String manufacturingCompany;
	private String type;
	private String listOfConditions;
	private String contraindications;

// ----------------------------------------------------------------------------
	public Drugs(String n, String cn, String i, String mc, String t, String loc, String contr) {
		name = n;
		chemicalName = cn;
		ingredients = i;
		manufacturingCompany = mc;
		type = t;
		listOfConditions = loc;
		contraindications = contr;
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
	public String getChemicalName() {
		return chemicalName;
	}

// ----------------------------------------------------------------------------
	public void setChemicalName(String chemicalName) {
		this.chemicalName = chemicalName;
	}

// ----------------------------------------------------------------------------
	public String getIngredients() {
		return ingredients;
	}

// ----------------------------------------------------------------------------
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

// ----------------------------------------------------------------------------
	public String getManufacturingCompany() {
		return manufacturingCompany;
	}

// ----------------------------------------------------------------------------
	public void setManufacturingCompany(String manufacturingCompany) {
		this.manufacturingCompany = manufacturingCompany;
	}

// ----------------------------------------------------------------------------
	public String getType() {
		return type;
	}

// ----------------------------------------------------------------------------
	public void setType(String type) {
		this.type = type;
	}

// ----------------------------------------------------------------------------
	public String getListOfConditions() {
		return listOfConditions;
	}

// ----------------------------------------------------------------------------
	public void setListOfConditions(String listOfConditions) {
		this.listOfConditions = listOfConditions;
	}
	
//-----------------------------------------------------------------------------
	public String getContraindications() {
		return contraindications;
	}

//-----------------------------------------------------------------------------
	public void setContraindications(String contraindications) {
		this.contraindications = contraindications;
	}

}