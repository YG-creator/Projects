package mc.sn.wine.vo;

import org.springframework.stereotype.Component;

@Component("wineGradeVO")
public class wineGradeVO {
	private String grade_ID;
	private String title;
	private float ratio;
	
	public wineGradeVO() {
	}

	public wineGradeVO(String grade_ID, String title, float ratio) {
		this.grade_ID = grade_ID;
		this.title = title;
		this.ratio = ratio;
	}

	public String getGrade_ID() {
		return grade_ID;
	}

	public void setGrade_ID(String grade_ID) {
		this.grade_ID = grade_ID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getRatio() {
		return ratio;
	}

	public void setRatio(float ratio) {
		this.ratio = ratio;
	}
	
}
