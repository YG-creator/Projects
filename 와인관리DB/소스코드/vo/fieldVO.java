package mc.sn.wine.vo;

import org.springframework.stereotype.Component;

@Component("fieldVO")
public class fieldVO {
	private String field_ID;
	private String location;
	private String area;
	private String variety;
	private String vineyard_ID;
		
	public fieldVO() {
	}
	
	public fieldVO(String field_ID, String location, String area, String variety) {
		this.field_ID = field_ID;
		this.location = location;
		this.area = area;
		this.variety = variety;
	}

	public String getField_ID() {
		return field_ID;
	}

	public void setField_ID(String field_ID) {
		this.field_ID = field_ID;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public String getVineyard_ID() {
		return vineyard_ID;
	}

	public void setVineyard_ID(String vineyard_ID) {
		this.vineyard_ID = vineyard_ID;
	}

	@Override
	public String toString() {
		return "[field_ID=" + field_ID + ", location=" + location + ", area=" + area + ", vineyard_ID="
				+ vineyard_ID + "]";
	}
}
