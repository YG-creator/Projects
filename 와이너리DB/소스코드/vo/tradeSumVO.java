package mc.sn.wine.vo;

import org.springframework.stereotype.Component;

@Component("tradeSumVO")
public class tradeSumVO {
	private String category_ID;
	private int amount;
	
	public tradeSumVO() {
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
		return "tradeSumVO [category_ID=" + category_ID + ", amount=" + amount + "]";
	}
	
}
