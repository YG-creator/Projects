package mc.sn.wine.vo;

import org.springframework.stereotype.Component;

@Component("wineCategoryVO")
public class wineCategoryVO {
	private String category_ID;
	private String title;
	private int standardPrice;
	
	public wineCategoryVO() {
	}

	public wineCategoryVO(String category_ID, String title, int standardPrice) {
		this.category_ID = category_ID;
		this.title = title;
		this.standardPrice = standardPrice;
	}

	public String getCategory_ID() {
		return category_ID;
	}

	public void setCategory_ID(String category_ID) {
		this.category_ID = category_ID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getStandardPrice() {
		return standardPrice;
	}

	public void setStandardPrice(int standardPrice) {
		this.standardPrice = standardPrice;
	}
	
}
