package SCMProject.Prakat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "demanddelivery")
public class DemandDelivery {
	
	@Id
	@Column(name = "product_id")
	private int productID;
	
	@Column(name = "customer_id")
	private int customerID;
	
	@Column(name = "date_id")
	private String dateID;
	
	@Column(name = "delivery")
	private String delivery;
	
	@Column(name = "demand")
	private String demand;

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getDateID() {
		return dateID;
	}

	public void setDateID(String dateID) {
		this.dateID = dateID;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getDemand() {
		return demand;
	}

	public void setDemand(String demand) {
		this.demand = demand;
	}

	@Override
	public String toString() {
		return "DemandDelivery [productID=" + productID + ", customerID=" + customerID + ", dateID=" + dateID
				+ ", delivery=" + delivery + ", demand=" + demand + "]";
	}
	
	
	

}
