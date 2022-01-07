package mc.sn.wine.vo;

import org.springframework.stereotype.Component;

@Component("wineryVO")
public class wineryVO {
	private String winery_ID;
	private String owner;
	private String address;
	private String tel_number;
	private int inv_white;
	private int inv_red;
	private int money;
	private String grade_ID;
	private String vineyard_ID;
	
	public wineryVO() {
	}

	public wineryVO(String winery_ID, String owner, String address, String tel_number, int inv_white, int inv_red,
			int money, String grade_ID, String vineyard_ID) {
		this.winery_ID = winery_ID;
		this.owner = owner;
		this.address = address;
		this.tel_number = tel_number;
		this.inv_white = inv_white;
		this.inv_red = inv_red;
		this.money = money;
		this.grade_ID = grade_ID;
		this.vineyard_ID = vineyard_ID;
	}

	public String getWinery_ID() {
		return winery_ID;
	}

	public void setWinery_ID(String winery_ID) {
		this.winery_ID = winery_ID;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel_number() {
		return tel_number;
	}

	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getGrade_ID() {
		return grade_ID;
	}

	public void setGrade_ID(String grade_ID) {
		this.grade_ID = grade_ID;
	}

	public String getVineyard_ID() {
		return vineyard_ID;
	}

	public void setVineyard_ID(String vineyard_ID) {
		this.vineyard_ID = vineyard_ID;
	}

	@Override
	public String toString() {
		return "wineryVO [winery_ID=" + winery_ID + ", owner=" + owner + ", address=" + address + ", tel_number="
				+ tel_number + ", inv_white=" + inv_white + ", inv_red=" + inv_red + ", money=" + money + ", grade_ID="
				+ grade_ID + ", vineyard_ID=" + vineyard_ID + "]";
	}
	
	
}
