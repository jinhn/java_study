package lms;

import java.io.Serializable;

public class Professor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int proNo; // 교수번호
	private String proName; // 교수이름
	private String proId; // 교수아이디
	private String proPwd; // 교수비번
	private String proDept; // 교수학과
	private String position; // 교수직위
	
	public Professor() {}

	public Professor(int proNo, String proName, String proId, String proPwd, String proDept, String position) {
		super();
		this.proNo = proNo;
		this.proName = proName;
		this.proId = proId;
		this.proPwd = proPwd;
		this.proDept = proDept;
		this.position = position;
	}

	public int getProNo() {
		return proNo;
	}

	public void setProNo(int proNo) {
		this.proNo = proNo;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getProPwd() {
		return proPwd;
	}

	public void setProPwd(String proPwd) {
		this.proPwd = proPwd;
	}

	public String getProDept() {
		return proDept;
	}

	public void setProDept(String proDept) {
		this.proDept = proDept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}	
}