package yxm.pojo;

import yxm.interfaces.Ink;
import yxm.interfaces.Paper;

public class Printer {
	
	//Ʒ��
	private String  Brand;
	
	//ī��
	Ink ink;
	
	//ֽ��
	Paper paper;
	
	
	
	public String getBrand() {
		return Brand;
	}



	public void setBrand(String brand) {
		Brand = brand;
	}



	public Ink getInk() {
		return ink;
	}



	public void setInk(Ink ink) {
		this.ink = ink;
	}



	public Paper getPaper() {
		return paper;
	}



	public void setPaper(Paper paper) {
		this.paper = paper;
	}



	public String Printerinfo() {
		return this.Brand+"Ʒ�� ����ʹ��"+this.ink.getColor()+"��ӡ������"+this.paper.getPaper()+"!";
	}

}
