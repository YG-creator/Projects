package mc.sn.wine.vo;

import org.springframework.stereotype.Component;

@Component("grapeProductionVO")
public class grapeProductionVO {
	private String GP_ID;
	private String year;
	private int amount;
	private String field_ID;
	
	public grapeProductionVO() {
		
	}

	public String getGP_ID() {
		return GP_ID;
	}

	public void setGP_ID(String gP_ID) {
		GP_ID = gP_ID;
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

	public String getField_ID() {
		return field_ID;
	}

	public void setField_ID(String field_ID) {
		this.field_ID = field_ID;
	}
}
