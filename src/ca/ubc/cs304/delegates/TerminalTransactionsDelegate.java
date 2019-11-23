package ca.ubc.cs304.delegates;

import ca.ubc.cs304.model.BranchModel;
import ca.ubc.cs304.model.CustomerModel;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * This interface uses the delegation design pattern where instead of having
 * the TerminalTransactions class try to do everything, it will only
 * focus on handling the UI. The actual logic/operation will be delegated to the 
 * controller class (in this case Bank).
 * 
 * TerminalTransactions calls the methods that we have listed below but 
 * Bank is the actual class that will implement the methods.
 */
public interface TerminalTransactionsDelegate {
//	public void deleteBranch(int branchId);
//	public void insertBranch(BranchModel model);
//	public void showBranch();
//	public void updateBranch(int branchId, String name);

	// rental car methods..
	public void insertCustomer(CustomerModel customer);

	public boolean customerExists(long dLicence);

	public boolean branchExists(String location, String city);

	public boolean vehicleTypeExists(String vtname);

	public String getNameFromLicence(long dLicence);

	public int numberVehiclesAvailable(String location, String vtname, Timestamp fromDate, Timestamp toDate);

	public CustomerModel getCustomer(int licence);

	public void makeReservation(long dLicence, String vtname, Timestamp fromDate, Timestamp toDate);

	public boolean isValidReservation(String location, String vtname, Timestamp startDateTimestamp, Timestamp endDate);
	public void printVehicles(ArrayList licences);
	public void insertRental(int confNo, String cardName, int cardNo, String expDate);
	public void insertRental(String cardName, int cardNo, String expDate);
	public boolean checkRentalExists(int rid);
	public void insertReturn(int rid, Timestamp rtnDateTime, int odometer, int fullTank);
    public float calcValue (int rid, Timestamp rtnDateTime, int current_odometer);
	public ArrayList getLicenses(String location, String vtname, Timestamp fromDate, Timestamp toDate);
	public void terminalTransactionsFinished();
}
