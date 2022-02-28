package controller;

import java.util.Scanner;

import data.bloodadmin;
import model.bloodModel;
import service.bloodmodelDetails;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException { //throws ClasssNotFoundException {
		bloodmodelDetails bmd = new bloodmodelDetails();
		Scanner sc = new Scanner(System.in);
		bloodadmin ba = new bloodadmin();
		System.out.println("Blood admin or Donor or Patient:");
		boolean temp = true;
		while(temp) {
			System.out.println("--> Blood admin \n -->Donor\n -->Home");
			int option = Integer.parseInt(sc.nextLine());
			switch(option) {
			case 1: {
				System.out.println("Blood Admin name please");
				String bloodAdmin = sc.nextLine();
				System.out.println("Blood Admin password please");
				String bloodadminPassword = sc.nextLine();
				if(bloodAdmin.equals("Rohini111")  && bloodadminPassword.equals("Rohini$111")) {
					boolean temp1  = true;
					while(temp1 ) {
						System.out.println("bloodgroups are avaliable:");
						System.out.println("A+\n B+ \n AB+\n O+ \n O- \n A- \n B- \n AB-");
						System.out.println("select any operation of ur choice:");
						System.out.println("1.Add New Donor\n2.View Donor\n3.Update Existing Donor\n4.Delete Donor Details\n5.Exit selected choice");
						boolean flag1 = true;
						int bloodadminoption = 0;
						while(flag1) {
							try {
								bloodadminoption = Integer.parseInt(sc.nextLine());
								flag1 = false;
							} catch(Exception e) {
								System.out.println("Input given type is wrong, mention in number type");
								flag1 = true;
							}
						}
						switch(bloodadminoption) {
							case 1:{
								System.out.println("How many blood donor details need to ADD");
								int donorCount = Integer.parseInt(sc.nextLine());
								int donorId;
								String donorName;
								String donorSurname;
								String donorbloodGroup;
								int donorPhoneno;
								double donorAmt;
								for(int i=0; i<donorCount; i++) {
									donorId = Integer.parseInt(sc.nextLine());
									donorName = sc.nextLine();
									donorSurname = sc.nextLine();
									donorbloodGroup = sc.nextLine();
									donorPhoneno = Integer.parseInt(sc.nextLine());
									donorAmt = Integer.parseInt(sc.nextLine());
									bloodModel bm = new bloodModel(donorId,donorName,donorSurname,donorbloodGroup,donorPhoneno,donorAmt);
									bmd.addDonorToList(bm);
									
								}
								break;
							}
							case 2:{
								ba.viewDonorTableRecords();
								break;
							}
							case 3:{
								System.out.println("Enter the donorId");
								int donorId = Integer.parseInt(sc.nextLine());
								System.out.println("Select one of the options to get updated.\n1.DonorId\n2.DonorName\n3.DonorSurname\n4.DOnorBloodGroup\n5.DonorPhoneno\n6.DonorAmt");
								int updateOption = Integer.parseInt(sc.nextLine());
								switch (updateOption) {
								case 1:{
									System.out.println("Enter the Donor Name and the Id as "+donorId);
									String newDonorName = sc.nextLine();
									ba.updateDonorRecords(updateOption,donorId,newDonorName);
									break;
								}
								case 2:{
									System.out.println("Enter the Donor's Surname and the Id as "+donorId);
									String newDonorSurname = sc.nextLine();
									ba.updateDonorRecords(updateOption,donorId,newDonorSurname);
									break;
								}
								case 3:{
									System.out.println("Enter the Donor's BloodGroup and the Id as "+donorId);
									String newDonorBloodGroup = sc.nextLine();
									ba.updateDonorRecords(updateOption,donorId,newDonorBloodGroup);
									break;
								}
								case 4:{
									System.out.println("Enter the Donor's Phoneno and the Id as "+donorId);
									int newPhoneno = Integer.parseInt(sc.nextLine());
									ba.updateDonorRecords(updateOption,donorId,newPhoneno);
									break;
								}
								}
								break;
								}
							case 5:{
								temp1 = false;
								break;
							}
						}
					}
				} 
				else {
					System.out.println("Incorrect BloodAdmin/Password");
				}
				break;
				
			}
			case 2:{
				
			}
			case 3:{
				temp = false;
				}
			}
		}
	}

}
