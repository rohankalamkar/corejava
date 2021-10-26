package com.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.model.Account;

public class SBI implements RBI {

	Account ac = new Account();
	Scanner sc = new Scanner(System.in);
	int account;
	private String sbiBranch = "Pimpri";
	private String sbiIFSC = "SBI001756";
	String trsns[] = new String[100];
	int count = -1;
	int num = 0;

	boolean b = true;
	boolean c = true;
	boolean d = true;

	@Override
	public void addAccount() {

		while (b) {

			while (b) {
				try {
					System.out.println("Add Account Number (Account Number contains only 5 Integer)  : ");
					String ac1 = sc.next();

					int account = Integer.parseInt(ac1);
					if (account < 0) {
						throw new SBIException("Account Number Cannot be Negative");
					}
					int count0 = 0;
					int accNum = account;
					int rem = 0;
					for (int i = 0; i < 20; i++) {
						rem = accNum / 10;
						accNum = rem;
						count0++;
						if (accNum == 0) {
							break;
						}
					}
					if (count0 < 5 || count0 > 5) {

						// throw new SBIException("Please enter 5 digit account number");
						System.out.println("Please enter 5 digit account number ");
						System.out.println("You have Entered : " + ac1);
					}
					if (count0 == 5) {
						ac.setAccountnumber(account);
						break;
					}
				} catch (SBIException e) {
					System.out.println(e.getMessage());
				} catch (NumberFormatException e) {
					System.out.println("Sorry. Please enter 5 digit number & Only Numbers are allowed ");
					// System.out.println("You have just entered : ");

				}
			}

			System.out.println("Add Name of Account Holder : ");

			String name = sc.next();
			name += sc.nextLine();
			ac.setName(name);

			System.out.println("Enter Your address :");
			String address = sc.next();
			address += sc.nextLine();
			ac.setAddress(address);

			System.out.println("Enter PAN Number : ");
			String panId = sc.next();
			panId += sc.nextLine();
			ac.setPan(panId);

			while (b) {
				try {
					System.out.println("Enter Account Holder Balance Amount : ");
					String bal = sc.next();
					double balance = Double.parseDouble(bal);
					if (balance < 0) {
						throw new SBIException("Balance Cannot be Negative.");
					}
					ac.setBalance(balance);
					
					System.out.println("Account Created Successfully............... ");
					b = false;
				} catch (NumberFormatException e) {
					System.out.println("Please Enter Amount in Digit Only");
				} catch (SBIException e) {
					System.out.println(e.getMessage());
				}
			}

		}

	}

	@Override
	public void viewBalance() {
		System.out.println("Your Current account balance is : " + ac.getBalance());
	}

	@Override
	public void WithdrawMoney() {
		boolean c = true;
		while (c)
			try {
				System.out.println("Enter amount to Withdraw : ");
				String wit = sc.next();
				double Withdraw = Double.parseDouble(wit);
				if (Withdraw <= 0) {
					throw new SBIException("Withdrawal Amount Cannot be Negative or zero(0)");
				}
				if (Withdraw > ac.getBalance()) {
					System.out.println("You have insfficient balance .");
					System.out.println("Your current balance is : " + ac.getBalance());
					System.out.println("You want to withdraw amount : " + Withdraw);
				}
				if (Withdraw < ac.getBalance()) {
					double balance = ac.getBalance() - Withdraw;
					ac.setBalance(balance);
					System.out.printf("Withdrawal amount of Rs %f is Successfully", Withdraw);
					System.out.println();
					System.out.println("Your current balance is : " + ac.getBalance());
					count++;
					num++;
					String trs1 = "Your " + num + " Transaction is Withdrawal Amount of Rs : " + Withdraw;
					String trs2 = "\nYour Balance After Withdrawal of Rs. " + Withdraw + " is Rs : " + balance;
					trsns[count] = trs1 + trs2;

					break;
				}

			} catch (SBIException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Please Enter amount only in Numbers.");
			}
	}

	@Override
	public void depositeMoney() {

		while (c) {
			try {

				System.out.println("Enter amount you want to deposite in Rs.");
				String amt = sc.next();
				// amt+=sc.nextLine();
				double depositemoney = Double.parseDouble(amt);
				if (depositemoney <= 0) {
					throw new SBIException("Deposited money cannot be negative or Zero(0)");
				}
				if (depositemoney > 100000) {
					System.out.println("You cannot Deposited more than Rs 100000(one Lac Rupee)");
				} else {
					double previousBalance = ac.getBalance();
					double depo = ac.getBalance() + depositemoney;
					ac.setBalance(depo);
					System.out.printf("Amount Rs %f is deposited(added) successfully .", depositemoney);
					System.out.println();
					System.out.println("Your Previous Balance was Rs : " + previousBalance);
					System.out.println("Your Current Balance is Rs : " + depo);
					count++;
					num++;
					String trs1 = "Your " + num + " Transaction is Depositing Amount of Rs : " + depositemoney;
					String trs2 = "\nYour Balance After Deposting of Rs. " + depositemoney + " is Rs : " + depo;
					trsns[count] = trs1 + trs2;

					break;

				}
			} catch (SBIException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Please Enter digit only..");
			}
		}

	}

	@Override
	public void updateAccount() {

		while (d) {
			try {
				System.out.println("Updating Account Details: \n");
				System.out.println("1.Account Number.");
				System.out.println("2.Account Holder Name.");
				System.out.println("3.Account Holder Address");
				System.out.println("4.Account Holder PAN ID.");
				System.out.println("5.Account Holder Balance.");
				System.out.println("6.Account Holder Branch Name.");
				System.out.println("7.Account Holder Branch IFSC");
				System.out.println("8.Exit.");
				System.out.println("Enter your choice  : ");
				String s = sc.next();
				int ch = Integer.parseInt(s);
				switch (ch) {
				case 1:
					while (d) {
						try {
							// System.out.println("You cannot Update Account Number.");
							System.out.println("Enter Previous 5 Digit Account Number to update : ");
							String acn = sc.next();
							acn += sc.nextLine();

							int AcnNum = Integer.parseInt(acn);

							if (AcnNum == ac.getAccountnumber()) {
								while (d) {
									try {

										System.out.println("Account Number = " + ac.getAccountnumber()
												+ " is Belongs To Person Name : " + ac.getName());
										System.out
												.println("Enter Your New 5 Digit Account Number For Person Name with : "
														+ ac.getName());
										String newacn = sc.next();
										newacn += sc.nextLine();
										int newACCNum = Integer.parseInt(newacn);
										if (newACCNum < 0) {
											throw new SBIException("Account Number Cannot be Negative");
										}
										int count1 = 0;
										int accNum = newACCNum;
										int rem = 0;
										for (int i = 0; i < 20; i++) {
											rem = accNum / 10;
											accNum = rem;
											count1++;
											if (accNum == 0) {
												break;
											}
										}
										if (count1 < 5 || count1 > 5) {

											// throw new SBIException("Please enter 5 digit account number");
											System.out.println("Please enter 5 digit account number ");
											System.out.println("You have Entered : " + newACCNum);
										}
										if (count1 == 5) {
											System.out.println("Account Number Updated Successfully...");
											System.out.println("Old Account for Person : " + ac.getName() + " is : "
													+ ac.getAccountnumber());
											ac.setAccountnumber(newACCNum);
											System.out.println("New Updated Account Number for Person : " + ac.getName()
													+ " is : " + ac.getAccountnumber());
											d = false;
											break;
										}

									} catch (SBIException e) {
										System.out.println(e.getMessage());
									} catch (NumberFormatException e) {
										System.out.println("Please Enter only Numbers(Integers)");
									}
								}
							} else {
								System.out.println("You Have Entered Wrong Account Number .");
								System.out.println("You just have Entered : " + AcnNum);
								System.out.println("Please Enter Valid Account Number...\n");
							}
						}

						catch (NumberFormatException e) {
							System.out.println("Please Enter Numbers Only...\n");
						}
					}

					break;
				case 2:
					System.out.println("Previous Account Holder Name was : " + ac.getName());
					System.out.println("Enter Your Updated Name : ");
					String name = sc.next();
					name += sc.nextLine();
					ac.setName(name);
					System.out.println("Name Updated Successfully.....");
					System.out.println("Updated name of Account Holder is " + ac.getName());

					break;
				case 3:
					System.out.println("Previous Account Holder Addresss was : " + ac.getAddress());
					System.out.println("Enter Your Updated Address : ");
					String address = sc.next();
					address += sc.nextLine();
					ac.setAddress(address);
					System.out.println("Address Updated Successfully.....");
					System.out.println("Updated Address of Account Holder is " + ac.getAddress());
					break;
				case 4:
					System.out.println("Previous Account Holder Pan ID was : " + ac.getPan());
					System.out.println("Enter Your Updated Pan ID : ");
					String pan = sc.next();
					pan += sc.nextLine();
					ac.setPan(pan);
					System.out.println("Pan ID Updated Successfully.....");
					System.out.println("Updated PanID of Account Holder is " + ac.getPan());
					break;
				case 5:
					System.out.println("Sorry..You Cannot Update Balance Amount..");
					System.out.println("You can only Update Balance by Depositing or Withdrawing Amount");
					break;
				case 6:
					System.out.println("Your Previous Branch Name was : " + sbiBranch);
					System.out.println("Enter Your Updated Branch Name : ");
					String updBrnch = sc.next();
					updBrnch += sc.nextLine();
					setSbiBranch(updBrnch);
					System.out.println("Your Branch Name updated Successfully..");
					System.out.println("Your Updated new Branch name is : " + getSbiBranch());
					break;
				case 7:
					System.out.println("Your Previous Branch IFSC ID was : " + sbiIFSC);
					System.out.println("Enter Your Updated Branch IFSC ID : ");
					String updBrnchIFSC = sc.next();
					updBrnchIFSC += sc.nextLine();
					setSbiBranch(updBrnchIFSC);
					System.out.println("Your Branch IFSC ID updated Successfully..");
					System.out.println("Your Updated new Branch IFSC ID is : " + getSbiIFSC());
					break;
				case 8:
					d = false;
					break;
				default:
					System.out.println("You have entered Wrong Choice..");
				}

			} catch (NumberFormatException e) {
				System.out.println("Please Enter Number(Integer) Only");
			} catch (SBIException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public String getSbiBranch() {
		return sbiBranch;
	}

	public void setSbiBranch(String sbiBranch) {
		this.sbiBranch = sbiBranch;
	}

	public String getSbiIFSC() {
		return sbiIFSC;
	}

	public void setSbiIFSC(String sbiIFSC) {
		this.sbiIFSC = sbiIFSC;
	}

	@Override
	public String toString() {
		String a = "\nSBI Branch :  " + sbiBranch;
		String b = "\nSBI IFSCCode : " + sbiIFSC;
		String c = ac.toString() + a + b;
		return c;
	}

	public void transactionDetails() {
		if (num == 0) {
			System.out.println("You have not did any transaction yet...");
			// System.out.println("Your Current Balance is : "+ac.getBalance());
		} else if (num == 1) {
			System.out.println(trsns[count]);

		} else if (num > 1) {
			for (int i = 0; i <= count; i++) {
				System.out.println(trsns[i]);
				System.out.println();
			}
		}

		System.out.println("Your Current Balance is Rs : " + ac.getBalance());
	}

//	public static void main(String[] args) {
//		boolean b = true;
//		RBI s = new SBI();
//		Scanner sc1 = new Scanner(System.in);
//		while(b) {
//			try {
//				
//			
//		System.out.println("\n-----------WELCOME TO STATE BANK OF INDIA-----------\n");
//		System.out.println("1.Adding new Account.");
//		System.out.println("2.Depositing Money.");
//		System.out.println("3.Withdrawing Money.");
//		System.out.println("4.View Account Balance.");
//		System.out.println("5.View Account Details.");
//		System.out.println("6.Update Account Details.");
//		System.out.println("7.Transaction Details.");
//		System.out.println("8.Exit.\n");
//		System.out.println("Enter Your Choice : ");
//		String choice = sc1.next();
//		//choice +=sc1.nextLine();
//		int ch =Integer.parseInt(choice);
//		switch (ch) {
//		case 1:
//			s.addAccount();
//			break;
//		case 2:
//			s.depositeMoney();
//			break;
//		case 3:
//			s.WithdrawMoney();;
//			break;
//		case 4:
//			s.viewBalance();
//			break;
//		case 5:
//			s.viewAccountDetails();
//			break;
//		case 6:
//			s.updateAccount();
//			break;
//		case 7:
//			s.transactionDetails();
//			break;
//		case 8 :
//			b=false;
//			break;
//		default:
//				System.out.println("You Have Entered Wrong input...");
//			
//		}
//			}
//		catch(NumberFormatException e) {
//			System.out.println("Please Enter valid .....");
//		}
//			catch(Exception e) {
//				System.out.println(e.getMessage());
//			}
//		
//		
//		}
////		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	//	s.addAccount();
//	//	System.out.println(s.toString());
//		
////		s.WithdrawMoney();
////		s.depositeMoney();
////		s.updateAccount();
//
//	}

	@Override
	public void viewAccountDetails() {
		System.out.println(toString());
	}


}
