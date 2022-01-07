package mc.sn.wine.vo;

import org.springframework.stereotype.Component;

@Component("productionSumVO")
public class productionSumVO {
	
	private String category_ID;
	private int amount;
	
	public productionSumVO() {
	}

	public String getCategory_ID() {
		return category_ID;
	}

	public void setCategory_ID(String category_ID) {
		this.category_ID = category_ID;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "productionSumVO [category_ID=" + category_ID + ", amount=" + amount + "]";
	}
}
