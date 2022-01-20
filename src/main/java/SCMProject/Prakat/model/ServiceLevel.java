package SCMProject.Prakat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicelevel")
public class ServiceLevel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int service;
	private int customerID;
	private double contractindex;

	
	

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getService() {
		return service;
	}




	public void setService(int service) {
		this.service = service;
	}




	public int getCustomerID() {
		return customerID;
	}




	public void setCustomerID(int customerID) {
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
		return "ServiceLevel [id=" + id + ", service=" + service + ", customerID=" + customerID + ", contractindex="
				+ contractindex + "]";
	}
	
	
}
