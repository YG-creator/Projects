package mc.sn.wine.vo;

import org.springframework.stereotype.Component;

@Component("vineyardVO")
public class vineyardVO {
	private String vineyard_ID;
	private String owner;
	private String address;
	private String tel_number;
	private int inv_white;
	private int inv_red;
	private int money;
	
	public vineyardVO() {
	}

	public String getVineyard_ID() {
		return vineyard_ID;
	}

	public void setVineyard_ID(String vineyard_ID) {
		this.vineyard_ID = vineyard_ID;
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

	public void setTel_nuber(String tel_number) {
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

	@Override
	public String toString() {
		return "vineyardVO [vineyard_ID=" + vineyard_ID + ", owner=" + owner + ", address=" + address + ", tel_number="
				+ tel_number + ", inv_white=" + inv_white + ", inv_red=" + inv_red + ", money=" + money + "]";
	}
}
