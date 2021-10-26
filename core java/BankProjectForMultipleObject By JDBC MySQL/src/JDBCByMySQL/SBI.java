package JDBCByMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

public class SBI implements RBI{
	Scanner sc = new Scanner(System.in);
	Connection con =AcDBConnection.GetConnection();
	
	public void addAccount()  {
		
		//Connection con = AcDBConnection.GetConnection();
		
		System.out.println("Enter Total Number of Accounts Added : ");
		int size = sc.nextInt();
		for(int i=0;i<size;i++) {
			
			System.out.println("Enter Account Number : ");
			int acn = sc.nextInt();
			
			System.out.println("Enter Name : ");
			String name=sc.next();
			name+=sc.nextLine();
			
			System.out.println("Enter Address : ");
			String addr = sc.next();
			addr+=sc.nextLine();
			
			System.out.println("Enter Pan ID : ");
			String pan = sc.next();
			pan+=sc.nextLine();
			
			System.out.println("Enter Balance : ");
			double bal = sc.nextDouble();
			
			// Add by Prepare Statement (best According to me.)
			
			
			String query = "insert into sbibank values(?,?,?,?,?)";
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1, acn);
				ps.setString(2, name);
				ps.setString(3, addr);
				ps.setString(4, pan);
				ps.setDouble(5, bal);
				
				
				ps.execute();
				
				System.out.println("Account Added Successfully....");
				ps.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
	}

	@Override
	public void viewAccount() {
		System.out.println("Enter Account Number For Viewing Account Details");
		
		int acn = sc.nextInt();
		
		String query = "Select * from sbibank where AccountNumber = "+acn+" ";
		boolean flag=true;
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(query);
			while(rs.next()) {
				flag=false;
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getDouble(5));
			}
			if(flag) {
				System.out.println(acn + "This Account Number Do not exist in SBI Bank.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		}
		
		
		
		
	}

	@Override
	public void viewAllAccount() {
		
		String query = "Select * from sbibank  ";
		int count =0;
		
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getDouble(5));
			count++;
			}
			System.out.println("Total Accounts in SBI Bank is : "+count);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		
		}
		
		
		
	}

	@Override
	public void withdrawMoney() {
		
		
		System.out.println("Enter Account Number For Withdrawing Money : ");
		int acn = sc.nextInt();
		
		String query = "select * from sbibank where AccountNumber = "+acn+"";
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(query);
			double bal2=0;
			while(rs.next()) {
			double bal = rs.getDouble(5);
			bal2=bal;
			}
			System.out.println("Enter Amount to Withdraw  in Rupee :  ");
			double wbal = sc.nextDouble();
			if(wbal>bal2) {
				System.out.println("You Have Insufficient Balance. ");
				System.out.println("You have Current Balance is Rs : "+bal2);
			}else {
				
				
				String query1 = "Update sbibank set balance = balance - "+wbal+" where AccountNumber = "+acn+" ";
				smt.execute(query1);
				System.out.println("Withdrawal Amount of Rs : "+wbal+" is Succussful.");
				smt.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void depositMoney() {
		System.out.println("Enter Correct Account for Depositing money : ");
		//String query = "Enter Correct Account for Withdrawing money : ";
		int acn = sc.nextInt();
		System.out.println("Enter Amount to Deposit/Add in bank Account : ");
		double dpt=sc.nextDouble();
		String query = "update sbibank set balance = balance + "+dpt+"";
		if(dpt<=0) {
			System.out.println("Entered Amount cannot be negative or Zero.");
		}
		else {
		try {
			Statement smt = con.createStatement();
			smt.execute(query);
			System.out.println("Depositing Amount of Rs : "+dpt+" is Successful.");
			smt.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		}
	}

	@Override
	public void updateAccount() {
		
		System.out.println("Enter Account Number for Updating details.");
		int acn = sc.nextInt();
		boolean flag = true;
		String sql = " select * from sbibank";
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()) {
				if(rs.getInt(1)==acn) {
					flag= false;
					
					System.out.println("1. Account Number Updating");
					System.out.println("2. Name Updating.");
					System.out.println("3. Address Updating.");
					System.out.println("4. Pan Updating.");
					System.out.println("5. Exit.\n");
					System.out.println("Enter Your Choice : ");
					int ch = sc.nextInt();
					
					switch(ch) {
					
					case 1:
						System.out.println("This Account Belongs to Mr/Mrs : "+rs.getString(2));
						System.out.println("Enter new  Account Number : ");
						int neacn = sc.nextInt();
						
						String query1 = "Update sbibank set AccountNumber = "+neacn+" where AccountNumber = "+acn+" ";
						
						smt.execute(query1);
						System.out.println("Account Number Updated Successfully..");
						
						
						break;
					case 2:
						System.out.println("Previous Name was  Mr/Mrs : "+rs.getString(2));
						System.out.println("Enter New Name : ");
						String name = sc.next();
						name+=sc.nextLine();
						
						String query2 = "update sbibank set name = '"+name+"' where accountNumber = "+acn+" ";
						smt.execute(query2);
						System.out.println("Name Updated Successfully.");
						
						break;
					case 3:
						System.out.println("This Account Belongs to Mr/Mrs : "+rs.getString(2));
						System.out.println("Your Previous Address was : "+rs.getString(3));
						System.out.println("Enter Your New Address : ");
						String add = sc.next();
						add+=sc.nextLine();
						
						String query3="update sbibank set address = '"+add+"' where accountnumber = "+acn+"";
						
						smt.execute(query3);
						System.out.println("Address Updated Successful.");
						break;
					case 4:
						System.out.println("This Account Belongs to Mr/Mrs : "+rs.getString(2));
						System.out.println("Your Previous Pan Id was : "+rs.getString(4));
						System.out.println("Enter Your New Pan Id :");
						String pan = sc.next();
						pan+=sc.nextLine();
						
						String query4 = "update sbibank set pan ='"+pan+"' where AccountNumber = "+acn+"";
						
						smt.execute(query4);
						System.out.println("Pan Updated Successfully..");
						
						break;
					case 5:
						break;
						default:
							System.out.println("Wrong Choice.");

					}
					
					
				}
			}
			
			if(flag) {
				System.out.println(acn+" :This Account Number Does not exists in sbi bank.");
			}
			smt.close();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			
		}
		
		
		
				
		
		
		
	}
	public static void main(String[] args) {
		SBI s = new SBI();
		//s.addAccount();
		//s.viewAccount();
		//s.viewAllAccount();
		//s.withdrawMoney();
		//s.depositMoney();
		//s.updateAccount();
		//s.deleteAccount();
		
	}

	@Override
	public void deleteAccount() {
		System.out.println("Enter Correct account to be delete : ");
		int acn = sc.nextInt();
		String sql = "select * from sbibank";
		boolean flag=true;
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()) {
				if(rs.getInt(1)==acn) {
					System.out.println("This Account Belongs to Mr/Mrs : "+rs.getString(2));
					flag=false;
					String query = "delete from sbibank where accountNumber = "+acn+"";
					smt.execute(query);
					System.out.println("Account Deleted Successfully...");
					
				}
			}
			if(flag) {
				System.out.println(acn+" : This Account Number Does not Exists in bank.");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		
		}
		
		
	}
	

}
