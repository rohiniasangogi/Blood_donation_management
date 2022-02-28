package model;

import java.sql.PreparedStatement;
import java.sql.Statement;

import com.mysql.cj.xdevapi.AddStatement;

public class bloodModel {
	private int donorId;
	private String donorName;
	private String donorSurname;
	private String donorbloodGroup;
	private int donorPhoneno;
	private double donorAmt;
	public bloodModel (int donorId, String donorName, String donorSurname, String donorbloodGroup, int donorPhoneno, double donorAmt) {
		super();
		this.donorId = donorId;
		this.donorName = donorName;
		this.donorSurname = donorSurname;
		this.donorbloodGroup = donorbloodGroup;
		this.donorPhoneno = donorPhoneno;
		this.donorAmt = donorAmt;
	}
	public bloodModel() {
		super();
	}
	public int getdonorId() {
		return donorId;
	}
	public void setdonorId(int donorId) {
		this.donorId = donorId;
	}
	public String getdonorName() {
		return donorName;
	}
	public void setdonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getdonorSurname() {
		return donorSurname;
	}
	public void setdonorSurname(String donorSurname) {
		this.donorSurname = donorSurname;
	}
	public String getdonorbloodGroup() {
		return donorbloodGroup;
	}
	public void setdonorbloodGroup(String donorbloodGroup) {
		this.donorbloodGroup = donorbloodGroup;
	}
	public int donorPhoneno() {
		return donorPhoneno;
	}
	public void setdonorPhoneno( int donorPhoneno) {
		this.donorPhoneno = donorPhoneno;
	}
	public double donorAmt() {
		return donorAmt;
	}
	public void setdonorAmt(double donorAmt) {
		this.donorAmt = donorAmt;
	}
	public PreparedStatement prepareStatement(String sql) {
		// TODO Auto-generated method stub
		return null;
	}
	public Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
