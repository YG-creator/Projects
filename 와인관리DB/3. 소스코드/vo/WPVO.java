package mc.sn.wine.vo;

public class WPVO {
	private String WP_ID;
	private String category_ID;
	private String year;
	private int amount;
	private String winery_ID;
	
	public WPVO() {

	}

	public String getWP_ID() {
		return WP_ID;
	}

	public void setWP_ID(String wP_ID) {
		WP_ID = wP_ID;
	}

	public String getCategory_ID() {
		return category_ID;
	}

	public void setCategory_ID(String category_ID) {
		this.category_ID = category_ID;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getWinery_ID() {
		return winery_ID;
	}

	public void setWinery_ID(String winery_ID) {
		this.winery_ID = winery_ID;
	}

	@Override
	public String toString() {
		return "WPVO [WP_ID=" + WP_ID + ", category_ID=" + category_ID + ", year=" + year + ", amount=" + amount
				+ ", winery_ID=" + winery_ID + "]";
	}

}
