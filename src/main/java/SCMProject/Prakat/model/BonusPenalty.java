package SCMProject.Prakat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bonuspenalty")
public class BonusPenalty {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private int bp;
	
	@Column(name="customer_id")
	private String cusotmerID;
	
	@Column(name="contractindex")
	private String contractindex;

	public int getBp() {
		return bp;
	}

	public void setBp(int bp) {
		this.bp = bp;
	}

	public String getCusotmerID() {
		return cusotmerID;
	}

	public void setCusotmerID(String cusotmerID) {
		this.cusotmerID = cusotmerID;
	}

	public String getContractindex() {
		return contractindex;
	}

	public void setContractindex(String contractindex) {
		this.contractindex = contractindex;
	}

	@Override
	public String toString() {
		return "BonusPenalty [bp=" + bp + ", cusotmerID=" + cusotmerID + ", contractindex=" + contractindex + "]";
	}
	
	
	
}
