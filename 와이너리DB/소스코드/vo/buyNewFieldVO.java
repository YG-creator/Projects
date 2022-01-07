package mc.sn.wine.vo;

import org.springframework.stereotype.Component;

@Component("buyNewFieldVO")
public class buyNewFieldVO {
	private String vineyard_ID;
	private String field_ID;
	private int area;
	
	public buyNewFieldVO() {
	}

	public String getVineyard_ID() {
		return vineyard_ID;
	}

	public void setVineyard_ID(String vineyard_ID) {
		this.vineyard_ID = vineyard_ID;
	}

	public String getField_ID() {
		return field_ID;
	}

	public void setField_ID(String field_ID) {
		this.field_ID = field_ID;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "buyNewField [vineyard_ID=" + vineyard_ID + ", field_ID=" + field_ID + ", area=" + area + "]";
	}

}
