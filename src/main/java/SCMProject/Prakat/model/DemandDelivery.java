package SCMProject.Prakat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "demanddelivery")
public class DemandDelivery {
	@Id
	private int id;

	@Column(name = "product_id")
	private int productID;
	
	@Column(name = "customer_id")
	private int customerID;
	
	@Column(name = "date_id")
	private int dateID;
	
	@Column(name = "delivery")
	private int delivery;
	
	@Column(name = "demand")
	private int demand;

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

	public int getDateID() {
		return dateID;
	}

	public void setDateID(int dateID) {
		this.dateID = dateID;
	}

	public int getDelivery() {
		return delivery;
	}

	public void setDelivery(int delivery) {
		this.delivery = delivery;
	}

	public int getDemand() {
		return demand;
	}

	public void setDemand(int demand) {
		this.demand = demand;
	}

	@Override
	public String toString() {
		return "DemandDelivery [productID=" + productID + ", customerID=" + customerID + ", dateID=" + dateID
				+ ", delivery=" + delivery + ", demand=" + demand + "]";
	}
	
	
	

}
