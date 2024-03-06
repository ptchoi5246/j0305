package t6_exam;

public class Test1급여계산VO {
	
	int no;
	String name;
	int code;
	int overTime;
	int netPay;
	int sudang; //sudang = (overTime * 25000);
	int gongje; //gongje = (bonbong+sudang)*0.1;
	int bonbong;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getOverTime() {
		return overTime;
	}
	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}
	public int getNetPay() {
		return netPay;
	}
	public void setNetPay(int netPay) {
		this.netPay = netPay;
	}
	public int getSudang() {
		return sudang;
	}
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	public int getGongje() {
		return gongje;
	}
	public void setGongje(int gongje) {
		this.gongje = gongje;
	}
	public int getBonbong() {
		return bonbong;
	}
	public void setBonbong(int bonbong) {
		this.bonbong = bonbong;
	}
	
	
}
