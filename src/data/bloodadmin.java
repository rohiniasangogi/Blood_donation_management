package data;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;


import model.bloodModel;
import utility.MainsqlConnnection;

public class bloodadmin<bloodModel1> extends GetConnection {
	bloodModel dbcon = null;
	@Override
	public 	bloodModel getDbConnection() throws ClassNotFoundException {
		bloodModel dbcon = MainsqlConnnection.getConnection();
		return dbcon;
	}
	public void storeDonorRecordsInDb(ArrayList<bloodModel> donorList) throws ClassNotFoundException {
		dbcon = getDbConnection();
		String sql = "insert into Donor(id,name,surname,bloodgroup,phoneno,amt) values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = dbcon.prepareStatement(sql);
			for(bloodModel bm:donorList) {
				ps.setInt(1, bm.getdonorId());
				ps.setString(2, bm.getdonorName());
				ps.setString(3, bm.getdonorSurname());
				ps.setString(4, bm.getdonorbloodGroup());
				ps.setInt(5,bm.donorPhoneno());
				ps.setDouble(6, bm.donorAmt());
				int result = ps.executeUpdate();
				if(result  == 1) {
					System.out.println("Donor record added sussesfully");
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	public void viewDonorTableRecords() throws ClassNotFoundException {
		dbcon = getDbConnection();
		String sql = "Select *from Donor";
		try {
			Statement stmt = dbcon.createStatement();
			ResultSet rs = ((java.sql.Statement) stmt).executeQuery(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void updateDonorRecords(int option, int donorId, String newDonorName) throws ClassNotFoundException {
		dbcon = getDbConnection();
		String sql = null;
		if(option == 1) {
			sql = "update donor set donorname = ? where id = ?";
		}
		else if(option == 2) {
			sql = "update donor set donorsurname = ? where id = ?";
		}
		
		try {
			PreparedStatement ps = dbcon.prepareStatement(sql);
			ps.setString(1, newDonorName);
			ps.setInt(2, donorId);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void updateDonorRecords(int donorId, String newDonorBloodGroup) throws ClassNotFoundException {
		dbcon = getDbConnection();
		String sql = "update donor set exprerience = ? where id = ?";
		
		try {
			PreparedStatement ps = dbcon.prepareStatement(sql);
			ps.setString(1, newDonorBloodGroup);
			ps.setInt(2, donorId);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateDonorRecords(int donorId, double newDonorAmt) throws ClassNotFoundException {
		dbcon = getDbConnection();
		String sql = "update donor set exprerience = ? where id = ?";
		
		try {
			PreparedStatement ps = dbcon.prepareStatement(sql);
			ps.setDouble(1, newDonorAmt);
			ps.setInt(2, donorId);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void updateDonorRecords(int updateOption, int donorId, int newPhoneno)  throws ClassNotFoundException {
		dbcon = getDbConnection();
		String sql = "update donor set exprerience = ? where id = ?";
		
		try {
			PreparedStatement ps = dbcon.prepareStatement(sql);
			ps.setInt(1, newPhoneno);
			ps.setInt(2, donorId);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
		
	}
	


