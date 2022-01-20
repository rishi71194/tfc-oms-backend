package SCMProject.Prakat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shelflife")
public class ShelfLife {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column
	private int id;
	
	@Column(name = "slife")
	private double shelfLife;
	private double customerID;
	private double contractindex;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getShelfLife() {
		return shelfLife;
	}
	public void setShelfLife(double shelfLife) {
		this.shelfLife = shelfLife;
	}
	public double getCustomerID() {
		return customerID;
	}
	public void setCustomerID(double customerID) {
		this.customerID = customerID;
	}
	public double getContractindex() {
		return contractindex;
	}
	public void setContractindex(double contractindex) {
		this.contractindex = contractindex;
	}
	@Override
	public String toString() {
		return "ShelfLife [id=" + id + ", shelfLife=" + shelfLife + ", customerID=" + customerID + ", contractindex="
				+ contractindex + "]";
	}
	
	

}
