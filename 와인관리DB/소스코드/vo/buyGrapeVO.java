package mc.sn.wine.vo;

import org.springframework.stereotype.Component;

@Component("buyGrapeVO")
public class buyGrapeVO {
	private int inv_white;
	private int inv_red;
	private String winery_ID;
	public buyGrapeVO() {

	}
	public int getInv_white() {
		return inv_white;
	}
	public void setInv_white(int inv_white) {
		this.inv_white = inv_white;
	}
	public int getInv_red() {
		return inv_red;
	}
	public void setInv_red(int inv_red) {
		this.inv_red = inv_red;
	}
	public String getWinery_ID() {
		return winery_ID;
	}
	public void setWinery_ID(String winery_ID) {
		this.winery_ID = winery_ID;
	}
	@Override
	public String toString() {
		return "buyGrapeVO [inv_white=" + inv_white + ", inv_red=" + inv_red + ", winery_ID=" + winery_ID + "]";
	}

}
