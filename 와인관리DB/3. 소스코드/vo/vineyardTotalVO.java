package mc.sn.wine.vo;

import org.springframework.stereotype.Component;

@Component("vineyardTotalVO")
public class vineyardTotalVO {
	private int totalArea;
	private int totalGP;
	private int totalGT;
	
	public vineyardTotalVO() {

	}

	public int getTotalArea() {
		return totalArea;
	}



	public void setTotalArea(int totalArea) {
		this.totalArea = totalArea;
	}



	public int getTotalGP() {
		return totalGP;
	}



	public void setTotalGP(int totalGP) {
		this.totalGP = totalGP;
	}



	public int getTotalGT() {
		return totalGT;
	}



	public void setTotalGT(int totalGT) {
		this.totalGT = totalGT;
	}



	@Override
	public String toString() {
		return "vineyardTotal [totalArea=" + totalArea + ", totalGP=" + totalGP + ", totalGT=" + totalGT + "]";
	}
}
