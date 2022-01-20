package SCMProject.Prakat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "production")
public class Production {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int dateID;
	private int productID;
	private int stockEOD;
	private int deliveryFromProduction;
	private int rejection;
	private int startupLoss;
	private int obsoletes;
	private int inBackorder;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDateID() {
		return dateID;
	}
	public void setDateID(int dateID) {
		this.dateID = dateID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getStockEOD() {
		return stockEOD;
	}
	public void setStockEOD(int stockEOD) {
		this.stockEOD = stockEOD;
	}
	public int getDeliveryFromProduction() {
		return deliveryFromProduction;
	}
	public void setDeliveryFromProduction(int deliveryFromProduction) {
		this.deliveryFromProduction = deliveryFromProduction;
	}
	public int getRejection() {
		return rejection;
	}
	public void setRejection(int rejection) {
		this.rejection = rejection;
	}
	public int getStartupLoss() {
		return startupLoss;
	}
	public void setStartupLoss(int startupLoss) {
		this.startupLoss = startupLoss;
	}
	public int getObsoletes() {
		return obsoletes;
	}
	public void setObsoletes(int obsoletes) {
		this.obsoletes = obsoletes;
	}
	public int getInBackorder() {
		return inBackorder;
	}
	public void setInBackorder(int inBackorder) {
		this.inBackorder = inBackorder;
	}
	@Override
	public String toString() {
		return "Production [id=" + id + ", dateID=" + dateID + ", productID=" + productID + ", stockEOD=" + stockEOD
				+ ", deliveryFromProduction=" + deliveryFromProduction + ", rejection=" + rejection + ", startupLoss="
				+ startupLoss + ", obsoletes=" + obsoletes + ", inBackorder=" + inBackorder + "]";
	}
	

}
