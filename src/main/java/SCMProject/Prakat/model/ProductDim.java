package SCMProject.Prakat.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productdim")
public class ProductDim {
	
	@Id
	private int productID;
	private String productName;
	private String shelfLifeInWeeks;
	private String numberPerOuterBox;
	private String numberPerPalletLayer;
	private String numberPerPallet;
	private String litersPerPack;
	private String salesPriceRetail;
	private String amountOrange;
	private String amountMango;
	private String amountVitaminC;
	private String amountWater;
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getShelfLifeInWeeks() {
		return shelfLifeInWeeks;
	}
	public void setShelfLifeInWeeks(String shelfLifeInWeeks) {
		this.shelfLifeInWeeks = shelfLifeInWeeks;
	}
	public String getNumberPerOuterBox() {
		return numberPerOuterBox;
	}
	public void setNumberPerOuterBox(String numberPerOuterBox) {
		this.numberPerOuterBox = numberPerOuterBox;
	}
	public String getNumberPerPalletLayer() {
		return numberPerPalletLayer;
	}
	public void setNumberPerPalletLayer(String numberPerPalletLayer) {
		this.numberPerPalletLayer = numberPerPalletLayer;
	}
	public String getNumberPerPallet() {
		return numberPerPallet;
	}
	public void setNumberPerPallet(String numberPerPallet) {
		this.numberPerPallet = numberPerPallet;
	}
	public String getLitersPerPack() {
		return litersPerPack;
	}
	public void setLitersPerPack(String litersPerPack) {
		this.litersPerPack = litersPerPack;
	}
	public String getSalesPriceRetail() {
		return salesPriceRetail;
	}
	public void setSalesPriceRetail(String salesPriceRetail) {
		this.salesPriceRetail = salesPriceRetail;
	}
	public String getAmountOrange() {
		return amountOrange;
	}
	public void setAmountOrange(String amountOrange) {
		this.amountOrange = amountOrange;
	}
	public String getAmountMango() {
		return amountMango;
	}
	public void setAmountMango(String amountMango) {
		this.amountMango = amountMango;
	}
	public String getAmountVitaminC() {
		return amountVitaminC;
	}
	public void setAmountVitaminC(String amountVitaminC) {
		this.amountVitaminC = amountVitaminC;
	}
	public String getAmountWater() {
		return amountWater;
	}
	public void setAmountWater(String amountWater) {
		this.amountWater = amountWater;
	}
	@Override
	public String toString() {
		return "ProductDim [productID=" + productID + ", productName=" + productName + ", shelfLifeInWeeks="
				+ shelfLifeInWeeks + ", numberPerOuterBox=" + numberPerOuterBox + ", numberPerPalletLayer="
				+ numberPerPalletLayer + ", numberPerPallet=" + numberPerPallet + ", litersPerPack=" + litersPerPack
				+ ", salesPriceRetail=" + salesPriceRetail + ", amountOrange=" + amountOrange + ", amountMango="
				+ amountMango + ", amountVitaminC=" + amountVitaminC + ", amountWater=" + amountWater + "]";
	}
	
	

}
