import java.awt.Font;
import java.awt.Point;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.text.ParseException;

import java.time.Period;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.List;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.concurrent.CompletableFuture;

import javax.swing.Timer;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.BorderFactory;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.event.HyperlinkListener;
import javax.swing.table.DefaultTableCellRenderer;

import bms.utilities.centralizedstr.FrameText;
import bms.utilities.centralizedstr.FinalStrings;
import bms.utilities.database.Connectivity;
import bms.utilities.validator.UserEntryValidator;
// import bms.utilities.exception.ConnectionFailed;

class NotiHyperlinkListener implements HyperlinkListener {
    @Override
    public void hyperlinkUpdate(HyperlinkEvent e) {
        if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            System.out.println("A Window is to be opened");
        }
    }
}

class UserIdentityAttributes {
    public char ageStatus;
    public String wasLoginSuccessfull = null;

    public String receivedHonorific = null;
    public String receivedFName = null;
    public String receivedMName = null;
    public String receivedLName = null;
    public String receivedDOB = null;
    public String receivedAadhar = null;
    public String receivedPan = null;
    public String receivedGender = null;
    public String receivedEmail = null;
    public String receivedPhno1 = null;
    public String receivedPhno2 = null;
    public String receivedMarital = null;
    
    public String receivedResidentialHouseNo = null;
    public String receivedResidentialWardNo = null;
    public String receivedResidentialArea = null;
    public String receivedResidentialCity = null;
    public String receivedResidentialDistrict = null;
    public String receivedResidentialState = null;
    public String receivedResidentialCountry = null;
    public String receivedResidentialPostOffice = null;
    public String receivedResidentialPoliceStation = null;
    public String receivedResidentialPincode = null;
    public String receivedResidentialLandmark = null;

    public String receivedPermanentHouseNo = null;
    public String receivedPermanentWardNo = null;
    public String receivedPermanentArea = null;
    public String receivedPermanentCity = null;
    public String receivedPermanentDistrict = null;
    public String receivedPermanentState = null;
    public String receivedPermanentCountry = null;
    public String receivedPermanentPostOffice = null;
    public String receivedPermanentPoliceStation = null;
    public String receivedPermanentPincode = null;
    public String receivedPermanentLandmark = null;

    public String receivedParentalPreference = null;
    public String receivedParentalRelation = null;
    public String receivedParentalHonorific = null;
    public String receivedParentalFName = null;
    public String receivedParentalMName = null;
    public String receivedParentalLName = null;
    public String receivedParentalPhno = null;
    public String receivedParentalAadhar = null;

    public String userGeneratedID = null;
    public String userGivenPassword = null;

    public String userIdWhileLogin = null;
    public String userPasswordWhileLogin = null;

// --------------------------------------------------------------------------------

    // Table 2
    public String Customer_Bank_Head_Quarter_table_2 = "Delhi";
    public String Customer_Bank_Name_table_2 = new FinalStrings().bankAbbr()+"("+new FinalStrings().bankNameNull()+")";
    public String Customer_Bank_IFSC_Code_table_2 = new FinalStrings().bankAbbr();
    public long Customer_Bank_Account_Number_table_2;
    public String Customer_Account_Opening_Date_table_2 = null;
    public String Customer_Account_Opening_Time_table_2 = null;
    public String Customer_Account_Type_table_2;
    public float Customer_Bank_Balance_table_2;
    public long Customer_Bank_Monthly_Limit_table_2;
    public long Customer_Bank_Daily_Limit_table_2;
    public long Customer_Bank_Minimum_Maintenance_Balance_table_2;

    // Table 3
    public String NetBanking_table_3;
    public String ATM_Card_table_3;
    public String UPI_table_3;
    public String Activate_PayTm_table_3;
    public String Activate_PhonePe_table_3;
    public String Activate_Google_Pay_table_3;
    public String Activate_Bharat_Pe_table_3;
    // Table 4
    public String NRI_or_Resident_table_4;
    
    // Table 5
    public int Serial_Number_table_5;
    public long Transaction_Reference_Number_table_5;
    public String Transaction_Date_table_5 = null;
    public String Transaction_Time_table_5 = null;
    public float Transaction_Amount_table_5;
    public String Description_or_Subject_table_5 = null;
    public String [] Credit_or_Debit_table_5 = {"Debit", "Credit"};
    public long Sender_Account_Number_table_5;
    public long Receiver_Account_Number_table_5;
    public String [] Transaction_Status_table_5 = {"Successful", "Failed"};

    // Table 6
    public long ATM_Card_Number_table_6;
    public int ATM_Card_CVV_table_6;
    public int ATM_Card_Expiry_Month_table_6;
    public int ATM_Card_Expiry_Year_table_6;
    public int ATM_Card_PIN_table_6;
    public String ATM_Card_Type_table_6;
    public String ATM_Card_Associations_table_6;
    public String ATM_Card_Facility_Status_table_6;

    // Table 7
    public int Serial_Number_table_7;
    public String Withdraw_or_Deposit_Reference_Number_table_7;
    public String Transaction_Date_table_7 = null;
    public String Transaction_Time_table_7 = null;
    public float Transaction_Amount_table_7;
    public String Withdraw_or_Deposit_table_7 = null;
    public String Transaction_Status_table_7 = null;
    public String Transaction_Failure_Log_table_7 = null;

    // Table 8
    public String UPI_Id_payTm_table_8 = "@paytm";
    public String UPI_Id_phonePe_table_8 = "@ybl";
    public String UPI_Id_googlePay_table_8 = "@gpay";
    public String UPI_Id_BharatPay_table_8 = "@bhp";
    public int UPI_Transaction_PIN_table_8;

    public String Current_UPI_Id_table_8 = null;
    public String Current_UPI_Id_payTm_table_8 = null;
    public String Current_UPI_Id_phonePe_table_8 = null;
    public String Current_UPI_Id_googlePay_table_8 = null;
    public String Current_UPI_Id_BharatPay_table_8 = null;

    // Table 9
    public int Serial_Number_table_9;
    public String UPI_Reference_Number_table_9;
    public String Transaction_Date_table_9 = null;
    public String Transaction_Time_table_9 = null;
    public Double Transaction_Amount_table_9;
    public String Description_or_Subject_table_9 = null;
    public String [] Credit_or_Debit_table_9 = {"Debit", "Credit"};
    public String description_table_9 = null;
    public String Sender_UPI_ID_table_9;
    public String Receiver_UPI_ID_table_9;
    public String [] Transaction_Status_table_9 = {"Successful", "Failed"};
    public String sender_Transaction_Status_table_9 = null;
    public String receiver_Transaction_Status_table_9 = null;

    // Table 10
    public String [] Bank_Account_Status_table_10 = {"Enabled", "Disabled", "Frozen", "Activated", "Deactivated"};
    public String [] Net_Banking_Facility_Status_table_10 = {"Enabled", "Disabled", "Frozen", "Activated", "Deactivated"};
    public String [] ATM_Card_Facility_Status_table_10 = {"Enabled", "Disabled", "Frozen", "Activated", "Deactivated"};
    public String [] UPI_Facility_Status_table_10 = {"Enabled", "Disabled", "Frozen", "Activated", "Deactivated"};
    public float Induced_Fine_table_10;
    public String Current_UPI_Facility_Status_table_10 = null;

    // Table 11
    public int Serial_Number_table_11;
    public String [] Any_Loan_table_11 = {"Yes", "No"};
    public int Number_Of_Loans_table_11;
    public float Interest_Percentage_Per_Annum_table_11;
    public String [] Any_EMI_table_11 = {"Yes", "No"};
    public int Number_Of_EMIs_table_11;
    public float EMI_Charge_Per_Month_table_11;

    // Table 12
    public int Serial_Number_table_12;
    public String Loan_Reference_ID_table_12 = null;
    public float Loan_Paid_Back_table_12;
    public float Loan_Remaining_table_12;
    public String [] Loan_Recovered_table_12 = {"Yes", "No"};

    // Table 13
    public int Serial_Number_table_13;
    public String EMI_Reference_ID_table_13 = null;
    public float EMI_Paid_Back_table_13;
    public float EMI_Remaining_table_13;
    public String [] EMI_Recovered_table_13 = {"Yes", "No"};

    // Table 14
    public int Notification_Fill_Till_table_14;
    public String [] Notification_table_14 = new String[100];
    {
        Arrays.fill(Notification_table_14, null);
    }
}
class AccountRegistrationDetails extends UserIdentityAttributes {

    public void logUserOut() {
        this.wasLoginSuccessfull = null;
        this.receivedHonorific = null;
        this.receivedFName = null;
        this.receivedMName = null;
        this.receivedLName = null;
        this.receivedDOB = null;
        this.receivedAadhar = null;
        this.receivedPan = null;
        this.receivedGender = null;
        this.receivedEmail = null;
        this.receivedPhno1 = null;
        this.receivedPhno2 = null;
        this.receivedMarital = null;
        this.receivedResidentialHouseNo = null;
        this.receivedResidentialWardNo = null;
        this.receivedResidentialArea = null;
        this.receivedResidentialCity = null;
        this.receivedResidentialDistrict = null;
        this.receivedResidentialState = null;
        this.receivedResidentialCountry = null;
        this.receivedResidentialPostOffice = null;
        this.receivedResidentialPoliceStation = null;
        this.receivedResidentialPincode = null;
        this.receivedResidentialLandmark = null;
        this.receivedPermanentHouseNo = null;
        this.receivedPermanentWardNo = null;
        this.receivedPermanentArea = null;
        this.receivedPermanentCity = null;
        this.receivedPermanentDistrict = null;
        this.receivedPermanentState = null;
        this.receivedPermanentCountry = null;
        this.receivedPermanentPostOffice = null;
        this.receivedPermanentPoliceStation = null;
        this.receivedPermanentPincode = null;
        this.receivedPermanentLandmark = null;
        this.receivedParentalPreference = null;
        this.receivedParentalRelation = null;
        this.receivedParentalHonorific = null;
        this.receivedParentalFName = null;
        this.receivedParentalMName = null;
        this.receivedParentalLName = null;
        this.receivedParentalPhno = null;
        this.receivedParentalAadhar = null;
        this.userGeneratedID = null;
        this.userGivenPassword = null;
        this.userIdWhileLogin = null;
        this.userPasswordWhileLogin = null;
    }

    public void setAgeStatus(char ageStatus) {
        this.ageStatus = ageStatus;
    }
    public void setWasLoginSuccessfull(String wasLoginSuccessfull) {
        this.wasLoginSuccessfull = wasLoginSuccessfull;
    }
    public void setHonorific(String receivedHonorific) {
        this.receivedHonorific = receivedHonorific;
    }

    public void setFName(String receivedFName) {
        this.receivedFName = receivedFName;
    }

    public void setMName(String receivedMName) {
        this.receivedMName = receivedMName;
    }

    public void setLName(String receivedLName) {
        this.receivedLName = receivedLName;
    }

    public void setDOB(String receivedDOB) {
        this.receivedDOB = receivedDOB;
    }

    public void setAadhar(String receivedAadhar) {
        this.receivedAadhar = receivedAadhar;
    }

    public void setPan(String receivedPan) {
        this.receivedPan = receivedPan;
    }

    public void setGender(String receivedGender) {
        this.receivedGender = receivedGender;
    }

    public void setEmail(String receivedEmail) {
        this.receivedEmail = receivedEmail;
    }

    public void setPhno1(String receivedPhno1) {
        this.receivedPhno1 = receivedPhno1;
    }

    public void setPhno2(String receivedPhno2) {
        this.receivedPhno2 = receivedPhno2;
    }

    public void setMarital(String receivedMarital) {
        this.receivedMarital = receivedMarital;
    }

    public void setResidentialHouseNo(String receivedResidentialHouseNo) {
        this.receivedResidentialHouseNo = receivedResidentialHouseNo;
    }

    public void setResidentialWardNo(String receivedResidentialWardNo) {
        this.receivedResidentialWardNo = receivedResidentialWardNo;
    }

    public void setResidentialArea(String receivedResidentialArea) {
        this.receivedResidentialArea = receivedResidentialArea;
    }

    public void setResidentialCity(String receivedResidentialCity) {
        this.receivedResidentialCity = receivedResidentialCity;
    }

    public void setResidentialDistrict(String receivedResidentialDistrict) {
        this.receivedResidentialDistrict = receivedResidentialDistrict;
    }

    public void setResidentialState(String receivedResidentialState) {
        this.receivedResidentialState = receivedResidentialState;
    }

    public void setResidentialCountry(String receivedResidentialCountry) {
        this.receivedResidentialCountry = receivedResidentialCountry;
    }

    public void setResidentialPostOffice(String receivedResidentialPostOffice) {
        this.receivedResidentialPostOffice = receivedResidentialPostOffice;
    }

    public void setResidentialPoliceStation(String receivedResidentialPoliceStation) {
        this.receivedResidentialPoliceStation = receivedResidentialPoliceStation;
    }

    public void setResidentialPincode(String receivedResidentialPincode) {
        this.receivedResidentialPincode = receivedResidentialPincode;
    }

    public void setResidentialLandmark(String receivedResidentialLandmark) {
        this.receivedResidentialLandmark = receivedResidentialLandmark;
    }

    public void setPermanentHouseNo(String receivedPermanentHouseNo) {
        this.receivedPermanentHouseNo = receivedPermanentHouseNo;
    }

    public void setPermanentWardNo(String receivedPermanentWardNo) {
        this.receivedPermanentWardNo = receivedPermanentWardNo;
    }

    public void setPermanentArea(String receivedPermanentArea) {
        this.receivedPermanentArea = receivedPermanentArea;
    }

    public void setPermanentCity(String receivedPermanentCity) {
        this.receivedPermanentCity = receivedPermanentCity;
    }

    public void setPermanentDistrict(String receivedPermanentDistrict) {
        this.receivedPermanentDistrict = receivedPermanentDistrict;
    }

    public void setPermanentState(String receivedPermanentState) {
        this.receivedPermanentState = receivedPermanentState;
    }

    public void setPermanentCountry(String receivedPermanentCountry) {
        this.receivedPermanentCountry = receivedPermanentCountry;
    }

    public void setPermanentPostOffice(String receivedPermanentPostOffice) {
        this.receivedPermanentPostOffice = receivedPermanentPostOffice;
    }

    public void setPermanentPoliceStation(String receivedPermanentPoliceStation) {
        this.receivedPermanentPoliceStation = receivedPermanentPoliceStation;
    }

    public void setPermanentPincode(String receivedPermanentPincode) {
        this.receivedPermanentPincode = receivedPermanentPincode;
    }

    public void setPermanentLandmark(String receivedPermanentLandmark) {
        this.receivedPermanentLandmark = receivedPermanentLandmark;
    }

    public void setReceivedParentalPreference(String receivedParentalPreference) {
        this.receivedParentalPreference = receivedParentalPreference;
    }
    public void setReceivedParentalRelation(String receivedParentalRelation) {
        this.receivedParentalRelation = receivedParentalRelation;
    }
    public void setReceivedParentalHonorific(String receivedParentalHonorific) {
        this.receivedParentalHonorific = receivedParentalHonorific;
    }
    public void setReceivedParentalFName(String receivedParentalFName) {
        this.receivedParentalFName = receivedParentalFName;
    }
    public void setReceivedParentalMName(String receivedParentalMName) {
        this.receivedParentalMName = receivedParentalMName;
    }
    public void setReceivedParentalLName(String receivedParentalLName) {
        this.receivedParentalLName = receivedParentalLName;
    }
    public void setReceivedParentalPhno(String receivedParentalPhno) {
        this.receivedParentalPhno = receivedParentalPhno;
    }
    public void setReceivedParentalAadhar(String receivedParentalAadhar) {
        this.receivedParentalAadhar = receivedParentalAadhar;
    }
    public void setUserGeneratedID(String userGeneratedID) {
        this.userGeneratedID = userGeneratedID;
    }
    public void setUserGivenPassword(String userGivenPassword) {
        this.userGivenPassword = userGivenPassword;
    }
    public void setUserIdWhileLogin(String userIdWhileLogin) {
        this.userIdWhileLogin = userIdWhileLogin;
    }
    public void setUserPasswordWhileLogin(String userPasswordWhileLogin) {
        this.userPasswordWhileLogin = userPasswordWhileLogin;
    }

    public void setCustomer_Bank_IFSC_Code_table_2(int uniqueIFSCIdentifier) {
        if(uniqueIFSCIdentifier>=1 && uniqueIFSCIdentifier<=9) {
            this.Customer_Bank_IFSC_Code_table_2 += "000"+uniqueIFSCIdentifier;
        } else if(uniqueIFSCIdentifier>=10 && uniqueIFSCIdentifier<=99) {
            this.Customer_Bank_IFSC_Code_table_2 += "00"+uniqueIFSCIdentifier;
        } else if(uniqueIFSCIdentifier>=100 && uniqueIFSCIdentifier<=999) {
            this.Customer_Bank_IFSC_Code_table_2 += "0"+uniqueIFSCIdentifier;
        } else if(uniqueIFSCIdentifier>=1000 && uniqueIFSCIdentifier<=9999) {
            this.Customer_Bank_IFSC_Code_table_2 += uniqueIFSCIdentifier;
        }
    }
    public void setCustomer_Bank_Account_Number_table_2(long cban) {
        this.Customer_Bank_Account_Number_table_2 = cban;
    }
    public void setCustomer_Account_Opening_Date_table_2(String caod) {
        this.Customer_Account_Opening_Date_table_2 = caod;
    }
    public void setCustomer_Account_Opening_Time_table_2(String caot) {
        this.Customer_Account_Opening_Time_table_2 = caot;
    }
    public void setCustomer_Bank_Balance_table_2(float cbb) {
        this.Customer_Bank_Balance_table_2 = cbb;
    }
    public void setCustomer_Bank_Monthly_Limit_table_2(long Customer_Bank_Monthly_Limit_table_2) {
        this.Customer_Bank_Monthly_Limit_table_2 = Customer_Bank_Monthly_Limit_table_2;
    }
    public void setCustomer_Bank_Daily_Limit_table_2(long Customer_Bank_Daily_Limit_table_2) {
        this.Customer_Bank_Daily_Limit_table_2 = Customer_Bank_Daily_Limit_table_2;
    }
    public void setCustomer_Bank_Minimum_Maintenance_Balance_table_2(long Customer_Bank_Minimum_Maintenance_Balance_table_2) {
        this.Customer_Bank_Minimum_Maintenance_Balance_table_2 = Customer_Bank_Minimum_Maintenance_Balance_table_2;
    }
    public void setCustomer_Account_Type_table_2(String Customer_Account_Type_table_2) {
        this.Customer_Account_Type_table_2 = Customer_Account_Type_table_2;
    }

    public void setNetBanking_table_3(String NetBanking_table_3) {
        this.NetBanking_table_3 = NetBanking_table_3;
    }
    public void setATM_Card_table_3(String ATM_Card_table_3) {
        this.ATM_Card_table_3 = ATM_Card_table_3;
    }
    public void setUPI_table_3(String UPI_table_3) {
        this.UPI_table_3 = UPI_table_3;
    }
    public void setActivate_PayTm_table_3(String Activate_PayTm_table_3) {
        this.Activate_PayTm_table_3 = Activate_PayTm_table_3;
    }
    public void setActivate_PhonePe_table_3(String Activate_PhonePe_table_3) {
        this.Activate_PhonePe_table_3 = Activate_PhonePe_table_3;
    }
    public void setActivate_Google_Pay_table_3(String Activate_Google_Pay_table_3) {
        this.Activate_Google_Pay_table_3 = Activate_Google_Pay_table_3;
    }
    public void setActivate_Bharat_Pe_table_3(String Activate_Bharat_Pe_table_3) {
        this.Activate_Bharat_Pe_table_3 = Activate_Bharat_Pe_table_3;
    }

    public void setNRI_or_Resident_table_4(String NRI_or_Resident_table_4) {
        this.NRI_or_Resident_table_4 = NRI_or_Resident_table_4;
    }

    public void setSerial_Number_table_5(int sn) {
        this.Serial_Number_table_5 = sn;
    }
    public void setTransaction_Reference_Number_table_5(long trn) {
        this.Transaction_Reference_Number_table_5 = trn;
    }
    public void setTransaction_Date_table_5(String td) {
        this.Transaction_Date_table_5 = td;
    }
    public void setTransaction_Time_table_5(String tt) {
        this.Transaction_Time_table_5 = tt;
    }
    public void setTransaction_Amount_table_5(float tm) {
        this.Transaction_Amount_table_5 = tm;
    }
    public void setDescription_or_Subject_table_5(String ds) {
        this.Description_or_Subject_table_5 = ds;
    }
    public void setSender_Account_Number_table_5(long san) {
        this.Sender_Account_Number_table_5 = san;
    }
    public void setReceiver_Account_Number_table_5(long ran) {
        this.Receiver_Account_Number_table_5 = ran;
    }


    public void setATM_Card_Number_table_6(long atmcn) {
        this.ATM_Card_Number_table_6 = atmcn;
    }
    public void setATM_Card_CVV_table_6(int atmccvv) {
        this.ATM_Card_CVV_table_6 = atmccvv;
    }
    public void setATM_Card_Expiry_Month_table_6(int atmcem) {
        this.ATM_Card_Expiry_Month_table_6 = atmcem;
    }
    public void setATM_Card_Expiry_Year_table_6(int atmcey) {
        this.ATM_Card_Expiry_Year_table_6 = atmcey;
    }
    public void setATM_Card_PIN_table_6(int atmcp) {
        this.ATM_Card_PIN_table_6 = atmcp;
    }
    public void setATM_Card_Type_table_6(String ATM_Card_Type_table_6) {
        this.ATM_Card_Type_table_6 = ATM_Card_Type_table_6;
    }
    public void setATM_Card_Associations_table_6(String ATM_Card_Associations_table_6) {
        this.ATM_Card_Associations_table_6 = ATM_Card_Associations_table_6;
    }
    public void setATM_Card_Facility_Status_table_6(String ATM_Card_Facility_Status_table_6) {
        this.ATM_Card_Facility_Status_table_6 = ATM_Card_Facility_Status_table_6;
    }


    public void setSerial_Number_table_7(int sn) {
        this.Serial_Number_table_7 = sn;
    }
    public void setWithdraw_or_Deposit_Reference_Number_table_7(String wodrn) {
        this.Withdraw_or_Deposit_Reference_Number_table_7 = wodrn;
    }
    public void setTransaction_Date_table_7(String td) {
        this.Transaction_Date_table_7 = td;
    }
    public void setTransaction_Time_table_7(String tt) {
        this.Transaction_Time_table_7 = tt;
    }
    public void setTransaction_Amount_table_7(float ta) {
        this.Transaction_Amount_table_7 = ta;
    }
    public void setWithdraw_or_Deposit_table_7(String wod) {
        this.Withdraw_or_Deposit_table_7 = wod;
    }
    public void setTransaction_Status_table_7(String ts) {
        this.Transaction_Status_table_7 = ts;
    }

    public void setUPI_Transaction_PIN_table_8(int upitp) {
        this.UPI_Transaction_PIN_table_8 = upitp;
    }


    public void setSerial_Number_table_9(int sn) {
        this.Serial_Number_table_9 = sn;
    }
    public void setUPI_Reference_Number_table_9(String upirn) {
        this.UPI_Reference_Number_table_9 = upirn;
    }
    public void setTransaction_Date_table_9(String td) {
        this.Transaction_Date_table_9 = td;
    }
    public void setTransaction_Time_table_9(String tt) {
        this.Transaction_Time_table_9 = tt;
    }
    public void setTransaction_Amount_table_9(Double ta) {
        this.Transaction_Amount_table_9 = ta;
    }
    public void setDescription_or_Subject_table_9(String ds) {
        this.Description_or_Subject_table_9 = ds;
    }
    public void setSender_UPI_Id_table_9(String sui) {
        this.Sender_UPI_ID_table_9 = sui;
    }
    public void setReceiver_UPI_Id_table_9(String rui) {
        this.Receiver_UPI_ID_table_9 = rui;
    }

    public void setSerial_Number_table_11(int sn) {
        this.Serial_Number_table_11 = sn;
    }
    public void setNumber_Of_Loans_table_11(int nol) {
        this.Number_Of_Loans_table_11 = nol;
    }
    public void setInterest_Percentage_Per_Annum_table_11(float ippa) {
        this.Interest_Percentage_Per_Annum_table_11 = ippa;
    }
    public void setNumber_Of_EMIs_table_11(int noe) {
        this.Number_Of_EMIs_table_11 = noe;
    }
    public void setEMI_Charge_Per_Month_table_11(float emicpm) {
        this.EMI_Charge_Per_Month_table_11 = emicpm;
    }
    
    public void setSerial_Number_table_12(int sn) {
        this.Serial_Number_table_12 = sn;
    }
    public void setLoan_Reference_ID_table_12(String lrid) {
        this.Loan_Reference_ID_table_12 = lrid;
    }
    public void setLoan_Paid_Back_table_12(float lpb) {
        this.Loan_Paid_Back_table_12 = lpb;
    }
    public void setLoan_Remaining_table_12(float lr) {
        this.Loan_Remaining_table_12 = lr;
    }
    
    public void setSerial_Number_table_13(int sn) {
        this.Serial_Number_table_13 = sn;
    }
    public void setEMI_Reference_ID_table_13(String emirid) {
        this.EMI_Reference_ID_table_13 = emirid;
    }
    public void setEMI_Paid_Back_table_13(float emipb) {
        this.EMI_Paid_Back_table_13 = emipb;
    }
    public void setEMI_Remaining_table_13(float emir) {
        this.EMI_Remaining_table_13 = emir;
    }

    public void setNotification_Fill_Till_table_14(int nft) {
        this.Notification_Fill_Till_table_14 = nft;
    }
    public void setNotification_table_14(String noti, int index) {
        this.Notification_table_14[index] = noti;
    }

    public char fetchAgeStatus() {
        return ageStatus;
    }
    
    public String fetchWasLoginSuccessfull() {
        return wasLoginSuccessfull;
    }

    public String fetchHonorific() {
        return receivedHonorific;
    }

    public String fetchFName() {
        return receivedFName;
    }

    public String fetchMName() {
        return receivedMName;
    }

    public String fetchLName() {
        return receivedLName;
    }

    public String fetchDOB() {
        return receivedDOB;
    }

    public String fetchAadhar() {
        return receivedAadhar;
    }

    public String fetchPan() {
        return receivedPan;
    }

    public String fetchGender() {
        return receivedGender;
    }

    public String fetchEmail() {
        return receivedEmail;
    }

    public String fetchPhno1() {
        return receivedPhno1;
    }

    public String fetchPhno2() {
        return receivedPhno2;
    }

    public String fetchMarital() {
        return receivedMarital;
    }

    public String fetchResidentialHouseNo() {
        return receivedResidentialHouseNo;
    }

    public String fetchResidentialWardNo() {
        return receivedResidentialWardNo;
    }

    public String fetchResidentialArea() {
        return receivedResidentialArea;
    }

    public String fetchResidentialCity() {
        return receivedResidentialCity;
    }

    public String fetchResidentialDistrict() {
        return receivedResidentialDistrict;
    }

    public String fetchResidentialState() {
        return receivedResidentialState;
    }

    public String fetchResidentialCountry() {
        return receivedResidentialCountry;
    }

    public String fetchResidentialPostOffice() {
        return receivedResidentialPostOffice;
    }

    public String fetchResidentialPoliceStation() {
        return receivedResidentialPoliceStation;
    }

    public String fetchResidentialPincode() {
        return receivedResidentialPincode;
    }

    public String fetchResidentialLandmark() {
        return receivedResidentialLandmark;
    }

    public String fetchPermanentHouseNo() {
        return receivedPermanentHouseNo;
    }

    public String fetchPermanentWardNo() {
        return receivedPermanentWardNo;
    }

    public String fetchPermanentArea() {
        return receivedPermanentArea;
    }

    public String fetchPermanentCity() {
        return receivedPermanentCity;
    }

    public String fetchPermanentDistrict() {
        return receivedPermanentDistrict;
    }

    public String fetchPermanentState() {
        return receivedPermanentState;
    }

    public String fetchPermanentCountry() {
        return receivedPermanentCountry;
    }

    public String fetchPermanentPostOffice() {
        return receivedPermanentPostOffice;
    }

    public String fetchPermanentPoliceStation() {
        return receivedPermanentPoliceStation;
    }

    public String fetchPermanentPincode() {
        return receivedPermanentPincode;
    }

    public String fetchPermanentLandmark() {
        return receivedPermanentLandmark;
    }

    public String fetchReceivedParentalPreference() {
        return receivedParentalPreference;
    }
    public String fetchReceivedParentalRelation() {
        return receivedParentalRelation;
    }
    public String fetchReceivedParentalHonorific() {
        return receivedParentalHonorific;
    }
    public String fetchReceivedParentalFName() {
        return receivedParentalFName;
    }
    public String fetchReceivedParentalMName() {
        return receivedParentalMName;
    }
    public String fetchReceivedParentalLName() {
        return receivedParentalLName;
    }
    public String fetchReceivedParentalPhno() {
        return receivedParentalPhno;
    }
    public String fetchReceivedParentalAadhar() {
        return receivedParentalAadhar;
    }

    public String fetchUserGeneratedID() {
        return userGeneratedID;
    }

    public String fetchUserGivenPassword() {
        return userGivenPassword;
    }

    public String fetchUserIdWhileLogin() {
        return userIdWhileLogin;
    }
    public String fetchUserPasswordWhileLogin() {
        return userPasswordWhileLogin;
    }


    public String fetchCustomer_Bank_Head_Quarter_table_2() {
        return this.Customer_Bank_Head_Quarter_table_2;
    }
    public String fetCustomer_Bank_Name_table_2() {
        return this.Customer_Bank_Name_table_2;
    }
    public String fetchCustomer_Bank_IFSC_Code_table_2() {
        return this.Customer_Bank_IFSC_Code_table_2;
    }
    public long fetchCustomer_Bank_Account_Number_table_2() {
        return this.Customer_Bank_Account_Number_table_2;
    }
    public String fetchCustomer_Account_Opening_Date_table_2() {
        return this.Customer_Account_Opening_Date_table_2;
    }
    public String fetchCustomer_Account_Opening_Time_table_2() {
        return this.Customer_Account_Opening_Time_table_2;
    }
    public String fetchCustomer_Account_Type_table_2() {
        return this.Customer_Account_Type_table_2;
    }
    public float fetchCustomer_Bank_Balance_table_2() {
        return this.Customer_Bank_Balance_table_2;
    }
    public long fetchCustomer_Bank_Monthly_Limit_table_2() {
        return this.Customer_Bank_Monthly_Limit_table_2;
    }
    public long fetchCustomer_Bank_Daily_Limit_table_2() {
        return this.Customer_Bank_Daily_Limit_table_2;
    }
    public long fetchCustomer_Bank_Minimum_Maintenance_Balance_table_2() {
        return this.Customer_Bank_Minimum_Maintenance_Balance_table_2;
    }

    public String fetchNetBanking_table_3() {
        return this.NetBanking_table_3;
    }
    public String fetchATM_Card_table_3() {
        return this.ATM_Card_table_3;
    }
    public String fetchUPI_table_3() {
        return this.UPI_table_3;
    }
    public String fetchActivate_PayTm_table_3() {
        return this.Activate_PayTm_table_3;
    }
    public String fetchActivate_PhonePe_table_3() {
        return this.Activate_PhonePe_table_3;
    }
    public String fetchActivate_Google_Pay_table_3() {
        return this.Activate_Google_Pay_table_3;
    }
    public String fetchActivate_Bharat_Pe_table_3() {
        return this.Activate_Bharat_Pe_table_3;
    }
    public String fetchNRI_or_Resident_table_4() {
        return this.NRI_or_Resident_table_4;
    }
    public int fetchSerial_Number_table_5() {
        return this.Serial_Number_table_5;
    }
    public long fetchTransaction_Reference_Number_table_5() {
        return this.Transaction_Reference_Number_table_5;
    }
    public String fetchTransaction_Date_table_5() {
        return this.Transaction_Date_table_5;
    }
    public String fetchTransaction_Time_table_5() {
        return this.Transaction_Time_table_5;
    }
    public float fetchTransaction_Amount_table_5() {
        return this.Transaction_Amount_table_5;
    }
    public String fetchDescription_or_Subject_table_5() {
        return this.Description_or_Subject_table_5;
    }
    public String fetchCredit_or_Debit_table_5(int index) {
        return this.Credit_or_Debit_table_5[index];
    }
    public long fetchSender_Account_Number_table_5() {
        return this.Sender_Account_Number_table_5;
    }
    public long fetchReceiver_Account_Number_table_5() {
        return this.Receiver_Account_Number_table_5;
    }
    public String fetchTransaction_Status_table_5(int index) {
        return this.Transaction_Status_table_5[index];
    }

    public long fetchATM_Card_Number_table_6() {
        return this.ATM_Card_Number_table_6;
    }
    public int fetchATM_Card_CVV_table_6() {
        return this.ATM_Card_CVV_table_6;
    }
    public int fetchATM_Card_Expiry_Month_table_6() {
        return this.ATM_Card_Expiry_Month_table_6;
    }
    public int fetchATM_Card_Expiry_Year_table_6() {
        return this.ATM_Card_Expiry_Year_table_6;
    }
    public int fetchATM_Card_PIN_table_6() {
        return this.ATM_Card_PIN_table_6;
    }
    public String fetchATM_Card_Type_table_6() {
        return this.ATM_Card_Type_table_6;
    }
    public String fetchATM_Card_Associations_table_6() {
        return this.ATM_Card_Associations_table_6;
    }
    public String fetchATM_Card_Facility_Status_table_6() {
        return this.ATM_Card_Facility_Status_table_6;
    }

    public int fetchSerial_Number_table_7() {
        return this.Serial_Number_table_7;
    }
    public String fetchWithdraw_or_Deposit_Reference_Number_table_7() {
        return this.Withdraw_or_Deposit_Reference_Number_table_7;
    }
    public String fetchTransaction_Date_table_7() {
        return this.Transaction_Date_table_7;
    }
    public String fetchTransaction_Time_table_7() {
        return this.Transaction_Time_table_7;
    }
    public float fetchTransaction_Amount_table_7() {
        return this.Transaction_Amount_table_7;
    }
    public String fetchWithdraw_or_Deposit_table_7() {
        return this.Withdraw_or_Deposit_table_7;
    }
    public String fetchTransaction_Status_table_7() {
        return this.Transaction_Status_table_7;
    }
    public String fetchUPI_Id_payTm_table_8(String userPhno) {
        if(fetchActivate_PayTm_table_3()=="Not Selected") {

            return null;
        }
        return userPhno+this.UPI_Id_payTm_table_8;
    }
    public String fetchUPI_Id_phonePe_table_8(String userPhno) {
        if(fetchActivate_PhonePe_table_3()=="Not Selected") {
            return null;
        }
        return userPhno+this.UPI_Id_phonePe_table_8;
    }
    public String fetchUPI_Id_googlePay_table_8(String userPhno) {
        if(fetchActivate_Google_Pay_table_3()=="Not Selected") {
            return null;
        }
        return userPhno+this.UPI_Id_googlePay_table_8;
    }
    public String fetchUPI_Id_BharatPay_table_8(String userPhno) {
        if(fetchActivate_Bharat_Pe_table_3()=="Not Selected") {
            return null;
        }
        return userPhno+this.UPI_Id_BharatPay_table_8;
    }
    public int fetchUPI_Transaction_PIN_table_8() {
        return this.UPI_Transaction_PIN_table_8;
    }
    public int fetchSerial_Number_table_9() {
        return this.Serial_Number_table_9;
    }
    public String fetchUPI_Reference_Number_table_9() {
        return this.UPI_Reference_Number_table_9;
    }
    public String fetchTransaction_Date_table_9() {
        return this.Transaction_Date_table_9;
    }
    public String fetchTransaction_Time_table_9() {
        return this.Transaction_Time_table_9;
    }
    public Double fetchTransaction_Amount_table_9() {
        return this.Transaction_Amount_table_9;
    }
    public String fetchDescription_or_Subject_table_9() {
        return this.Description_or_Subject_table_9;
    }
    public String fetchCredit_or_Debit_table_9(int index) {
        return this.Credit_or_Debit_table_9[index];
    }
    public String fetchSender_UPI_Id_table_9() {
        return this.Sender_UPI_ID_table_9;
    }
    public String fetchReceiver_UPI_Id_table_9() {
        return this.Sender_UPI_ID_table_9;
    }
    public String fetchTransaction_Status_table_9(int index) {
        return this.Transaction_Status_table_9[index];
    }
    public String fetchBank_Account_Status_table_10(int index) {
        return this.Bank_Account_Status_table_10[index];
    }
    public String fetchNet_Banking_Facility_Status_table_10(int index) {
        return this.Net_Banking_Facility_Status_table_10[index];
    }
    public String fetchATM_Card_Facility_Status_table_10(int index) {
        return this.ATM_Card_Facility_Status_table_10[index];
    }
    public String fetchUPI_Facility_Status_table_10(int index) {
        return this.UPI_Facility_Status_table_10[index];
    }
    public float fetchInduced_Fine_table_10() {
        return this.Induced_Fine_table_10;
    }
    public int fetchSerial_Number_table_11() {
        return this.Serial_Number_table_11;
    }
    public String fetchAny_Loan_table_11(int index) {
        return this.Any_Loan_table_11[index];
    }
    public int fetchNumber_Of_Loans_table_11() {
        return this.Number_Of_Loans_table_11;
    }
    public float fetchInterest_Percentage_Per_Annum_table_11() {
        return this.Interest_Percentage_Per_Annum_table_11;
    }
    public String fetchAny_EMI_table_11(int index) {
        return this.Any_EMI_table_11[index];
    }
    public int fetchNumber_Of_EMIs_table_11() {
        return this.Number_Of_EMIs_table_11;
    }
    public float fetchEMI_Charge_Per_Month_table_11() {
        return this.EMI_Charge_Per_Month_table_11;
    }
    public int fetchSerial_Number_table_12() {
        return this.Serial_Number_table_12;
    }
    public String fetchLoan_Reference_ID_table_12() {
        return this.Loan_Reference_ID_table_12;
    }
    public float fetchLoan_Paid_Back_table_12() {
        return this.Loan_Paid_Back_table_12;
    }
    public float fetchLoan_Remaining_table_12() {
        return this.Loan_Remaining_table_12;
    }
    public String fetchLoan_Recovered_table_12(int index) {
        return this.Loan_Recovered_table_12[index];
    }
    public int fetchSerial_Number_table_13() {
        return this.Serial_Number_table_13;
    }
    public String fetchEMI_Reference_ID_table_13() {
        return this.EMI_Reference_ID_table_13;
    }
    public float fetchEMI_Paid_Back_table_13() {
        return this.EMI_Paid_Back_table_13;
    }
    public float fetchEMI_Remaining_table_13() {
        return this.EMI_Remaining_table_13;
    }
    public String fetchEMI_Recovered_table_13(int index) {
        return this.EMI_Recovered_table_13[index];
    }

    public int fetchNotification_Fill_Till_table_14() {
        return this.Notification_Fill_Till_table_14;
    }
    public String fetchNotification_table_14(int index) {
        return this.Notification_table_14[index];
    }
}

class CurrentUserLogin {
    private String currentUserName = null;
    private String currentUserId = null;

    public void logUserOut() {
        this.currentUserName = null;
        this.currentUserId = null;
    }
    public void setCurrentUserName(String currentUserName) {
        this.currentUserName = currentUserName;
    }
    public void setCurrentUserId(String currentUserId) {
        this.currentUserId = currentUserId;
    }
    public String fetchCurrentUserName() {
        return currentUserName;
    }
    public String fetchCurrentUserId() {
        return currentUserId;
    }
}
class CurrentUserATM extends UserIdentityAttributes {
    private String Current_User_ATM_Card_Facility_Status_table_10;
    
    public void setCurrent_User_ATM_Card_Number_table_6(long atmcn) {
        this.ATM_Card_Number_table_6 = atmcn;
    }
    public void setCurrent_User_ATM_Card_CVV_table_6(int atmccvv) {
        this.ATM_Card_CVV_table_6 = atmccvv;
    }
    public void setCurrent_User_ATM_Card_Expiry_Month_table_6(int atmcem) {
        this.ATM_Card_Expiry_Month_table_6 = atmcem;
    }
    public void setCurrent_User_ATM_Card_Expiry_Year_table_6(int atmcey) {
        this.ATM_Card_Expiry_Year_table_6 = atmcey;
    }
    public void setCurrent_User_ATM_Card_PIN_table_6(int atmcp) {
        this.ATM_Card_PIN_table_6 = atmcp;
    }
    public void setCurrent_User_ATM_Card_Type_table_6(String ATM_Card_Type) {
        this.ATM_Card_Type_table_6 = ATM_Card_Type;
    }
    public void setCurrent_User_ATM_Card_Associations_table_6(String ATM_Card_Associations) {
        this.ATM_Card_Associations_table_6 = ATM_Card_Associations;
    }
    public void setCurrent_User_ATM_Card_Facility_Status_table_6(String ATM_Card_Facility_Status) {
        this.ATM_Card_Facility_Status_table_6 = ATM_Card_Facility_Status;
    }

    public void setCurrent_User_ATM_Card_table_3(String ATM_Card_table_3) {
        this.ATM_Card_table_3 = ATM_Card_table_3;
    }

    public void setCurrent_User_ATM_Card_Facility_Status_table_10(String cuacf) {
        this.Current_User_ATM_Card_Facility_Status_table_10 = cuacf;
    }

    

    public void setWithdraw_or_Deposit_Reference_Number_table_9(String Withdraw_or_Deposit_Reference_Number_table_9) {
        this.Withdraw_or_Deposit_Reference_Number_table_7 = Withdraw_or_Deposit_Reference_Number_table_9;
    }
    public void setTransaction_Date_table_9(String Transaction_Date_table_9) {
        this.Transaction_Date_table_7 = Transaction_Date_table_9;
    }
    public void setTransaction_Time_table_9(String Transaction_Time_table_9) {
        this.Transaction_Time_table_7 = Transaction_Time_table_9;
    }
    public void setTransaction_Amount_table_9(float Transaction_Amount_table_9) {
        this.Transaction_Amount_table_7 = Transaction_Amount_table_9;
    }
    public void setWithdraw_or_Deposit_table_9(String Withdraw_or_Deposit_table_9) {
        this.Withdraw_or_Deposit_table_7 = Withdraw_or_Deposit_table_9;
    }
    public void setTransaction_Status_table_9(String Transaction_Status_table_9) {
        this.Transaction_Status_table_7 = Transaction_Status_table_9;
    }
    public void setTransaction_Failure_Log_table_9(String Transaction_Failure_Log_table_9) {
        this.Transaction_Failure_Log_table_7 = Transaction_Failure_Log_table_9;
    }

    public long fetchCurrent_User_ATM_Card_Number_table_6() {
        return this.ATM_Card_Number_table_6;
    }
    public int fetchCurrent_User_ATM_Card_CVV_table_6() {
        return this.ATM_Card_CVV_table_6;
    }
    public int fetchCurrent_User_ATM_Card_Expiry_Month_table_6() {
        return this.ATM_Card_Expiry_Month_table_6;
    }
    public int fetchCurrent_User_ATM_Card_Expiry_Year_table_6() {
        return this.ATM_Card_Expiry_Year_table_6;
    }
    public int fetchCurrent_User_ATM_Card_PIN_table_6() {
        return this.ATM_Card_PIN_table_6;
    }
    public String fetchCurrent_User_ATM_Card_Type_table_6() {
        return this.ATM_Card_Type_table_6;
    }
    public String fetchCurrent_User_ATM_Card_Associations_table_6() {
        return this.ATM_Card_Associations_table_6;
    }
    public String fetchCurrent_User_ATM_Card_Facility_Status_table_6() {
        return this.ATM_Card_Facility_Status_table_6;
    }

    public String fetchCurrent_User_ATM_Card_table_3() {
        return this.ATM_Card_table_3;
    }

    public String fetchCurrent_User_ATM_Card_Facility_Status_table_10() {
        return this.Current_User_ATM_Card_Facility_Status_table_10;
    }
}
class HandleATMTransactions extends UserIdentityAttributes {
    public void setWithdraw_or_Deposit_Reference_Number_table_7(String Withdraw_or_Deposit_Reference_Number_table_7) {
        this.Withdraw_or_Deposit_Reference_Number_table_7 = Withdraw_or_Deposit_Reference_Number_table_7;
    }
    public void setTransaction_Date_table_7(String Transaction_Date_table_7) {
        this.Transaction_Date_table_7 = Transaction_Date_table_7;
    }
    public void setTransaction_Time_table_7(String Transaction_Time_table_7) {
        this.Transaction_Time_table_7 = Transaction_Time_table_7;
    }
    public void setTransaction_Amount_table_7(float Transaction_Amount_table_7) {
        this.Transaction_Amount_table_7 = Transaction_Amount_table_7;
    }
    public void setWithdraw_or_Deposit_table_7(String Withdraw_or_Deposit_table_7) {
        this.Withdraw_or_Deposit_table_7 = Withdraw_or_Deposit_table_7;
    }
    public void setTransaction_Status_table_7(String Transaction_Status_table_7) {
        this.Transaction_Status_table_7 = Transaction_Status_table_7;
    }
    public void setTransaction_Failure_Log_table_7(String Transaction_Failure_Log_table_7) {
        this.Transaction_Failure_Log_table_7 = Transaction_Failure_Log_table_7;
    }

    public String fetchWithdraw_or_Deposit_Reference_Number_table_7() {
        return this.Withdraw_or_Deposit_Reference_Number_table_7;
    }
    public String fetchTransaction_Date_table_7() {
        return this.Transaction_Date_table_7;
    }
    public String fetchTransaction_Time_table_7() {
        return this.Transaction_Time_table_7;
    }
    public float fetchTransaction_Amount_table_7() {
        return this.Transaction_Amount_table_7;
    }
    public String fetchWithdraw_or_Deposit_table_7() {
        return this.Withdraw_or_Deposit_table_7;
    }
    public String fetchTransaction_Status_table_7() {
        return this.Transaction_Status_table_7;
    }
    public String fetchTransaction_Failure_Log_table_7() {
        return this.Transaction_Failure_Log_table_7;
    }
}
class CurrentUserUPI extends UserIdentityAttributes {
    public void setCurrent_User_UPI_ID_table_8(String upi) {
        this.Current_UPI_Id_table_8 = upi;
    }
    public void setCurrent_User_UPI_table_3(String UPI_table_3) {
        this.UPI_table_3 = UPI_table_3;
    }

    public void setCurrent_User_UPI_Facility_Status_table_10(String cuupif) {
        this.Current_UPI_Facility_Status_table_10 = cuupif;
    }

    public String fetchCurrent_User_UPI_ID_table_8() {
        return this.Current_UPI_Id_table_8;
    }
    
    public String fetchCurrent_User_UPI_table_3() {
        return this.UPI_table_3;
    }
    public String setCurrent_User_UPI_Facility_Status_table_10() {
        return this.Current_UPI_Facility_Status_table_10;
    }
}
class HandleUPITransactions extends UserIdentityAttributes {
    private String sender_Unique_Id = null;
    private String receiver_Unique_Id = null;
    private String unique_id_to_be_inserted = null;
    private String credit_or_debit_to_be_inserted = null;

    public void setSender_Unique_Id(String sender_Unique_Id) {
        this.sender_Unique_Id = sender_Unique_Id;
    }
    public void setReceiver_Unique_Id(String receiver_Unique_Id) {
        this.receiver_Unique_Id = receiver_Unique_Id;
    }
    public void setUnique_id_to_be_inserted(String unique_id_to_be_inserted) {
        this.unique_id_to_be_inserted = unique_id_to_be_inserted;
    }
    public void setCredit_or_debit_to_be_inserted(String credit_or_debit_to_be_inserted) {
        this.credit_or_debit_to_be_inserted = credit_or_debit_to_be_inserted;
    }
    public void setUPI_Reference_Number_table_9(String UPI_Reference_Number_table_9) {
        this.UPI_Reference_Number_table_9 = UPI_Reference_Number_table_9;
    }
    public void setTransaction_Date_table_9(String Transaction_Date_table_9) {
        this.Transaction_Date_table_9 = Transaction_Date_table_9;
    }
    public void setTransaction_Time_table_9(String Transaction_Time_table_9) {
        this.Transaction_Time_table_9 = Transaction_Time_table_9;
    }
    public void setTransaction_Amount_table_9(Double Transaction_Amount_table_9) {
        this.Transaction_Amount_table_9 = Transaction_Amount_table_9;
    }
    public void setDescription_Subject_table_9(String description_table_9) {
        this.description_table_9 = description_table_9;
    }
    public void setSender_UPI_ID_table_9(String Sender_UPI_ID_table_9) {
        this.Sender_UPI_ID_table_9 = Sender_UPI_ID_table_9;
    }
    public void setReceiver_UPI_ID_table_9(String Receiver_UPI_ID_table_9) {
        this.Receiver_UPI_ID_table_9 = Receiver_UPI_ID_table_9;
    }
    public void setTransaction_Status_table_9(String Transaction_Status_table_9) {
        this.Transaction_Status_table_7 = Transaction_Status_table_9;
    }
    public void setTransaction_Failure_Log_table_9(String Transaction_Failure_Log_table_9) {
        this.Transaction_Failure_Log_table_7 = Transaction_Failure_Log_table_9;
    }

    public String fetchSender_Unique_Id() {
        return this.sender_Unique_Id;
    }
    public String fetchReceiver_Unique_Id() {
        return this.receiver_Unique_Id;
    }
    public String fetchUnique_id_to_be_inserted() {
        return this.unique_id_to_be_inserted;
    }
    public String fetchCredit_or_debit_to_be_inserted() {
        return this.credit_or_debit_to_be_inserted;
    }
    public String fetchUPI_Reference_Number_table_9() {
        return this.UPI_Reference_Number_table_9;
    }
    public String fetchTransaction_Date_table_9() {
        return this.Transaction_Date_table_9;
    }
    public String fetchTransaction_Time_table_9() {
        return this.Transaction_Time_table_9;
    }
    public Double fetchTransaction_Amount_table_9() {
        return this.Transaction_Amount_table_9;
    }
    public String fetchCredit_or_Debit_table_9(int i) {
        return this.Credit_or_Debit_table_9[i];
    }
    public String fetchDescription_Subject_table_9() {
        return this.description_table_9;
    }
    public String fetchSender_UPI_ID_table_9() {
        return this.Sender_UPI_ID_table_9;
    }
    public String fetchReceiver_UPI_ID_table_9() {
        return this.Receiver_UPI_ID_table_9;
    }
    public String fetchTransaction_Status_table_9() {
        return this.Transaction_Status_table_7;
    }
    public String fetchTransaction_Failure_Log_table_9() {
        return this.Transaction_Failure_Log_table_7;
    }
}
public class RDFC {
    private static JTextField jtfa, jtfb, jtfc, jtfd, jtfe, jtff, jtfg, jtfh, jtfi, jtfj, jtfk, amountTextField;
    private static JTextPane verificationStatus = null;
    private static JLabel enterAmountToBeSent = null;
    private static JTextArea description_Text_Area = null;
    private static JPasswordField jpfa, jpfb;
    private static JButton jba, jbb, newRegistrationButton, logOut, atm, lifeInsurance, quickTransfer, contactUs, emi, upi, requestMoney, transferMoney, sip_fd_stocks, accSecurity, accDetails, updateDetails, resetButton, finishButton, withdraw, changeATMpin, updateCardType, deposit, miniStatement, unblock_blockATMCard, balanceEnquiry, enable_disableATMCard, backtoMainMenu, forgot, next, showResults, reSearch, verifyUPI, verifyNB, verifyATM, send, back;
    private static MaskFormatter mfa, mfb, mfc, mfd, mfe, mff, mfg;
    private static JFormattedTextField jftfa, jftfb, jftfc, jftfd, jftfe, jftff, jftfg, from, to;
    private static JComboBox<String> honorificComboBox=null, genderComboBox=null, maritalComboBox=null, parentalComboBox=null, accountTypeComboBox=null, nriOrResidentialComboBox=null, atmCardTypesComboBox=null, atmCardAssociationComboBox=null;
    private static JCheckBox ATMCheckBox=null, NBSCheckBox=null, UPICheckBox=null, PayTmCheckBox=null, PhonePeCheckBox=null, GooglePayCheckBox=null, BharatPeCheckBox=null;
    private static JTable transactionTable = null;
    private static JScrollPane transactionScrollPane = null;
    private static AccountRegistrationDetails ard = new AccountRegistrationDetails();
    private static CurrentUserLogin cul = new CurrentUserLogin();
    private static CurrentUserATM cuatm = new CurrentUserATM();
    private static HandleATMTransactions hat = new HandleATMTransactions();
    private static CurrentUserUPI cuupi = new CurrentUserUPI();
    private static HandleUPITransactions hut = new HandleUPITransactions();
    private static CompletableFuture<Void> fromMain_II = new CompletableFuture<>();
    private static CompletableFuture<Void> fromMain_III = new CompletableFuture<>();
    

    
    private static RDFC initiate = null;
    public static void main(String[] args) throws ParseException, ClassNotFoundException, SQLException {
        RDFC initiate = new RDFC();
        initiate.mainWindow(null);
    }
    public void mainWindow(Runnable callback) throws ParseException, ClassNotFoundException, SQLException {
        JFrame frame = new JFrame(new FinalStrings().bankNamePre());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().mainWindowHeadingTop());
        panel.add(heading);
        
        vSpace(panel, new JTextPane(), 60);
        
        JTextPane rowI = new JTextPane();
        rowI.setContentType("text/html");
        rowI.setEditable(false);
        rowI.setText(new FrameText().custID());
        panel.add(rowI);

        vSpace(panel, new JTextPane(), 10);
        
        jtfa = JTextF(panel, 500, 45,0);
        shiftByPixel(panel, new JTextPane(), 230);
        
        vSpace(panel, new JTextPane(), 45);
        
        JTextPane PasswordLabel = new JTextPane();
        PasswordLabel.setContentType("text/html");
        PasswordLabel.setEditable(false);
        PasswordLabel.setText(new FrameText().passwordID());
        panel.add(PasswordLabel);
        
        vSpace(panel, new JTextPane(), 10);
        
        JPasswordField passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(500, 45));
        passwordField.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
        passwordField.setMargin(new Insets(10, 30, 10, 30));
        passwordField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkFields(0);
            }
            
            @Override
            public void removeUpdate(DocumentEvent e) {
                checkFields(0);
            }
            
            @Override
            public void changedUpdate(DocumentEvent e) {
                checkFields(0);
            }
        });
        jpfa = passwordField;
        panel.add(passwordField);
        
        shiftByPixel(panel, new JTextPane(), 230);
        
        vSpace(panel, new JTextPane(), 30);
        
        
        
        newRegistrationButton = new JButton("Open Account, Register!");
        newRegistrationButton.setEnabled(true);
        newRegistrationButton.setPreferredSize(new Dimension(200, 35));
        newRegistrationButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        newRegistrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                
                    SwingUtilities.invokeLater(()->{
                        try {
                            initiate.accountRegistrationWindowI(() -> {
                                try {
                                    initiate.accountRegistrationWindowII(() -> {
                                        try {
                                            initiate.accountRegistrationWindowIII(() -> {
                                                initiate.minorParentalRegistration(() -> {
                                                    initiate.intakeResidualDetail(() -> {
                                                        initiate.intakePassword(() -> {
                                                            try {
                                                                initiate.insertNewUser(()->{});
                                                            } catch (ClassNotFoundException | SQLException e1) {
                                                                e1.printStackTrace();
                                                            }
                                                        });
                                                    });
                                                });
                                            });
                                        } catch (ParseException e1) {
                                            e1.printStackTrace();
                                        }
                                    });
                                } catch (ParseException e1) {
                                    e1.printStackTrace();
                                    }
                            });
                        } catch (ParseException e1) {
                            e1.printStackTrace();
                        }
                    });

                    fromMain_II.thenRun(()->{
                        try {
                            main(null);
                        } catch (ClassNotFoundException | ParseException | SQLException e1) {
                            e1.printStackTrace();
                        }
                        callback.run();
                    });
            }
        });
        panel.add(newRegistrationButton);


        
        shiftByPixel(panel, new JTextPane(), -70);


        JButton submitButton = new JButton("Login");
        submitButton.setEnabled(false);
        submitButton.setPreferredSize(new Dimension(150, 35));
        submitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String receivedID = jtfa.getText();
                String password = new String(passwordField.getPassword());
                ard.setUserIdWhileLogin(receivedID);
                ard.setUserPasswordWhileLogin(password);
                
                jtfa.setText("");
                passwordField.setText("");

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                } catch (ClassNotFoundException e3) {
                    e3.printStackTrace();
                }

                String url = "jdbc:mysql://localhost:3306/bankingsystemsimulation";
                String username = "your_mysql_database_user_id";
                String _password = "your_mysql_database_password";
                
                try (Connection con = DriverManager.getConnection(url, username, _password)) {
                    System.out.println("Connection Established");
                    String query = "select * from newUserRegistration where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
                    Statement st = con.createStatement();
                    ResultSet rs =  st.executeQuery(query);
                    String db_custId = null, db_password=null, db_honorific = null, db_fName = null, db_mName = null, db_lName = null;
                    while(rs.next()) {
                        db_custId = rs.getString("Customer Auto-Generated ID");
                        db_password = rs.getString("Customer Password");
                        db_honorific = rs.getString("Customer Honorific");
                        db_fName = rs.getString("Customer First Name");
                        db_mName = rs.getString("Customer Middle Name");
                        db_lName = rs.getString("Customer Last Name");
                    }
                    if(db_password.trim().equals(ard.fetchUserPasswordWhileLogin().trim())) {
                        setGlassPaneView(frame, true);
                        showLoadingScreen("Logging in...", 1500);
                        setGlassPaneView(frame, false);
                        cul.setCurrentUserId(db_custId);
                        if(db_mName=="") {
                            cul.setCurrentUserName(db_honorific+" "+db_fName+" "+db_mName+" "+db_lName);
                        } else {
                            cul.setCurrentUserName(db_honorific+" "+db_fName+" "+db_lName);
                        }
                        fromMain_III.complete(null);
                        fromMain_III.thenRun(()->{
                            afterLogin();
                        });
                        frame.dispose();
                    }
                    else if(db_password.trim().equals(ard.fetchUserPasswordWhileLogin().trim())/* && db_status.trim().equals("Disabled") */) {
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:14pt; color:Red;'>"+"<b>Your Account is Disabled</b></div></html>", "Failure", JOptionPane.ERROR_MESSAGE);
                    } 
                    else if(!db_password.trim().equals(ard.fetchUserPasswordWhileLogin().trim())) {
                        showLoadingScreen("Logging in...", 1500);
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:14pt; color:Red;'>"+"<b>Login Failed : Incorrect Password</b></div></html>", "Failure", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        jba = submitButton;
        panel.add(submitButton);
        
        shiftByPixel(panel, new JTextPane(), 235);
        
        vSpace(panel, new JTextPane(), 100);
        
        frame.pack();

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        frame.setVisible(true);
    }

    public void accountRegistrationWindowI(Runnable callback) throws ParseException {
        JFrame frame = new JFrame(new FinalStrings().bankNamePre());
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().accountRegistrationWindowHeadingTop());
        panel.add(heading);
        
        vSpace(panel, new JTextPane(), 60);
        
        JTextPane rowI = new JTextPane();
        rowI.setContentType("text/html");
        rowI.setEditable(false);
        rowI.setText(new FrameText().regCustWindowIRowI());
        panel.add(rowI);

        vSpace(panel, new JTextPane(), 10);
        
        shiftByPixel(panel, new JTextPane(), -155);
        String[] honorifics = {"Select Honorific", "Mr.", "Ms.", "Mrs."};
        honorificComboBox = new JComboBox<>(honorifics);
        honorificComboBox.setSelectedItem("Select Honorific");
        honorificComboBox.setPreferredSize(new Dimension(200, 35));
        panel.add(honorificComboBox);
        honorificComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkFields(1);
            }
        });

        shiftByPixel(panel, new JTextPane(), -83);
        jtfc = JTextF(panel, 200, 35, 1);
        jtfc.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkFields(1);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkFields(1);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkFields(1);
            }
        });
        shiftByPixel(panel, new JTextPane(), -60);

        jtfd = JTextF(panel, 200, 35, 1);
        shiftByPixel(panel, new JTextPane(), -45);

        jtfe = JTextF(panel, 200, 35, 1);
        jtfe.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkFields(1);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkFields(1);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkFields(1);
            }
        });
        
        vSpace(panel, new JTextPane(), 45);

        JTextPane rowII = new JTextPane();
        rowII.setContentType("text/html");
        rowII.setEditable(false);
        rowII.setText(new FrameText().regCustWindowIRowII());
        panel.add(rowII);
        
        vSpace(panel, new JTextPane(), 10);
        
        shiftByPixel(panel, new JTextPane(), -155);
        
        try {   
            mfa = new MaskFormatter("##-##-####");
            jftfa = new JFormattedTextField(mfa);
            jftfa.setPreferredSize(new Dimension(200, 35));
            jftfa.setMargin(new Insets(0, 50, 0, 0));
            jftfa.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
            jftfa.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    checkFields(1);
                }
            
                @Override
                public void removeUpdate(DocumentEvent e) {
                    checkFields(1);
                }
            
                @Override
                public void changedUpdate(DocumentEvent e) {
                    checkFields(1);
                }
            });
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        frame.getContentPane().add(jftfa);
        
        shiftByPixel(panel, new JTextPane(), -83);

        try {   
            mfb = new MaskFormatter("#### #### ####");
            jftfb = new JFormattedTextField(mfb);
            jftfb.setPreferredSize(new Dimension(200, 35));
            jftfb.setMargin(new Insets(0, 40, 0, 0));
            jftfb.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
            jftfb.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    checkFields(1);
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    checkFields(1);
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    checkFields(1);
                }
            });
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        frame.getContentPane().add(jftfb);

        shiftByPixel(panel, new JTextPane(), -60);

        try {   
            mfc = new MaskFormatter("UUUUU####U");
            jftfc = new JFormattedTextField(mfc);
            jftfc.setPreferredSize(new Dimension(200, 35));
            jftfc.setMargin(new Insets(0, 40, 0, 0));
            jftfc.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
            jftfc.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    checkFields(1);
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    checkFields(1);
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    checkFields(1);
                }
            });
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        frame.getContentPane().add(jftfc);

        shiftByPixel(panel, new JTextPane(), -45);

        String[] genders = {"Select Gender", "Male", "Female", "Others"};
        genderComboBox = new JComboBox<>(genders);
        genderComboBox.setSelectedItem("Select Gender");
        genderComboBox.setPreferredSize(new Dimension(200, 35));
        panel.add(genderComboBox);
        genderComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkFields(1);
            }
        });

        vSpace(panel, new JTextPane(), 45);

        JTextPane rowIII = new JTextPane();
        rowIII.setContentType("text/html");
        rowIII.setEditable(false);
        rowIII.setText(new FrameText().regCustWindowIRowIII());
        panel.add(rowIII);
        
        vSpace(panel, new JTextPane(), 10);

        shiftByPixel(panel, new JTextPane(), -155);
        jtff = JTextF(panel, 200, 35, 1);
        jtff.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkFields(1);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkFields(1);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkFields(1);
            }
        });
        

        shiftByPixel(panel, new JTextPane(), -83);
        
        try {   
            mfd = new MaskFormatter("##########");
            jftfd = new JFormattedTextField(mfd);
            jftfd.setPreferredSize(new Dimension(200, 35));
            jftfd.setMargin(new Insets(0, 10, 0, 0));
            jftfd.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
            jftfd.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    checkFields(1);
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    checkFields(1);
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    checkFields(1);
                }
            });
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        frame.getContentPane().add(jftfd);

        shiftByPixel(panel, new JTextPane(), -60);
        try {   
            mfe = new MaskFormatter("##########");
            jftfe = new JFormattedTextField(mfe);
            jftfe.setPreferredSize(new Dimension(200, 35));
            jftfe.setMargin(new Insets(0, 10, 0, 0));
            jftfe.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
            jftfe.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    checkFields(1);
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    checkFields(1);
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    checkFields(1);
                }
            });
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        frame.getContentPane().add(jftfe);
        shiftByPixel(panel, new JTextPane(), -45);

        String[] maritalStatus = {"Select Marital Status", "Single", "Married", "Divorced"};
        maritalComboBox = new JComboBox<>(maritalStatus);
        maritalComboBox.setSelectedItem("Select Marital Status");
        maritalComboBox.setPreferredSize(new Dimension(200, 35));
        panel.add(maritalComboBox);
        maritalComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkFields(1);
            }
        });
        vSpace(panel, new JTextPane(), 60);

        shiftByPixel(panel, new JTextPane(), -185);
        
        JButton resetButton = new JButton("Reset");
        resetButton.setEnabled(true);
        resetButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        resetButton.setPreferredSize(new Dimension(170, 40));
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                honorificComboBox.setSelectedIndex(0);
                jtfc.setText("");
                jtfd.setText("");
                jtfe.setText("");
                jftfa.setValue(null);
                jftfb.setValue(null);
                jftfc.setValue(null);
                genderComboBox.setSelectedIndex(0);
                jtff.setText("");
                jftfd.setValue(null);
                jftfe.setValue(null);
                maritalComboBox.setSelectedIndex(0);
                
            }
        });
        panel.add(resetButton);
        
       

        shiftByPixel(panel, new JTextPane(), 695);

        JButton submitButton = new JButton("Next >");
        submitButton.setEnabled(false);
        submitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        submitButton.setPreferredSize(new Dimension(170, 40));
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ard.setHonorific((String) honorificComboBox.getSelectedItem());
                ard.setFName(jtfc.getText());
                ard.setMName(jtfd.getText());
                ard.setLName(jtfe.getText());
                ard.setDOB(jftfa.getText());

                if(evauateAge(jftfa.getText())==false) {
                    JOptionPane.showMessageDialog(null, "You Are Minor, Your Parents/Guarduan Details Will Be Needed For Futher Processings");
                    ard.setAgeStatus('m');
                } else {
                    ard.setAgeStatus('M');
                }

                ard.setAadhar(jftfb.getText().replaceAll("\\s", ""));
                ard.setPan(jftfc.getText());
                ard.setGender((String) genderComboBox.getSelectedItem());
                ard.setEmail(jtff.getText());
                ard.setPhno1(jftfd.getText());
                ard.setPhno2(jftfe.getText());
                ard.setMarital((String) maritalComboBox.getSelectedItem());
                
                honorificComboBox.setSelectedIndex(0);
                jtfc.setText("");
                jtfd.setText("");
                jtfe.setText("");
                jftfa.setValue(null);
                jftfb.setValue(null);
                jftfc.setValue(null);
                genderComboBox.setSelectedIndex(0);
                jtff.setText("");
                jftfd.setValue(null);
                jftfe.setValue(null);
                maritalComboBox.setSelectedIndex(0);
                
                frame.dispose();
                callback.run();
            }
        });
        jbb = submitButton;
        panel.add(submitButton);
                

        JTextPane footer = new JTextPane();
        footer.setContentType("text/html");
        footer.setEditable(false);
        footer.setText(new FrameText().regCustWindowIRowIV());
        panel.add(footer);
        
        frame.pack();
        
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setVisible(true);
    }
    public void accountRegistrationWindowII(Runnable callback) throws ParseException {
        JFrame frame = new JFrame(new FinalStrings().bankNamePre());
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().accountRegistrationWindowHeadingTop());
        panel.add(heading);

        vSpace(panel, new JTextPane(), 20);
        
        JTextPane subHeading = new JTextPane();
        subHeading.setContentType("text/html");
        subHeading.setEditable(false);
        subHeading.setText(new FrameText().regCustWindowIITop());
        panel.add(subHeading);

        shiftByPixel(panel, subHeading, 900);
        
        vSpace(panel, new JTextPane(), 20);

        JTextPane rowI = new JTextPane();
        rowI.setContentType("text/html");
        rowI.setEditable(false);
        rowI.setText(new FrameText().regCustWindowIIRowI());
        panel.add(rowI);
        
        vSpace(panel, new JTextPane(), 10);
        
        shiftByPixel(panel, new JTextPane(), -155);
        
        jtfa = JTextF(panel, 200, 35, 2);
        
        shiftByPixel(panel, new JTextPane(), -83);
        jtfb = JTextF(panel, 200, 35, 2);
        
        shiftByPixel(panel, new JTextPane(), -60);
        
        jtfc = JTextF(panel, 200, 35, -1);
        
        shiftByPixel(panel, new JTextPane(), -45);
        
        jtfd = JTextF(panel, 200, 35, 2);
        
        vSpace(panel, new JTextPane(), 45);
        
        JTextPane rowII = new JTextPane();
        rowII.setContentType("text/html");
        rowII.setEditable(false);
        rowII.setText(new FrameText().regCustWindowIIRowII());
        panel.add(rowII);
        
        vSpace(panel, new JTextPane(), 10);
        
        shiftByPixel(panel, new JTextPane(), -155);
        
        jtfe = JTextF(panel, 200, 35, 2);
        
        shiftByPixel(panel, new JTextPane(), -83);
        
        jtff = JTextF(panel, 200, 35, 2);
        
        shiftByPixel(panel, new JTextPane(), -60);
        
        jtfg = JTextF(panel, 200, 35, -1);
        jtfg.setText("India");
        jtfg.setEditable(false);
        jtfg.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        shiftByPixel(panel, new JTextPane(), -45);
        
        jtfh = JTextF(panel, 200, 35, 2);
        
        
        vSpace(panel, new JTextPane(), 45);
        
        
        JTextPane rowIII = new JTextPane();
        rowIII.setContentType("text/html");
        rowIII.setEditable(false);
        rowIII.setText(new FrameText().regCustWindowIIRowIII());
        panel.add(rowIII);
        
        vSpace(panel, new JTextPane(), 10);
        
        shiftByPixel(panel, new JTextPane(), -150);
        jtfi = JTextF(panel, 200, 35, 2);
        
        
        shiftByPixel(panel, new JTextPane(), -83);
        
        jtfj = JTextF(panel, 200, 35, 2);
        

        shiftByPixel(panel, new JTextPane(), -60);
        jtfk = JTextF(panel, 580, 35, 2);
        
        shiftByPixel(panel, new JTextPane(), -45);
        
        vSpace(panel, new JTextPane(), 60);
        
        shiftByPixel(panel, new JTextPane(), -185);
        
        JButton resetButton = new JButton("Reset");
        resetButton.setEnabled(true);
        resetButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        resetButton.setPreferredSize(new Dimension(170, 40));
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtfa.setText("");
                jtfb.setText("");
                jtfc.setText("");
                jtfd.setText("");
                jtfe.setText("");
                jtff.setText("");
                jtfh.setText("");
                jtfi.setText("");
                jtfj.setText("");
                jtfk.setText("");
                
            }
        });
        panel.add(resetButton);

       
        
        shiftByPixel(panel, new JTextPane(), 695);
        
        JButton submitButton = new JButton("Next >");
        submitButton.setEnabled(false);
        submitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        submitButton.setPreferredSize(new Dimension(170, 40));
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String receivedHouseNo = jtfa.getText();
                String receivedWardNo = jtfb.getText();
                String receivedArea = jtfc.getText();
                String receivedCity = jtfd.getText();
                String receivedDistrict = jtfe.getText();
                String receivedState = jtff.getText();
                String receivedCountry = jtfg.getText();
                String receivedPostOffice = jtfh.getText();
                String receivedPoliceStation = jtfi.getText();
                String receivedPincode = jtfj.getText();
                String receivedLandmark = jtfk.getText();
                
                ard.setResidentialHouseNo(receivedHouseNo);
                ard.setResidentialWardNo(receivedWardNo);
                ard.setResidentialArea(receivedArea);
                ard.setResidentialCity(receivedCity);
                ard.setResidentialDistrict(receivedDistrict);
                ard.setResidentialState(receivedState);
                ard.setResidentialCountry(receivedCountry);
                ard.setResidentialPostOffice(receivedPostOffice);
                ard.setResidentialPoliceStation(receivedPoliceStation);
                ard.setResidentialPincode(receivedPincode);
                ard.setResidentialLandmark(receivedLandmark);
                
                jtfa.setText("");
                jtfb.setText("");
                jtfc.setText("");
                jtfd.setText("");
                jtfe.setText("");
                jtff.setText("");
                jtfh.setText("");
                jtfi.setText("");
                jtfj.setText("");
                jtfk.setText("");

                frame.dispose();
                callback.run();
            }
        });
        jbb = submitButton;
        panel.add(submitButton);
                
        
        JTextPane footer = new JTextPane();
        footer.setContentType("text/html");
        footer.setEditable(false);
        footer.setText(new FrameText().regCustWindowIIRowIV());
        panel.add(footer);
        
        frame.pack();

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setVisible(true);
    }
    public void accountRegistrationWindowIII(Runnable callback) throws ParseException {
        JFrame frame = new JFrame(new FinalStrings().bankNamePre());
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().accountRegistrationWindowHeadingTop());
        panel.add(heading);
        
        vSpace(panel, new JTextPane(), 20);
        
        JTextPane subHeading = new JTextPane();
        subHeading.setContentType("text/html");
        subHeading.setEditable(false);
        subHeading.setText(new FrameText().regCustWindowIIITop());
        panel.add(subHeading);
        
        
        JCheckBox checkBox = new JCheckBox("Same as Residential Address");
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    int choice = JOptionPane.showConfirmDialog(null, "Shall we move further?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    if (choice == JOptionPane.YES_OPTION) {
                        jtfa.setText(ard.fetchResidentialHouseNo());
                        jtfa.setEnabled(false);

                        jtfb.setText(ard.fetchResidentialWardNo());
                        jtfb.setEnabled(false);

                        jtfc.setText(ard.fetchResidentialArea());
                        jtfc.setEnabled(false);

                        jtfd.setText(ard.fetchResidentialCity());
                        jtfd.setEnabled(false);

                        jtfe.setText(ard.fetchResidentialDistrict());
                        jtfe.setEnabled(false);
                        
                        jtff.setText(ard.fetchResidentialState());
                        jtff.setEnabled(false);

                        jtfh.setText(ard.fetchResidentialPostOffice());
                        jtfh.setEnabled(false);

                        jtfi.setText(ard.fetchResidentialPoliceStation());
                        jtfi.setEnabled(false);
                        
                        jtfj.setText(ard.fetchResidentialPincode());
                        jtfj.setEnabled(false);

                        jtfk.setText(ard.fetchResidentialLandmark());
                        jtfk.setEnabled(false);
                        
                        ard.setPermanentHouseNo(ard.fetchResidentialHouseNo());
                        ard.setPermanentWardNo(ard.fetchResidentialWardNo());
                        ard.setPermanentArea(ard.fetchResidentialArea());
                        ard.setPermanentCity(ard.fetchResidentialCity());
                        ard.setPermanentDistrict(ard.fetchResidentialDistrict());
                        ard.setPermanentState(ard.fetchResidentialState());
                        ard.setPermanentCountry(ard.fetchResidentialCountry());
                        ard.setPermanentPostOffice(ard.fetchResidentialPostOffice());
                        ard.setPermanentPoliceStation(ard.fetchResidentialPoliceStation());
                        ard.setPermanentPincode(ard.fetchResidentialPincode());
                        ard.setPermanentLandmark(ard.fetchResidentialLandmark());

                        frame.dispose();
                        callback.run();
                        
                    }
                } else {
                    jtfa.setText("");
                    jtfa.setEnabled(true);

                    jtfb.setText("");
                    jtfb.setEnabled(true);

                    jtfc.setText("");
                    jtfc.setEnabled(true);

                    jtfd.setText("");
                    jtfd.setEnabled(true);

                    jtfe.setText("");
                    jtfe.setEnabled(true);

                    jtff.setText("");
                    jtff.setEnabled(true);

                    jtfh.setText("");
                    jtfh.setEnabled(true);

                    jtfi.setText("");
                    jtfi.setEnabled(true);
                        
                    jtfj.setText("");
                    jtfj.setEnabled(true);

                    jtfk.setText("");
                    jtfk.setEnabled(true);
                }
            }
        });
        frame.getContentPane().add(checkBox);
    
    
        shiftByPixel(panel, subHeading, 800);
        
        vSpace(panel, new JTextPane(), 20);
        
        JTextPane rowI = new JTextPane();
        rowI.setContentType("text/html");
        rowI.setEditable(false);
        rowI.setText(new FrameText().regCustWindowIIRowI());
        panel.add(rowI);
        
        vSpace(panel, new JTextPane(), 10);
        
        shiftByPixel(panel, new JTextPane(), -155);
        
        jtfa = JTextF(panel, 200, 35, 2);
        
        shiftByPixel(panel, new JTextPane(), -83);
        jtfb = JTextF(panel, 200, 35, 2);
        
        shiftByPixel(panel, new JTextPane(), -60);
        
        jtfc = JTextF(panel, 200, 35, -1);
        
        shiftByPixel(panel, new JTextPane(), -45);
        
        jtfd = JTextF(panel, 200, 35, 2);
        
        vSpace(panel, new JTextPane(), 45);
        
        JTextPane rowII = new JTextPane();
        rowII.setContentType("text/html");
        rowII.setEditable(false);
        rowII.setText(new FrameText().regCustWindowIIRowII());
        panel.add(rowII);
        
        vSpace(panel, new JTextPane(), 10);
        
        shiftByPixel(panel, new JTextPane(), -155);
        
        jtfe = JTextF(panel, 200, 35, 2);
        
        shiftByPixel(panel, new JTextPane(), -83);
        
        jtff = JTextF(panel, 200, 35, 2);
        
        shiftByPixel(panel, new JTextPane(), -60);
        
        jtfg = JTextF(panel, 200, 35, -1);
        jtfg.setText("India");
        jtfg.setEditable(false);
        jtfg.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        
        shiftByPixel(panel, new JTextPane(), -45);
        
        jtfh = JTextF(panel, 200, 35, 2);
        
        vSpace(panel, new JTextPane(), 45);
        
        JTextPane rowIII = new JTextPane();
        rowIII.setContentType("text/html");
        rowIII.setEditable(false);
        rowIII.setText(new FrameText().regCustWindowIIRowIII());
        panel.add(rowIII);

        vSpace(panel, new JTextPane(), 10);
        
        shiftByPixel(panel, new JTextPane(), -150);
        jtfi = JTextF(panel, 200, 35, 2);

        
        shiftByPixel(panel, new JTextPane(), -83);
        
        jtfj = JTextF(panel, 200, 35, 2);
        
        shiftByPixel(panel, new JTextPane(), -60);
        jtfk = JTextF(panel, 580, 35, 2);
        
        shiftByPixel(panel, new JTextPane(), -45);

        vSpace(panel, new JTextPane(), 60);

        shiftByPixel(panel, new JTextPane(), -185);
        
        JButton resetButton = new JButton("Reset");
        resetButton.setEnabled(true);
        resetButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        resetButton.setPreferredSize(new Dimension(170, 40));
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtfa.setText("");
                jtfb.setText("");
                jtfc.setText("");
                jtfd.setText("");
                jtfe.setText("");
                jtff.setText("");
                jtfh.setText("");
                jtfi.setText("");
                jtfj.setText("");
                jtfk.setText("");

            }
        });
        panel.add(resetButton);

        
        
        shiftByPixel(panel, new JTextPane(), 695);
        
        JButton submitButton = new JButton("Submit");
        submitButton.setEnabled(false);
        submitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        submitButton.setPreferredSize(new Dimension(170, 40));
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String receivedHouseNo = jtfa.getText();
                String receivedWardNo = jtfb.getText();
                String receivedArea = jtfc.getText();
                String receivedCity = jtfd.getText();
                String receivedDistrict = jtfe.getText();
                String receivedState = jtff.getText();
                String receivedCountry = jtfg.getText();
                String receivedPostOffice = jtfh.getText();
                String receivedPoliceStation = jtfi.getText();
                String receivedPincode = jtfj.getText();
                String receivedLandmark = jtfk.getText();
                
                ard.setPermanentHouseNo(receivedHouseNo);
                ard.setPermanentWardNo(receivedWardNo);
                ard.setPermanentArea(receivedArea);
                ard.setPermanentCity(receivedCity);
                ard.setPermanentDistrict(receivedDistrict);
                ard.setPermanentState(receivedState);
                ard.setPermanentCountry(receivedCountry);
                ard.setPermanentPostOffice(receivedPostOffice);
                ard.setPermanentPoliceStation(receivedPoliceStation);
                ard.setPermanentPincode(receivedPincode);
                ard.setPermanentLandmark(receivedLandmark);
                
                jtfa.setText("");
                jtfb.setText("");
                jtfc.setText("");
                jtfd.setText("");
                jtfe.setText("");
                jtff.setText("");
                jtfh.setText("");
                jtfi.setText("");
                jtfj.setText("");
                jtfk.setText("");

                frame.dispose();
                callback.run();
            }
        });
        jbb = submitButton;
        panel.add(submitButton);
                
        
        JTextPane footer = new JTextPane();
        footer.setContentType("text/html");
        footer.setEditable(false);
        footer.setText(new FrameText().regCustWindowIIIRowIV());
        panel.add(footer);
        
        frame.pack();
        
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        frame.setVisible(true);
    }
    private void minorParentalRegistration(Runnable callback) {
        JFrame frame = new JFrame(new FinalStrings().bankNamePre());
        if(ard.fetchAgeStatus()=='m') {
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            frame.setResizable(false);
            
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            panel.setBackground(Color.white);
            frame.setContentPane(panel);
            
            JTextPane heading = new JTextPane();
            heading.setContentType("text/html");
            heading.setEditable(false);
            heading.setText(new FrameText().accountRegistrationWindowHeadingTop());
            panel.add(heading);
            
            vSpace(panel, new JTextPane(), 20);
            
            JTextPane subHeading = new JTextPane();
            subHeading.setContentType("text/html");
            subHeading.setEditable(false);
            subHeading.setText(new FrameText().regMinorWindowIVTop());
            panel.add(subHeading);
            
            shiftByPixel(panel, subHeading, 800);    
            
            vSpace(panel, new JTextPane(), 20);
            
            JTextPane rowI = new JTextPane();
            rowI.setContentType("text/html");
            rowI.setEditable(false);
            rowI.setText(new FrameText().regMinorWindowIVRowI());
            panel.add(rowI);
            
            vSpace(panel, new JTextPane(), 10);
            
            shiftByPixel(panel, new JTextPane(), -155);
            
            String[] GuardianOrRelativeOrParent = {"Select Parental Preference", "Parent", "Relative", "Guardian"};
            parentalComboBox = new JComboBox<>(GuardianOrRelativeOrParent);
            parentalComboBox.setSelectedItem("Select Parental Preference");
            parentalComboBox.setPreferredSize(new Dimension(200, 35));
            panel.add(parentalComboBox);
            parentalComboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    checkFields(4);
                }
            });
            
            
            shiftByPixel(panel, new JTextPane(), -83);
            jtfb = JTextF(panel, 200, 35, -1);
            jtfb.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            
                @Override
                public void removeUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            
                @Override
                public void changedUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            });
            
            shiftByPixel(panel, new JTextPane(), 520);
            
            vSpace(panel, new JTextPane(), 45);
        
            JTextPane rowII = new JTextPane();
            rowII.setContentType("text/html");
            rowII.setEditable(false);
            rowII.setText(new FrameText().regMinorWindowIVRowII());
            panel.add(rowII);
            
            vSpace(panel, new JTextPane(), 10);
            
            shiftByPixel(panel, new JTextPane(), -155);
            
            String[] honorifics = {"Select Honorific", "Mr.", "Ms.", "Mrs."};
            honorificComboBox = new JComboBox<>(honorifics);
            honorificComboBox.setSelectedItem("Select Honorific");
            honorificComboBox.setPreferredSize(new Dimension(200, 35));
            panel.add(honorificComboBox);
            honorificComboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    checkFields(4);
                }
            });
        
            
            shiftByPixel(panel, new JTextPane(), -83);
            
            jtff = JTextF(panel, 200, 35, -1);
            jtff.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            
                @Override
                public void removeUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            
                @Override
                public void changedUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            });
            
            shiftByPixel(panel, new JTextPane(), -60);
            
            jtfg = JTextF(panel, 200, 35, -1);
            jtfg.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            
                @Override
                public void removeUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            
                @Override
                public void changedUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            });
        
            shiftByPixel(panel, new JTextPane(), -45);
        
            jtfh = JTextF(panel, 200, 35, -1);
            jtfh.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    checkFields(4);
                }
                
                @Override
                public void removeUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            
                @Override
                public void changedUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            });
            
        
            vSpace(panel, new JTextPane(), 45);
        
            
            JTextPane rowIII = new JTextPane();
            rowIII.setContentType("text/html");
            rowIII.setEditable(false);
            rowIII.setText(new FrameText().regMinorWindowIVRowIII());
            panel.add(rowIII);
            
            vSpace(panel, new JTextPane(), 10);
            
            shiftByPixel(panel, new JTextPane(), -150);
            jtfi = JTextF(panel, 580, 35, -1);
            jtfi.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            
                @Override
                public void removeUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            
                @Override
                public void changedUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            });
        
        
            shiftByPixel(panel, new JTextPane(), -90);
            jtfk = JTextF(panel, 580, 35, -1);
            jtfk.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            
                @Override
                public void removeUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            
                @Override
                public void changedUpdate(DocumentEvent e) {
                    checkFields(4);
                }
            });
        
            vSpace(panel, new JTextPane(), 60);
        
            shiftByPixel(panel, new JTextPane(), -185);
        
            JButton resetButton = new JButton("Reset");
            resetButton.setEnabled(true);
            resetButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            resetButton.setPreferredSize(new Dimension(170, 40));
            resetButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    parentalComboBox.setSelectedIndex(0);
                    honorificComboBox.setSelectedIndex(0);
                    jtfb.setText("");
                    jtff.setText("");
                    jtfg.setText("");
                    jtfh.setText("");
                    jtfi.setText("");
                    jtfk.setText("");
                    
                }
            });
            panel.add(resetButton);
        
        
            
            shiftByPixel(panel, new JTextPane(), 695);
        
            JButton submitButton = new JButton("Submit");
            submitButton.setEnabled(false);
            submitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            submitButton.setPreferredSize(new Dimension(170, 40));
            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                
                    ard.setReceivedParentalPreference((String) parentalComboBox.getSelectedItem());
                    ard.setReceivedParentalRelation(jtfb.getText());
                    ard.setReceivedParentalHonorific((String) honorificComboBox.getSelectedItem());
                    ard.setReceivedParentalFName(jtff.getText());
                    ard.setReceivedParentalMName(jtfg.getText());
                    ard.setReceivedParentalLName(jtfh.getText());
                    ard.setReceivedParentalPhno(jtfi.getText());
                    ard.setReceivedParentalAadhar(jtfk.getText());
                    
                    parentalComboBox.setSelectedIndex(0);
                    jtfb.setText("");
                    honorificComboBox.setSelectedIndex(0);
                    jtff.setText("");
                    jtfg.setText("");
                    jtfh.setText("");
                    jtfi.setText("");
                    jtfk.setText("");
                    
                    frame.dispose();
                    callback.run();
                }
            });
            jbb = submitButton;
            panel.add(submitButton);
                    
            
            frame.pack();
            
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            
            frame.setVisible(true);
        } else {
            frame.dispose();
            callback.run();
        }

    }
    public void intakeResidualDetail(Runnable callback) {
        Boolean [] indication = new Boolean[6];
        {
            indication[0] = false;
            indication[1] = false;
            indication[2] = false;
            indication[3] = false;
            indication[4] = false;
            indication[5] = false;
        }
        JFrame frame = new JFrame("Setting Account Properties");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 10);

        JTextPane separator_I = new JTextPane();
        separator_I.setContentType("text/html");
        separator_I.setEditable(false);
        separator_I.setText(new FrameText().separator_I());
        panel.add(separator_I);

        vSpace(panel, new JTextPane(), 5);


        JTextPane textRowI = new JTextPane();
        textRowI.setContentType("text/html");
        textRowI.setEditable(false);
        textRowI.setText(new FrameText().textRow_I());
        panel.add(textRowI);        

        vSpace(panel, new JTextPane(), 10);

        String[] accountTypes = {"Select Account Type", "Saving", "Current", "Student", "BPL (Below Poverty Line)"};
        accountTypeComboBox = new JComboBox<>(accountTypes);
        accountTypeComboBox.setSelectedItem("Select Account Type");
        accountTypeComboBox.setPreferredSize(new Dimension(200, 35));
        panel.add(accountTypeComboBox);
        accountTypeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Boolean action = !accountTypeComboBox.getSelectedItem().equals("Select Account Type")?true:false;
                enabler(accountTypeComboBox, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
            }
        });

        shiftByPixel(panel, new JTextPane(), 570);

        String[] nriOrResidential = {"Select Account Origin", "NRI (Non-Resedential Indian)", "Indian Residential"};
        nriOrResidentialComboBox = new JComboBox<>(nriOrResidential);
        nriOrResidentialComboBox.setSelectedItem("Select Account Origin");
        nriOrResidentialComboBox.setPreferredSize(new Dimension(200, 35));
        panel.add(nriOrResidentialComboBox);
        nriOrResidentialComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Boolean action = !nriOrResidentialComboBox.getSelectedItem().equals("Select Account Origin")?true:false;
                enabler(nriOrResidentialComboBox, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
            }
        });
        
        vSpace(panel, new JTextPane(), 20);

        JTextPane separator_II = new JTextPane();
        separator_II.setContentType("text/html");
        separator_II.setEditable(false);
        separator_II.setText(new FrameText().separator_II());
        panel.add(separator_II);

        vSpace(panel, new JTextPane(), 30);

        ATMCheckBox = new JCheckBox("ATM Services");
        ATMCheckBox.setForeground(Color.BLACK);
        ATMCheckBox.setToolTipText("Check to Activate ATM Services");
        ATMCheckBox.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(5, 15, 5, 15), ATMCheckBox.getBorder()));
        ATMCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    indication[0] = true;
                    Boolean action = true;
                    enabler(ATMCheckBox, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
                    jftff.setEnabled(true);
                    atmCardTypesComboBox.setEnabled(true);
                    atmCardAssociationComboBox.setEnabled(true);
                } else {
                    indication[0] = false;
                    Boolean action = false;
                    enabler(ATMCheckBox, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
                }
            }
        });
        frame.getContentPane().add(ATMCheckBox);
        
        shiftByPixel(panel, new JTextPane(), 130+20);

        NBSCheckBox = new JCheckBox("Net Banking Services");
        NBSCheckBox.setSelected(true);
        NBSCheckBox.setEnabled(false);
        NBSCheckBox.setForeground(Color.BLACK);
        NBSCheckBox.setToolTipText("Net Banking Services is By Default Activated");
        NBSCheckBox.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(5, 15, 5, 15), NBSCheckBox.getBorder()));
        frame.getContentPane().add(NBSCheckBox);
        
        shiftByPixel(panel, new JTextPane(), 90);

        UPICheckBox = new JCheckBox("UPI Services");
        UPICheckBox.setForeground(Color.BLACK);
        UPICheckBox.setToolTipText("Check to Activate UPI Services");
        UPICheckBox.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(5, 15, 5, 15), UPICheckBox.getBorder()));
        UPICheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    indication[1] = true;
                    Boolean action = true;
                    enabler(UPICheckBox, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
                    PayTmCheckBox.setEnabled(true);
                    PhonePeCheckBox.setEnabled(true);
                    GooglePayCheckBox.setEnabled(true);
                    BharatPeCheckBox.setEnabled(true);
                    jftfg.setEnabled(true);

                } else {
                    indication[1] = false;
                    Boolean action = false;
                    enabler(UPICheckBox, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
                    PayTmCheckBox.setEnabled(false);
                    PhonePeCheckBox.setEnabled(false);
                    GooglePayCheckBox.setEnabled(false);
                    BharatPeCheckBox.setEnabled(false);
                    jftfg.setEnabled(false);
                }
            }
        });
        frame.getContentPane().add(UPICheckBox);
        
        shiftByPixel(panel, new JTextPane(), -160);

        vSpace(panel, new JTextPane(), 30);
        
        JTextPane separator_III = new JTextPane();
        separator_III.setContentType("text/html");
        separator_III.setEditable(false);
        separator_III.setText(new FrameText().separator_III());
        panel.add(separator_III);
        
        vSpace(panel, new JTextPane(), 20);

        JTextPane textRowII = new JTextPane();
        textRowII.setContentType("text/html");
        textRowII.setEditable(false);
        textRowII.setText(new FrameText().textRow_III());
        panel.add(textRowII);    

        vSpace(panel, new JTextPane(), 5);
        
        try {   
            mff = new MaskFormatter("#  #  #  #");
            jftff = new JFormattedTextField(mff);
            jftff.setEnabled(false);
            jftff.setPreferredSize(new Dimension(200, 35));
            jftff.setMargin(new Insets(0, 60, 0, 0));
            jftff.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
            jftff.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    Boolean action = jftff.getText().trim().length()==10;
                    enabler(jftff, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
                }

                @Override
                public void removeUpdate(DocumentEvent e) {

                }

                @Override
                public void changedUpdate(DocumentEvent e) {

                }
            });
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        frame.getContentPane().add(jftff);

        shiftByPixel(panel, new JTextPane(), -115);

        String[] atmCardTypes = {"Select ATM Card Type", "Debit Card", "Credit Card"};
        atmCardTypesComboBox = new JComboBox<>(atmCardTypes);
        atmCardTypesComboBox.setEnabled(false);
        atmCardTypesComboBox.setSelectedItem("Select ATM Card Type");
        atmCardTypesComboBox.setPreferredSize(new Dimension(200, 35));
        panel.add(atmCardTypesComboBox);
        atmCardTypesComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Boolean action = atmCardTypesComboBox.getSelectedItem()!="Select ATM Card Type";
                enabler(atmCardTypesComboBox, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
            }
        });

        shiftByPixel(panel, new JTextPane(), -100);
        
        String[] atmCardAssociation = {"Select ATM Card Association", "VISA", "PREMIUM", "MILLENIUM", "MASTERCARD"};
        atmCardAssociationComboBox = new JComboBox<>(atmCardAssociation);
        atmCardAssociationComboBox.setEnabled(false);
        atmCardAssociationComboBox.setSelectedItem("Select ATM Card Association");
        atmCardAssociationComboBox.setPreferredSize(new Dimension(200, 35));
        panel.add(atmCardAssociationComboBox);
        atmCardAssociationComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Boolean action = atmCardAssociationComboBox.getSelectedItem()!="Select ATM Card Association";
                enabler(atmCardAssociationComboBox, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
            }
        });
        
        shiftByPixel(panel, new JTextPane(), -65);

        try {   
            mfg = new MaskFormatter("# # # # # #");
            jftfg = new JFormattedTextField(mfg);
            jftfg.setEnabled(false);
            jftfg.setPreferredSize(new Dimension(200, 35));
            jftfg.setMargin(new Insets(0, 55, 0, 0));
            jftfg.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
            jftfg.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    Boolean action = jftfg.getText().trim().length()==11;
                    enabler(jftfg, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
                }

                @Override
                public void removeUpdate(DocumentEvent e) {}

                @Override
                public void changedUpdate(DocumentEvent e) {}
            });
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        frame.getContentPane().add(jftfg);

        vSpace(panel, new JTextPane(), 30);

        PayTmCheckBox = new JCheckBox("PayTm Services");
        PayTmCheckBox.setEnabled(false);
        PayTmCheckBox.setForeground(Color.BLACK);
        PayTmCheckBox.setToolTipText("Check to Activate PayTm Services");
        PayTmCheckBox.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(5, 15, 5, 15), ATMCheckBox.getBorder()));
        PayTmCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    indication[2] = true;
                    Boolean action = true;
                    enabler(PayTmCheckBox, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
                } else {
                    indication[2] = false;
                    Boolean action = false;
                    enabler(PayTmCheckBox, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
                }
            }
        });
        frame.getContentPane().add(PayTmCheckBox);
        
        shiftByPixel(panel, new JTextPane(), -90);

        PhonePeCheckBox = new JCheckBox("PhonePe Services");
        PhonePeCheckBox.setEnabled(false);
        PhonePeCheckBox.setForeground(Color.BLACK);
        PhonePeCheckBox.setToolTipText("Check to Activate PhonePe Services");
        PhonePeCheckBox.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(5, 15, 5, 15), NBSCheckBox.getBorder()));
        PhonePeCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    indication[3] = true;
                    Boolean action = true;
                    enabler(PhonePeCheckBox, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
                } else {
                    indication[3] = false;
                    Boolean action = false;
                    enabler(PhonePeCheckBox, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
                }
            }
        });
        frame.getContentPane().add(PhonePeCheckBox);
        
        shiftByPixel(panel, new JTextPane(), -90);

        GooglePayCheckBox = new JCheckBox("GooglePay Services");
        GooglePayCheckBox.setEnabled(false);
        GooglePayCheckBox.setForeground(Color.BLACK);
        GooglePayCheckBox.setToolTipText("Check to Activate GooglePay Services");
        GooglePayCheckBox.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(5, 15, 5, 15), UPICheckBox.getBorder()));
        GooglePayCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    indication[4] = true;
                    Boolean action = true;
                    enabler(GooglePayCheckBox, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
                } else {
                    indication[4] = false;
                    Boolean action = false;
                    enabler(GooglePayCheckBox, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
                }
            }
        });
        frame.getContentPane().add(GooglePayCheckBox);
        
        shiftByPixel(panel, new JTextPane(), -70);

        BharatPeCheckBox = new JCheckBox("BharatPe Services");
        BharatPeCheckBox.setEnabled(false);
        BharatPeCheckBox.setForeground(Color.BLACK);
        BharatPeCheckBox.setToolTipText("Check to Activate BharatPe Services");
        BharatPeCheckBox.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(5, 15, 5, 15), UPICheckBox.getBorder()));
        BharatPeCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    indication[5] = true;
                    Boolean action = true;
                    enabler(BharatPeCheckBox, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
                } else {
                    indication[5] = false;
                    Boolean action = false;
                    enabler(BharatPeCheckBox, action, indication, accountTypeComboBox, nriOrResidentialComboBox, ATMCheckBox, UPICheckBox, jftff, atmCardTypesComboBox, atmCardAssociationComboBox, jftfg, PayTmCheckBox, PhonePeCheckBox, GooglePayCheckBox, BharatPeCheckBox, resetButton, finishButton);
                }
            }
        });
        frame.getContentPane().add(BharatPeCheckBox);

        vSpace(panel, new JTextPane(), 20);
 
        JTextPane separator_IV = new JTextPane();
        separator_IV.setContentType("text/html");
        separator_IV.setEditable(false);
        separator_IV.setText(new FrameText().separator_IV());
        panel.add(separator_IV);
        
        vSpace(panel, new JTextPane(), 15);

        resetButton = new JButton("Reset");
        resetButton.setEnabled(true);
        resetButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        resetButton.setPreferredSize(new Dimension(200, 35));
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accountTypeComboBox.setSelectedIndex(0);
                nriOrResidentialComboBox.setSelectedIndex(0);
                ATMCheckBox.setSelected(false);
                NBSCheckBox.setSelected(true);
                UPICheckBox.setSelected(false);
                jftff.setText(null);
                atmCardTypesComboBox.setSelectedIndex(0);
                atmCardAssociationComboBox.setSelectedIndex(0);
                jftfg.setText(null);
                PayTmCheckBox.setSelected(false);
                PhonePeCheckBox.setSelected(false);
                GooglePayCheckBox.setSelected(false);
                BharatPeCheckBox.setSelected(false);
            }
        });
        jbb = resetButton;
        panel.add(resetButton);


        shiftByPixel(panel, new JTextPane(), 555);

        finishButton = new JButton("Finish");
        finishButton.setEnabled(false);
        finishButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        finishButton.setPreferredSize(new Dimension(200, 35));
        finishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String accType = (String) accountTypeComboBox.getSelectedItem();
                String nriOrRes = (String) nriOrResidentialComboBox.getSelectedItem();
                String ATMService = ATMCheckBox.isSelected()?"Selected":"Not Selected";
                String NetBankingService = NBSCheckBox.isSelected()?"Selected":"Not Selected";
                String UPIService = UPICheckBox.isSelected()?"Selected":"Not Selected";
                int ATMPin = -1;
                if(false != !(jftff.getText().replaceAll("\\s", "").isEmpty())) {
                    ATMPin = Integer.parseInt(jftff.getText().replaceAll("\\s", ""));
                }
                String ATMCardTypes = (String) atmCardTypesComboBox.getSelectedItem();
                String ATMCardAssociation = (String) atmCardAssociationComboBox.getSelectedItem();
                int UPIPin = -1;
                if(false != !(jftfg.getText().replaceAll("\\s", "").isEmpty())) {
                    UPIPin = Integer.parseInt(jftfg.getText().replaceAll("\\s", ""));
                }
                String PayTmService = PayTmCheckBox.isSelected()?"Selected":"Not Selected";
                String PhonePeService = PhonePeCheckBox.isSelected()?"Selected":"Not Selected";
                String GooglePayService = GooglePayCheckBox.isSelected()?"Selected":"Not Selected";
                String BharatPeService = BharatPeCheckBox.isSelected()?"Selected":"Not Selected";

                if(accType=="BPL (Below Poverty Line)") {
                    ard.setCustomer_Account_Type_table_2("BPL");
                } else {
                    ard.setCustomer_Account_Type_table_2(accType);
                }
                if(nriOrRes=="NRI (Non-Resedential Indian)") {
                    ard.setNRI_or_Resident_table_4("NRI");
                } else {
                    ard.setNRI_or_Resident_table_4(nriOrRes);
                }
                ard.setATM_Card_table_3(ATMService);
                ard.setNetBanking_table_3(NetBankingService);
                ard.setUPI_table_3(UPIService);

                ard.setATM_Card_PIN_table_6(ATMPin);
                ard.setATM_Card_Type_table_6(ATMCardTypes);
                ard.setATM_Card_Associations_table_6(ATMCardAssociation);
                if(ATMService=="Selected") {
                    ard.setATM_Card_Facility_Status_table_6("Enabled");
                } else {
                    ard.setATM_Card_Facility_Status_table_6("Disabled");
                }
                
                ard.setUPI_Transaction_PIN_table_8(UPIPin);
                ard.setActivate_PayTm_table_3(PayTmService);
                ard.setActivate_PhonePe_table_3(PhonePeService);
                ard.setActivate_Google_Pay_table_3(GooglePayService);
                ard.setActivate_Bharat_Pe_table_3(BharatPeService);
                
                frame.dispose();
                callback.run();
            }
        });
        jba = finishButton;
        panel.add(finishButton);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
    public static void enabler(Object referenceObj, Boolean action, Boolean indication[], JComboBox<?> account_types, JComboBox<?> nri_residential, JCheckBox atm_parent, JCheckBox upi_parent, JFormattedTextField atm_pin, JComboBox<?> atm_card_type, JComboBox<?> atm_card_association, JFormattedTextField upi_pin, JCheckBox paytm_cb, JCheckBox phonepe_cb, JCheckBox googlepay_cb, JCheckBox bharatpe_cb, JButton reset_button, JButton finish_button) {
        if(referenceObj == account_types) {
            if(action) {
                if((false != !nri_residential.getSelectedItem().equals("Select Account Origin")) && ((indication[0] && (atm_pin.getText().trim().length()==10 && atm_card_type.getSelectedItem()!="Select ATM Card Type" && atm_card_association.getSelectedItem()!="Select ATM Card Association")) || (indication[0]==false)) && ((indication[1] && upi_pin.getText().trim().length()==11 && (indication[2] || indication[3] || indication[4] || indication[5])) || (indication[1]==false))) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            } else {
                finish_button.setEnabled(false);
            }                 
        } else if(referenceObj == nri_residential) {
            if(action) {
                if((false != !account_types.getSelectedItem().equals("Select Account Type")) && ((indication[0] && (atm_pin.getText().trim().length()==10 && atm_card_type.getSelectedItem()!="Select ATM Card Type" && atm_card_association.getSelectedItem()!="Select ATM Card Association")) || (indication[0]==false)) && ((indication[1] && upi_pin.getText().trim().length()==11 && (indication[2] || indication[3] || indication[4] || indication[5])) || (indication[1]==false))) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            } else {
                finish_button.setEnabled(false);
            }             
        } else if(referenceObj == atm_parent) {
            if(action) { 
                if(atm_pin.getText().trim().length()==10 && atm_card_type.getSelectedItem()!="Select ATM Card Type" && atm_card_association.getSelectedItem()!="Select ATM Card Association") {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            } else {
                atm_pin.setText("");
                atmCardTypesComboBox.setSelectedIndex(0);
                atmCardAssociationComboBox.setSelectedIndex(0);

                atm_pin.setEnabled(false);
                atm_card_type.setEnabled(false);
                atm_card_association.setEnabled(false);
                
                if((false != !nri_residential.getSelectedItem().equals("Select Account Origin")) && (false != !account_types.getSelectedItem().equals("Select Account Type")) && ((indication[1] && upi_pin.getText().trim().length()==11 && (indication[2] || indication[3] || indication[4] || indication[5])) || (indication[1]==false))) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            }             
        } else if(referenceObj == upi_parent) {
            if(action) {
                if(upi_pin.getText().trim().length()==11 && (indication[2] || indication[3] || indication[4] || indication[5])) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            } else {
                upi_pin.setText("");
                indication[2] = indication[3] = indication[4] = indication[5] = false;
                paytm_cb.setSelected(false);
                phonepe_cb.setSelected(false);
                googlepay_cb.setSelected(false);
                bharatpe_cb.setSelected(false);

                upi_pin.setEnabled(false);
                paytm_cb.setEnabled(false);
                phonepe_cb.setEnabled(false);
                googlepay_cb.setEnabled(false);
                bharatpe_cb.setEnabled(false);

                if((false != !nri_residential.getSelectedItem().equals("Select Account Origin")) && (false != !account_types.getSelectedItem().equals("Select Account Type")) && ((indication[0] && (atm_pin.getText().trim().length()==10 && atm_card_type.getSelectedItem()!="Select ATM Card Type" && atm_card_association.getSelectedItem()!="Select ATM Card Association")) || (indication[0]==false))) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            }             
        } else if(referenceObj == atm_pin) {
            if(action) {
                if((false != !account_types.getSelectedItem().equals("Select Account Type")) && (false != !nri_residential.getSelectedItem().equals("Select Account Origin")) && ((indication[1] && upi_pin.getText().trim().length()==11 && (indication[2] || indication[3] || indication[4] || indication[5])) || (indication[1]==false)) && (atm_card_type.getSelectedItem()!="Select ATM Card Type") && (atm_card_association.getSelectedItem()!="Select ATM Card Association")) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            } else {
                finish_button.setEnabled(false);
            }             
        } else if(referenceObj == atm_card_type) {
            if(action) {
                if((false != !account_types.getSelectedItem().equals("Select Account Type")) && (false != !nri_residential.getSelectedItem().equals("Select Account Origin")) && ((indication[1] && upi_pin.getText().trim().length()==11 && (indication[2] || indication[3] || indication[4] || indication[5])) || (indication[1]==false)) && (atm_pin.getText().trim().length()==10) && (atm_card_association.getSelectedItem()!="Select ATM Card Association")) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            } else {
                finish_button.setEnabled(false);
            }             
        } else if(referenceObj == atm_card_association) {
            if(action) {
                if((false != !account_types.getSelectedItem().equals("Select Account Type")) && (false != !nri_residential.getSelectedItem().equals("Select Account Origin")) && ((indication[1] && upi_pin.getText().trim().length()==11 && (indication[2] || indication[3] || indication[4] || indication[5])) || (indication[1]==false)) && (atm_pin.getText().trim().length()==10) && (atm_card_type.getSelectedItem()!="Select ATM Card Type")) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            } else {
                finish_button.setEnabled(false);
            }             
        } else if(referenceObj == upi_pin) {
            if(action) {
                if((false != !account_types.getSelectedItem().equals("Select Account Type")) && (false != !nri_residential.getSelectedItem().equals("Select Account Origin")) && ((indication[0] && (atm_pin.getText().trim().length()==10 && atm_card_type.getSelectedItem()!="Select ATM Card Type" && atm_card_association.getSelectedItem()!="Select ATM Card Association")) || (indication[0]==false)) && ((indication[2] || indication[3] || indication[4] || indication[5]))) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            } else {
                finish_button.setEnabled(false);
            }             
        } else if(referenceObj == paytm_cb) {
            if(action) {
                if((false != !account_types.getSelectedItem().equals("Select Account Type")) && (false != !nri_residential.getSelectedItem().equals("Select Account Origin")) && (upi_pin.getText().trim().length()==11) && ((indication[0] && (atm_pin.getText().trim().length()==10 && atm_card_type.getSelectedItem()!="Select ATM Card Type" && atm_card_association.getSelectedItem()!="Select ATM Card Association")) || (indication[0]==false))) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            } else {
                if(indication[3] || indication[4] || indication[5]) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            }               
        } else if(referenceObj == phonepe_cb) {
            if(action) {
                if((false != !account_types.getSelectedItem().equals("Select Account Type")) && (false != !nri_residential.getSelectedItem().equals("Select Account Origin")) && (upi_pin.getText().trim().length()==11) && ((indication[0] && (atm_pin.getText().trim().length()==10 && atm_card_type.getSelectedItem()!="Select ATM Card Type" && atm_card_association.getSelectedItem()!="Select ATM Card Association")) || (indication[0]==false))) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            } else {
                if(indication[2] || indication[4] || indication[5]) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            }                 
        } else if(referenceObj == googlepay_cb) {
            if(action) {
                if((false != !account_types.getSelectedItem().equals("Select Account Type")) && (false != !nri_residential.getSelectedItem().equals("Select Account Origin")) && (upi_pin.getText().trim().length()==11) && ((indication[0] && (atm_pin.getText().trim().length()==10 && atm_card_type.getSelectedItem()!="Select ATM Card Type" && atm_card_association.getSelectedItem()!="Select ATM Card Association")) || (indication[0]==false))) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            } else {
                if(indication[2] || indication[3] || indication[5]) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            }             
        } else if(referenceObj == bharatpe_cb) {
            if(action) {
                if((false != !account_types.getSelectedItem().equals("Select Account Type")) && (false != !nri_residential.getSelectedItem().equals("Select Account Origin")) && (upi_pin.getText().trim().length()==11) && ((indication[0] && (atm_pin.getText().trim().length()==10 && atm_card_type.getSelectedItem()!="Select ATM Card Type" && atm_card_association.getSelectedItem()!="Select ATM Card Association")) || (indication[0]==false))) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            } else {
                if(indication[2] || indication[3] || indication[4]) {
                    finish_button.setEnabled(true);
                } else {
                    finish_button.setEnabled(false);
                }
            }                 
        } else {
            
        }
    }
    public void intakePassword(Runnable callback) {
        JFrame frame = new JFrame(new FinalStrings().bankNamePre());
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().passwordIntakeWindowHeadingTop());
        panel.add(heading);
        
        shiftByPixel(panel, heading, 800);
        JEditorPane editorPane = new JEditorPane();
        editorPane.setEditable(false);
        editorPane.setPreferredSize(new Dimension(400, 115));
        editorPane.setEditorKit(new HTMLEditorKit());
        editorPane.setText(new FrameText().passwordIntakeWindowNotice());
        panel.add(editorPane);
        editorPane.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createLineBorder(Color.BLACK, 3)));
            
        JTextPane rowI = new JTextPane();
        rowI.setContentType("text/html");
        rowI.setEditable(false);
        rowI.setText(new FrameText().passwordIntakeWindowCustID());
        panel.add(rowI);
            
            
        vSpace(panel, new JTextPane(), 10);
            
        JTextField jtf = JTextF(panel, 500, 45,-1);
        jtf.setText(generateId(ard.fetchPan(), ard.fetchAadhar().replaceAll("\\s", "")));
        jtf.setEditable(false);
        
        shiftByPixel(panel, new JTextPane(), 450);
        
        vSpace(panel, new JTextPane(), 25);
        
        JTextPane PasswordLabel = new JTextPane();
        PasswordLabel.setContentType("text/html");
        PasswordLabel.setEditable(false);
        PasswordLabel.setText(new FrameText().passwordIntakeWindowPasswordIDI());
        panel.add(PasswordLabel);
        
        
        vSpace(panel, new JTextPane(), 10);
        
        JPasswordField passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(500, 45));
        Font font = new Font("Arial", Font.ROMAN_BASELINE, 16);
        passwordField.setFont(font);
        passwordField.setMargin(new Insets(10, 30, 10, 30));
        passwordField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkFields(5);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkFields(5);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkFields(5);
            }
        });
        jpfa = passwordField;
        panel.add(passwordField);
        
        shiftByPixel(panel, new JTextPane(), 450);

        vSpace(panel, new JTextPane(), 25);

        JTextPane PasswordLabelII = new JTextPane();
        PasswordLabelII.setContentType("text/html");
        PasswordLabelII.setEditable(false);
        PasswordLabelII.setText(new FrameText().passwordIntakeWindowPasswordIDII());
        panel.add(PasswordLabelII);
        
        vSpace(panel, new JTextPane(), 10);
        
        JPasswordField passwordFieldII = new JPasswordField();
        passwordFieldII.setPreferredSize(new Dimension(500, 45));
        passwordFieldII.setFont(font);
        passwordFieldII.setMargin(new Insets(10, 30, 10, 30));
        passwordFieldII.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkFields(5);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkFields(5);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkFields(5);
            }
        });
        jpfb = passwordFieldII;
        panel.add(passwordFieldII);
        
        shiftByPixel(panel, new JTextPane(), 450);
        
        vSpace(panel, new JTextPane(), 30);
        
        
        
        JButton resetButton = new JButton("Reset");
        resetButton.setEnabled(true);
        resetButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        resetButton.setPreferredSize(new Dimension(200, 35));
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpfa.setText("");
                jpfb.setText("");
            }
        });
        panel.add(resetButton);

        shiftByPixel(panel, new JTextPane(), -75);

        JButton submitButton = new JButton("Submit");
        submitButton.setEnabled(false);
        submitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        submitButton.setPreferredSize(new Dimension(150, 35));
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                JOptionPane.showMessageDialog(null, "<html><body>"+"<p>Do Not Forget Your Customer ID and Password:</p>"+"<p><b>Customer ID :</b> " + generateId(ard.fetchPan(), ard.fetchAadhar().replaceAll("\\s", ""))+"</p>"+"<p><b>Password : </b>"+new String(passwordField.getPassword()));
                ard.setUserGeneratedID(generateId(ard.fetchPan(), ard.fetchAadhar().replaceAll("\\s", "")));
                ard.setUserGivenPassword(String.valueOf(passwordField.getPassword()));

                passwordField.setText("");
                passwordFieldII.setText("");
                jtf.setText("");

                frame.dispose();
                callback.run();
            }
        });
        jba = submitButton;
        panel.add(submitButton);
        
        shiftByPixel(panel, new JTextPane(), 453);
        
        vSpace(panel, new JTextPane(), 100);
        
        frame.pack();

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        frame.setVisible(true);
    }
    public void afterLogin() {
        JFrame frame = new JFrame("Welcome To Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, null, 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterLoginWelcomeUser("left")+cul.fetchCurrentUserName()+new FrameText().afterLoginWelcomeUser("right"));
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().afterLoginShowUniqueID("left")+cul.fetchCurrentUserId()+new FrameText().afterLoginShowUniqueID("right"));
        panel.add(custoInfo);

        vSpace(panel, new JTextPane(), 10);
        
        shiftByPixel(panel, custoInfo, 1120);
        
        logOut = new JButton("Log Out");
        logOut.setEnabled(true);
        logOut.setPreferredSize(new Dimension(100, 35));
        logOut.setBackground(new Color(199, 54, 59));
        logOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(logOut);
        logOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logOut.setEnabled(false);
                atm.setEnabled(false);
                lifeInsurance.setEnabled(false);
                quickTransfer.setEnabled(false);
                contactUs.setEnabled(false);
                emi.setEnabled(false);
                upi.setEnabled(false);
                requestMoney.setEnabled(false);
                transferMoney.setEnabled(false);
                sip_fd_stocks.setEnabled(false);
                accSecurity.setEnabled(false);
                accDetails.setEnabled(false);
                updateDetails.setEnabled(false);
                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to Log Out ?", "Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    ard.logUserOut();
                    cul.logUserOut();
                    try {
                        setGlassPaneView(frame, true);
                        showLoadingScreen("Logging Out...", 1500);
                        setGlassPaneView(frame, false);
                        mainWindow(null);
                    } catch (ClassNotFoundException | ParseException | SQLException e1) {
                        e1.printStackTrace();
                    }
                    frame.dispose();
                } else {
                    logOut.setEnabled(true);
                    atm.setEnabled(true);
                    lifeInsurance.setEnabled(true);
                    quickTransfer.setEnabled(true);
                    contactUs.setEnabled(true);
                    emi.setEnabled(true);
                    upi.setEnabled(true);
                    requestMoney.setEnabled(true);
                    transferMoney.setEnabled(true);
                    sip_fd_stocks.setEnabled(true);
                    accSecurity.setEnabled(true);
                    accDetails.setEnabled(true);
                    updateDetails.setEnabled(true);
                }
            }
        });
        
        vSpace(panel, new JTextPane(), 40);

        atm = new JButton("ATM");
        atm.setEnabled(true);
        atm.setPreferredSize(new Dimension(220, 50));
        atm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        atm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ATM_Module(null, frame);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.setVisible(false);
            }
        });
        panel.add(atm);

        shiftByPixel(panel, new JTextPane(), 100);

        emi = new JButton("EMI");
        emi.setEnabled(true);
        emi.setPreferredSize(new Dimension(220, 50));
        emi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        emi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panel.add(emi);
        
        shiftByPixel(panel, new JTextPane(), 100);

        sip_fd_stocks = new JButton("SIP / FD / Stocks");
        sip_fd_stocks.setEnabled(true);
        sip_fd_stocks.setPreferredSize(new Dimension(220, 50));
        sip_fd_stocks.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        sip_fd_stocks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panel.add(sip_fd_stocks);


        vSpace(panel, new JTextPane(), 40);


        lifeInsurance = new JButton("Life Insurance");
        lifeInsurance.setEnabled(true);
        lifeInsurance.setPreferredSize(new Dimension(220, 50));
        lifeInsurance.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lifeInsurance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panel.add(lifeInsurance);

        shiftByPixel(panel, new JTextPane(), 100);

        upi = new JButton("UPI");
        upi.setEnabled(true);
        upi.setPreferredSize(new Dimension(220, 50));
        upi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        upi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    upiFacilityOptionWindow(null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
        });
        panel.add(upi);

        shiftByPixel(panel, new JTextPane(), 100);

        accSecurity = new JButton("Account Security");
        accSecurity.setEnabled(true);
        accSecurity.setPreferredSize(new Dimension(220, 50));
        accSecurity.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        accSecurity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panel.add(accSecurity);


        vSpace(panel, new JTextPane(), 40);


        quickTransfer = new JButton("Quick Transfer");
        quickTransfer.setEnabled(true);
        quickTransfer.setPreferredSize(new Dimension(220, 50));
        quickTransfer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        quickTransfer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panel.add(quickTransfer);

        shiftByPixel(panel, new JTextPane(), 100);

        requestMoney = new JButton("Request Money");
        requestMoney.setEnabled(true);
        requestMoney.setPreferredSize(new Dimension(220, 50));
        requestMoney.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        requestMoney.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panel.add(requestMoney);

        shiftByPixel(panel, new JTextPane(), 100);

        accDetails = new JButton("Account Details");
        accDetails.setEnabled(true);
        accDetails.setPreferredSize(new Dimension(220, 50));
        accDetails.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        accDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    displayCompleteDetails(null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
        });
        panel.add(accDetails);


        vSpace(panel, new JTextPane(), 40);


        contactUs = new JButton("Get Help / Contact Us");
        contactUs.setEnabled(true);
        contactUs.setPreferredSize(new Dimension(220, 50));
        contactUs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        contactUs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panel.add(contactUs);

        shiftByPixel(panel, new JTextPane(), 100);

        transferMoney = new JButton("Transfer Money");
        transferMoney.setEnabled(true);
        transferMoney.setPreferredSize(new Dimension(220, 50));
        transferMoney.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        transferMoney.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panel.add(transferMoney);

        shiftByPixel(panel, new JTextPane(), 100);

        updateDetails = new JButton("Update Your Details");
        updateDetails.setEnabled(true);
        updateDetails.setPreferredSize(new Dimension(220, 50));
        updateDetails.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        updateDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panel.add(updateDetails);


        vSpace(panel, new JTextPane(), 56);


        JTextPane footer = new JTextPane();
        footer.setContentType("text/html");
        footer.setEditable(false);
        footer.setText(new FrameText().afterLoginFooter("left", (Integer) null)+new FrameText().afterLoginFooter("right", 17));
        footer.addHyperlinkListener(new NotiHyperlinkListener());
        panel.add(footer);
        

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
    public void ATM_Module(Runnable callback, JFrame previousFrame) throws ClassNotFoundException, SQLException {
        
        {
            Connection con = new Connectivity().establishConnection();

            String query = "select * from atm where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
            Statement st = con.createStatement();
            ResultSet rs =  st.executeQuery(query);

            while(rs.next()) {
                cuatm.setCurrent_User_ATM_Card_Number_table_6(rs.getLong("ATM Card Number"));
                cuatm.setCurrent_User_ATM_Card_CVV_table_6(rs.getInt("ATM Card CVV"));
                cuatm.setCurrent_User_ATM_Card_Expiry_Month_table_6(rs.getInt("ATM Card Expiry Month"));
                cuatm.setCurrent_User_ATM_Card_Expiry_Year_table_6(rs.getInt("ATM Card Expiry Year"));
                cuatm.setCurrent_User_ATM_Card_PIN_table_6(rs.getInt("ATM Card PIN"));
                cuatm.setCurrent_User_ATM_Card_Type_table_6(rs.getString("ATM Card Type"));
                cuatm.setCurrent_User_ATM_Card_Associations_table_6(rs.getString("ATM Card Associations"));
                cuatm.setCurrent_User_ATM_Card_Facility_Status_table_6(rs.getString("ATM Card Facility Status"));
            }
            
            query = "select * from userFacilityDetails where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
            st = con.createStatement();
            rs =  st.executeQuery(query);

            while(rs.next()) {
                cuatm.setCurrent_User_ATM_Card_table_3(rs.getString("ATM Card"));
            }

            query = "select * from bankActions where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
            st = con.createStatement();
            rs =  st.executeQuery(query);

            while(rs.next()) {
                cuatm.setCurrent_User_ATM_Card_Facility_Status_table_10(rs.getString("ATM Card Facility Status"));
            }
            
            con.close();
        }
        
        JFrame frame = new JFrame("Welcome To Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingATMModuleHeading());
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().inATMShowATMCardNumber("left")+"#### #### #### "+String.valueOf(cuatm.fetchCurrent_User_ATM_Card_Number_table_6()).substring(12, 16)+new FrameText().inATMShowATMCardNumber("right"));
        panel.add(custoInfo);

        vSpace(panel, new JTextPane(), 30);
        
        
        vSpace(panel, new JTextPane(), 50);

        withdraw = new JButton("Withdraw");
        withdraw.setEnabled(true);
        withdraw.setPreferredSize(new Dimension(220, 50));
        withdraw.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        withdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Withdraw_Module_Window_I(null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
        });
        panel.add(withdraw);

        shiftByPixel(panel, new JTextPane(), 100);

        changeATMpin = new JButton("Change ATM Pin");
        changeATMpin.setEnabled(true);
        changeATMpin.setPreferredSize(new Dimension(220, 50));
        changeATMpin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        changeATMpin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    change_ATM_PIN_Module_Window_I(null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
        });
        panel.add(changeATMpin);
        
        shiftByPixel(panel, new JTextPane(), 100);

        updateCardType = new JButton("Update Card Type");
        updateCardType.setEnabled(true);
        updateCardType.setPreferredSize(new Dimension(220, 50));
        updateCardType.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        updateCardType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panel.add(updateCardType);


        vSpace(panel, new JTextPane(), 80);


        deposit = new JButton("Deposit");
        deposit.setEnabled(true);
        deposit.setPreferredSize(new Dimension(220, 50));
        deposit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        deposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Deposit_Module_Window_I(null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
        });
        panel.add(deposit);

        shiftByPixel(panel, new JTextPane(), 100);

        miniStatement = new JButton("Mini Statement");
        miniStatement.setEnabled(true);
        miniStatement.setPreferredSize(new Dimension(220, 50));
        miniStatement.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        miniStatement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    mini_Statement_Module_Window_I(null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
        });
        panel.add(miniStatement);

        shiftByPixel(panel, new JTextPane(), 100);
        if(checkStatus(6)) {
            unblock_blockATMCard = new JButton("Block ATM Card");
            unblock_blockATMCard.setBackground(new Color(209, 54, 59));
        } else {
            unblock_blockATMCard = new JButton("Un-Block ATM Card");
            unblock_blockATMCard.setBackground(new Color(0, 190, 0));
        }
        unblock_blockATMCard.setEnabled(true);
        unblock_blockATMCard.setPreferredSize(new Dimension(220, 50));
        unblock_blockATMCard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        unblock_blockATMCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panel.add(unblock_blockATMCard);


        vSpace(panel, new JTextPane(), 80);


        balanceEnquiry = new JButton("Balance Enquiry");
        balanceEnquiry.setEnabled(true);
        balanceEnquiry.setPreferredSize(new Dimension(220, 50));
        balanceEnquiry.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        balanceEnquiry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    balance_Enquiry_Module_Window_I(null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
        });
        panel.add(balanceEnquiry);

        shiftByPixel(panel, new JTextPane(), 100);
        if(checkStatus(6)) {
            enable_disableATMCard = new JButton("Disable ATM Facility");
            enable_disableATMCard.setBackground(new Color(209, 54, 59));
        } else {
            enable_disableATMCard = new JButton("Enable ATM Facility");
            enable_disableATMCard.setBackground(new Color(0, 190, 0));
        }
        enable_disableATMCard.setEnabled(true);
        enable_disableATMCard.setPreferredSize(new Dimension(220, 50));
        enable_disableATMCard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        enable_disableATMCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panel.add(enable_disableATMCard);

        shiftByPixel(panel, new JTextPane(), 100);

        backtoMainMenu = new JButton("Back To Main Menu");
        backtoMainMenu.setEnabled(true);
        backtoMainMenu.setPreferredSize(new Dimension(220, 50));
        backtoMainMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backtoMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afterLogin();
                frame.dispose();
            }
        });
        panel.add(backtoMainMenu);

        vSpace(panel, new JTextPane(), 73);

        JTextPane footer = new JTextPane();
        footer.setContentType("text/html");
        footer.setEditable(false);
        footer.setText(new FrameText().inATMFooter());
        panel.add(footer);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        LocalDate today = LocalDate.now();
        String currentUserATMCardExpiryDate = LocalDate.of(cuatm.fetchCurrent_User_ATM_Card_Expiry_Year_table_6(), cuatm.fetchCurrent_User_ATM_Card_Expiry_Month_table_6(), LocalDate.now().getDayOfMonth()).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        

        LocalDate expiryDate = LocalDate.parse(currentUserATMCardExpiryDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        if (expiryDate.getYear() < today.getYear() || (expiryDate.getYear() == today.getYear() && expiryDate.getMonthValue() < today.getMonthValue())) {
            previousFrame.setVisible(false);
            setGlassPaneView(frame, true);
            String htmlMessage = "<html><body style='width: 250px;'><h3 style='color: red;'>Expiry Date Alert</h3><p>" + "Expiry Date Has Passed, Renew Your ATM Facility" + "</p><br /></body></html>";
            
            int userChoice = JOptionPane.showOptionDialog(null, htmlMessage, "ATM CARD EXPIRY ALERT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Renew", "Don't Renew"}, "Renew");

            if (userChoice == JOptionPane.YES_OPTION) {
                setGlassPaneView(frame, false);

            } else if (userChoice == JOptionPane.NO_OPTION) {
                afterLogin();
                frame.dispose();
            } else {
                afterLogin();
                frame.dispose();
            }
        } else if (expiryDate.getYear() == today.getYear() && expiryDate.getMonthValue() == today.getMonthValue()) {
            previousFrame.setVisible(false);
            setGlassPaneView(frame, true);
            String htmlMessage = "<html><body style='width: 250px;'><h3 style='color: red;'>Expiry Date Alert</h3><p>" + "You Are Near to Expiry of ATM Facility, Renew Your ATM Facility Before it Gets Expired !" + "</p><br /></body></html>";
            
            int userChoice = JOptionPane.showOptionDialog(null, htmlMessage, "ATM CARD EXPIRY ALERT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Renew", "Don't Renew"}, "Renew");

            if (userChoice == JOptionPane.YES_OPTION) {
                setGlassPaneView(frame, false);

            } else {
                setGlassPaneView(frame, false);
            }
        }

        {
            int bankState = checkBankStability(ard.fetchUserIdWhileLogin(), "ATM");
            if(bankState==0) {
                setGlassPaneView(frame, true);
                JOptionPane.showMessageDialog(null, "<html><div style='font-size:12pt; color:Red;'>"+"<b>Your Account has Already Reached<br /><i>Monthly Limit !</i></b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                setGlassPaneView(frame, false);
            } else if(bankState==1) {
                setGlassPaneView(frame, true);
                JOptionPane.showMessageDialog(null, "<html><div style='font-size:12pt; color:Red;'>"+"<b>Your Account has Already Reached<br /><i>Daily Limit !</i></b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                setGlassPaneView(frame, false);
            } else if(bankState==2) {
                setGlassPaneView(frame, true);
                JOptionPane.showMessageDialog(null, "<html><div style='font-size:12pt; color:Red;'>"+"<b>Your Account has Already Reached<br /><i>Minimum Maintenance Balance !</i></b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                setGlassPaneView(frame, false);
            } else if(bankState==3) {
                setGlassPaneView(frame, true);
                JOptionPane.showMessageDialog(null, "<html><div style='font-size:12pt; color:Red;'>"+"<b>Your ATM Facility is <i>Frozen</i></b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                setGlassPaneView(frame, false);
            } else if(bankState==4) {
                setGlassPaneView(frame, true);
                JOptionPane.showMessageDialog(null, "<html><div style='font-size:12pt; color:Red;'>"+"<b>Your ATM Facility is <i>Deactivated</i></b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                setGlassPaneView(frame, false);
            } else if(bankState==5) {

            }
        }
            
    }
    public void Withdraw_Module_Window_I(Runnable callback) throws ClassNotFoundException, SQLException {
        
        JFrame frame = new JFrame("Welcome To ATM-WIthdraw Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingWithdrawModuleHeading());
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().inATMShowATMCardNumber("left")+"#### #### #### "+String.valueOf(cuatm.fetchCurrent_User_ATM_Card_Number_table_6()).substring(12, 16)+new FrameText().inATMShowATMCardNumber("right"));
        panel.add(custoInfo);
        vSpace(panel, new JTextPane(), 95);
        
        JTextPane enterATMPinText = new JTextPane();
        enterATMPinText.setContentType("text/html");
        enterATMPinText.setEditable(false);
        enterATMPinText.setText(new FrameText().enterAtmPinText());
        panel.add(enterATMPinText);

        vSpace(panel, new JTextPane(), 20);
        try {   
            mff = new MaskFormatter("            #            #            #            #");
            jftff = new JFormattedTextField(mff);
            jftff.setEnabled(true);
            jftff.requestFocusInWindow();
            jftff.setToolTipText("4 Digit ATM PIN");
            jftff.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            jftff.setPreferredSize(new Dimension(500, 80));
            jftff.setFont(new Font("Arial", Font.BOLD, 26));
            jftff.getDocument().addDocumentListener(new DocumentListener() {
                @Override
            public void insertUpdate(DocumentEvent e) {
                if(jftff.getText().trim().length()==40) {
                    next.setEnabled(true);
                } else {
                    next.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {}

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });
            frame.getContentPane().add(jftff);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        vSpace(panel, new JTextPane(), 20);

        forgot = new JButton("Forgot ?");
        forgot.setEnabled(true);
        forgot.setPreferredSize(new Dimension(200, 45));
        forgot.setForeground(new Color(249, 54, 59));
        forgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        forgot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(forgot);

        shiftByPixel(panel, new JTextPane(), -127);
        
        next = new JButton("Next >");
        next.setEnabled(false);
        next.setPreferredSize(new Dimension(200, 45));
        next.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userGivenPIN = jftff.getText().replaceAll("\\s", "");
                int userAuthenticPIN = 0;
                try {
                    Connection con = new Connectivity().establishConnection();
                    String query = "select * from `atm` where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()) {
                        userAuthenticPIN = rs.getInt("ATM Card PIN");
                    }
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                if(userGivenPIN.equals(String.valueOf(userAuthenticPIN))) {
                    try {
                        Withdraw_Module_Window_II(null);
                    } catch (ClassNotFoundException | SQLException e1) {
                        e1.printStackTrace();
                    }
                    frame.dispose();
                } else {
                    setGlassPaneView(frame, true);
                    JOptionPane.showMessageDialog(null, "<html><div style='font-size:14pt; color:Red;'>"+"<b>Incorrect PIN Entered</b></div></html>", "Failure", JOptionPane.WARNING_MESSAGE);
                    jftff.setText("");
                    jftff.requestFocusInWindow();
                    setGlassPaneView(frame, false);
                }
            }
        });
        panel.add(next);

        vSpace(panel, new JTextPane(), 20);

        backtoMainMenu = new JButton("< Go Back To Previous Menu");
        backtoMainMenu.setEnabled(true);
        backtoMainMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backtoMainMenu.setPreferredSize(new Dimension(500, 55));
        backtoMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ATM_Module(null, null);
                    frame.dispose();
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel.add(backtoMainMenu);

        vSpace(panel, new JTextPane(), 88);

        JTextPane footer = new JTextPane();
        footer.setContentType("text/html");
        footer.setEditable(false);
        footer.setText(new FrameText().inATMFooter());
        panel.add(footer);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jftff.requestFocusInWindow();
        frame.setVisible(true);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        boolean numLockEnabled = toolkit.getLockingKeyState(KeyEvent.VK_NUM_LOCK);
        if (numLockEnabled==false) {
            JOptionPane.showMessageDialog(null, "NUMLOCK is currently enabled. Please consider disabling it.", "NUMLOCK Warning", JOptionPane.WARNING_MESSAGE);
            jftff.requestFocusInWindow();
        }
        
    }
    public void Withdraw_Module_Window_II(Runnable callback) throws ClassNotFoundException, SQLException {
        JFrame frame = new JFrame("Welcome To ATM-WIthdraw Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingWithdrawModuleHeading());
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().inATMShowATMCardNumber("left")+"#### #### #### "+String.valueOf(cuatm.fetchCurrent_User_ATM_Card_Number_table_6()).substring(12, 16)+new FrameText().inATMShowATMCardNumber("right"));
        panel.add(custoInfo);
        vSpace(panel, new JTextPane(), 95);
        
        JTextPane enterAmountTextI = new JTextPane();
        enterAmountTextI.setContentType("text/html");
        enterAmountTextI.setEditable(false);
        enterAmountTextI.setText(new FrameText().enterWithdrawlAmount());
        panel.add(enterAmountTextI);

        vSpace(panel, new JTextPane(), 10);

        JTextPane enterAmountTextII = new JTextPane();
        enterAmountTextII.setContentType("text/html");
        enterAmountTextII.setEditable(false);
        enterAmountTextII.setText(new FrameText().enterMultipleOf5K());
        panel.add(enterAmountTextII);

        vSpace(panel, new JTextPane(), 10);

        JTextField numericTextField = new UserEntryValidator().createNumericTextField();
        numericTextField.setPreferredSize(new Dimension(500, 80));
        numericTextField.setFont(new Font("Arial", Font.BOLD, 26));
        numericTextField.setMargin(new Insets(0, 100, 0, 30));
        numericTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        numericTextField.setToolTipText("Amount To Be Withdrawn");
        panel.add(numericTextField);
        numericTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(numericTextField.getText().trim().length()>=3) {
                    if(Long.parseLong(numericTextField.getText().trim())%500==0 && Long.parseLong(numericTextField.getText().trim())!=0) {
                        next.setEnabled(true);
                    } else {
                        next.setEnabled(false);
                    }
                } else {
                    next.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(numericTextField.getText().trim().length()>=3) {
                    if(Long.parseLong(numericTextField.getText().trim())%500==0 && Long.parseLong(numericTextField.getText().trim())!=0) {
                        next.setEnabled(true);
                    } else {
                        next.setEnabled(false);
                    }
                } else {
                    next.setEnabled(false);
                }
            }
            
            @Override
            public void changedUpdate(DocumentEvent e) {
                if(numericTextField.getText().trim().length()>=3) {
                    if(Long.parseLong(numericTextField.getText().trim())%500==0 && Long.parseLong(numericTextField.getText().trim())!=0) {
                        next.setEnabled(true);
                    } else {
                        next.setEnabled(false);
                    }
                } else {
                    next.setEnabled(false);
                }
            }
        });

        vSpace(panel, new JTextPane(), 20);

        backtoMainMenu = new JButton("< Back");
        backtoMainMenu.setEnabled(true);
        backtoMainMenu.setPreferredSize(new Dimension(200, 45));
        backtoMainMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backtoMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Withdraw_Module_Window_I(null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
        });
        panel.add(backtoMainMenu);

        shiftByPixel(panel, new JTextPane(), -127);
        
        next = new JButton("Next >");
        next.setEnabled(false);
        next.setPreferredSize(new Dimension(200, 45));
        next.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setGlassPaneView(frame, true);
                showLoadingScreen("Processing...", 4000);
                try {
                    int status = debitMoney(ard.fetchUserIdWhileLogin(), Long.parseLong(numericTextField.getText().trim()), "ATM");
                    if(status==0) {
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Insufficient Balance</b></div></html>", "Failed", JOptionPane.ERROR_MESSAGE);
                    } else if(status==1) {
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Monthly Limit Exceeded !</b></div></html>", "Failed", JOptionPane.ERROR_MESSAGE);
                    } else if(status==2) {
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Daily Limit Exceeded !</b></div></html>", "Failed", JOptionPane.ERROR_MESSAGE);
                    } else if(status==3) {
                    } else if(status==4) {
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Your ATM Facility is Frozen</b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                    } else if(status==5) {
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Your ATM Facility is Deactivated</b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                    } else if(status==6) {
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Green;'>"+"<b>Withdral Successful</b></div></html>", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                    setGlassPaneView(frame, false);
                    ATM_Module(null, null);
                    frame.dispose();
                } catch (NumberFormatException | ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }

        });
        panel.add(next);
        
        vSpace(panel, new JTextPane(), 143);

        JTextPane footer = new JTextPane();
        footer.setContentType("text/html");
        footer.setEditable(false);
        footer.setText(new FrameText().inATMFooter());
        panel.add(footer);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        numericTextField.requestFocusInWindow();
        frame.setVisible(true);
    }
    public void Deposit_Module_Window_I(Runnable callback) throws ClassNotFoundException, SQLException {
        
        JFrame frame = new JFrame("Welcome To ATM-WIthdraw Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingDepositModuleHeading());
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().inATMShowATMCardNumber("left")+"#### #### #### "+String.valueOf(cuatm.fetchCurrent_User_ATM_Card_Number_table_6()).substring(12, 16)+new FrameText().inATMShowATMCardNumber("right"));
        panel.add(custoInfo);
        vSpace(panel, new JTextPane(), 95);
        
        JTextPane enterATMPinText = new JTextPane();
        enterATMPinText.setContentType("text/html");
        enterATMPinText.setEditable(false);
        enterATMPinText.setText(new FrameText().enterAtmPinText());
        panel.add(enterATMPinText);

        vSpace(panel, new JTextPane(), 20);
        try {   
            mff = new MaskFormatter("            #            #            #            #");
            jftff = new JFormattedTextField(mff);
            jftff.setEnabled(true);
            jftff.requestFocusInWindow();
            jftff.setToolTipText("4 Digit ATM PIN");
            jftff.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            jftff.setPreferredSize(new Dimension(500, 80));
            jftff.setFont(new Font("Arial", Font.BOLD, 26));
            jftff.getDocument().addDocumentListener(new DocumentListener() {
                @Override
            public void insertUpdate(DocumentEvent e) {
                if(jftff.getText().trim().length()==40) {
                    next.setEnabled(true);
                } else {
                    next.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {}

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });
            frame.getContentPane().add(jftff);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        vSpace(panel, new JTextPane(), 20);

        forgot = new JButton("Forgot ?");
        forgot.setEnabled(true);
        forgot.setPreferredSize(new Dimension(200, 45));
        forgot.setForeground(new Color(249, 54, 59));
        forgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        forgot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(forgot);

        shiftByPixel(panel, new JTextPane(), -127);
        
        next = new JButton("Next >");
        next.setEnabled(false);
        next.setPreferredSize(new Dimension(200, 45));
        next.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userGivenPIN = jftff.getText().replaceAll("\\s", "");
                int userAuthenticPIN = 0;
                try {
                    Connection con = new Connectivity().establishConnection();
                    String query = "select * from `atm` where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()) {
                        userAuthenticPIN = rs.getInt("ATM Card PIN");
                    }
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                if(userGivenPIN.equals(String.valueOf(userAuthenticPIN))) {
                    try {
                        Deposit_Module_Window_II(null);
                    } catch (ClassNotFoundException | SQLException e1) {
                        e1.printStackTrace();
                    }
                    frame.dispose();
                } else {
                    setGlassPaneView(frame, true);
                    JOptionPane.showMessageDialog(null, "<html><div style='font-size:14pt; color:Red;'>"+"<b>Incorrect PIN Entered</b></div></html>", "Failure", JOptionPane.WARNING_MESSAGE);
                    jftff.setText("");
                    jftff.requestFocusInWindow();
                    setGlassPaneView(frame, false);
                }
            }
        });
        panel.add(next);

        vSpace(panel, new JTextPane(), 20);

        backtoMainMenu = new JButton("< Go Back To Previous Menu");
        backtoMainMenu.setEnabled(true);
        backtoMainMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backtoMainMenu.setPreferredSize(new Dimension(500, 55));
        backtoMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ATM_Module(null, null);
                    frame.dispose();
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel.add(backtoMainMenu);

        vSpace(panel, new JTextPane(), 88);

        JTextPane footer = new JTextPane();
        footer.setContentType("text/html");
        footer.setEditable(false);
        footer.setText(new FrameText().inATMFooter());
        panel.add(footer);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jftff.requestFocusInWindow();
        frame.setVisible(true);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        boolean numLockEnabled = toolkit.getLockingKeyState(KeyEvent.VK_NUM_LOCK);
        if (numLockEnabled==false) {
            JOptionPane.showMessageDialog(null, "NUMLOCK is currently enabled. Please consider disabling it.", "NUMLOCK Warning", JOptionPane.WARNING_MESSAGE);
            jftff.requestFocusInWindow();
        }
        
    }
    public void Deposit_Module_Window_II(Runnable callback) throws ClassNotFoundException, SQLException {
        JFrame frame = new JFrame("Welcome To ATM-Deposit Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingDepositModuleHeading());
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().inATMShowATMCardNumber("left")+"#### #### #### "+String.valueOf(cuatm.fetchCurrent_User_ATM_Card_Number_table_6()).substring(12, 16)+new FrameText().inATMShowATMCardNumber("right"));
        panel.add(custoInfo);
        vSpace(panel, new JTextPane(), 95);
        
        JTextPane enterAmountTextI = new JTextPane();
        enterAmountTextI.setContentType("text/html");
        enterAmountTextI.setEditable(false);
        enterAmountTextI.setText(new FrameText().enterDepositAmount());
        panel.add(enterAmountTextI);

        vSpace(panel, new JTextPane(), 10);

        JTextPane enterAmountTextII = new JTextPane();
        enterAmountTextII.setContentType("text/html");
        enterAmountTextII.setEditable(false);
        enterAmountTextII.setText(new FrameText().enterMultipleOf5K());
        panel.add(enterAmountTextII);

        vSpace(panel, new JTextPane(), 10);

        JTextField numericTextField = new UserEntryValidator().createNumericTextField();
        numericTextField.setPreferredSize(new Dimension(500, 80));
        numericTextField.setFont(new Font("Arial", Font.BOLD, 26));
        numericTextField.setMargin(new Insets(0, 100, 0, 30));
        numericTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        numericTextField.setToolTipText("Amount To Be Deposited");
        panel.add(numericTextField);
        numericTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(numericTextField.getText().trim().length()>=3) {
                    if(Long.parseLong(numericTextField.getText().trim())%500==0 && Long.parseLong(numericTextField.getText().trim())!=0) {
                        next.setEnabled(true);
                    } else {
                        next.setEnabled(false);
                    }
                } else {
                    next.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(numericTextField.getText().trim().length()>=3) {
                    if(Long.parseLong(numericTextField.getText().trim())%500==0 && Long.parseLong(numericTextField.getText().trim())!=0) {
                        next.setEnabled(true);
                    } else {
                        next.setEnabled(false);
                    }
                } else {
                    next.setEnabled(false);
                }
            }
            
            @Override
            public void changedUpdate(DocumentEvent e) {
                if(numericTextField.getText().trim().length()>=3) {
                    if(Long.parseLong(numericTextField.getText().trim())%500==0 && Long.parseLong(numericTextField.getText().trim())!=0) {
                        next.setEnabled(true);
                    } else {
                        next.setEnabled(false);
                    }
                } else {
                    next.setEnabled(false);
                }
            }
        });

        vSpace(panel, new JTextPane(), 20);

        backtoMainMenu = new JButton("< Back");
        backtoMainMenu.setEnabled(true);
        backtoMainMenu.setPreferredSize(new Dimension(200, 45));
        backtoMainMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backtoMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Withdraw_Module_Window_I(null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
        });
        panel.add(backtoMainMenu);

        shiftByPixel(panel, new JTextPane(), -127);
        
        next = new JButton("Next >");
        next.setEnabled(false);
        next.setPreferredSize(new Dimension(200, 45));
        next.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setGlassPaneView(frame, true);
                showLoadingScreen("Processing...", 4000);
                try {
                    int status = creditMoney(ard.fetchUserIdWhileLogin(), Long.parseLong(numericTextField.getText().trim()), "ATM");
                    if(status==0) {
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Your ATM Facility is Frozen</b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                    } else if(status==1) {
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Your ATM Facility is Deactivated</b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                    } else if(status==2) {
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Green;'>"+"<b>Deposited Successfully</b></div></html>", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                    setGlassPaneView(frame, false);
                    ATM_Module(null, null);
                    frame.dispose();
                } catch (NumberFormatException | ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }

        });
        panel.add(next);
        
        vSpace(panel, new JTextPane(), 143);

        JTextPane footer = new JTextPane();
        footer.setContentType("text/html");
        footer.setEditable(false);
        footer.setText(new FrameText().inATMFooter());
        panel.add(footer);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        numericTextField.requestFocusInWindow();
        frame.setVisible(true);
    }
    public void balance_Enquiry_Module_Window_I(Runnable callback) throws ClassNotFoundException, SQLException {
        
        JFrame frame = new JFrame("Welcome To ATM-Balance Enquiry Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingBalanceEnquiryModuleHeading());
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().inATMShowATMCardNumber("left")+"#### #### #### "+String.valueOf("9756305760337545").substring(12, 16)+new FrameText().inATMShowATMCardNumber("right"));
        panel.add(custoInfo);
        vSpace(panel, new JTextPane(), 95);
        
        JTextPane enterATMPinText = new JTextPane();
        enterATMPinText.setContentType("text/html");
        enterATMPinText.setEditable(false);
        enterATMPinText.setText(new FrameText().enterAtmPinText());
        panel.add(enterATMPinText);

        vSpace(panel, new JTextPane(), 20);
        try {   
            mff = new MaskFormatter("            #            #            #            #");
            jftff = new JFormattedTextField(mff);
            jftff.setEnabled(true);
            jftff.requestFocusInWindow();
            jftff.setToolTipText("4 Digit ATM PIN");
            jftff.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            jftff.setPreferredSize(new Dimension(500, 80));
            jftff.setFont(new Font("Arial", Font.BOLD, 26));
            jftff.getDocument().addDocumentListener(new DocumentListener() {
                @Override
            public void insertUpdate(DocumentEvent e) {
                if(jftff.getText().trim().length()==40) {
                    next.setEnabled(true);
                } else {
                    next.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {}

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });
            frame.getContentPane().add(jftff);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        vSpace(panel, new JTextPane(), 20);

        forgot = new JButton("Forgot ?");
        forgot.setEnabled(true);
        forgot.setPreferredSize(new Dimension(200, 45));
        forgot.setForeground(new Color(249, 54, 59));
        forgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        forgot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(forgot);

        shiftByPixel(panel, new JTextPane(), -127);
        
        next = new JButton("Next >");
        next.setEnabled(false);
        next.setPreferredSize(new Dimension(200, 45));
        next.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userGivenPIN = jftff.getText().replaceAll("\\s", "");
                int userAuthenticPIN = 0;
                try {
                    Connection con = new Connectivity().establishConnection();
                    String query = "select * from `atm` where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()) {
                        userAuthenticPIN = rs.getInt("ATM Card PIN");
                    }
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                if(userGivenPIN.equals(String.valueOf(userAuthenticPIN))) {
                    try {
                        balance_Enquiry_Module_Window_II(null);
                    } catch (ClassNotFoundException | SQLException e1) {
                        e1.printStackTrace();
                    }
                    frame.dispose();
                } else {
                    setGlassPaneView(frame, true);
                    JOptionPane.showMessageDialog(null, "<html><div style='font-size:14pt; color:Red;'>"+"<b>Incorrect PIN Entered</b></div></html>", "Failure", JOptionPane.WARNING_MESSAGE);
                    jftff.setText("");
                    jftff.requestFocusInWindow();
                    setGlassPaneView(frame, false);
                }
            }
        });
        panel.add(next);

        vSpace(panel, new JTextPane(), 20);

        backtoMainMenu = new JButton("< Go Back To Previous Menu");
        backtoMainMenu.setEnabled(true);
        backtoMainMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backtoMainMenu.setPreferredSize(new Dimension(500, 55));
        backtoMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ATM_Module(null, null);
                    frame.dispose();
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel.add(backtoMainMenu);

        vSpace(panel, new JTextPane(), 88);

        JTextPane footer = new JTextPane();
        footer.setContentType("text/html");
        footer.setEditable(false);
        footer.setText(new FrameText().inATMFooter());
        panel.add(footer);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jftff.requestFocusInWindow();
        frame.setVisible(true);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        boolean numLockEnabled = toolkit.getLockingKeyState(KeyEvent.VK_NUM_LOCK);
        if (numLockEnabled==false) {
            JOptionPane.showMessageDialog(null, "NUMLOCK is currently enabled. Please consider disabling it.", "NUMLOCK Warning", JOptionPane.WARNING_MESSAGE);
            jftff.requestFocusInWindow();
        }
        
    }
    public void balance_Enquiry_Module_Window_II(Runnable callback) throws ClassNotFoundException, SQLException {
        JFrame frame = new JFrame("Welcome To ATM-Balance Enquiry Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingBalanceEnquiryModuleHeading());
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().inATMShowATMCardNumber("left")+"#### #### #### "+String.valueOf(cuatm.fetchCurrent_User_ATM_Card_Number_table_6()).substring(12, 16)+new FrameText().inATMShowATMCardNumber("right"));
        panel.add(custoInfo);
        vSpace(panel, new JTextPane(), 95);
        
        



        JTextPane balanceDisplayLabel = new JTextPane();
        balanceDisplayLabel.setContentType("text/html");
        balanceDisplayLabel.setEditable(false);
        balanceDisplayLabel.setText(new FrameText().balanceDisplayLabel());
        panel.add(balanceDisplayLabel);

        vSpace(panel, new JTextPane(), 20);

        Connection con = new Connectivity().establishConnection();
        String query = "select * from `userBankRelatedDetails` where `Customer Auto-Generated ID`= '"+ard.fetchUserIdWhileLogin()+"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        Double userBankBalance = null;
        while(rs.next()) {
            userBankBalance = rs.getDouble("Customer Bank Balance");
        }
        JTextField displayBalance = new JTextField();
        displayBalance.setPreferredSize(new Dimension(500, 80));
        displayBalance.setFont(new Font("Arial", Font.BOLD, 26));
        displayBalance.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        displayBalance.setMargin(new Insets(0, 60, 0, 0));
        displayBalance.setToolTipText("Your Bank Balance");
        displayBalance.setText(String.valueOf(userBankBalance));
        displayBalance.setEditable(false);
        panel.add(displayBalance);

        vSpace(panel, new JTextPane(), 20);

        backtoMainMenu = new JButton("< Back");
        backtoMainMenu.setEnabled(true);
        backtoMainMenu.setPreferredSize(new Dimension(200, 45));
        backtoMainMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backtoMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ATM_Module(null, null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
        });
        panel.add(backtoMainMenu);
        
        vSpace(panel, new JTextPane(), 143);

        JTextPane footer = new JTextPane();
        footer.setContentType("text/html");
        footer.setEditable(false);
        footer.setText(new FrameText().inATMFooter());
        panel.add(footer);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
    public void mini_Statement_Module_Window_I(Runnable callback) throws ClassNotFoundException, SQLException {
        
        JFrame frame = new JFrame("Welcome To ATM-Mini-Statement Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingMiniStatementModuleHeading());
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().inATMShowATMCardNumber("left")+"#### #### #### "+String.valueOf("9756305760337545").substring(12, 16)+new FrameText().inATMShowATMCardNumber("right"));
        panel.add(custoInfo);
        vSpace(panel, new JTextPane(), 95);
        
        JTextPane enterATMPinText = new JTextPane();
        enterATMPinText.setContentType("text/html");
        enterATMPinText.setEditable(false);
        enterATMPinText.setText(new FrameText().enterAtmPinText());
        panel.add(enterATMPinText);

        vSpace(panel, new JTextPane(), 20);
        try {   
            mff = new MaskFormatter("            #            #            #            #");
            jftff = new JFormattedTextField(mff);
            jftff.setEnabled(true);
            jftff.requestFocusInWindow();
            jftff.setToolTipText("4 Digit ATM PIN");
            jftff.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            jftff.setPreferredSize(new Dimension(500, 80));
            jftff.setFont(new Font("Arial", Font.BOLD, 26));
            jftff.getDocument().addDocumentListener(new DocumentListener() {
                @Override
            public void insertUpdate(DocumentEvent e) {
                if(jftff.getText().trim().length()==40) {
                    next.setEnabled(true);
                } else {
                    next.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {}

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });
            frame.getContentPane().add(jftff);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        vSpace(panel, new JTextPane(), 20);

        forgot = new JButton("Forgot ?");
        forgot.setEnabled(true);
        forgot.setPreferredSize(new Dimension(200, 45));
        forgot.setForeground(new Color(249, 54, 59));
        forgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        forgot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(forgot);

        shiftByPixel(panel, new JTextPane(), -127);
        
        next = new JButton("Next >");
        next.setEnabled(false);
        next.setPreferredSize(new Dimension(200, 45));
        next.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userGivenPIN = jftff.getText().replaceAll("\\s", "");
                int userAuthenticPIN = 0;
                try {
                    Connection con = new Connectivity().establishConnection();
                    String query = "select * from `atm` where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()) {
                        userAuthenticPIN = rs.getInt("ATM Card PIN");
                    }
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                if(userGivenPIN.equals(String.valueOf(userAuthenticPIN))) {
                    try {
                        mini_Statement_Module_Window_II(callback);
                    } catch (ClassNotFoundException | SQLException e1) {
                        e1.printStackTrace();
                    }
                    frame.dispose();
                } else {
                    setGlassPaneView(frame, true);
                    JOptionPane.showMessageDialog(null, "<html><div style='font-size:14pt; color:Red;'>"+"<b>Incorrect PIN Entered</b></div></html>", "Failure", JOptionPane.WARNING_MESSAGE);
                    jftff.setText("");
                    jftff.requestFocusInWindow();
                    setGlassPaneView(frame, false);
                }
            }
        });
        panel.add(next);

        vSpace(panel, new JTextPane(), 20);

        backtoMainMenu = new JButton("< Go Back To Previous Menu");
        backtoMainMenu.setEnabled(true);
        backtoMainMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backtoMainMenu.setPreferredSize(new Dimension(500, 55));
        backtoMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ATM_Module(null, null);
                    frame.dispose();
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel.add(backtoMainMenu);

        vSpace(panel, new JTextPane(), 88);

        JTextPane footer = new JTextPane();
        footer.setContentType("text/html");
        footer.setEditable(false);
        footer.setText(new FrameText().inATMFooter());
        panel.add(footer);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jftff.requestFocusInWindow();
        frame.setVisible(true);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        boolean numLockEnabled = toolkit.getLockingKeyState(KeyEvent.VK_NUM_LOCK);
        if (numLockEnabled==false) {
            JOptionPane.showMessageDialog(null, "NUMLOCK is currently enabled. Please consider disabling it.", "NUMLOCK Warning", JOptionPane.WARNING_MESSAGE);
            jftff.requestFocusInWindow();
        }
        
    }
    public void mini_Statement_Module_Window_II(Runnable callback) throws ClassNotFoundException, SQLException {
        JFrame frame = new JFrame("Welcome To ATM-Mini-Statement Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingMiniStatementModuleHeading());
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().inATMShowATMCardNumber("left")+"#### #### #### "+String.valueOf("9756305760337545").substring(12, 16)+new FrameText().inATMShowATMCardNumber("right"));
        panel.add(custoInfo);
        vSpace(panel, new JTextPane(), 30);
        
        JTextPane balanceDisplayLabel = new JTextPane();
        balanceDisplayLabel.setContentType("text/html");
        balanceDisplayLabel.setEditable(false);
        balanceDisplayLabel.setText(new FrameText().miniStatementDisplayLabel());
        panel.add(balanceDisplayLabel);

        vSpace(panel, new JTextPane(), 75);

        JTextPane miniStatementFromAndToLabel = new JTextPane();
        miniStatementFromAndToLabel.setContentType("text/html");
        miniStatementFromAndToLabel.setEditable(false);
        miniStatementFromAndToLabel.setText(new FrameText().miniStatementFromAndToLabel());
        panel.add(miniStatementFromAndToLabel);

        vSpace(panel, new JTextPane(), 10);

        try {   
            mff = new MaskFormatter("## / ## / ####");
            from = new JFormattedTextField(mff);
            from.setEnabled(true);
            from.setPreferredSize(new Dimension(200, 35));
            from.setMargin(new Insets(0, 45, 0, 0));
            from.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
            from.getDocument().addDocumentListener(new DocumentListener() {
                @Override
            public void insertUpdate(DocumentEvent e) {
                
                if(from.getText().trim().replaceAll("\\s", "").length()==10 && to.getText().trim().replaceAll("\\s", "").length()==10) {
                    showResults.setEnabled(true);
                } else if(from.getText().trim().replaceAll("\\s", "").length()==10) {
                    to.requestFocusInWindow();
                } else {
                    showResults.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {}

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        panel.add(from);

        shiftByPixel(panel, new JTextPane(), -10);

        try {   
            mfg = new MaskFormatter("## / ## / ####");
            to = new JFormattedTextField(mfg);
            to.setEnabled(true);
            to.setPreferredSize(new Dimension(200, 35));
            to.setMargin(new Insets(0, 45, 0, 0));
            to.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
            to.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    if(from.getText().trim().replaceAll("\\s", "").length()==10 && to.getText().trim().replaceAll("\\s", "").length()==10) {
                        showResults.setEnabled(true);
                    } else if(to.getText().trim().replaceAll("\\s", "").length()==10) {

                    } else {
                        showResults.setEnabled(false);
                    }
                }

                @Override
                public void removeUpdate(DocumentEvent e) {}

                @Override
                public void changedUpdate(DocumentEvent e) {}
        });
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        panel.add(to);
    
        vSpace(panel, new JTextPane(), 20);
        
        showResults = new JButton("Show Results 🔍");
        showResults.setPreferredSize(new Dimension(611, 45));
        showResults.setEnabled(false);
        showResults.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        showResults.setVisible(true);
        showResults.setToolTipText("Click to View Mini-Statement Between the Selected Dates");
        showResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    mini_Statement_Module_Window_III(null);
                    frame.dispose();
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel.add(showResults);
        
        vSpace(panel, new JTextPane(), 5);

        backtoMainMenu = new JButton("< Back");
        backtoMainMenu.setEnabled(true);
        backtoMainMenu.setVisible(true);
        backtoMainMenu.setPreferredSize(new Dimension(611, 45));
        backtoMainMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backtoMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ATM_Module(null, null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
        });
        panel.add(backtoMainMenu);

        vSpace(panel, new JTextPane(), 10);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        from.requestFocusInWindow();
        frame.setVisible(true);
    }
    public void mini_Statement_Module_Window_III(Runnable callback) throws ClassNotFoundException, SQLException {
        JFrame frame = new JFrame("Welcome To ATM-Mini-Statement Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingMiniStatementModuleHeading());
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().inATMShowATMCardNumber("left")+"#### #### #### "+String.valueOf("9756305760337545").substring(12, 16)+new FrameText().inATMShowATMCardNumber("right"));
        panel.add(custoInfo);
        vSpace(panel, new JTextPane(), 30);
        
        JTextPane balanceDisplayLabel = new JTextPane();
        balanceDisplayLabel.setContentType("text/html");
        balanceDisplayLabel.setEditable(false);
        balanceDisplayLabel.setText(new FrameText().miniStatementDisplayLabel());
        panel.add(balanceDisplayLabel);

        vSpace(panel, new JTextPane(), 20);

        List<Long> ATM_Card_Number = new ArrayList<>();
        List<String> withdrawORdeposit = new ArrayList<>();
        List<Double> transactionAmount = new ArrayList<>();
        List<String> transactionReferenceID = new ArrayList<>();
        List<String> transactionDate = new ArrayList<>();
        List<String> transactionTime = new ArrayList<>();
        List<String> transactionStatus = new ArrayList<>();

        Connection con = new Connectivity().establishConnection();
        String query = "select * from `atm` where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()) {
            ATM_Card_Number.add(rs.getLong("ATM Card Number"));
        }

        con = new Connectivity().establishConnection();
        query = "select * from `atmTransactionHistory` where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
        st = con.createStatement();
        rs = st.executeQuery(query);
        final ResultSet[] resultSetWrapper = {rs};

        LocalDate fromDate = LocalDate.parse(from.getText().trim().replaceAll("\\s", ""), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate toDate = LocalDate.parse(to.getText().trim().replaceAll("\\s", ""), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        if(fromDate.isAfter(toDate)) {
            setGlassPaneView(frame, true);
            JOptionPane.showMessageDialog(null, "<html><div style='font-size:14pt; color:Red;'>"+"Entered Date Seems Logically Invalid.<br />Make Sure Your Enter The Range Correctly.</div></html>", "Invalid Date Entered", JOptionPane.WARNING_MESSAGE);
            from.setText("");
            to.setText("");
            setGlassPaneView(frame, false);
            from.requestFocusInWindow();
        }
        else {
            showResults.setVisible(false);
            from.setVisible(false);
            to.setVisible(false);
            balanceDisplayLabel.setVisible(false);
            withdrawORdeposit.clear();
            transactionAmount.clear();
            transactionReferenceID.clear();
            transactionDate.clear();
            transactionTime.clear();
            transactionStatus.clear();
            try {
                while(resultSetWrapper[0].next()) {
                    if((LocalDate.parse(resultSetWrapper[0].getString("Transaction Date").trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy")).isAfter(fromDate) || LocalDate.parse(resultSetWrapper[0].getString("Transaction Date").trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy")).isEqual(fromDate)) && (LocalDate.parse(resultSetWrapper[0].getString("Transaction Date").trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy")).isBefore(toDate) || LocalDate.parse(resultSetWrapper[0].getString("Transaction Date").trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy")).isEqual(toDate))) {
                        withdrawORdeposit.add(resultSetWrapper[0].getString("Withdraw/Deposit"));
                        transactionAmount.add(resultSetWrapper[0].getDouble("Transaction Amount"));
                        transactionReferenceID.add(resultSetWrapper[0].getString("Withdraw/Deposit Reference ID"));
                        transactionDate.add(resultSetWrapper[0].getString("Transaction Date"));
                        transactionTime.add(resultSetWrapper[0].getString("Transaction Time"));
                        transactionStatus.add(resultSetWrapper[0].getString("Transaction Status"));
                    }
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            } 
        }
        

        vSpace(panel, new JTextPane(), 10);

        String[] columnNames = {"Serial Number", "ATM Card Number", "Withdraw/Deposit", "Transaction Amount", "Withdraw/Deposit Reference ID", "Transaction Date", "Transaction Time", "Transaction Status"};
        Object[][] rowData = new Object[withdrawORdeposit.size()][columnNames.length];

        transactionTable = new JTable(rowData, columnNames);
        transactionTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        transactionTable.getColumnModel().getColumn(1).setPreferredWidth(170);
        transactionTable.getColumnModel().getColumn(2).setPreferredWidth(120);
        transactionTable.getColumnModel().getColumn(3).setPreferredWidth(120);
        transactionTable.getColumnModel().getColumn(4).setPreferredWidth(170);
        transactionTable.getColumnModel().getColumn(5).setPreferredWidth(100);
        transactionTable.getColumnModel().getColumn(6).setPreferredWidth(100);
        transactionTable.getColumnModel().getColumn(7).setPreferredWidth(120);
        transactionTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (row % 2 == 0) {
                    c.setBackground(Color.WHITE);
                } else {
                    c.setBackground(new Color(227, 235, 247));
                }
                return c;
            }
        });

        transactionTable.setFont(new Font(transactionTable.getFont().getFontName(), transactionTable.getFont().getStyle(), 15));
        transactionScrollPane = new JScrollPane(transactionTable);
        transactionScrollPane.getViewport().setPreferredSize(new Dimension(1170, 400));
        panel.add(transactionScrollPane);
        panel.revalidate();
        panel.repaint();
        vSpace(panel, new JTextPane(), 7);

        backtoMainMenu = new JButton("< Back");
        backtoMainMenu.setEnabled(true);
        backtoMainMenu.setPreferredSize(new Dimension(200, 35));
        backtoMainMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backtoMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ATM_Module(null, null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
        });
        panel.add(backtoMainMenu);
        shiftByPixel(panel, new JTextPane(), 25);
        reSearch = new JButton("Search Again 🔍");
        reSearch.setEnabled(true);
        reSearch.setPreferredSize(new Dimension(200, 35));
        reSearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        reSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    frame.dispose();
                    mini_Statement_Module_Window_II(null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel.add(reSearch);

        vSpace(panel, new JTextPane(), 7);

        JTextPane footer = new JTextPane();
        footer.setContentType("text/html");
        footer.setEditable(false);
        footer.setText(new FrameText().inATMFooter());
        panel.add(footer);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        if(transactionReferenceID.isEmpty()) {
            setGlassPaneView(frame, true);
            showLoadingScreen("Fetching Data...", 3000);
            JOptionPane.showMessageDialog(null, "<html><div style='font-size:12pt; color:Black;'>"+"No Transactions in Between <b>"+fromDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+"</b> and <b>"+toDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+"</b> is Found !</div></html>", "No Transaction", JOptionPane.INFORMATION_MESSAGE);
            setGlassPaneView(frame, false);
            ATM_Module(null, null);
            frame.dispose();
        } else {
            setGlassPaneView(frame, true);
            showLoadingScreen("Fetching Data...", 3000);
            
            for (int i = 0; i < withdrawORdeposit.size(); i++) {
                rowData[i][0] = i + 1;
                rowData[i][1] = ATM_Card_Number.get(0);
                rowData[i][2] = withdrawORdeposit.get(i);
                rowData[i][3] = new BigDecimal(transactionAmount.get(i));
                rowData[i][4] = transactionReferenceID.get(i);
                rowData[i][5] = transactionDate.get(i);
                rowData[i][6] = transactionTime.get(i);
                rowData[i][7] = transactionStatus.get(i);
            }
            setGlassPaneView(frame, false);
        }
    }
    public void change_ATM_PIN_Module_Window_I(Runnable callback) throws ClassNotFoundException, SQLException {
        
        JFrame frame = new JFrame("Welcome To ATM-PIN Changing Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingPINChangeModuleHeading());
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().inATMShowATMCardNumber("left")+"#### #### #### "+String.valueOf(cuatm.fetchCurrent_User_ATM_Card_Number_table_6()).substring(12, 16)+new FrameText().inATMShowATMCardNumber("right"));
    
        panel.add(custoInfo);
        vSpace(panel, new JTextPane(), 95);
        
        JTextPane enterATMPinText = new JTextPane();
        enterATMPinText.setContentType("text/html");
        enterATMPinText.setEditable(false);
        enterATMPinText.setText(new FrameText().confirmAtmPinText());
        panel.add(enterATMPinText);

        vSpace(panel, new JTextPane(), 20);
        try {   
            mff = new MaskFormatter("            #            #            #            #");
            jftff = new JFormattedTextField(mff);
            jftff.setEnabled(true);
            jftff.requestFocusInWindow();
            jftff.setToolTipText("4 Digit ATM PIN");
            jftff.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            jftff.setPreferredSize(new Dimension(500, 80));
            jftff.setFont(new Font("Arial", Font.BOLD, 26));
            jftff.getDocument().addDocumentListener(new DocumentListener() {
                @Override
            public void insertUpdate(DocumentEvent e) {
                if(jftff.getText().trim().length()==40) {
                    next.setEnabled(true);
                } else {
                    next.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {}

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });
            frame.getContentPane().add(jftff);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        vSpace(panel, new JTextPane(), 20);

        forgot = new JButton("Forgot ?");
        forgot.setEnabled(true);
        forgot.setPreferredSize(new Dimension(200, 45));
        forgot.setForeground(new Color(249, 54, 59));
        forgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        forgot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(forgot);

        shiftByPixel(panel, new JTextPane(), -127);
        
        next = new JButton("Proceed >");
        next.setEnabled(false);
        next.setPreferredSize(new Dimension(200, 45));
        next.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userGivenPIN = jftff.getText().replaceAll("\\s", "");
                int userAuthenticPIN = 0;
                try {
                    Connection con = new Connectivity().establishConnection();
                    String query = "select * from `atm` where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()) {
                        userAuthenticPIN = rs.getInt("ATM Card PIN");
                    }
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                setGlassPaneView(frame, true);
                showLoadingScreen("Verifying Your PIN...", 1500);
                setGlassPaneView(frame, false);
                if(userGivenPIN.equals(String.valueOf(userAuthenticPIN))) {
                    try {
                        change_ATM_PIN_Module_Window_II(null);
                    } catch (ClassNotFoundException | SQLException e1) {
                        e1.printStackTrace();
                    }
                    frame.dispose();
                } else {
                    setGlassPaneView(frame, true);
                    JOptionPane.showMessageDialog(null, "<html><div style='font-size:14pt; color:Red;'>"+"<b>Incorrect PIN Entered</b></div></html>", "Failure", JOptionPane.WARNING_MESSAGE);
                    jftff.setText("");
                    jftff.requestFocusInWindow();
                    setGlassPaneView(frame, false);
                }
            }
        });
        panel.add(next);

        vSpace(panel, new JTextPane(), 20);

        backtoMainMenu = new JButton("< Go Back To Previous Menu");
        backtoMainMenu.setEnabled(true);
        backtoMainMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backtoMainMenu.setPreferredSize(new Dimension(500, 55));
        backtoMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ATM_Module(null, null);
                    frame.dispose();
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel.add(backtoMainMenu);

        vSpace(panel, new JTextPane(), 88);

        JTextPane footer = new JTextPane();
        footer.setContentType("text/html");
        footer.setEditable(false);
        footer.setText(new FrameText().inATMFooter());
        panel.add(footer);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jftff.requestFocusInWindow();
        frame.setVisible(true);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        boolean numLockEnabled = toolkit.getLockingKeyState(KeyEvent.VK_NUM_LOCK);
        if (numLockEnabled==false) {
            JOptionPane.showMessageDialog(null, "NUMLOCK is currently enabled. Please consider disabling it.", "NUMLOCK Warning", JOptionPane.WARNING_MESSAGE);
            jftff.requestFocusInWindow();
        }
        
    }
    public void change_ATM_PIN_Module_Window_II(Runnable callback) throws ClassNotFoundException, SQLException {
        
        JFrame frame = new JFrame("Welcome To ATM-PIN Changing Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingPINChangeModuleHeading());
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().inATMShowATMCardNumber("left")+"#### #### #### "+String.valueOf(cuatm.fetchCurrent_User_ATM_Card_Number_table_6()).substring(12, 16)+new FrameText().inATMShowATMCardNumber("right"));
    
        panel.add(custoInfo);
        vSpace(panel, new JTextPane(), 40);
        
        JTextPane enterNewAtmPinText = new JTextPane();
        enterNewAtmPinText.setContentType("text/html");
        enterNewAtmPinText.setEditable(false);
        enterNewAtmPinText.setText(new FrameText().enterNewAtmPinText());
        panel.add(enterNewAtmPinText);

        vSpace(panel, new JTextPane(), 20);
        try {   
            mff = new MaskFormatter("            #            #            #            #");
            jftff = new JFormattedTextField(mff);
            jftff.setEnabled(true);
            jftff.requestFocusInWindow();
            jftff.setToolTipText("4 Digit ATM PIN");
            jftff.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            jftff.setPreferredSize(new Dimension(500, 80));
            jftff.setFont(new Font("Arial", Font.BOLD, 26));
            jftff.getDocument().addDocumentListener(new DocumentListener() {
                @Override
            public void insertUpdate(DocumentEvent e) {
                if(jftff.getText().trim().length()==40 && jftff.getText().trim().equals(jftfg.getText().trim())) {
                    next.setEnabled(true);
                } else {
                    next.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {}

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });
            frame.getContentPane().add(jftff);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        vSpace(panel, new JTextPane(), 20);

        JTextPane confirmNewAtmPinText = new JTextPane();
        confirmNewAtmPinText.setContentType("text/html");
        confirmNewAtmPinText.setEditable(false);
        confirmNewAtmPinText.setText(new FrameText().confirmNewAtmPinText());
        panel.add(confirmNewAtmPinText);

        vSpace(panel, new JTextPane(), 20);
        try {   
            mfg = new MaskFormatter("            #            #            #            #");
            jftfg = new JFormattedTextField(mfg);
            jftfg.setEnabled(true);
            jftfg.requestFocusInWindow();
            jftfg.setToolTipText("4 Digit ATM PIN");
            jftfg.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            jftfg.setPreferredSize(new Dimension(500, 80));
            jftfg.setFont(new Font("Arial", Font.BOLD, 26));
            jftfg.getDocument().addDocumentListener(new DocumentListener() {
                @Override
            public void insertUpdate(DocumentEvent e) {
                if(jftfg.getText().trim().length()==40 && jftfg.getText().trim().equals(jftff.getText().trim())) {
                    next.setEnabled(true);
                } else {
                    next.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {}

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });
            frame.getContentPane().add(jftfg);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        vSpace(panel, new JTextPane(), 20);
        
        backtoMainMenu = new JButton("< Go Back To Main Menu");
        backtoMainMenu.setEnabled(true);
        backtoMainMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backtoMainMenu.setPreferredSize(new Dimension(200, 45));
        backtoMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ATM_Module(null, null);
                    frame.dispose();
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel.add(backtoMainMenu);

        shiftByPixel(panel, new JTextPane(), -127);

        next = new JButton("Proceed >");
        next.setEnabled(false);
        next.setPreferredSize(new Dimension(200, 45));
        next.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        next.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userGivenNEWPIN = jftff.getText().replaceAll("\\s", "");
                String userOldPIN = null;
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingsystemsimulation", "your_mysql_database_user_id", "your_mysql_database_password")) {
                    String query = "select * from `atm` where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()) {
                        userOldPIN = String.valueOf(rs.getInt("ATM Card PIN"));
                    } 


                    if(userGivenNEWPIN.equals(userOldPIN)!=true) {
                        query = "update `atm` set `ATM Card PIN`="+Integer.parseInt(userGivenNEWPIN)+" where `Customer Auto-Generated ID`='"+ard.fetchUserIdWhileLogin()+"'";
                        st = con.createStatement();
                        st.executeUpdate(query);
                        con.close();
                        setGlassPaneView(frame, true);
                        showLoadingScreen("Processing...", 3000);
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:14pt; color: Green;'>"+"<b>ATM Pin Changed Successfully</b></div></html>", "Success", JOptionPane.INFORMATION_MESSAGE);
                        setGlassPaneView(frame, false);
                        try {
                            ATM_Module(null, null);
                        } catch (ClassNotFoundException | SQLException e1) {
                            e1.printStackTrace();
                        }
                        frame.dispose();
                    } else {
                        con.close();
                        setGlassPaneView(frame, true);
                        showLoadingScreen("Processing...", 3000);
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:14pt; color: Red;'>"+"<b>New ATM Pin Cannot Be Same as Old PIN</b></div></html>", "Failure", JOptionPane.WARNING_MESSAGE);
                        setGlassPaneView(frame, false);
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                
                
            }
        });
        panel.add(next);

        vSpace(panel, new JTextPane(), 88);

        JTextPane footer = new JTextPane();
        footer.setContentType("text/html");
        footer.setEditable(false);
        footer.setText(new FrameText().inATMFooter());
        panel.add(footer);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jftff.requestFocusInWindow();
        frame.setVisible(true);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        boolean numLockEnabled = toolkit.getLockingKeyState(KeyEvent.VK_NUM_LOCK);
        if (numLockEnabled==false) {
            JOptionPane.showMessageDialog(null, "NUMLOCK is currently enabled. Please consider disabling it.", "NUMLOCK Warning", JOptionPane.WARNING_MESSAGE);
            jftff.requestFocusInWindow();
        }
        
    }
    private void displayCompleteDetails(Runnable callback) throws ClassNotFoundException, SQLException {
        JFrame frame = new JFrame("Know Your Complete Detail");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel mainPanel = new JPanel(new GridLayout(1, 3));
        mainPanel.setBackground(Color.white);
        mainPanel.setPreferredSize(new Dimension(1536, 1000));
        frame.setContentPane(mainPanel);

        JPanel NB_panel = new JPanel();
        NB_panel.setBackground(Color.white);
        NB_panel.setPreferredSize(new Dimension(510, 0));
        NB_panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.white, 5), BorderFactory.createTitledBorder("Net Banking Details")));

            JPanel verificationPanelNB = new JPanel();
            verificationPanelNB.setBackground(Color.white);
            verificationPanelNB.setPreferredSize(new Dimension(510, 100));
            verificationPanelNB.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.white, 5), BorderFactory.createTitledBorder("VERIFICATION FOR NETBANKING DETAILS")));
            mainPanel.add(verificationPanelNB);

            xySpace(verificationPanelNB, new JTextPane(), 375, 120);

            JTextPane NBLabel = new JTextPane();
            NBLabel.setEditable(false);
            NBLabel.setContentType("text/html");
            NBLabel.setText("\"<html><div style='font-size: 22px;'><b>ENTER NET BANKING PASSWORD</b></div></html>\"");
            verificationPanelNB.add(NBLabel);

            xySpace(verificationPanelNB, new JTextPane(), 375, 50);
            
            JPasswordField passwordField = new JPasswordField();
            passwordField.setPreferredSize(new Dimension(320, 45));
            passwordField.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
            passwordField.setBackground(Color.BLACK);
            passwordField.setForeground(Color.white);
            passwordField.setCaretColor(Color.white);
            passwordField.setMargin(new Insets(10, 30, 10, 30));
            passwordField.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    verifyNB.setEnabled(!new String(passwordField.getPassword()).trim().isEmpty());
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    verifyNB.setEnabled(!new String(passwordField.getPassword()).trim().isEmpty());
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    verifyNB.setEnabled(!new String(passwordField.getPassword()).trim().isEmpty());
                }
            });
            verificationPanelNB.add(passwordField);
            
            xySpace(verificationPanelNB, new JTextPane(), 375, 20);
            
            verifyNB = new JButton("Verify");
            verifyNB.setEnabled(false);
            verifyNB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            verifyNB.setPreferredSize(new Dimension(320, 45));
            verificationPanelNB.add(verifyNB);
            verifyNB.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String userEnteredNBPIN = new String(passwordField.getPassword()).trim().replaceAll("\\s", "");
                    String authenticNBPIN = null;
                    Connection con;
                    Statement st;
                    ResultSet rs;
                    try {
                        con = new Connectivity().establishConnection();
                        String query = "select * from newUserRegistration where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
                        st = con.createStatement();
                        rs = st.executeQuery(query);
                        while(rs.next()) {
                            authenticNBPIN = rs.getString("Customer Password");
                        }
                        con.close();
                    } catch (ClassNotFoundException | SQLException e1) {
                        e1.printStackTrace();
                    }

                    setGlassPaneView(frame, true);
                    showLoadingScreen("Verifying Your PIN...", 1500);
                    setGlassPaneView(frame, false);
                    
                    if(userEnteredNBPIN.equals(authenticNBPIN)) {
                        mainPanel.remove(verificationPanelNB); 
                        mainPanel.add(NB_panel);
                        frame.revalidate();
                        frame.repaint();
                    } else {
                        JOptionPane.showMessageDialog(verificationPanelNB, "<html><div style='font-size:14pt; color:Red;'>"+"<b>PIN Entered is Incorrect</b></div></html>", "Failure", JOptionPane.ERROR_MESSAGE);
                        passwordField.setText("");
                        jftfg.setText("");
                        jftfe.setText("");
                    }
                }
            });

            xySpace(verificationPanelNB, new JTextPane(), 375, 20);

            JButton prevButton_NB = new JButton("< Get Back");
            prevButton_NB.setEnabled(true);
            prevButton_NB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            prevButton_NB.setPreferredSize(new Dimension(320, 45));
            verificationPanelNB.add(prevButton_NB);
            prevButton_NB.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    afterLogin();
                    frame.dispose();
                }
            });

        Connection con = new Connectivity().establishConnection();

        String query = "select * from `netBankingDetails` where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        String NRIorIND = null;
        while(rs.next()) {
            NRIorIND = rs.getString("NRI/Resident");
        }

        con.close();
        
        xySpace(NB_panel, new JTextPane(), 375, 40);
        
        JTextPane custID = new JTextPane();
        custID.setContentType("text/html");
        custID.setEditable(false);
        custID.setText("<html><div style='font-size: 12px;'><b>Customer ID : "+NRIorIND+"</b></div></html>");
        NB_panel.add(custID);
        
        xySpace(NB_panel, new JTextPane(), 375, 20);

        JTextPane custResidence = new JTextPane();
        custResidence.setContentType("text/html");
        custResidence.setEditable(false);
        custResidence.setText("<html><div style='font-size: 12px;'><b>Residential Status : Indian Residential</b></div></html>");
        NB_panel.add(custResidence);

        xySpace(NB_panel, new JTextPane(), 375, 40);

        JButton previousButton = new JButton("< Get Back");
        previousButton.setEnabled(true);
        previousButton.setPreferredSize(new Dimension(200, 35));
        previousButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        NB_panel.add(previousButton);
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afterLogin();
                frame.dispose();
            }
        });

        JPanel UPI_panel = new JPanel();
        UPI_panel.setBackground(Color.white);
        UPI_panel.setPreferredSize(new Dimension(510, 100));
        UPI_panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.white, 5), BorderFactory.createTitledBorder("UPI Details")));
            JPanel verificationPanelUPI = new JPanel();
            verificationPanelUPI.setBackground(Color.white);
            verificationPanelUPI.setPreferredSize(new Dimension(510, 100));
            verificationPanelUPI.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.white, 5), BorderFactory.createTitledBorder("VERIFICATION FOR UPI DETAILS")));
            mainPanel.add(verificationPanelUPI);

            xySpace(verificationPanelUPI, new JTextPane(), 375, 120);

            JTextPane UPILabel = new JTextPane();
            UPILabel.setEditable(false);
            UPILabel.setContentType("text/html");
            UPILabel.setText("\"<html><div style='font-size: 25px;'><b>ENTER UPI PIN</b></div></html>\"");
            verificationPanelUPI.add(UPILabel);

            xySpace(verificationPanelUPI, new JTextPane(), 375, 50);

            try {   
                mfg = new MaskFormatter("#       #       #       #       #       #");
                jftfg = new JFormattedTextField(mfg);
                jftfg.setEnabled(true);
                jftfg.setPreferredSize(new Dimension(320, 45));
                jftfg.setBackground(Color.BLACK);
                jftfg.setForeground(Color.WHITE);
                jftfg.setCaretColor(Color.WHITE);
                jftfg.setMargin(new Insets(0, 45, 0, 0));
                jftfg.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
                verificationPanelUPI.add(jftfg);
                jftfg.getDocument().addDocumentListener(new DocumentListener() {
                    @Override
                public void insertUpdate(DocumentEvent e) {
                    if(jftfg.getText().trim().length()==41) {
                        verifyUPI.setEnabled(true);
                    } else {
                        verifyUPI.setEnabled(false);
                    }

                }
    
                @Override
                public void removeUpdate(DocumentEvent e) {
                    
                }
                
                @Override
                public void changedUpdate(DocumentEvent e) {
                    
                }
            });
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
            
            xySpace(verificationPanelUPI, new JTextPane(), 375, 20);
            
            verifyUPI = new JButton("Verify");
            verifyUPI.setEnabled(false);
            verifyUPI.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            verifyUPI.setPreferredSize(new Dimension(320, 45));
            verificationPanelUPI.add(verifyUPI);
            verifyUPI.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String userEnteredUPIPIN = jftfg.getText().trim().replaceAll("\\s", "");
                    String authenticUPIPIN = null;
                    Connection con;
                    Statement st;
                    ResultSet rs;
                    try {
                        con = new Connectivity().establishConnection();
                        String query = "select * from upi where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
                        st = con.createStatement();
                        rs = st.executeQuery(query);
                        while(rs.next()) {
                            authenticUPIPIN = String.valueOf(rs.getInt("UPI Transaction PIN"));
                        }
                        con.close();
                    } catch (ClassNotFoundException | SQLException e1) {
                        e1.printStackTrace();
                    }

                    setGlassPaneView(frame, true);
                    showLoadingScreen("Verifying Your PIN...", 1500);
                    setGlassPaneView(frame, false);
                    
                    if(userEnteredUPIPIN.equals(authenticUPIPIN)) {
                        mainPanel.remove(verificationPanelUPI); 
                        mainPanel.add(UPI_panel);
                        frame.revalidate();
                        frame.repaint();
                    } else {
                        JOptionPane.showMessageDialog(verificationPanelUPI, "<html><div style='font-size:14pt; color:Red;'>"+"<b>PIN Entered is Incorrect</b></div></html>", "Failure", JOptionPane.ERROR_MESSAGE);
                        passwordField.setText("");
                        jftfg.setText("");
                        jftfe.setText("");
                    }
                }
            });

            xySpace(verificationPanelUPI, new JTextPane(), 375, 20);

            JButton prevButton_UPI = new JButton("< Get Back");
            prevButton_UPI.setEnabled(true);
            prevButton_UPI.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            prevButton_UPI.setPreferredSize(new Dimension(320, 45));
            verificationPanelUPI.add(prevButton_UPI);
            prevButton_UPI.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    afterLogin();
                    frame.dispose();
                }
            });

        con = new Connectivity().establishConnection();
        
        query = "select * from `upi` where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
        st = con.createStatement();
        rs = st.executeQuery(query);
        String paytm = null, phonepe = null, googlepay = null, bharatpe = null;
        while(rs.next()) {
            paytm = rs.getString("UPI Id @payTm");
            phonepe = rs.getString("UPI Id @phonePe");
            googlepay = rs.getString("UPI Id @googlePay");
            bharatpe = rs.getString("UPI Id @BharatPay");
        }
        
        con.close();
        
        xySpace(UPI_panel, new JTextPane(), 375, 40);

        JTextPane payTmUPI = new JTextPane();
        payTmUPI.setContentType("text/html");
        payTmUPI.setEditable(false);
        payTmUPI.setText("<html><div style='font-size: 12px;'><b>PayTm UPI ID : "+paytm+"</b></div></html>");
        UPI_panel.add(payTmUPI);

        xySpace(UPI_panel, new JTextPane(), 375, 20);

        JTextPane phonePeUPI = new JTextPane();
        phonePeUPI.setContentType("text/html");
        phonePeUPI.setEditable(false);
        phonePeUPI.setText("<html><div style='font-size: 12px;'><b>PhonePe UPI ID : "+phonepe+"</b></div></html>");
        UPI_panel.add(phonePeUPI);

        xySpace(UPI_panel, new JTextPane(), 375, 20);

        JTextPane googlePayUPI = new JTextPane();
        googlePayUPI.setContentType("text/html");
        googlePayUPI.setEditable(false);
        googlePayUPI.setText("<html><div style='font-size: 12px;'><b>GooglePay UPI ID : "+googlepay+"</b></div></html>");
        UPI_panel.add(googlePayUPI);

        xySpace(UPI_panel, new JTextPane(), 375, 20);

        JTextPane bharatPeUPI = new JTextPane();
        bharatPeUPI.setContentType("text/html");
        bharatPeUPI.setEditable(false);
        bharatPeUPI.setText("<html><div style='font-size: 12px;'><b>BharatPe UPI ID : "+bharatpe+"</b></div></html>");
        UPI_panel.add(bharatPeUPI);

        xySpace(UPI_panel, new JTextPane(), 375, 40);

        previousButton = new JButton("< Get Back");
        previousButton.setEnabled(true);
        previousButton.setPreferredSize(new Dimension(200, 35));
        previousButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        UPI_panel.add(previousButton);
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afterLogin();
                frame.dispose();
            }
        });

        JPanel ATM_panel = new JPanel();
        ATM_panel.setBackground(Color.white);
        ATM_panel.setPreferredSize(new Dimension(510, 0));
        ATM_panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.white, 5), BorderFactory.createTitledBorder("ATM Details")));

            JPanel verificationPanelATM = new JPanel();
            verificationPanelATM.setBackground(Color.white);
            verificationPanelATM.setPreferredSize(new Dimension(510, 100));
            verificationPanelATM.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.white, 5), BorderFactory.createTitledBorder("VERIFICATION FOR ATM DETAILS")));
            mainPanel.add(verificationPanelATM);

            xySpace(verificationPanelATM, new JTextPane(), 375, 120);

            JTextPane ATMLabel = new JTextPane();
            ATMLabel.setEditable(false);
            ATMLabel.setContentType("text/html");
            ATMLabel.setText("\"<html><div style='font-size: 25px;'><b>ENTER ATM PIN</b></div></html>\"");
            verificationPanelATM.add(ATMLabel);

            xySpace(verificationPanelATM, new JTextPane(), 375, 50);
            
            try {   
                mfe = new MaskFormatter("#           #           #           #");
                jftfe = new JFormattedTextField(mfe);
                jftfe.setEnabled(true);
                jftfe.setPreferredSize(new Dimension(320, 45));
                jftfe.setBackground(Color.BLACK);
                jftfe.setForeground(Color.WHITE);
                jftfe.setCaretColor(Color.WHITE);
                jftfe.setMargin(new Insets(0, 55, 0, 0));
                jftfe.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
                verificationPanelATM.add(jftfe);
                jftfe.getDocument().addDocumentListener(new DocumentListener() {
                    @Override
                public void insertUpdate(DocumentEvent e) {
                    if(jftfe.getText().trim().length()==37) {
                        verifyATM.setEnabled(true);
                    } else {
                        verifyATM.setEnabled(false);
                    }

                }
    
                @Override
                public void removeUpdate(DocumentEvent e) {
                    
                }
                
                @Override
                public void changedUpdate(DocumentEvent e) {
                    
                }
            });
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
            
            xySpace(verificationPanelATM, new JTextPane(), 375, 20);
            
            verifyATM = new JButton("Verify");
            verifyATM.setEnabled(false);
            verifyATM.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            verifyATM.setPreferredSize(new Dimension(320, 45));
            verificationPanelATM.add(verifyATM);
            verifyATM.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String userEnteredATMPIN = jftfe.getText().trim().replaceAll("\\s", "");
                    String authenticATMPIN = null;
                    Connection con;
                    Statement st;
                    ResultSet rs;
                    try {
                        con = new Connectivity().establishConnection();
                        String query = "select * from atm where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
                        st = con.createStatement();
                        rs = st.executeQuery(query);
                        while(rs.next()) {
                            authenticATMPIN = String.valueOf(rs.getInt("ATM Card PIN"));
                        }
                        con.close();
                    } catch (ClassNotFoundException | SQLException e1) {
                        e1.printStackTrace();
                    }

                    setGlassPaneView(frame, true);
                    showLoadingScreen("Verifying Your PIN...", 1500);
                    setGlassPaneView(frame, false);
                    
                    if(userEnteredATMPIN.equals(authenticATMPIN)) {
                        mainPanel.remove(verificationPanelATM); 
                        mainPanel.add(ATM_panel);
                        frame.revalidate();
                        frame.repaint();
                    } else {
                        JOptionPane.showMessageDialog(verificationPanelATM, "<html><div style='font-size:14pt; color:Red;'>"+"<b>PIN Entered is Incorrect</b></div></html>", "Failure", JOptionPane.ERROR_MESSAGE);
                        passwordField.setText("");
                        jftfg.setText("");
                        jftfe.setText("");

                    }
                }
            });

            xySpace(verificationPanelATM, new JTextPane(), 375, 20);

            JButton prevButton_ATM = new JButton("< Get Back");
            prevButton_ATM.setEnabled(true);
            prevButton_ATM.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            prevButton_ATM.setPreferredSize(new Dimension(320, 45));
            verificationPanelATM.add(prevButton_ATM);
            prevButton_ATM.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    afterLogin();
                    frame.dispose();
                }
            });

        con = new Connectivity().establishConnection();

        query = "select * from `atm` where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
        st = con.createStatement();
        rs = st.executeQuery(query);
        String ATMCardNumber = null, ATMCardCVVNumber = null, ATMCardExpMonth = null, ATMCardExpYear = null, ATMCardType = null, ATMCardAssociation = null;
        while(rs.next()) {
            ATMCardNumber = rs.getString("ATM Card Number");
            ATMCardCVVNumber = rs.getString("ATM Card CVV");
            ATMCardExpMonth = rs.getString("ATM Card Expiry Month");
            ATMCardExpYear = rs.getString("ATM Card Expiry Year");
            ATMCardType = rs.getString("ATM Card Type");
            ATMCardAssociation = rs.getString("ATM Card Associations");
        }
        
        con.close();
         
        xySpace(ATM_panel, new JTextPane(), 375, 40);

        JTextPane cardHolderName = new JTextPane();
        cardHolderName.setContentType("text/html");
        cardHolderName.setEditable(false);
        cardHolderName.setText("<html><div style='font-size: 12px;'><b>ATM Card Holder Name : "+cul.fetchCurrentUserName()+"</b></div></html>");
        ATM_panel.add(cardHolderName);

        xySpace(ATM_panel, new JTextPane(), 375, 20);

        JTextPane cardNumber = new JTextPane();
        cardNumber.setContentType("text/html");
        cardNumber.setEditable(false);
        cardNumber.setText("<html><div style='font-size: 12px;'><b>ATM Card Number : "+ATMCardNumber+"</b></div></html>");
        ATM_panel.add(cardNumber);

        xySpace(ATM_panel, new JTextPane(), 375, 20);

        JTextPane cardCvv = new JTextPane();
        cardCvv.setContentType("text/html");
        cardCvv.setEditable(false);
        cardCvv.setText("<html><div style='font-size: 12px;'><b>ATM Card CVV Number : "+ATMCardCVVNumber+"</b></div></html>");
        ATM_panel.add(cardCvv);

        xySpace(ATM_panel, new JTextPane(), 375, 20);

        JTextPane cardExpMonth = new JTextPane();
        cardExpMonth.setContentType("text/html");
        cardExpMonth.setEditable(false);
        cardExpMonth.setText("<html><div style='font-size: 12px;'><b>ATM Card Expiry Month : "+ATMCardExpMonth+"</b></div></html>");
        ATM_panel.add(cardExpMonth);

        xySpace(ATM_panel, new JTextPane(), 375, 20);

        JTextPane cardExpYear = new JTextPane();
        cardExpYear.setContentType("text/html");
        cardExpYear.setEditable(false);
        cardExpYear.setText("<html><div style='font-size: 12px;'><b>ATM Card Expiry Year : "+ATMCardExpYear+"</b></div></html>");
        ATM_panel.add(cardExpYear);

        xySpace(ATM_panel, new JTextPane(), 375, 20);

        JTextPane cardType = new JTextPane();
        cardType.setContentType("text/html");
        cardType.setEditable(false);
        cardType.setText("<html><div style='font-size: 12px;'><b>ATM Card Type : "+ATMCardType+"</b></div></html>");
        ATM_panel.add(cardType);

        xySpace(ATM_panel, new JTextPane(), 375, 20);

        JTextPane cardAssociation = new JTextPane();
        cardAssociation.setContentType("text/html");
        cardAssociation.setEditable(false);
        cardAssociation.setText("<html><div style='font-size: 12px;'><b>ATM Card Association : "+ATMCardAssociation+"</b></div></html>");
        ATM_panel.add(cardAssociation);

        xySpace(ATM_panel, new JTextPane(), 375, 40);

        previousButton = new JButton("< Get Back");
        previousButton.setEnabled(true);
        previousButton.setPreferredSize(new Dimension(200, 35));
        previousButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ATM_panel.add(previousButton);
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afterLogin();
                frame.dispose();
            }
        });

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
    public void upiFacilityOptionWindow(Runnable callback) throws SQLException, ClassNotFoundException {
        JFrame frame = new JFrame("Welcome To Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingUPIModuleHeading());
        
        
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().simple_adafb3_Color());
        panel.add(custoInfo);

        vSpace(panel, new JTextPane(), 50);
        
        Connection con = new Connectivity().establishConnection();
        String query = "select * from upi where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        String paytmUPI = null, phonepeUPI = null, googlepayUPI = null, bharatpeUPI = null;
        while(rs.next()) {
            paytmUPI = rs.getString("UPI Id @payTm");
            phonepeUPI = rs.getString("UPI Id @phonePe");
            googlepayUPI = rs.getString("UPI Id @googlePay");
            bharatpeUPI = rs.getString("UPI Id @BharatPay");
        }
        con.close();

        JTextPane paytm_card = new JTextPane();
        paytm_card.setContentType("text/html");
        paytm_card.setEditable(false);
        paytm_card.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(Toolkit.getDefaultToolkit().createImage(new byte[] { 0 }), new Point(0, 0), "Blank Cursor"));
        paytm_card.setText(new FrameText().paytmCard(paytmUPI));
        panel.add(paytm_card);


        shiftByPixel(panel, new JTextPane(), -130);

        JTextPane phonepe_card = new JTextPane();
        phonepe_card.setContentType("text/html");
        phonepe_card.setEditable(false);
        phonepe_card.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(Toolkit.getDefaultToolkit().createImage(new byte[] { 0 }), new Point(0, 0), "Blank Cursor"));
        phonepe_card.setText(new FrameText().phonepeCard(phonepeUPI));
        panel.add(phonepe_card);

        shiftByPixel(panel, new JTextPane(), -130);

        JTextPane googlepay_card = new JTextPane();
        googlepay_card.setContentType("text/html");
        googlepay_card.setEditable(false);
        googlepay_card.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(Toolkit.getDefaultToolkit().createImage(new byte[] { 0 }), new Point(0, 0), "Blank Cursor"));
        googlepay_card.setText(new FrameText().googlepayCard(googlepayUPI));
        panel.add(googlepay_card);

        shiftByPixel(panel, new JTextPane(), -130);

        JTextPane bharatpe_card = new JTextPane();
        bharatpe_card.setContentType("text/html");
        bharatpe_card.setEditable(false);
        bharatpe_card.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(Toolkit.getDefaultToolkit().createImage(new byte[] { 0 }), new Point(0, 0), "Blank Cursor"));
        bharatpe_card.setText(new FrameText().bharatpeCard(bharatpeUPI));
        panel.add(bharatpe_card);

        vSpace(panel, new JTextPane(), 0);


        JButton enter_paytm = new JButton("Use PayTm");
        enter_paytm.setEnabled(true); 
        enter_paytm.setPreferredSize(new Dimension(258, 45));
        enter_paytm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(enter_paytm);
        final String paytmUPIFinal = paytmUPI;
        enter_paytm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuupi.setCurrent_User_UPI_ID_table_8(paytmUPIFinal);
                UPIPaytmWindow(null);
                frame.dispose();
            }
        });

        shiftByPixel(panel, new JTextPane(), -120);

        JButton enter_phonepe = new JButton("Use PhonePe");
        enter_phonepe.setEnabled(true); 
        enter_phonepe.setPreferredSize(new Dimension(258, 45));
        enter_phonepe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(enter_phonepe);
        final String phonepeUPIFinal = phonepeUPI;
        enter_phonepe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuupi.setCurrent_User_UPI_ID_table_8(phonepeUPIFinal);
                UPIPhonePeWindow(null);
                frame.dispose();
            }
        });

        shiftByPixel(panel, new JTextPane(), -120);

        JButton enter_googlepay = new JButton("Use GooglePay");
        enter_googlepay.setEnabled(true); 
        enter_googlepay.setPreferredSize(new Dimension(258, 45));
        enter_googlepay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(enter_googlepay);
        final String googlepayUPIFinal = googlepayUPI;
        enter_googlepay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuupi.setCurrent_User_UPI_ID_table_8(googlepayUPIFinal);
                UPIGooglePayWindow(null);
                frame.dispose();
            }
        });

        shiftByPixel(panel, new JTextPane(), -120);

        JButton enter_bharatpe = new JButton("Use BharatPe");
        enter_bharatpe.setEnabled(true); 
        enter_bharatpe.setPreferredSize(new Dimension( 258, 45));
        enter_bharatpe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(enter_bharatpe);
        final String bharatpeUPIFinal = bharatpeUPI;
        enter_bharatpe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuupi.setCurrent_User_UPI_ID_table_8(bharatpeUPIFinal);
                UPIBharatPeWindow(null);
                frame.dispose();
            }
        });

        vSpace(panel, new JTextPane(), 20);

        JButton getBack = new JButton("< Get Back");
        getBack.setEnabled(true); 
        getBack.setPreferredSize(new Dimension( 300, 40));
        getBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(getBack);
        getBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afterLogin();
                frame.dispose();;     
            }
        });

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
    public void UPIPaytmWindow(Runnable callback) {
        
        JFrame frame = new JFrame("Welcome To Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingPaytmModuleHeading());
        
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().afterClickingPayTmModuleShowUPIID("left")+cuupi.fetchCurrent_User_UPI_ID_table_8()+new FrameText().afterClickingPayTmModuleShowUPIID("right"));
        panel.add(custoInfo);

        vSpace(panel, new JTextPane(), 50);
        
        JLabel enterUpiIdOfReceiver = new JLabel("Enter Reciever's UPI Id");
        enterUpiIdOfReceiver.setFont(new Font("Arial", Font.BOLD, 20));
        enterUpiIdOfReceiver.setForeground(Color.black);
        panel.add(enterUpiIdOfReceiver);

        shiftByPixel(panel, new JTextPane(), 710);

        vSpace(panel, new JTextPane(), 10);

        try {   
            mfa = new MaskFormatter("##########@paytm");
            jftfa = new JFormattedTextField(mfa);
            jftfa.setEnabled(true);
            jftfa.setPreferredSize(new Dimension(270, 40));
            jftfa.setMargin(new Insets(0, 60, 0, 0));
            jftfa.setForeground(Color.decode("#4169E1"));
            jftfa.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
            jftfa.getDocument().addDocumentListener(new DocumentListener() {
                @Override
            public void insertUpdate(DocumentEvent e) {
                verifyUPI.setEnabled(jftfa.getText().trim().replaceAll("\\s", "").length()==16);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {}

            @Override
            public void changedUpdate(DocumentEvent e) {}
            });
            panel.add(jftfa);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        verifyUPI = new JButton("Verify");
        verifyUPI.setEnabled(false);
        verifyUPI.setPreferredSize(new Dimension(80, 40));
        verifyUPI.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(verifyUPI);
        verifyUPI.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String query = "select * from upi where `UPI Id @payTm` = '"+jftfa.getText().trim().replaceAll("\\s", "")+"'";
                    String recieverUniqueId = null, reciever_honorific_Name = null, reciever_first_Name = null, reciever_middle_Name = null, reciever_last_Name = null;
                    Connection con = new Connectivity().establishConnection();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()) {
                        recieverUniqueId = rs.getString("Customer Auto-Generated ID");
                    }
                    query = "select * from newUserRegistration where `Customer Auto-Generated ID` = '"+recieverUniqueId+"'";
                    st = con.createStatement();
                    rs = st.executeQuery(query);
                    while(rs.next()) {
                        reciever_honorific_Name = rs.getString("Customer Honorific");
                        reciever_first_Name = rs.getString("Customer First Name");
                        reciever_middle_Name = rs.getString("Customer Middle Name");
                        reciever_last_Name = rs.getString("Customer Last Name");
                    }
                    con.close();
                    if(recieverUniqueId != null) {
                        if(recieverUniqueId.equals(ard.fetchUserIdWhileLogin())) {
                            setGlassPaneView(frame, true);
                            showLoadingScreen("Verifying...", 1000);
                            verificationStatus.setText("<html><body><div style=' font-size: 12px;'><b>Sender and Receiver can't be Same, <font color='red'>Illegal UPI ID Entered "+ (char) '\u26D4'+"</b></font></div></body></html>");
                            setGlassPaneView(frame, false);
                            jftfa.setText("");
                            jftfa.requestFocusInWindow();
                            SwingUtilities.invokeLater(()-> {
                                try {
                                    Thread.sleep(300);
                                    description_Text_Area.setVisible(false);
                                    enterAmountToBeSent.setVisible(false);
                                    enterAmountToBeSent.setVisible(false);
                                    amountTextField.setVisible(false);
                                    send.setVisible(false);
                                } catch (InterruptedException e1) {
                                    e1.printStackTrace();
                                }
                            });
                        } else {
                            
                            hut.setSender_Unique_Id(ard.fetchUserIdWhileLogin());
                            hut.setReceiver_Unique_Id(recieverUniqueId);
                            hut.setReceiver_UPI_ID_table_9(jftfa.getText().trim().replaceAll("\\s", ""));
                            hut.setSender_UPI_ID_table_9(cuupi.fetchCurrent_User_UPI_ID_table_8());

                            setGlassPaneView(frame, true);
                            showLoadingScreen("Verifying...", 1000);
                            verificationStatus.setText("<html><body><div style=' font-size: 12px;'><b>"+reciever_honorific_Name+" "+reciever_first_Name+" "+reciever_middle_Name+""+reciever_last_Name+", <font color='green'>Verified "+ (char) '\u2714'+"</b></font></div></body></html>");
                            setGlassPaneView(frame, false);
                            jftfa.setText("");
                            SwingUtilities.invokeLater(()-> {
                                try {
                                    Thread.sleep(1300);
                                    description_Text_Area.setVisible(true);
                                    enterAmountToBeSent.setVisible(true);
                                    enterAmountToBeSent.setVisible(true);
                                    amountTextField.setVisible(true);
                                    send.setVisible(true);
                                } catch (InterruptedException e1) {
                                    e1.printStackTrace();
                                }
                            });
                        }
                    } else {
                        setGlassPaneView(frame, true);
                        showLoadingScreen("Verifying...", 1000);
                        verificationStatus.setText("<html><body><div style=' font-size: 12px;'><b>No Such User Found, <font color='red'>Verification Failed "+ (char) '\u2718'+"</b></font></div></body></html>");
                        setGlassPaneView(frame, false);
                        jftfa.setText("");
                        jftfa.requestFocusInWindow();
                        SwingUtilities.invokeLater(()-> {
                            try {
                                Thread.sleep(300);
                                description_Text_Area.setVisible(false);
                                enterAmountToBeSent.setVisible(false);
                                enterAmountToBeSent.setVisible(false);
                                amountTextField.setVisible(false);
                                send.setVisible(false);
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }
                        });
                    }
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
            
        });

        shiftByPixel(panel, new JTextPane(), 570);

        vSpace(panel, new JTextPane(), 0);

        
        verificationStatus = new JTextPane();
        verificationStatus.setContentType("text/html");
        verificationStatus.setPreferredSize(new Dimension(430, 40));
        verificationStatus.setEditable(false);
        verificationStatus.setText("<html><body><div style=' font-size: 12px;'>Waiting for verification request...</div></body></html>");
        panel.add(verificationStatus);
        
        shiftByPixel(panel, new JTextPane(), 500);

        vSpace(panel, new JTextPane(), 15);
        
        description_Text_Area = new JTextArea();
        description_Text_Area.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
        description_Text_Area.setLineWrap(true);
        description_Text_Area.setWrapStyleWord(true);
        description_Text_Area.setPreferredSize(new Dimension(500, 150));
        description_Text_Area.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(" Decription / Subject / Note "), BorderFactory.createEmptyBorder(10, 15, 10, 15)));
        description_Text_Area.setVisible(false);
        panel.add(description_Text_Area);

        shiftByPixel(panel, new JTextPane(), 430);

        vSpace(panel, new JTextPane(), 30);

        enterAmountToBeSent = new JLabel("Enter Amount");
        enterAmountToBeSent.setFont(new Font("Arial", Font.BOLD, 20));
        enterAmountToBeSent.setForeground(Color.black);
        enterAmountToBeSent.setVisible(false);
        panel.add(enterAmountToBeSent);

        shiftByPixel(panel, new JTextPane(), 800);

        vSpace(panel, new JTextPane(), 15);
        
        amountTextField = new UserEntryValidator().createFloatingNumericTextField();
        amountTextField.setPreferredSize(new Dimension(270, 40));
        amountTextField.setFont(new Font("Arial", Font.BOLD, 20));
        amountTextField.setMargin(new Insets(0, 50, 0, 30));
        amountTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        amountTextField.setVisible(false);
        amountTextField.setToolTipText("Amount To Be Withdrawn");
        panel.add(amountTextField);
        amountTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                send.setEnabled(amountTextField.getText().trim().length()>=1);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                send.setEnabled(amountTextField.getText().trim().length()>=1);
            }
            
            @Override
            public void changedUpdate(DocumentEvent e) {
                send.setEnabled(amountTextField.getText().trim().length()>=1);
            }
        });

        send = new JButton("Send 📨");
        send.setEnabled(false);
        send.setPreferredSize(new Dimension(80, 40));
        send.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        send.setVisible(false);
        panel.add(send);
        send.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String amount_to_be_transfered = amountTextField.getText().trim();
                if(amount_to_be_transfered.charAt(amount_to_be_transfered.length()-1)=='.') {
                    amount_to_be_transfered = amount_to_be_transfered + '0';
                } else if(amount_to_be_transfered.charAt(0)=='.') {
                    amount_to_be_transfered = '0' + amount_to_be_transfered;
                }
                
                hut.setTransaction_Amount_table_9(Double.parseDouble(amount_to_be_transfered));
                hut.setDescription_Subject_table_9(description_Text_Area.getText().trim());

                verifyPasswordAndTransferPaytm(null);
                frame.dispose();
            }
            
        });

        shiftByPixel(panel, new JTextPane(), 570);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jftfa.requestFocusInWindow();
        frame.setVisible(true);
    }
    public void verifyPasswordAndTransferPaytm(Runnable callback) {
        JFrame frame = new JFrame("Welcome To Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingPaytmModuleHeading());
        
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().afterClickingPayTmModuleShowUPIID("left")+cuupi.fetchCurrent_User_UPI_ID_table_8()+new FrameText().afterClickingPayTmModuleShowUPIID("right"));
        panel.add(custoInfo);

        vSpace(panel, new JTextPane(), 100);
        
        JLabel enterUpiIdOfReceiver = new JLabel("Enter PayTm UPI PIN");
        enterUpiIdOfReceiver.setFont(new Font("Arial", Font.BOLD, 25));
        enterUpiIdOfReceiver.setForeground(Color.black);
        panel.add(enterUpiIdOfReceiver);

        vSpace(panel, new JTextPane(), 10);

        try {   
            mfa = new MaskFormatter("        #        #        #        #        #        #");
            jftfa = new JFormattedTextField(mfa);
            jftfa.setEnabled(true);
            jftfa.setPreferredSize(new Dimension(500, 80));
            jftfa.setMargin(new Insets(0, 4, 0, 0));
            jftfa.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            jftfa.setFont(new Font("Arial", Font.BOLD, 26));
            jftfa.getDocument().addDocumentListener(new DocumentListener() {
                @Override
            public void insertUpdate(DocumentEvent e) {
                send.setEnabled(jftfa.getText().trim().replaceAll("\\s", "").length()==6);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {}

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });
            panel.add(jftfa);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        vSpace(panel, new JTextPane(), 15);


        forgot = new JButton("Forgot ?");
        forgot.setEnabled(true);
        forgot.setPreferredSize(new Dimension(200, 40));
        forgot.setForeground(new Color(249, 54, 59));
        forgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(forgot);
        forgot.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
        });

        shiftByPixel(panel, new JTextPane(), -127);

        send = new JButton("Send ₹");
        send.setEnabled(false);
        send.setPreferredSize(new Dimension(200, 40));
        send.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(send);
        send.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String query = "select * from upi where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
                    int authentic_UPI_Pin = 0;
                    Connection con = new Connectivity().establishConnection();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()) {
                        authentic_UPI_Pin = rs.getInt("UPI Transaction PIN");
                    }
                    con.close();
                    if(Integer.parseInt(jftfa.getText().trim().replaceAll("\\s", ""))==authentic_UPI_Pin) {

                        try {
                            int statusOfSender = debitMoney(ard.fetchUserIdWhileLogin(), 0, "UPI");
                            if(statusOfSender==0) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Insufficient Balance</b></div></html>", "Failed", JOptionPane.ERROR_MESSAGE);
                            } else if(statusOfSender==1) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Monthly Limit Exceeded !</b></div></html>", "Failed", JOptionPane.ERROR_MESSAGE);
                            } else if(statusOfSender==2) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Daily Limit Exceeded !</b></div></html>", "Failed", JOptionPane.ERROR_MESSAGE);
                            } else if(statusOfSender==3) {
                            } else if(statusOfSender==4) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Your ATM Facility is Frozen</b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                            } else if(statusOfSender==5) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Your ATM Facility is Deactivated</b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                            } else if(statusOfSender==6) {
                                int statusOfReceiver = creditMoney(hut.fetchReceiver_Unique_Id(), 0, "UPI");
                                setGlassPaneView(frame, true);
                                showLoadingScreen("Verifying Your PIN...", 1500);
                                setGlassPaneView(frame, false);
                                jftfa.setText(null);
                                jftfa.requestFocusInWindow();
                                setGlassPaneView(frame, true);
                                showLoadingScreen("Transferring Amount...", 1500);
                                showLoadingScreen("<html><div style='font-size:16pt; color:Green;'>"+"<b>Transaction Successful</b></div></html>", 1500);
                                setGlassPaneView(frame, false);
                            }
                            setGlassPaneView(frame, false);
                            afterLogin();
                            frame.dispose();
                        } catch (NumberFormatException | ClassNotFoundException | SQLException e1) {
                            e1.printStackTrace();
                        }
                    } else {
                        setGlassPaneView(frame, true);
                        showLoadingScreen("Verifying Your PIN...", 1500);
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:14pt; color:Red;'>"+"<b>Entered Incorrect UPI PIN</b></div></html>", "Failure", JOptionPane.WARNING_MESSAGE);
                        setGlassPaneView(frame, false);
                        jftfa.setText(null);
                        jftfa.requestFocusInWindow();
                    }
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
            
        });


        vSpace(panel, new JTextPane(), 0);

        back = new JButton("< Go Back To Previous Menu");
        back.setEnabled(true);
        back.setPreferredSize(new Dimension(500, 40));
        back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(back);
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    upiFacilityOptionWindow(null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
            
        });
        
        

        vSpace(panel, new JTextPane(), 40);


        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jftfa.requestFocusInWindow();
        frame.setVisible(true);
    }
    public void UPIPhonePeWindow(Runnable callback) {
        
        JFrame frame = new JFrame("Welcome To Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingPhonePeModuleHeading());
        
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().afterClickingPhonePeModuleShowUPIID("left")+cuupi.fetchCurrent_User_UPI_ID_table_8()+new FrameText().afterClickingPhonePeModuleShowUPIID("right"));
        panel.add(custoInfo);

        vSpace(panel, new JTextPane(), 50);
        
        JLabel enterUpiIdOfReceiver = new JLabel("Enter Reciever's UPI Id");
        enterUpiIdOfReceiver.setFont(new Font("Arial", Font.BOLD, 20));
        enterUpiIdOfReceiver.setForeground(Color.black);
        panel.add(enterUpiIdOfReceiver);

        shiftByPixel(panel, new JTextPane(), 710);

        vSpace(panel, new JTextPane(), 10);

        try {   
            mfa = new MaskFormatter("##########@ybl");
            jftfa = new JFormattedTextField(mfa);
            jftfa.setEnabled(true);
            jftfa.setPreferredSize(new Dimension(270, 40));
            jftfa.setMargin(new Insets(0, 60, 0, 0));
            jftfa.setForeground(Color.decode("#4169E1"));
            jftfa.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
            jftfa.getDocument().addDocumentListener(new DocumentListener() {
                @Override
            public void insertUpdate(DocumentEvent e) {
                verifyUPI.setEnabled(jftfa.getText().trim().replaceAll("\\s", "").length()==14);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {}

            @Override
            public void changedUpdate(DocumentEvent e) {}
            });
            panel.add(jftfa);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        verifyUPI = new JButton("Verify");
        verifyUPI.setEnabled(false);
        verifyUPI.setPreferredSize(new Dimension(80, 40));
        verifyUPI.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(verifyUPI);
        verifyUPI.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String query = "select * from upi where `UPI Id @phonePe` = '"+jftfa.getText().trim().replaceAll("\\s", "")+"'";
                    String recieverUniqueId = null, reciever_honorific_Name = null, reciever_first_Name = null, reciever_middle_Name = null, reciever_last_Name = null;
                    Connection con = new Connectivity().establishConnection();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()) {
                        recieverUniqueId = rs.getString("Customer Auto-Generated ID");
                    }
                    query = "select * from newUserRegistration where `Customer Auto-Generated ID` = '"+recieverUniqueId+"'";
                    st = con.createStatement();
                    rs = st.executeQuery(query);
                    while(rs.next()) {
                        reciever_honorific_Name = rs.getString("Customer Honorific");
                        reciever_first_Name = rs.getString("Customer First Name");
                        reciever_middle_Name = rs.getString("Customer Middle Name");
                        reciever_last_Name = rs.getString("Customer Last Name");
                    }
                    con.close();
                    if(recieverUniqueId != null) {
                        if(recieverUniqueId.equals(ard.fetchUserIdWhileLogin())) {
                            setGlassPaneView(frame, true);
                            showLoadingScreen("Verifying...", 1000);
                            verificationStatus.setText("<html><body><div style=' font-size: 12px;'><b>Sender and Receiver can't be Same, <font color='red'>Illegal UPI ID Entered "+ (char) '\u26D4'+"</b></font></div></body></html>");
                            setGlassPaneView(frame, false);
                            jftfa.setText("");
                            jftfa.requestFocusInWindow();
                            SwingUtilities.invokeLater(()-> {
                                try {
                                    Thread.sleep(300);
                                    description_Text_Area.setVisible(false);
                                    enterAmountToBeSent.setVisible(false);
                                    enterAmountToBeSent.setVisible(false);
                                    amountTextField.setVisible(false);
                                    send.setVisible(false);
                                } catch (InterruptedException e1) {
                                    e1.printStackTrace();
                                }
                            });
                        } else {
                            
                            hut.setSender_Unique_Id(ard.fetchUserIdWhileLogin());
                            hut.setReceiver_Unique_Id(recieverUniqueId);
                            hut.setReceiver_UPI_ID_table_9(jftfa.getText().trim().replaceAll("\\s", ""));
                            hut.setSender_UPI_ID_table_9(cuupi.fetchCurrent_User_UPI_ID_table_8());

                            setGlassPaneView(frame, true);
                            showLoadingScreen("Verifying...", 1000);
                            verificationStatus.setText("<html><body><div style=' font-size: 12px;'><b>"+reciever_honorific_Name+" "+reciever_first_Name+" "+reciever_middle_Name+""+reciever_last_Name+", <font color='green'>Verified "+ (char) '\u2714'+"</b></font></div></body></html>");
                            setGlassPaneView(frame, false);
                            jftfa.setText("");
                            SwingUtilities.invokeLater(()-> {
                                try {
                                    Thread.sleep(1300);
                                    description_Text_Area.setVisible(true);
                                    enterAmountToBeSent.setVisible(true);
                                    enterAmountToBeSent.setVisible(true);
                                    amountTextField.setVisible(true);
                                    send.setVisible(true);
                                } catch (InterruptedException e1) {
                                    e1.printStackTrace();
                                }
                            });
                        }
                    } else {
                        setGlassPaneView(frame, true);
                        showLoadingScreen("Verifying...", 1000);
                        verificationStatus.setText("<html><body><div style=' font-size: 12px;'><b>No Such User Found, <font color='red'>Verification Failed "+ (char) '\u2718'+"</b></font></div></body></html>");
                        setGlassPaneView(frame, false);
                        jftfa.setText("");
                        jftfa.requestFocusInWindow();
                        SwingUtilities.invokeLater(()-> {
                            try {
                                Thread.sleep(300);
                                description_Text_Area.setVisible(false);
                                enterAmountToBeSent.setVisible(false);
                                enterAmountToBeSent.setVisible(false);
                                amountTextField.setVisible(false);
                                send.setVisible(false);
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }
                        });
                    }
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
            
        });

        shiftByPixel(panel, new JTextPane(), 570);

        vSpace(panel, new JTextPane(), 0);

        
        verificationStatus = new JTextPane();
        verificationStatus.setContentType("text/html");
        verificationStatus.setPreferredSize(new Dimension(430, 40));
        verificationStatus.setEditable(false);
        verificationStatus.setText("<html><body><div style=' font-size: 12px;'>Waiting for verification request...</div></body></html>");
        panel.add(verificationStatus);
        
        shiftByPixel(panel, new JTextPane(), 500);

        vSpace(panel, new JTextPane(), 15);
        
        description_Text_Area = new JTextArea();
        description_Text_Area.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
        description_Text_Area.setLineWrap(true);
        description_Text_Area.setWrapStyleWord(true);
        description_Text_Area.setPreferredSize(new Dimension(500, 150));
        description_Text_Area.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(" Decription / Subject / Note "), BorderFactory.createEmptyBorder(10, 15, 10, 15)));
        description_Text_Area.setVisible(false);
        panel.add(description_Text_Area);

        shiftByPixel(panel, new JTextPane(), 430);

        vSpace(panel, new JTextPane(), 30);

        enterAmountToBeSent = new JLabel("Enter Amount");
        enterAmountToBeSent.setFont(new Font("Arial", Font.BOLD, 20));
        enterAmountToBeSent.setForeground(Color.black);
        enterAmountToBeSent.setVisible(false);
        panel.add(enterAmountToBeSent);

        shiftByPixel(panel, new JTextPane(), 800);

        vSpace(panel, new JTextPane(), 15);
        
        amountTextField = new UserEntryValidator().createFloatingNumericTextField();
        amountTextField.setPreferredSize(new Dimension(270, 40));
        amountTextField.setFont(new Font("Arial", Font.BOLD, 20));
        amountTextField.setMargin(new Insets(0, 50, 0, 30));
        amountTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        amountTextField.setVisible(false);
        amountTextField.setToolTipText("Amount To Be Withdrawn");
        panel.add(amountTextField);
        amountTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                send.setEnabled(amountTextField.getText().trim().length()>=1);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                send.setEnabled(amountTextField.getText().trim().length()>=1);
            }
            
            @Override
            public void changedUpdate(DocumentEvent e) {
                send.setEnabled(amountTextField.getText().trim().length()>=1);
            }
        });

        send = new JButton("Send 📨");
        send.setEnabled(false);
        send.setPreferredSize(new Dimension(80, 40));
        send.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        send.setVisible(false);
        panel.add(send);
        send.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String amount_to_be_transfered = amountTextField.getText().trim();
                if(amount_to_be_transfered.charAt(amount_to_be_transfered.length()-1)=='.') {
                    amount_to_be_transfered = amount_to_be_transfered + '0';
                } else if(amount_to_be_transfered.charAt(0)=='.') {
                    amount_to_be_transfered = '0' + amount_to_be_transfered;
                }
                
                hut.setTransaction_Amount_table_9(Double.parseDouble(amount_to_be_transfered));
                hut.setDescription_Subject_table_9(description_Text_Area.getText().trim());

                verifyPasswordAndTransferPhonePe(null);
                frame.dispose();
            }
            
        });

        shiftByPixel(panel, new JTextPane(), 570);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jftfa.requestFocusInWindow();
        frame.setVisible(true);
    }
    public void verifyPasswordAndTransferPhonePe(Runnable callback) {
        JFrame frame = new JFrame("Welcome To Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingPhonePeModuleHeading());
        
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().afterClickingPhonePeModuleShowUPIID("left")+cuupi.fetchCurrent_User_UPI_ID_table_8()+new FrameText().afterClickingPhonePeModuleShowUPIID("right"));
        panel.add(custoInfo);

        vSpace(panel, new JTextPane(), 100);
        
        JLabel enterUpiIdOfReceiver = new JLabel("Enter PhonePe UPI PIN");
        enterUpiIdOfReceiver.setFont(new Font("Arial", Font.BOLD, 25));
        enterUpiIdOfReceiver.setForeground(Color.black);
        panel.add(enterUpiIdOfReceiver);

        vSpace(panel, new JTextPane(), 10);

        try {   
            mfa = new MaskFormatter("        #        #        #        #        #        #");
            jftfa = new JFormattedTextField(mfa);
            jftfa.setEnabled(true);
            jftfa.setPreferredSize(new Dimension(500, 80));
            jftfa.setMargin(new Insets(0, 4, 0, 0));
            jftfa.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            jftfa.setFont(new Font("Arial", Font.BOLD, 26));
            jftfa.getDocument().addDocumentListener(new DocumentListener() {
                @Override
            public void insertUpdate(DocumentEvent e) {
                send.setEnabled(jftfa.getText().trim().replaceAll("\\s", "").length()==6);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {}

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });
            panel.add(jftfa);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        vSpace(panel, new JTextPane(), 15);


        forgot = new JButton("Forgot ?");
        forgot.setEnabled(true);
        forgot.setPreferredSize(new Dimension(200, 40));
        forgot.setForeground(new Color(249, 54, 59));
        forgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(forgot);
        forgot.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
        });

        shiftByPixel(panel, new JTextPane(), -127);

        send = new JButton("Send ₹");
        send.setEnabled(false);
        send.setPreferredSize(new Dimension(200, 40));
        send.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(send);
        send.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String query = "select * from upi where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
                    int authentic_UPI_Pin = 0;
                    Connection con = new Connectivity().establishConnection();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()) {
                        authentic_UPI_Pin = rs.getInt("UPI Transaction PIN");
                    }
                    con.close();
                    if(Integer.parseInt(jftfa.getText().trim().replaceAll("\\s", ""))==authentic_UPI_Pin) {

                        try {
                            int statusOfSender = debitMoney(ard.fetchUserIdWhileLogin(), 0, "UPI");
                            if(statusOfSender==0) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Insufficient Balance</b></div></html>", "Failed", JOptionPane.ERROR_MESSAGE);
                            } else if(statusOfSender==1) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Monthly Limit Exceeded !</b></div></html>", "Failed", JOptionPane.ERROR_MESSAGE);
                            } else if(statusOfSender==2) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Daily Limit Exceeded !</b></div></html>", "Failed", JOptionPane.ERROR_MESSAGE);
                            } else if(statusOfSender==3) {
                            } else if(statusOfSender==4) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Your ATM Facility is Frozen</b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                            } else if(statusOfSender==5) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Your ATM Facility is Deactivated</b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                            } else if(statusOfSender==6) {
                                int statusOfReceiver = creditMoney(hut.fetchReceiver_Unique_Id(), 0, "UPI");
                                setGlassPaneView(frame, true);
                                showLoadingScreen("Verifying Your PIN...", 1500);
                                setGlassPaneView(frame, false);
                                jftfa.setText(null);
                                jftfa.requestFocusInWindow();
                                setGlassPaneView(frame, true);
                                showLoadingScreen("Transferring Amount...", 1500);
                                showLoadingScreen("<html><div style='font-size:16pt; color:Green;'>"+"<b>Transaction Successful</b></div></html>", 1500);
                                setGlassPaneView(frame, false);
                            }
                            setGlassPaneView(frame, false);
                            afterLogin();
                            frame.dispose();
                        } catch (NumberFormatException | ClassNotFoundException | SQLException e1) {
                            e1.printStackTrace();
                        }
                    } else {
                        setGlassPaneView(frame, true);
                        showLoadingScreen("Verifying Your PIN...", 1500);
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:14pt; color:Red;'>"+"<b>Entered Incorrect UPI PIN</b></div></html>", "Failure", JOptionPane.WARNING_MESSAGE);
                        setGlassPaneView(frame, false);
                        jftfa.setText(null);
                        jftfa.requestFocusInWindow();
                    }
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
            
        });


        vSpace(panel, new JTextPane(), 0);

        back = new JButton("< Go Back To Previous Menu");
        back.setEnabled(true);
        back.setPreferredSize(new Dimension(500, 40));
        back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(back);
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    upiFacilityOptionWindow(null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
            
        });
        
        vSpace(panel, new JTextPane(), 40);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jftfa.requestFocusInWindow();
        frame.setVisible(true);
    }
    public void UPIGooglePayWindow(Runnable callback) {
        
        JFrame frame = new JFrame("Welcome To Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingGooglePayModuleHeading());
        
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().afterClickingGooglePayModuleShowUPIID("left")+cuupi.fetchCurrent_User_UPI_ID_table_8()+new FrameText().afterClickingGooglePayModuleShowUPIID("right"));
        panel.add(custoInfo);

        vSpace(panel, new JTextPane(), 50);
        
        JLabel enterUpiIdOfReceiver = new JLabel("Enter Reciever's UPI Id");
        enterUpiIdOfReceiver.setFont(new Font("Arial", Font.BOLD, 20));
        enterUpiIdOfReceiver.setForeground(Color.black);
        panel.add(enterUpiIdOfReceiver);

        shiftByPixel(panel, new JTextPane(), 710);

        vSpace(panel, new JTextPane(), 10);

        try {   
            mfa = new MaskFormatter("##########@gpay");
            jftfa = new JFormattedTextField(mfa);
            jftfa.setEnabled(true);
            jftfa.setPreferredSize(new Dimension(270, 40));
            jftfa.setMargin(new Insets(0, 60, 0, 0));
            jftfa.setForeground(Color.decode("#4169E1"));
            jftfa.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
            jftfa.getDocument().addDocumentListener(new DocumentListener() {
                @Override
            public void insertUpdate(DocumentEvent e) {
                verifyUPI.setEnabled(jftfa.getText().trim().replaceAll("\\s", "").length()==15);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {}

            @Override
            public void changedUpdate(DocumentEvent e) {}
            });
            panel.add(jftfa);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        verifyUPI = new JButton("Verify");
        verifyUPI.setEnabled(false);
        verifyUPI.setPreferredSize(new Dimension(80, 40));
        verifyUPI.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(verifyUPI);
        verifyUPI.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String query = "select * from upi where `UPI Id @googlePay` = '"+jftfa.getText().trim().replaceAll("\\s", "")+"'";
                    String recieverUniqueId = null, reciever_honorific_Name = null, reciever_first_Name = null, reciever_middle_Name = null, reciever_last_Name = null;
                    Connection con = new Connectivity().establishConnection();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()) {
                        recieverUniqueId = rs.getString("Customer Auto-Generated ID");
                    }
                    query = "select * from newUserRegistration where `Customer Auto-Generated ID` = '"+recieverUniqueId+"'";
                    st = con.createStatement();
                    rs = st.executeQuery(query);
                    while(rs.next()) {
                        reciever_honorific_Name = rs.getString("Customer Honorific");
                        reciever_first_Name = rs.getString("Customer First Name");
                        reciever_middle_Name = rs.getString("Customer Middle Name");
                        reciever_last_Name = rs.getString("Customer Last Name");
                    }
                    con.close();
                    if(recieverUniqueId != null) {
                        if(recieverUniqueId.equals(ard.fetchUserIdWhileLogin())) {
                            setGlassPaneView(frame, true);
                            showLoadingScreen("Verifying...", 1000);
                            verificationStatus.setText("<html><body><div style=' font-size: 12px;'><b>Sender and Receiver can't be Same, <font color='red'>Illegal UPI ID Entered "+ (char) '\u26D4'+"</b></font></div></body></html>");
                            setGlassPaneView(frame, false);
                            jftfa.setText("");
                            jftfa.requestFocusInWindow();
                            SwingUtilities.invokeLater(()-> {
                                try {
                                    Thread.sleep(300);
                                    description_Text_Area.setVisible(false);
                                    enterAmountToBeSent.setVisible(false);
                                    enterAmountToBeSent.setVisible(false);
                                    amountTextField.setVisible(false);
                                    send.setVisible(false);
                                } catch (InterruptedException e1) {
                                    e1.printStackTrace();
                                }
                            });
                        } else {
                            
                            hut.setSender_Unique_Id(ard.fetchUserIdWhileLogin());
                            hut.setReceiver_Unique_Id(recieverUniqueId);
                            hut.setReceiver_UPI_ID_table_9(jftfa.getText().trim().replaceAll("\\s", ""));
                            hut.setSender_UPI_ID_table_9(cuupi.fetchCurrent_User_UPI_ID_table_8());

                            setGlassPaneView(frame, true);
                            showLoadingScreen("Verifying...", 1000);
                            verificationStatus.setText("<html><body><div style=' font-size: 12px;'><b>"+reciever_honorific_Name+" "+reciever_first_Name+" "+reciever_middle_Name+""+reciever_last_Name+", <font color='green'>Verified "+ (char) '\u2714'+"</b></font></div></body></html>");
                            setGlassPaneView(frame, false);
                            jftfa.setText("");
                            SwingUtilities.invokeLater(()-> {
                                try {
                                    Thread.sleep(1300);
                                    description_Text_Area.setVisible(true);
                                    enterAmountToBeSent.setVisible(true);
                                    enterAmountToBeSent.setVisible(true);
                                    amountTextField.setVisible(true);
                                    send.setVisible(true);
                                } catch (InterruptedException e1) {
                                    e1.printStackTrace();
                                }
                            });
                        }
                    } else {
                        setGlassPaneView(frame, true);
                        showLoadingScreen("Verifying...", 1000);
                        verificationStatus.setText("<html><body><div style=' font-size: 12px;'><b>No Such User Found, <font color='red'>Verification Failed "+ (char) '\u2718'+"</b></font></div></body></html>");
                        setGlassPaneView(frame, false);
                        jftfa.setText("");
                        jftfa.requestFocusInWindow();
                        SwingUtilities.invokeLater(()-> {
                            try {
                                Thread.sleep(300);
                                description_Text_Area.setVisible(false);
                                enterAmountToBeSent.setVisible(false);
                                enterAmountToBeSent.setVisible(false);
                                amountTextField.setVisible(false);
                                send.setVisible(false);
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }
                        });
                    }
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
            
        });

        shiftByPixel(panel, new JTextPane(), 570);

        vSpace(panel, new JTextPane(), 0);

        
        verificationStatus = new JTextPane();
        verificationStatus.setContentType("text/html");
        verificationStatus.setPreferredSize(new Dimension(430, 40));
        verificationStatus.setEditable(false);
        verificationStatus.setText("<html><body><div style=' font-size: 12px;'>Waiting for verification request...</div></body></html>");
        panel.add(verificationStatus);
        
        shiftByPixel(panel, new JTextPane(), 500);

        vSpace(panel, new JTextPane(), 15);
        
        description_Text_Area = new JTextArea();
        description_Text_Area.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
        description_Text_Area.setLineWrap(true);
        description_Text_Area.setWrapStyleWord(true);
        description_Text_Area.setPreferredSize(new Dimension(500, 150));
        description_Text_Area.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(" Decription / Subject / Note "), BorderFactory.createEmptyBorder(10, 15, 10, 15)));
        description_Text_Area.setVisible(false);
        panel.add(description_Text_Area);

        shiftByPixel(panel, new JTextPane(), 430);

        vSpace(panel, new JTextPane(), 30);

        enterAmountToBeSent = new JLabel("Enter Amount");
        enterAmountToBeSent.setFont(new Font("Arial", Font.BOLD, 20));
        enterAmountToBeSent.setForeground(Color.black);
        enterAmountToBeSent.setVisible(false);
        panel.add(enterAmountToBeSent);

        shiftByPixel(panel, new JTextPane(), 800);

        vSpace(panel, new JTextPane(), 15);
        
        amountTextField = new UserEntryValidator().createFloatingNumericTextField();
        amountTextField.setPreferredSize(new Dimension(270, 40));
        amountTextField.setFont(new Font("Arial", Font.BOLD, 20));
        amountTextField.setMargin(new Insets(0, 50, 0, 30));
        amountTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        amountTextField.setVisible(false);
        amountTextField.setToolTipText("Amount To Be Withdrawn");
        panel.add(amountTextField);
        amountTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                send.setEnabled(amountTextField.getText().trim().length()>=1);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                send.setEnabled(amountTextField.getText().trim().length()>=1);
            }
            
            @Override
            public void changedUpdate(DocumentEvent e) {
                send.setEnabled(amountTextField.getText().trim().length()>=1);
            }
        });

        send = new JButton("Send 📨");
        send.setEnabled(false);
        send.setPreferredSize(new Dimension(80, 40));
        send.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        send.setVisible(false);
        panel.add(send);
        send.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String amount_to_be_transfered = amountTextField.getText().trim();
                if(amount_to_be_transfered.charAt(amount_to_be_transfered.length()-1)=='.') {
                    amount_to_be_transfered = amount_to_be_transfered + '0';
                } else if(amount_to_be_transfered.charAt(0)=='.') {
                    amount_to_be_transfered = '0' + amount_to_be_transfered;
                }
                
                hut.setTransaction_Amount_table_9(Double.parseDouble(amount_to_be_transfered));
                hut.setDescription_Subject_table_9(description_Text_Area.getText().trim());

                verifyPasswordAndTransferGooglePay(null);
                frame.dispose();
            }
            
        });

        shiftByPixel(panel, new JTextPane(), 570);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jftfa.requestFocusInWindow();
        frame.setVisible(true);
    }
    public void verifyPasswordAndTransferGooglePay(Runnable callback) {
        JFrame frame = new JFrame("Welcome To Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingGooglePayModuleHeading());
        
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().afterClickingGooglePayModuleShowUPIID("left")+cuupi.fetchCurrent_User_UPI_ID_table_8()+new FrameText().afterClickingGooglePayModuleShowUPIID("right"));
        panel.add(custoInfo);

        vSpace(panel, new JTextPane(), 100);
        
        JLabel enterUpiIdOfReceiver = new JLabel("Enter GooglePay UPI PIN");
        enterUpiIdOfReceiver.setFont(new Font("Arial", Font.BOLD, 25));
        enterUpiIdOfReceiver.setForeground(Color.black);
        panel.add(enterUpiIdOfReceiver);

        vSpace(panel, new JTextPane(), 10);

        try {   
            mfa = new MaskFormatter("        #        #        #        #        #        #");
            jftfa = new JFormattedTextField(mfa);
            jftfa.setEnabled(true);
            jftfa.setPreferredSize(new Dimension(500, 80));
            jftfa.setMargin(new Insets(0, 4, 0, 0));
            jftfa.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            jftfa.setFont(new Font("Arial", Font.BOLD, 26));
            jftfa.getDocument().addDocumentListener(new DocumentListener() {
                @Override
            public void insertUpdate(DocumentEvent e) {
                send.setEnabled(jftfa.getText().trim().replaceAll("\\s", "").length()==6);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {}

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });
            panel.add(jftfa);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        vSpace(panel, new JTextPane(), 15);


        forgot = new JButton("Forgot ?");
        forgot.setEnabled(true);
        forgot.setPreferredSize(new Dimension(200, 40));
        forgot.setForeground(new Color(249, 54, 59));
        forgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(forgot);
        forgot.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
        });

        shiftByPixel(panel, new JTextPane(), -127);

        send = new JButton("Send ₹");
        send.setEnabled(false);
        send.setPreferredSize(new Dimension(200, 40));
        send.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(send);
        send.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String query = "select * from upi where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
                    int authentic_UPI_Pin = 0;
                    Connection con = new Connectivity().establishConnection();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()) {
                        authentic_UPI_Pin = rs.getInt("UPI Transaction PIN");
                    }
                    con.close();
                    if(Integer.parseInt(jftfa.getText().trim().replaceAll("\\s", ""))==authentic_UPI_Pin) {

                        try {
                            int statusOfSender = debitMoney(ard.fetchUserIdWhileLogin(), 0, "UPI");
                            if(statusOfSender==0) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Insufficient Balance</b></div></html>", "Failed", JOptionPane.ERROR_MESSAGE);
                            } else if(statusOfSender==1) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Monthly Limit Exceeded !</b></div></html>", "Failed", JOptionPane.ERROR_MESSAGE);
                            } else if(statusOfSender==2) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Daily Limit Exceeded !</b></div></html>", "Failed", JOptionPane.ERROR_MESSAGE);
                            } else if(statusOfSender==3) {
                            } else if(statusOfSender==4) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Your ATM Facility is Frozen</b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                            } else if(statusOfSender==5) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Your ATM Facility is Deactivated</b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                            } else if(statusOfSender==6) {
                                int statusOfReceiver = creditMoney(hut.fetchReceiver_Unique_Id(), 0, "UPI");
                                setGlassPaneView(frame, true);
                                showLoadingScreen("Verifying Your PIN...", 1500);
                                setGlassPaneView(frame, false);
                                jftfa.setText(null);
                                jftfa.requestFocusInWindow();
                                setGlassPaneView(frame, true);
                                showLoadingScreen("Transferring Amount...", 1500);
                                showLoadingScreen("<html><div style='font-size:16pt; color:Green;'>"+"<b>Transaction Successful</b></div></html>", 1500);
                                setGlassPaneView(frame, false);
                            }
                            setGlassPaneView(frame, false);
                            afterLogin();
                            frame.dispose();
                        } catch (NumberFormatException | ClassNotFoundException | SQLException e1) {
                            e1.printStackTrace();
                        }
                    } else {
                        setGlassPaneView(frame, true);
                        showLoadingScreen("Verifying Your PIN...", 1500);
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:14pt; color:Red;'>"+"<b>Entered Incorrect UPI PIN</b></div></html>", "Failure", JOptionPane.WARNING_MESSAGE);
                        setGlassPaneView(frame, false);
                        jftfa.setText(null);
                        jftfa.requestFocusInWindow();
                    }
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
            
        });


        vSpace(panel, new JTextPane(), 0);

        back = new JButton("< Go Back To Previous Menu");
        back.setEnabled(true);
        back.setPreferredSize(new Dimension(500, 40));
        back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(back);
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    upiFacilityOptionWindow(null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
            
        });
        
        

        vSpace(panel, new JTextPane(), 40);


        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jftfa.requestFocusInWindow();
        frame.setVisible(true);
    }
    public void UPIBharatPeWindow(Runnable callback) {
        
        JFrame frame = new JFrame("Welcome To Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingBharatPeModuleHeading());
        
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().afterClickingBharatPeModuleShowUPIID("left")+cuupi.fetchCurrent_User_UPI_ID_table_8()+new FrameText().afterClickingBharatPeModuleShowUPIID("right"));
        panel.add(custoInfo);

        vSpace(panel, new JTextPane(), 50);
        
        JLabel enterUpiIdOfReceiver = new JLabel("Enter Reciever's UPI Id");
        enterUpiIdOfReceiver.setFont(new Font("Arial", Font.BOLD, 20));
        enterUpiIdOfReceiver.setForeground(Color.black);
        panel.add(enterUpiIdOfReceiver);

        shiftByPixel(panel, new JTextPane(), 710);

        vSpace(panel, new JTextPane(), 10);

        try {   
            mfa = new MaskFormatter("##########@bhp");
            jftfa = new JFormattedTextField(mfa);
            jftfa.setEnabled(true);
            jftfa.setPreferredSize(new Dimension(270, 40));
            jftfa.setMargin(new Insets(0, 60, 0, 0));
            jftfa.setForeground(Color.decode("#4169E1"));
            jftfa.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
            jftfa.getDocument().addDocumentListener(new DocumentListener() {
                @Override
            public void insertUpdate(DocumentEvent e) {
                verifyUPI.setEnabled(jftfa.getText().trim().replaceAll("\\s", "").length()==14);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {}

            @Override
            public void changedUpdate(DocumentEvent e) {}
            });
            panel.add(jftfa);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        verifyUPI = new JButton("Verify");
        verifyUPI.setEnabled(false);
        verifyUPI.setPreferredSize(new Dimension(80, 40));
        verifyUPI.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(verifyUPI);
        verifyUPI.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String query = "select * from upi where `UPI Id @BharatPay` = '"+jftfa.getText().trim().replaceAll("\\s", "")+"'";
                    String recieverUniqueId = null, reciever_honorific_Name = null, reciever_first_Name = null, reciever_middle_Name = null, reciever_last_Name = null;
                    Connection con = new Connectivity().establishConnection();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()) {
                        recieverUniqueId = rs.getString("Customer Auto-Generated ID");
                    }
                    query = "select * from newUserRegistration where `Customer Auto-Generated ID` = '"+recieverUniqueId+"'";
                    st = con.createStatement();
                    rs = st.executeQuery(query);
                    while(rs.next()) {
                        reciever_honorific_Name = rs.getString("Customer Honorific");
                        reciever_first_Name = rs.getString("Customer First Name");
                        reciever_middle_Name = rs.getString("Customer Middle Name");
                        reciever_last_Name = rs.getString("Customer Last Name");
                    }
                    con.close();
                    if(recieverUniqueId != null) {
                        if(recieverUniqueId.equals(ard.fetchUserIdWhileLogin())) {
                            setGlassPaneView(frame, true);
                            showLoadingScreen("Verifying...", 1000);
                            verificationStatus.setText("<html><body><div style=' font-size: 12px;'><b>Sender and Receiver can't be Same, <font color='red'>Illegal UPI ID Entered "+ (char) '\u26D4'+"</b></font></div></body></html>");
                            setGlassPaneView(frame, false);
                            jftfa.setText("");
                            jftfa.requestFocusInWindow();
                            SwingUtilities.invokeLater(()-> {
                                try {
                                    Thread.sleep(300);
                                    description_Text_Area.setVisible(false);
                                    enterAmountToBeSent.setVisible(false);
                                    enterAmountToBeSent.setVisible(false);
                                    amountTextField.setVisible(false);
                                    send.setVisible(false);
                                } catch (InterruptedException e1) {
                                    e1.printStackTrace();
                                }
                            });
                        } else {
                            
                            hut.setSender_Unique_Id(ard.fetchUserIdWhileLogin());
                            hut.setReceiver_Unique_Id(recieverUniqueId);
                            hut.setReceiver_UPI_ID_table_9(jftfa.getText().trim().replaceAll("\\s", ""));
                            hut.setSender_UPI_ID_table_9(cuupi.fetchCurrent_User_UPI_ID_table_8());

                            setGlassPaneView(frame, true);
                            showLoadingScreen("Verifying...", 1000);
                            verificationStatus.setText("<html><body><div style=' font-size: 12px;'><b>"+reciever_honorific_Name+" "+reciever_first_Name+" "+reciever_middle_Name+""+reciever_last_Name+", <font color='green'>Verified "+ (char) '\u2714'+"</b></font></div></body></html>");
                            setGlassPaneView(frame, false);
                            jftfa.setText("");
                            SwingUtilities.invokeLater(()-> {
                                try {
                                    Thread.sleep(1300);
                                    description_Text_Area.setVisible(true);
                                    enterAmountToBeSent.setVisible(true);
                                    enterAmountToBeSent.setVisible(true);
                                    amountTextField.setVisible(true);
                                    send.setVisible(true);
                                } catch (InterruptedException e1) {
                                    e1.printStackTrace();
                                }
                            });
                        }
                    } else {
                        setGlassPaneView(frame, true);
                        showLoadingScreen("Verifying...", 1000);
                        verificationStatus.setText("<html><body><div style=' font-size: 12px;'><b>No Such User Found, <font color='red'>Verification Failed "+ (char) '\u2718'+"</b></font></div></body></html>");
                        setGlassPaneView(frame, false);
                        jftfa.setText("");
                        jftfa.requestFocusInWindow();
                        SwingUtilities.invokeLater(()-> {
                            try {
                                Thread.sleep(300);
                                description_Text_Area.setVisible(false);
                                enterAmountToBeSent.setVisible(false);
                                enterAmountToBeSent.setVisible(false);
                                amountTextField.setVisible(false);
                                send.setVisible(false);
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }
                        });
                    }
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
            
        });

        shiftByPixel(panel, new JTextPane(), 570);

        vSpace(panel, new JTextPane(), 0);

        
        verificationStatus = new JTextPane();
        verificationStatus.setContentType("text/html");
        verificationStatus.setPreferredSize(new Dimension(430, 40));
        verificationStatus.setEditable(false);
        verificationStatus.setText("<html><body><div style=' font-size: 12px;'>Waiting for verification request...</div></body></html>");
        panel.add(verificationStatus);
        
        shiftByPixel(panel, new JTextPane(), 500);

        vSpace(panel, new JTextPane(), 15);
        
        description_Text_Area = new JTextArea();
        description_Text_Area.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
        description_Text_Area.setLineWrap(true);
        description_Text_Area.setWrapStyleWord(true);
        description_Text_Area.setPreferredSize(new Dimension(500, 150));
        description_Text_Area.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(" Decription / Subject / Note "), BorderFactory.createEmptyBorder(10, 15, 10, 15)));
        description_Text_Area.setVisible(false);
        panel.add(description_Text_Area);

        shiftByPixel(panel, new JTextPane(), 430);

        vSpace(panel, new JTextPane(), 30);

        enterAmountToBeSent = new JLabel("Enter Amount");
        enterAmountToBeSent.setFont(new Font("Arial", Font.BOLD, 20));
        enterAmountToBeSent.setForeground(Color.black);
        enterAmountToBeSent.setVisible(false);
        panel.add(enterAmountToBeSent);

        shiftByPixel(panel, new JTextPane(), 800);

        vSpace(panel, new JTextPane(), 15);
        
        amountTextField = new UserEntryValidator().createFloatingNumericTextField();
        amountTextField.setPreferredSize(new Dimension(270, 40));
        amountTextField.setFont(new Font("Arial", Font.BOLD, 20));
        amountTextField.setMargin(new Insets(0, 50, 0, 30));
        amountTextField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        amountTextField.setVisible(false);
        amountTextField.setToolTipText("Amount To Be Withdrawn");
        panel.add(amountTextField);
        amountTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                send.setEnabled(amountTextField.getText().trim().length()>=1);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                send.setEnabled(amountTextField.getText().trim().length()>=1);
            }
            
            @Override
            public void changedUpdate(DocumentEvent e) {
                send.setEnabled(amountTextField.getText().trim().length()>=1);
            }
        });

        send = new JButton("Send 📨");
        send.setEnabled(false);
        send.setPreferredSize(new Dimension(80, 40));
        send.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        send.setVisible(false);
        panel.add(send);
        send.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String amount_to_be_transfered = amountTextField.getText().trim();
                if(amount_to_be_transfered.charAt(amount_to_be_transfered.length()-1)=='.') {
                    amount_to_be_transfered = amount_to_be_transfered + '0';
                } else if(amount_to_be_transfered.charAt(0)=='.') {
                    amount_to_be_transfered = '0' + amount_to_be_transfered;
                }
                
                hut.setTransaction_Amount_table_9(Double.parseDouble(amount_to_be_transfered));
                hut.setDescription_Subject_table_9(description_Text_Area.getText().trim());

                verifyPasswordAndTransferBharatPe(null);
                frame.dispose();
            }
            
        });

        shiftByPixel(panel, new JTextPane(), 570);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jftfa.requestFocusInWindow();
        frame.setVisible(true);
    }
    public void verifyPasswordAndTransferBharatPe(Runnable callback) {
        JFrame frame = new JFrame("Welcome To Facility");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);
        frame.setContentPane(panel);

        vSpace(panel, new JTextPane(), 15);
        
        JTextPane heading = new JTextPane();
        heading.setContentType("text/html");
        heading.setEditable(false);
        heading.setText(new FrameText().afterClickingBharatPeModuleHeading());
        
        panel.add(heading);

        vSpace(panel, heading, 15);
        
        JTextPane custoInfo = new JTextPane();
        custoInfo.setContentType("text/html");
        custoInfo.setEditable(false);
        custoInfo.setText(new FrameText().afterClickingBharatPeModuleShowUPIID("left")+cuupi.fetchCurrent_User_UPI_ID_table_8()+new FrameText().afterClickingBharatPeModuleShowUPIID("right"));
        panel.add(custoInfo);

        vSpace(panel, new JTextPane(), 100);
        
        JLabel enterUpiIdOfReceiver = new JLabel("Enter BharatPe UPI PIN");
        enterUpiIdOfReceiver.setFont(new Font("Arial", Font.BOLD, 25));
        enterUpiIdOfReceiver.setForeground(Color.black);
        panel.add(enterUpiIdOfReceiver);

        vSpace(panel, new JTextPane(), 10);

        try {   
            mfa = new MaskFormatter("        #        #        #        #        #        #");
            jftfa = new JFormattedTextField(mfa);
            jftfa.setEnabled(true);
            jftfa.setPreferredSize(new Dimension(500, 80));
            jftfa.setMargin(new Insets(0, 4, 0, 0));
            jftfa.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            jftfa.setFont(new Font("Arial", Font.BOLD, 26));
            jftfa.getDocument().addDocumentListener(new DocumentListener() {
                @Override
            public void insertUpdate(DocumentEvent e) {
                send.setEnabled(jftfa.getText().trim().replaceAll("\\s", "").length()==6);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {}

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });
            panel.add(jftfa);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        vSpace(panel, new JTextPane(), 15);


        forgot = new JButton("Forgot ?");
        forgot.setEnabled(true);
        forgot.setPreferredSize(new Dimension(200, 40));
        forgot.setForeground(new Color(249, 54, 59));
        forgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(forgot);
        forgot.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
        });

        shiftByPixel(panel, new JTextPane(), -127);

        send = new JButton("Send ₹");
        send.setEnabled(false);
        send.setPreferredSize(new Dimension(200, 40));
        send.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(send);
        send.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String query = "select * from upi where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
                    int authentic_UPI_Pin = 0;
                    Connection con = new Connectivity().establishConnection();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()) {
                        authentic_UPI_Pin = rs.getInt("UPI Transaction PIN");
                    }
                    con.close();
                    if(Integer.parseInt(jftfa.getText().trim().replaceAll("\\s", ""))==authentic_UPI_Pin) {

                        try {
                            int statusOfSender = debitMoney(ard.fetchUserIdWhileLogin(), 0, "UPI");
                            if(statusOfSender==0) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Insufficient Balance</b></div></html>", "Failed", JOptionPane.ERROR_MESSAGE);
                            } else if(statusOfSender==1) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Monthly Limit Exceeded !</b></div></html>", "Failed", JOptionPane.ERROR_MESSAGE);
                            } else if(statusOfSender==2) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Daily Limit Exceeded !</b></div></html>", "Failed", JOptionPane.ERROR_MESSAGE);
                            } else if(statusOfSender==3) {
                            } else if(statusOfSender==4) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Your ATM Facility is Frozen</b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                            } else if(statusOfSender==5) {
                                JOptionPane.showMessageDialog(null, "<html><div style='font-size:16pt; color:Red;'>"+"<b>Your ATM Facility is Deactivated</b></div></html>", "Failed", JOptionPane.WARNING_MESSAGE);
                            } else if(statusOfSender==6) {
                                int statusOfReceiver = creditMoney(hut.fetchReceiver_Unique_Id(), 0, "UPI");
                                setGlassPaneView(frame, true);
                                showLoadingScreen("Verifying Your PIN...", 1500);
                                setGlassPaneView(frame, false);
                                jftfa.setText(null);
                                jftfa.requestFocusInWindow();
                                setGlassPaneView(frame, true);
                                showLoadingScreen("Transferring Amount...", 1500);
                                showLoadingScreen("<html><div style='font-size:16pt; color:Green;'>"+"<b>Transaction Successful</b></div></html>", 1500);
                                setGlassPaneView(frame, false);
                            }
                            setGlassPaneView(frame, false);
                            afterLogin();
                            frame.dispose();
                        } catch (NumberFormatException | ClassNotFoundException | SQLException e1) {
                            e1.printStackTrace();
                        }
                    } else {
                        setGlassPaneView(frame, true);
                        showLoadingScreen("Verifying Your PIN...", 1500);
                        JOptionPane.showMessageDialog(null, "<html><div style='font-size:14pt; color:Red;'>"+"<b>Entered Incorrect UPI PIN</b></div></html>", "Failure", JOptionPane.WARNING_MESSAGE);
                        setGlassPaneView(frame, false);
                        jftfa.setText(null);
                        jftfa.requestFocusInWindow();
                    }
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
            }
            
        });

        vSpace(panel, new JTextPane(), 0);

        back = new JButton("< Go Back To Previous Menu");
        back.setEnabled(true);
        back.setPreferredSize(new Dimension(500, 40));
        back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(back);
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    upiFacilityOptionWindow(null);
                } catch (ClassNotFoundException | SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
            
        });
        
        

        vSpace(panel, new JTextPane(), 40);


        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jftfa.requestFocusInWindow();
        frame.setVisible(true);
    }
    public static void vSpace(JPanel panel, JTextPane jtextpane, int size) {
        jtextpane = new JTextPane();
        jtextpane.setContentType("text/html");
        jtextpane.setEditable(false);
        jtextpane.setText(new FrameText().verticalSpace(size));
        jtextpane.setEnabled(false);
        panel.add(jtextpane);
    }
    
    public static JTextField JTextF(JPanel panel, int width, int height, int fromWindow) {
        JTextField textField = new JTextField();
        textField.setMargin(new Insets(0, 30, 0, 30));
        textField.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
        textField.setPreferredSize(new Dimension(width, height));
        
        if(fromWindow==-1) {
            panel.add(textField);
            return textField;
        }
        
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkFields(fromWindow);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkFields(fromWindow);
            }
            
            @Override
            public void changedUpdate(DocumentEvent e) {
                checkFields(fromWindow);
            }
        });
        panel.add(textField);
        return textField;
    }

    public static void shiftByPixel(JPanel panel, JTextPane jtextpane, int pixel) {
        jtextpane = new JTextPane();
        jtextpane.setContentType("text/html");
        jtextpane.setEditable(false);
        jtextpane.setText(new FrameText().shiftPixel(pixel));
        panel.add(jtextpane);
    }
    public static void xySpace(JPanel panel, JTextPane jtextpane, int xspace, int yspace) {
        jtextpane = new JTextPane();
        jtextpane.setContentType("text/html");
        jtextpane.setEditable(false);
        jtextpane.setText(new FrameText().xySpaceSetter(xspace, yspace));
        jtextpane.setEnabled(false);
        panel.add(jtextpane);
    }
    private static void checkFields(int fromWindow) {
        if(fromWindow==0) {
            String idText = jtfa.getText().trim();
            String passwordText = new String(jpfa.getPassword()).trim();
            jba.setEnabled(!idText.isEmpty() && !passwordText.isEmpty());
            newRegistrationButton.setEnabled(!(!idText.isEmpty() || !passwordText.isEmpty()));
        }
        else if(fromWindow==1) {
            Boolean [] flags = {true, true, true, false, true, true, true, true};
            String id2 = jtfc.getText().trim();
            String id4 = jtfe.getText().trim();
            flags[0] = !((String) honorificComboBox.getSelectedItem()).equals("Select Honorific");
            flags[1] = !((String) genderComboBox.getSelectedItem()).equals("Select Gender");
            flags[2] = !((String) maritalComboBox.getSelectedItem()).equals("Select Marital Status");
            flags[3] = (!isValidEmail(jtff.getText().trim()))?true: false;
            flags[4] = jftfa.getText().trim().length()==10?false: true;        
            flags[5] = jftfb.getText().trim().length()==14?false: true;
            flags[6] = jftfd.getText().trim().length()==10?false: true;
            flags[7] = jftfc.getText().trim().length()==10?false: true;
            jbb.setEnabled(flags[0] && !id2.isEmpty() && !id4.isEmpty() && !flags[4] && !flags[5] && !flags[7] && flags[1] && !flags[3] && !flags[6] && flags[2]);
        }
        else if(fromWindow==2) {
            jbb.setEnabled(!jtfa.getText().trim().isEmpty() && !jtfb.getText().trim().isEmpty() && !jtfd.getText().trim().isEmpty() && !jtfe.getText().trim().isEmpty() && !jtff.getText().trim().isEmpty() && !jtfh.getText().trim().isEmpty() && !jtfi.getText().trim().isEmpty() && !jtfj.getText().trim().isEmpty() && !jtfk.getText().trim().isEmpty());
        } else if(fromWindow==4) {
            jbb.setEnabled(!jtfb.getText().trim().isEmpty() && !jtff.getText().trim().isEmpty() && !jtfh.getText().trim().isEmpty() && !jtfi.getText().trim().isEmpty() && !jtfk.getText().trim().isEmpty() && !((String) honorificComboBox.getSelectedItem()).equals("Select Honorific") && !((String) parentalComboBox.getSelectedItem()).equals("Select Parental Preference"));
        } else if(fromWindow==5) {
            boolean checkLength = new String(jpfa.getPassword()).length()>=8;
            boolean match = new String(jpfa.getPassword()).equals(new String(jpfb.getPassword()));
            jba.setEnabled(checkLength && match);
        }
    }
    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    private static Boolean evauateAge(String dobString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dob = LocalDate.parse(dobString, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dob, currentDate);
        return period.getYears()>=18;
    }
    public static String generateId(String PAN_Number, String Aadhar_Number) {
        String combinedInput = PAN_Number + Aadhar_Number;
        
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = messageDigest.digest(combinedInput.getBytes());
            String Id = hashBytesToString(hashedBytes).substring(0, 8);
            return Id.toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String hashBytesToString(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }
    private static long generateUnique14DigitNumber(String phoneNumber, String aadharNumber) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return -1;
        }

        String combinedString = phoneNumber + aadharNumber;

        byte[] digest = md.digest(combinedString.getBytes());

        BigInteger positiveBigInt = new BigInteger(1, digest);
        String number = String.format("%014d", positiveBigInt.mod(BigInteger.valueOf(10L).pow(14)));

        return Long.parseLong(number);
    }
    private static void decideBankMonthlyLimit() {
        String accountType = ard.fetchCustomer_Account_Type_table_2();
        String origin = ard.fetchNRI_or_Resident_table_4();
        if(accountType=="Saving") {
            if(origin=="Indian Residential") {
                ard.setCustomer_Bank_Monthly_Limit_table_2(1000000l);
            } else if(origin=="NRI") {
                ard.setCustomer_Bank_Monthly_Limit_table_2(1500000l);
            }
        } else if(accountType=="Current") {
            if(origin=="Indian Residential") {
                ard.setCustomer_Bank_Monthly_Limit_table_2(3000000l);
            } else if(origin=="NRI") {
                ard.setCustomer_Bank_Monthly_Limit_table_2(4000000l);
            }
        } else if(accountType=="Student") {
            if(origin=="Indian Residential") {
                ard.setCustomer_Bank_Monthly_Limit_table_2(50000l);
            } else if(origin=="NRI") {
                ard.setCustomer_Bank_Monthly_Limit_table_2(70000l);
            }
        } else if(accountType=="BPL") {
            if(origin=="Indian Residential") {
                ard.setCustomer_Bank_Monthly_Limit_table_2(15000l);
            } else if(origin=="NRI") {
                ard.setCustomer_Bank_Monthly_Limit_table_2(20000l);
            }
        }
    }
    private void decideBankDailyLimit() {
        String accountType = ard.fetchCustomer_Account_Type_table_2();
        String origin = ard.fetchNRI_or_Resident_table_4();
        if(accountType=="Saving") {
            if(origin=="Indian Residential") {
                ard.setCustomer_Bank_Daily_Limit_table_2(100000l);
            } else if(origin=="NRI") {
                ard.setCustomer_Bank_Daily_Limit_table_2(200000l);
            }
        } else if(accountType=="Current") {
            if(origin=="Indian Residential") {
                ard.setCustomer_Bank_Daily_Limit_table_2(200000l);
            } else if(origin=="NRI") {
                ard.setCustomer_Bank_Daily_Limit_table_2(300000l);
            }
        } else if(accountType=="Student") {
            if(origin=="Indian Residential") {
                ard.setCustomer_Bank_Daily_Limit_table_2(5000l);
            } else if(origin=="NRI") {
                ard.setCustomer_Bank_Daily_Limit_table_2(7000l);
            }
        } else if(accountType=="BPL") {
            if(origin=="Indian Residential") {
                ard.setCustomer_Bank_Daily_Limit_table_2(2000l);
            } else if(origin=="NRI") {
                ard.setCustomer_Bank_Daily_Limit_table_2(3000l);
            }
        }
    }
    private void decideMinimumMaintenanceBalance() {
        String accountType = ard.fetchCustomer_Account_Type_table_2();
        String origin = ard.fetchNRI_or_Resident_table_4();
        if(accountType=="Saving") {
            if(origin=="Indian Residential") {
                ard.setCustomer_Bank_Minimum_Maintenance_Balance_table_2(10000l);
            } else if(origin=="NRI") {
                ard.setCustomer_Bank_Minimum_Maintenance_Balance_table_2(20000l);
            }
        } else if(accountType=="Current") {
            if(origin=="Indian Residential") {
                ard.setCustomer_Bank_Minimum_Maintenance_Balance_table_2(30000l);
            } else if(origin=="NRI") {
                ard.setCustomer_Bank_Minimum_Maintenance_Balance_table_2(40000l);
            }
        } else if(accountType=="Student") {
            if(origin=="Indian Residential") {
                ard.setCustomer_Bank_Minimum_Maintenance_Balance_table_2(5000l);
            } else if(origin=="NRI") {
                ard.setCustomer_Bank_Minimum_Maintenance_Balance_table_2(7000l);
            }
        } else if(accountType=="BPL") {
            if(origin=="Indian Residential") {
                ard.setCustomer_Bank_Minimum_Maintenance_Balance_table_2(0l);
            } else if(origin=="NRI") {
                ard.setCustomer_Bank_Minimum_Maintenance_Balance_table_2(1000l);
            }
        }
    }
    private void insertNewUser(Runnable callback) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bankingsystemsimulation";
        String username = "your_mysql_database_user_id";
        String password = "your_mysql_database_password";
        Connection con = DriverManager.getConnection(url, username, password);
    
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // Table 1 `newUserRegistration` insertion

        String attributes = "`Serial Number`, `Customer Auto-Generated ID`, `Customer Password`, `Customer Honorific`, `Customer First Name`, `Customer Middle Name`, `Customer Last Name`, `Customer Date Of Birth`, `Customer Aadhar Number`, `Customer PAN Number`, `Customer Gender`, `Customer Email`, `Customer Contact Number 1`, `Customer Contact Number 2`, `Customer Marital Status`, `Customer Residential House Number`, `Customer Residential Ward Number`, `Customer Residential Area`, `Customer Residential City`, `Customer Residential District`, `Customer Residential State`, `Customer Residential Country`, `Customer Residential Post Office`, `Customer Residential Police Station`, `Customer Residential Pincode`, `Customer Residential Landmark`, `Customer Permanent House Number`, `Customer Permanent Ward Number`, `Customer Permanent Area`, `Customer Permanent City`, `Customer Permanent District`, `Customer Permanent State`, `Customer Permanent Country`, `Customer Permanent Post Office`, `Customer Permanent Police Station`, `Customer Permanent Pincode`, `Customer Permanent Landmark`, `Customer Parental Preference`, `Customer Parental Relation`, `Customer Parental Honorific`, `Customer Parental First Name`, `Customer Parental Middle Name`, `Customer Parental Last Name`, `Customer Parental Contact Number`, `Customer Parental Aadhar Number`";
        String values = "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";
        String query = "insert into newUserRegistration("+attributes+") values ("+values+")";
        
        PreparedStatement ps = con.prepareStatement(query);
        
        String countQuery = "select count(*) as maxCurrentRow from newUserRegistration";
        Statement countStatement = con.createStatement();
        ResultSet countResultSet = countStatement.executeQuery(countQuery);
        int maxCurrentRow = 0;
        if (countResultSet.next()) {
            maxCurrentRow = countResultSet.getInt("maxCurrentRow");
        }

        ps.setInt(1, maxCurrentRow+1);
        ps.setString(2, ard.fetchUserGeneratedID());
        ps.setString(3, ard.fetchUserGivenPassword());
        ps.setString(4, ard.fetchHonorific());
        ps.setString(5, ard.fetchFName());
        ps.setString(6, ard.fetchMName());
        ps.setString(7, ard.fetchLName());
        ps.setString(8, ard.fetchDOB());
        ps.setString(9, ard.fetchAadhar());
        ps.setString(10, ard.fetchPan());
        ps.setString(11, ard.fetchGender());
        ps.setString(12, ard.fetchEmail());
        ps.setString(13, ard.fetchPhno1());
        ps.setString(14, ard.fetchPhno2());
        ps.setString(15, ard.fetchMarital());
        ps.setString(16, ard.fetchResidentialHouseNo());
        ps.setString(17, ard.fetchResidentialWardNo());
        ps.setString(18, ard.fetchResidentialArea());
        ps.setString(19, ard.fetchResidentialCity());
        ps.setString(20, ard.fetchResidentialDistrict());
        ps.setString(21, ard.fetchResidentialState());
        ps.setString(22, ard.fetchResidentialCountry());
        ps.setString(23, ard.fetchResidentialPostOffice());
        ps.setString(24, ard.fetchResidentialPoliceStation());
        ps.setString(25, ard.fetchResidentialPincode());
        ps.setString(26, ard.fetchResidentialLandmark());
        ps.setString(27, ard.fetchPermanentHouseNo());
        ps.setString(28, ard.fetchPermanentWardNo());
        ps.setString(29, ard.fetchPermanentArea());
        ps.setString(30, ard.fetchPermanentCity());
        ps.setString(31, ard.fetchPermanentDistrict());
        ps.setString(32, ard.fetchPermanentState());
        ps.setString(33, ard.fetchPermanentCountry());
        ps.setString(34, ard.fetchPermanentPostOffice());
        ps.setString(35, ard.fetchPermanentPoliceStation());
        ps.setString(36, ard.fetchPermanentPincode());
        ps.setString(37, ard.fetchPermanentLandmark());
        ps.setString(38, ard.fetchReceivedParentalPreference());
        ps.setString(39, ard.fetchReceivedParentalRelation());
        ps.setString(40, ard.fetchReceivedParentalHonorific());
        ps.setString(41, ard.fetchReceivedParentalFName());
        ps.setString(42, ard.fetchReceivedParentalMName());
        ps.setString(43, ard.fetchReceivedParentalLName());
        ps.setString(44, ard.fetchReceivedParentalPhno());
        ps.setString(45, ard.fetchReceivedParentalAadhar());

        
        ps.executeUpdate();
        System.out.println("Value Inserted in `newUserRegistration` table");


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // Table 2 `userBankRelatedDetails` insertion
        
    attributes = "`Customer Auto-Generated ID`, `Customer Bank Head Quarter`, `Customer Bank Name`, `Customer Bank IFSC Code`, `Customer Bank Account Number`, `Customer Bank Opening Date`, `Customer Bank Opening Time` , `Customer Account Type`, `Customer Bank Balance`, `Customer Bank Monthly Limit`, `Customer Bank Daily Limit`, `Customer Bank Minimum Maintenance Balance`";
    values = "?,?,?,?,?,?,?,?,?,?,?,?";
        query = "insert into userBankRelatedDetails("+attributes+") values ("+values+")";
        
        ps = con.prepareStatement(query);

        countQuery = "select count(*) as maxCurrentRow from userBankRelatedDetails";
        countStatement = con.createStatement();
        countResultSet = countStatement.executeQuery(countQuery);
        maxCurrentRow = 0;
        if (countResultSet.next()) {
            maxCurrentRow = countResultSet.getInt("maxCurrentRow");
        }
        
        ard.setCustomer_Bank_IFSC_Code_table_2(maxCurrentRow+1);
        ard.setCustomer_Bank_Account_Number_table_2(generateUnique14DigitNumber(ard.fetchPhno1(), ard.fetchAadhar()));
        decideBankMonthlyLimit();
        decideBankDailyLimit();
        decideMinimumMaintenanceBalance();
        ard.setCustomer_Account_Opening_Date_table_2(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        ard.setCustomer_Account_Opening_Time_table_2(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        ps.setString(1, ard.fetchUserGeneratedID());
        ps.setString(2, ard.fetchCustomer_Bank_Head_Quarter_table_2());
        ps.setString(3, ard.fetCustomer_Bank_Name_table_2());
        ps.setString(4, ard.fetchCustomer_Bank_IFSC_Code_table_2());
        ps.setLong(5, ard.fetchCustomer_Bank_Account_Number_table_2());
        ps.setString(6, ard.fetchCustomer_Account_Opening_Date_table_2());
        ps.setString(7, ard.fetchCustomer_Account_Opening_Time_table_2());
        ps.setString(8, ard.fetchCustomer_Account_Type_table_2());
        ps.setFloat(9, 0.0f);
        ps.setLong(10, ard.fetchCustomer_Bank_Monthly_Limit_table_2());
        ps.setLong(11, ard.fetchCustomer_Bank_Daily_Limit_table_2());
        ps.setLong(12, ard.fetchCustomer_Bank_Minimum_Maintenance_Balance_table_2());

        
        ps.executeUpdate();
        System.out.println("Value Inserted in `userBankRelatedDetails` table");


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


     // Table 3 `userFacilityDetails` insertion
     
        attributes = "`Customer Auto-Generated ID`, `NetBanking`, `ATM Card`, `UPI`, `Activate PayTm`, `Activate PhonePe`, `Activate Google Pay`, `Activate Bharat Pe`";
        values = "?,?,?,?,?,?,?,?";
        query = "insert into userFacilityDetails("+attributes+") values ("+values+")";
        
        ps = con.prepareStatement(query);

        ps.setString(1, ard.fetchUserGeneratedID());
        ps.setString(2, ard.fetchNetBanking_table_3());
        ps.setString(3, ard.fetchATM_Card_table_3());
        ps.setString(4, ard.fetchUPI_table_3());
        ps.setString(5, ard.fetchActivate_PayTm_table_3());
        ps.setString(6, ard.fetchActivate_PhonePe_table_3());
        ps.setString(7, ard.fetchActivate_Google_Pay_table_3());
        ps.setString(8, ard.fetchActivate_Bharat_Pe_table_3());

        
        ps.executeUpdate();
        System.out.println("Value Inserted in `userFacilityDetails` table");

    
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // Table 4 `netBankingDetails` insertion

        attributes = "`Customer Auto-Generated ID`, `NRI/Resident`";
        values = "?,?";
        query = "insert into netBankingDetails("+attributes+") values ("+values+")";
        
        ps = con.prepareStatement(query);
        
        ps.setString(1, ard.fetchUserGeneratedID());
        ps.setString(2, ard.fetchNRI_or_Resident_table_4());

        
        ps.executeUpdate();
        System.out.println("Value Inserted in `netBankingDetails` table");


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // Table 5 `nbTransactionHistory` insertion :  

        // SHIFTED TO ANOTHER INDIVIDUAL METHOD


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // Table 6 `atm` insertion :  

        attributes = "`Customer Auto-Generated ID`, `ATM Card Number`, `ATM Card CVV`, `ATM Card Expiry Month`, `ATM Card Expiry Year`, `ATM Card PIN`, `ATM Card Type`, `ATM Card Associations`, `ATM Card Facility Status`";
        values = "?,?,?,?,?,?,?,?,?";
        query = "insert into atm("+attributes+") values ("+values+")";
        
        ps = con.prepareStatement(query);

        generateATMCardNumber();
        generateATMCVVNumber();
        ard.setATM_Card_Expiry_Month_table_6(LocalDate.now().getMonthValue());
        ard.setATM_Card_Expiry_Year_table_6(LocalDate.now().getYear()+10);
    
        ps.setString(1, ard.fetchUserGeneratedID());
        ps.setLong(2, ard.fetchATM_Card_Number_table_6());
        ps.setInt(3, ard.fetchATM_Card_CVV_table_6());
        ps.setInt(4, ard.fetchATM_Card_Expiry_Month_table_6());
        ps.setInt(5, ard.fetchATM_Card_Expiry_Year_table_6());
        ps.setInt(6, ard.fetchATM_Card_PIN_table_6());
        ps.setString(7, ard.fetchATM_Card_Type_table_6());
        ps.setString(8, ard.fetchATM_Card_Associations_table_6());
        ps.setString(9, ard.fetchATM_Card_Facility_Status_table_6());

        
        ps.executeUpdate();
        System.out.println("Value Inserted in `atm` table");


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // Table 7 `atmTransactionHistory` insertion :  

        // SHIFTED TO ANOTHER INDIVIDUAL METHOD


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // Table 8 `upi` insertion :  

        attributes = "`Customer Auto-Generated ID`, `UPI Id @payTm`, `UPI Id @phonePe`, `UPI Id @googlePay`, `UPI Id @BharatPay`, `UPI Transaction PIN`";
        values = "?,?,?,?,?,?";
        query = "insert into upi("+attributes+") values ("+values+")";
        
        ps = con.prepareStatement(query);
        
        ps.setString(1, ard.fetchUserGeneratedID());
        ps.setString(2, ard.fetchUPI_Id_payTm_table_8(ard.fetchPhno1()));
        ps.setString(3, ard.fetchUPI_Id_phonePe_table_8(ard.fetchPhno1()));
        ps.setString(4, ard.fetchUPI_Id_googlePay_table_8(ard.fetchPhno1()));
        ps.setString(5, ard.fetchUPI_Id_BharatPay_table_8(ard.fetchPhno1()));
        ps.setInt(6, ard.fetchUPI_Transaction_PIN_table_8());

        
        ps.executeUpdate();
        System.out.println("Value Inserted in `upi` table");


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // Table 9 `upiTransactionHistory` insertion :  

        // SHIFTED TO ANOTHER INDIVIDUAL METHOD


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // Table 10 `bankActions` insertion :  

        attributes = "`Customer Auto-Generated ID`, `Bank Account Status`, `Net Banking Facility Status`, `ATM Card Facility Status`, `UPI Facility Status`, `Induced Fine`";
        values = "?,?,?,?,?,?";
        query = "insert into bankActions("+attributes+") values ("+values+")";
        
        ps = con.prepareStatement(query);
        
        ps.setString(1, ard.fetchUserGeneratedID());
        ps.setString(2, ard.fetchBank_Account_Status_table_10(0));
        ps.setString(3, ard.fetchNet_Banking_Facility_Status_table_10(0));
        if(ard.fetchATM_Card_table_3()=="Selected") {
            ps.setString(4, ard.fetchATM_Card_Facility_Status_table_10(0));
        } else {
            ps.setString(4, ard.fetchATM_Card_Facility_Status_table_10(1));
        }
        if(ard.fetchUPI_table_3()=="Selected") {
            ps.setString(5, ard.fetchUPI_Facility_Status_table_10(0));
        } else {
            ps.setString(5, ard.fetchUPI_Facility_Status_table_10(1));
        }
        ps.setFloat(6, 0.0f);

        
        ps.executeUpdate();
        System.out.println("Value Inserted in `bankActions` table");


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // Table 11 `bankAccountAudit` insertion :  

        // SHIFTED TO ANOTHER INDIVIDUAL METHOD


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // Table 12 `loan` insertion :  

        // SHIFTED TO ANOTHER INDIVIDUAL METHOD
        


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // Table 13 `emi` insertion :  

        // SHIFTED TO ANOTHER INDIVIDUAL METHOD


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // Table 14 `notification` insertion :  

        // SHIFTED TO ANOTHER INDIVIDUAL METHOD


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~    


        con.close();
        fromMain_II.complete(null);
    }
    private static int debitMoney(String uniqueUserId, long amount, String through) throws ClassNotFoundException, SQLException {
        Connection con = new Connectivity().establishConnection();
        if(through.equals("ATM")) {

            String dd_mm_yyyy = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            String hh_mm_ss = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            String query = "select * from `userBankRelatedDetails` where `Customer Auto-Generated ID` = '"+uniqueUserId+"'";
            Statement st = con.createStatement();
            ResultSet rs =  st.executeQuery(query);
            Double userCurrentBalance = null, userMinimumBalanceCriteria = null, monthlyLimit = null, dailyLimit = null;
            while(rs.next()) {
                userCurrentBalance = rs.getDouble("Customer Bank Balance");
                userMinimumBalanceCriteria = rs.getDouble("Customer Bank Minimum Maintenance Balance");
                monthlyLimit = rs.getDouble("Customer Bank Monthly Limit");
                dailyLimit = rs.getDouble("Customer Bank Daily Limit");
            }

            if(userCurrentBalance<amount) {
                hat.setWithdraw_or_Deposit_Reference_Number_table_7(provideReferenceId(through));
                hat.setTransaction_Date_table_7(dd_mm_yyyy);
                hat.setTransaction_Time_table_7(hh_mm_ss);
                hat.setTransaction_Amount_table_7(amount);
                hat.setWithdraw_or_Deposit_table_7("Withdraw");
                hat.setTransaction_Status_table_7("Failed");
                hat.setTransaction_Failure_Log_table_7("Insufficient Balance");
                
                ATMTransactionDetailInsertion(null);
                return 0;
            }

            if(monthlyLimit<=evaluateMonthlyTransaction(uniqueUserId)) {
                hat.setWithdraw_or_Deposit_Reference_Number_table_7(provideReferenceId(through));
                hat.setTransaction_Date_table_7(dd_mm_yyyy);
                hat.setTransaction_Time_table_7(hh_mm_ss);
                hat.setTransaction_Amount_table_7(amount);
                hat.setWithdraw_or_Deposit_table_7("Withdraw");
                hat.setTransaction_Status_table_7("Failed");
                hat.setTransaction_Failure_Log_table_7("Monthly Limit Exceeded");
                
                ATMTransactionDetailInsertion(null);
                return 1;
            }
            if(dailyLimit<=evaluateDailyTransaction(uniqueUserId)) {
                hat.setWithdraw_or_Deposit_Reference_Number_table_7(provideReferenceId(through));
                hat.setTransaction_Date_table_7(dd_mm_yyyy);
                hat.setTransaction_Time_table_7(hh_mm_ss);
                hat.setTransaction_Amount_table_7(amount);
                hat.setWithdraw_or_Deposit_table_7("Withdraw");
                hat.setTransaction_Status_table_7("Failed");
                hat.setTransaction_Failure_Log_table_7("Daily Limit Exceeded");

                ATMTransactionDetailInsertion(null);
                return 2;
            }

            // --------------------------------------------------------------
            if((userCurrentBalance-amount)<userMinimumBalanceCriteria) {

                String htmlMessage = "<html><body style='width: 250px;'><h3 style='color: red;'>Minimum Balance Alert</h3><p>" + "After Withdrawl, Your Account Will Get Below To Its Minimum Maintenance Balance" + "</p><br /></body></html>";
            
                int userChoice = JOptionPane.showOptionDialog(null, htmlMessage, "Minimum Balance Alert", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Don't Withdraw", "Continue Withdrawl"}, "Don't Withdrawl");

                if (userChoice == JOptionPane.YES_OPTION) {
                    hat.setWithdraw_or_Deposit_Reference_Number_table_7(provideReferenceId(through));
                    hat.setTransaction_Date_table_7(dd_mm_yyyy);
                    hat.setTransaction_Time_table_7(hh_mm_ss);
                    hat.setTransaction_Amount_table_7(amount);
                    hat.setWithdraw_or_Deposit_table_7("Withdraw");
                    hat.setTransaction_Status_table_7("Failed");
                    hat.setTransaction_Failure_Log_table_7("Minimum Balance Criteria Reached");

                    ATMTransactionDetailInsertion(null);
                    return 3;

                } else {
                    Double afterDebiting = userCurrentBalance-amount;
                    query = "update `userBankRelatedDetails` set `Customer Bank Balance` = "+afterDebiting+" where `Customer Auto-Generated ID`='"+uniqueUserId+"'";
                    st = con.createStatement();
                    st.executeUpdate(query);
                    con.close();
                    hat.setWithdraw_or_Deposit_Reference_Number_table_7(provideReferenceId(through));
                    hat.setTransaction_Date_table_7(dd_mm_yyyy);
                    hat.setTransaction_Time_table_7(hh_mm_ss);
                    hat.setTransaction_Amount_table_7(amount);
                    hat.setWithdraw_or_Deposit_table_7("Withdraw");
                    hat.setTransaction_Status_table_7("Successful");
                    hat.setTransaction_Failure_Log_table_7(null);

                    ATMTransactionDetailInsertion(null);
                    return 6;
                }
            }
            query = "select * from `bankActions` where `Customer Auto-Generated ID` = '"+uniqueUserId+"'";
            st = con.createStatement();
            rs = st.executeQuery(query);
            String status = null;
            while(rs.next()) {
                status = rs.getString("ATM Card Facility Status");
            }
            if(status=="Frozen") {
                hat.setWithdraw_or_Deposit_Reference_Number_table_7(provideReferenceId(through));
                hat.setTransaction_Date_table_7(dd_mm_yyyy);
                hat.setTransaction_Time_table_7(hh_mm_ss);
                hat.setTransaction_Amount_table_7(amount);
                hat.setWithdraw_or_Deposit_table_7("Withdraw");
                hat.setTransaction_Status_table_7("Failed");
                hat.setTransaction_Failure_Log_table_7("ATM Facility Frozen");

                ATMTransactionDetailInsertion(null);
                return 4;
            } else if(status=="Deactivated") {
                hat.setWithdraw_or_Deposit_Reference_Number_table_7(provideReferenceId(through));
                hat.setTransaction_Date_table_7(dd_mm_yyyy);
                hat.setTransaction_Time_table_7(hh_mm_ss);
                hat.setTransaction_Amount_table_7(amount);
                hat.setWithdraw_or_Deposit_table_7("Withdraw");
                hat.setTransaction_Status_table_7("Failed");
                hat.setTransaction_Failure_Log_table_7("ATM Facility Deactivated");

                ATMTransactionDetailInsertion(null);
                return 5;
            }

            Double afterDebiting = userCurrentBalance-amount;
            query = "update `userBankRelatedDetails` set `Customer Bank Balance` = "+afterDebiting+" where `Customer Auto-Generated ID`='"+uniqueUserId+"'";
            st = con.createStatement();
            st.executeUpdate(query);
            con.close();

            hat.setWithdraw_or_Deposit_Reference_Number_table_7(provideReferenceId(through));
            hat.setTransaction_Date_table_7(dd_mm_yyyy);
            hat.setTransaction_Time_table_7(hh_mm_ss);
            hat.setTransaction_Amount_table_7(amount);
            hat.setWithdraw_or_Deposit_table_7("Withdraw");
            hat.setTransaction_Status_table_7("Successful");
            hat.setTransaction_Failure_Log_table_7(null);

            ATMTransactionDetailInsertion(null);
            return 6;
        }
        if(through.equals("UPI")) {

            String dd_mm_yyyy = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            String hh_mm_ss = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            String query = "select * from `userBankRelatedDetails` where `Customer Auto-Generated ID` = '"+uniqueUserId+"'";
            Statement st = con.createStatement();
            ResultSet rs =  st.executeQuery(query);
            Double userCurrentBalance = null, userMinimumBalanceCriteria = null, monthlyLimit = null, dailyLimit = null;
            while(rs.next()) {
                userCurrentBalance = rs.getDouble("Customer Bank Balance");
                userMinimumBalanceCriteria = rs.getDouble("Customer Bank Minimum Maintenance Balance");
                monthlyLimit = rs.getDouble("Customer Bank Monthly Limit");
                dailyLimit = rs.getDouble("Customer Bank Daily Limit");
            }

            if(userCurrentBalance<hut.fetchTransaction_Amount_table_9()) {

                hut.setUPI_Reference_Number_table_9(provideReferenceId(through));
                hut.setTransaction_Date_table_9(dd_mm_yyyy);
                hut.setTransaction_Time_table_9(hh_mm_ss);
                hut.setTransaction_Status_table_9("Failed");
                hut.setTransaction_Failure_Log_table_9("Insufficient Balance");
                hut.setUnique_id_to_be_inserted(hut.fetchSender_Unique_Id());
                hut.setCredit_or_debit_to_be_inserted(hut.fetchCredit_or_Debit_table_9(0));

                UPITransactionDetailInsertion(null);
                return 0;
            }
 
            if(monthlyLimit<=evaluateMonthlyTransaction(uniqueUserId)) {
                hut.setUPI_Reference_Number_table_9(provideReferenceId(through));
                hut.setTransaction_Date_table_9(dd_mm_yyyy);
                hut.setTransaction_Time_table_9(hh_mm_ss);
                hut.setTransaction_Status_table_9("Failed");
                hut.setTransaction_Failure_Log_table_9("Monthly Limit Exceeded");
                hut.setUnique_id_to_be_inserted(hut.fetchSender_Unique_Id());
                hut.setCredit_or_debit_to_be_inserted(hut.fetchCredit_or_Debit_table_9(0));

                UPITransactionDetailInsertion(null);
                return 1;
            }
            if(dailyLimit<=evaluateDailyTransaction(uniqueUserId)) {

                hut.setUPI_Reference_Number_table_9(provideReferenceId(through));
                hut.setTransaction_Date_table_9(dd_mm_yyyy);
                hut.setTransaction_Time_table_9(hh_mm_ss);
                hut.setTransaction_Status_table_9("Failed");
                hut.setTransaction_Failure_Log_table_9("Daily Limit Exceeded");
                hut.setUnique_id_to_be_inserted(hut.fetchSender_Unique_Id());
                hut.setCredit_or_debit_to_be_inserted(hut.fetchCredit_or_Debit_table_9(0));

                UPITransactionDetailInsertion(null);
                return 2;
            }

            if((userCurrentBalance-hut.fetchTransaction_Amount_table_9())<userMinimumBalanceCriteria) {

                String htmlMessage = "<html><body style='width: 250px;'><h3 style='color: red;'>Minimum Balance Alert</h3><p>" + "After Withdrawl, Your Account Will Get Below To Its Minimum Maintenance Balance" + "</p><br /></body></html>";
            
                int userChoice = JOptionPane.showOptionDialog(null, htmlMessage, "Minimum Balance Alert", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Don't Withdraw", "Continue Withdrawl"}, "Don't Withdrawl");

                if (userChoice == JOptionPane.YES_OPTION) {
                    hut.setUPI_Reference_Number_table_9(provideReferenceId(through));
                    hut.setTransaction_Date_table_9(dd_mm_yyyy);
                    hut.setTransaction_Time_table_9(hh_mm_ss);
                    hut.setTransaction_Status_table_9("Failed");
                    hut.setTransaction_Failure_Log_table_9("Minimum Balance Criteria Reached");
                    hut.setUnique_id_to_be_inserted(hut.fetchSender_Unique_Id());
                    hut.setCredit_or_debit_to_be_inserted(hut.fetchCredit_or_Debit_table_9(0));

                    UPITransactionDetailInsertion(null);
                    return 3;

                } else {
                    Double afterDebiting = userCurrentBalance-hut.fetchTransaction_Amount_table_9();
                    query = "update `userBankRelatedDetails` set `Customer Bank Balance` = "+afterDebiting+" where `Customer Auto-Generated ID`='"+uniqueUserId+"'";
                    st = con.createStatement();
                    st.executeUpdate(query);
                    con.close();
                    hut.setUPI_Reference_Number_table_9(provideReferenceId(through));
                    hut.setTransaction_Date_table_9(dd_mm_yyyy);
                    hut.setTransaction_Time_table_9(hh_mm_ss);
                    hut.setTransaction_Status_table_9("Successful");
                    hut.setTransaction_Failure_Log_table_9(null);
                    hut.setUnique_id_to_be_inserted(hut.fetchSender_Unique_Id());
                    hut.setCredit_or_debit_to_be_inserted(hut.fetchCredit_or_Debit_table_9(0));

                    UPITransactionDetailInsertion(null);
                    return 6;
                }
            }
            query = "select * from `bankActions` where `Customer Auto-Generated ID` = '"+uniqueUserId+"'";
            st = con.createStatement();
            rs = st.executeQuery(query);
            String status = null;
            while(rs.next()) {
                status = rs.getString("UPI Facility Status");
            }
            if(status=="Frozen") {
                hut.setUPI_Reference_Number_table_9(provideReferenceId(through));
                hut.setTransaction_Date_table_9(dd_mm_yyyy);
                hut.setTransaction_Time_table_9(hh_mm_ss);
                hut.setTransaction_Status_table_9("Failed");
                hut.setTransaction_Failure_Log_table_9("UPI Facility Frozen");
                hut.setUnique_id_to_be_inserted(hut.fetchSender_Unique_Id());
                hut.setCredit_or_debit_to_be_inserted(hut.fetchCredit_or_Debit_table_9(0));

                UPITransactionDetailInsertion(null);
                return 4;
            } else if(status=="Deactivated") {
                hut.setUPI_Reference_Number_table_9(provideReferenceId(through));
                hut.setTransaction_Date_table_9(dd_mm_yyyy);
                hut.setTransaction_Time_table_9(hh_mm_ss);
                hut.setTransaction_Status_table_9("Failed");
                hut.setTransaction_Failure_Log_table_9("UPI Facility Deactivated");
                hut.setUnique_id_to_be_inserted(hut.fetchSender_Unique_Id());
                hut.setCredit_or_debit_to_be_inserted(hut.fetchCredit_or_Debit_table_9(0));

                UPITransactionDetailInsertion(null);
                return 5;
            }

            Double afterDebiting = userCurrentBalance-hut.fetchTransaction_Amount_table_9();
            query = "update `userBankRelatedDetails` set `Customer Bank Balance` = "+afterDebiting+" where `Customer Auto-Generated ID`='"+uniqueUserId+"'";
            st = con.createStatement();
            st.executeUpdate(query);
            con.close();

            hut.setUPI_Reference_Number_table_9(provideReferenceId(through));
            hut.setTransaction_Date_table_9(dd_mm_yyyy);
            hut.setTransaction_Time_table_9(hh_mm_ss);
            hut.setTransaction_Status_table_9("Successful");
            hut.setTransaction_Failure_Log_table_9(null);
            hut.setUnique_id_to_be_inserted(hut.fetchSender_Unique_Id());
            hut.setCredit_or_debit_to_be_inserted(hut.fetchCredit_or_Debit_table_9(0));

            UPITransactionDetailInsertion(null);
            return 6;
        }

        return 0;
    }
    private static int creditMoney(String uniqueUserId, long amount, String through) throws ClassNotFoundException, SQLException {
        Connection con = new Connectivity().establishConnection();
        if(through=="ATM") {

            String dd_mm_yyyy = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            String hh_mm_ss = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            String query = "select * from `userBankRelatedDetails` where `Customer Auto-Generated ID` = '"+uniqueUserId+"'";
            Statement st = con.createStatement();
            ResultSet rs =  st.executeQuery(query);
            Double userCurrentBalance = null;
            while(rs.next()) {
                userCurrentBalance = rs.getDouble("Customer Bank Balance");
            }

            query = "select * from `bankActions` where `Customer Auto-Generated ID` = '"+uniqueUserId+"'";
            st = con.createStatement();
            rs = st.executeQuery(query);
            String status = null;
            while(rs.next()) {
                status = rs.getString("ATM Card Facility Status");
            }
            if(status=="Frozen") {

                hat.setWithdraw_or_Deposit_Reference_Number_table_7(provideReferenceId(through));
                hat.setTransaction_Date_table_7(dd_mm_yyyy);
                hat.setTransaction_Time_table_7(hh_mm_ss);
                hat.setTransaction_Amount_table_7(amount);
                hat.setWithdraw_or_Deposit_table_7("Deposit");
                hat.setTransaction_Status_table_7("Failed");
                hat.setTransaction_Failure_Log_table_7("ATM Facility Frozen");
                ATMTransactionDetailInsertion(null);
                return 0;
            } else if(status=="Deactivated") {

                hat.setWithdraw_or_Deposit_Reference_Number_table_7(provideReferenceId(through));
                hat.setTransaction_Date_table_7(dd_mm_yyyy);
                hat.setTransaction_Time_table_7(hh_mm_ss);
                hat.setTransaction_Amount_table_7(amount);
                hat.setWithdraw_or_Deposit_table_7("Deposit");
                hat.setTransaction_Status_table_7("Failed");
                hat.setTransaction_Failure_Log_table_7("ATM Facility Deactivated");
                ATMTransactionDetailInsertion(null);
                return 1;
            }

            Double afterDebiting = userCurrentBalance+amount;
            query = "update `userBankRelatedDetails` set `Customer Bank Balance` = "+afterDebiting+" where `Customer Auto-Generated ID`='"+uniqueUserId+"'";
            st = con.createStatement();
            st.executeUpdate(query);
            con.close();

            hat.setWithdraw_or_Deposit_Reference_Number_table_7(provideReferenceId(through));
            hat.setTransaction_Date_table_7(dd_mm_yyyy);
            hat.setTransaction_Time_table_7(hh_mm_ss);
            hat.setTransaction_Amount_table_7(amount);
            hat.setWithdraw_or_Deposit_table_7("Deposit");
            hat.setTransaction_Status_table_7("Successful");
            hat.setTransaction_Failure_Log_table_7(null);
            ATMTransactionDetailInsertion(null);
            return 2;
        } 
        if(through.equals("UPI")) {

            String dd_mm_yyyy = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            String hh_mm_ss = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            String query = "select * from `userBankRelatedDetails` where `Customer Auto-Generated ID` = '"+uniqueUserId+"'";
            Statement st = con.createStatement();
            ResultSet rs =  st.executeQuery(query);
            Double userCurrentBalance = null;
            while(rs.next()) {
                userCurrentBalance = rs.getDouble("Customer Bank Balance");
            }

            query = "select * from `bankActions` where `Customer Auto-Generated ID` = '"+uniqueUserId+"'";
            st = con.createStatement();
            rs = st.executeQuery(query);
            String status = null;
            while(rs.next()) {
                status = rs.getString("UPI Facility Status");
            }
            if(status=="Frozen") {
                
                hut.setUPI_Reference_Number_table_9(hut.fetchUPI_Reference_Number_table_9());
                hut.setTransaction_Date_table_9(dd_mm_yyyy);
                hut.setTransaction_Time_table_9(hh_mm_ss);
                hut.setTransaction_Status_table_9("Failed");
                hut.setTransaction_Failure_Log_table_9("UPI Facility Frozen");
                hut.setUnique_id_to_be_inserted(hut.fetchReceiver_Unique_Id());
                hut.setCredit_or_debit_to_be_inserted(hut.fetchCredit_or_Debit_table_9(1));

                UPITransactionDetailInsertion(null);
                return 0;
            } else if(status=="Deactivated") {

                hut.setUPI_Reference_Number_table_9(hut.fetchUPI_Reference_Number_table_9());
                hut.setTransaction_Date_table_9(dd_mm_yyyy);
                hut.setTransaction_Time_table_9(hh_mm_ss);
                hut.setTransaction_Status_table_9("Failed");
                hut.setTransaction_Failure_Log_table_9("UPI Facility Deactivated");
                hut.setUnique_id_to_be_inserted(hut.fetchReceiver_Unique_Id());
                hut.setCredit_or_debit_to_be_inserted(hut.fetchCredit_or_Debit_table_9(1));

                UPITransactionDetailInsertion(null);
                return 1;
            }

            Double afterCrediting = userCurrentBalance+hut.fetchTransaction_Amount_table_9();
            query = "update `userBankRelatedDetails` set `Customer Bank Balance` = "+afterCrediting+" where `Customer Auto-Generated ID`='"+uniqueUserId+"'";
            st = con.createStatement();
            st.executeUpdate(query);
            con.close();

            hut.setUPI_Reference_Number_table_9(hut.fetchUPI_Reference_Number_table_9());
            hut.setTransaction_Date_table_9(dd_mm_yyyy);
            hut.setTransaction_Time_table_9(hh_mm_ss);
            hut.setTransaction_Status_table_9("Successful");
            hut.setTransaction_Failure_Log_table_9(null);
            hut.setUnique_id_to_be_inserted(hut.fetchReceiver_Unique_Id());
            hut.setCredit_or_debit_to_be_inserted(hut.fetchCredit_or_Debit_table_9(1));

            UPITransactionDetailInsertion(null);
            return 2;
        }


        return 0;
    }
    private static void NetBankingTransactionDetailInsertion(Runnable callback) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bankingsystemsimulation";
        String username = "your_mysql_database_user_id";
        String password = "your_mysql_database_password";
        Connection con = DriverManager.getConnection(url, username, password);

        // Table 5 `nbTransactionHistory` insertion :  
        
        String attributes = "`Serial Number`, `Customer Auto-Generated ID`, `Transaction Reference ID`, `Transaction Date`, `Transaction Time`, `Transaction Amount`, `Description/Subject`, `Credit/Debit`, `Sender Account Number`, `Receiver Account Number`, `Transaction Status`";
        String values = "?,?,?,?,?,?,?,?,?,?,?";
        String query = "insert into nbTransactionHistory("+attributes+") values ("+values+")";
        
        PreparedStatement ps = con.prepareStatement(query);

        String countQuery = "select count(*) as maxCurrentRow from nbTransactionHistory";
        Statement countStatement = con.createStatement();
        ResultSet countResultSet = countStatement.executeQuery(countQuery);
        int maxCurrentRow = 0;
        if (countResultSet.next()) {
            maxCurrentRow = countResultSet.getInt("maxCurrentRow");
        }

        ps.setInt(1, maxCurrentRow+1);
        ps.setString(2, ard.fetchUserGeneratedID());
        // ps.setString(3, ard.fetchTransaction_Reference_Number_table_5()); // Error : Because i Changed Reference Number from Long to String
        ps.setString(4, ard.fetchTransaction_Date_table_5());
        ps.setString(5, ard.fetchTransaction_Time_table_5());
        ps.setFloat(6, ard.fetchTransaction_Amount_table_5());
        ps.setString(7, ard.fetchDescription_or_Subject_table_5());
        // ps.setString(8, ard.fetchCredit_or_Debit_table_5()); // 0 for Debit, 1 for Credit -- given by User While Registering for Account
        ps.setLong(9, ard.fetchSender_Account_Number_table_5());
        ps.setLong(10, ard.fetchReceiver_Account_Number_table_5());
        // ps.setString(11, ard.fetchTransaction_Status_table_5()); // 0 for Successful, 1 for Failed -- given by User While Registering for Account

        ps.executeUpdate();
        System.out.println("Value Inserted in `nbTransactionHistory` table");

        con.close();
    }
    private static void ATMTransactionDetailInsertion(Runnable callback) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bankingsystemsimulation";
        String username = "your_mysql_database_user_id";
        String password = "your_mysql_database_password";
        Connection con = DriverManager.getConnection(url, username, password);

        String attributes = "`Serial Number`, `Customer Auto-Generated ID`, `Withdraw/Deposit Reference ID`, `Transaction Date`, `Transaction Time`, `Transaction Amount`, `Withdraw/Deposit`, `Transaction Status`, `Transaction Failure Log`";
        String values = "?,?,?,?,?,?,?,?,?";
        String query = "insert into atmTransactionHistory("+attributes+") values ("+values+")";
        
        PreparedStatement ps = con.prepareStatement(query);

        String countQuery = "select count(*) as maxCurrentRow from atmTransactionHistory";
        Statement countStatement = con.createStatement();
        ResultSet countResultSet = countStatement.executeQuery(countQuery);
        int maxCurrentRow = 0;
        if (countResultSet.next()) {
            maxCurrentRow = countResultSet.getInt("maxCurrentRow");
        }

        ps.setInt(1, maxCurrentRow+1);
        ps.setString(2, ard.fetchUserIdWhileLogin());
        ps.setString(3, hat.fetchWithdraw_or_Deposit_Reference_Number_table_7());
        ps.setString(4, hat.fetchTransaction_Date_table_7());
        ps.setString(5, hat.fetchTransaction_Time_table_7());
        ps.setFloat(6, hat.fetchTransaction_Amount_table_7());
        ps.setString(7, hat.fetchWithdraw_or_Deposit_table_7());
        ps.setString(8, hat.fetchTransaction_Status_table_7());
        ps.setString(9, hat.fetchTransaction_Failure_Log_table_7());

        ps.executeUpdate();
        System.out.println("Value Inserted in `atmTransactionHistory` table");

        con.close();
    }
    private static void UPITransactionDetailInsertion(Runnable callback) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bankingsystemsimulation";
        String username = "your_mysql_database_user_id";
        String password = "your_mysql_database_password";
        Connection con = DriverManager.getConnection(url, username, password);

        String attributes = "`Serial Number`, `Customer Auto-Generated ID`, `UPI Reference Number`, `Transaction Date`, `Transaction Time`, `Transaction Amount`, `Description/Subject`, `Credit/Debit`, `Sender UPI ID`, `Receiver UPI ID`, `Transaction Status`, `Transaction Failure Log`";
        String values = "?,?,?,?,?,?,?,?,?,?,?,?";
        String query = "insert into upiTransactionHistory("+attributes+") values ("+values+")";
        
        PreparedStatement ps = con.prepareStatement(query);

        String countQuery = "select count(*) as maxCurrentRow from upiTransactionHistory";
        Statement countStatement = con.createStatement();
        ResultSet countResultSet = countStatement.executeQuery(countQuery);
        int maxCurrentRow = 0;
        if (countResultSet.next()) {
            maxCurrentRow = countResultSet.getInt("maxCurrentRow");
        }
        
        ps.setInt(1, maxCurrentRow+1);
        ps.setString(2, hut.fetchUnique_id_to_be_inserted());
        ps.setString(3, hut.fetchUPI_Reference_Number_table_9());
        ps.setString(4, hut.fetchTransaction_Date_table_9());
        ps.setString(5, hut.fetchTransaction_Time_table_9());
        ps.setDouble(6, hut.fetchTransaction_Amount_table_9());
        ps.setString(7, hut.fetchDescription_Subject_table_9());
        ps.setString(8, hut.fetchCredit_or_debit_to_be_inserted());
        ps.setString(9, hut.fetchSender_UPI_ID_table_9());
        ps.setString(10, hut.fetchReceiver_UPI_ID_table_9());
        ps.setString(11, hut.fetchTransaction_Status_table_9());
        ps.setString(12, hut.fetchTransaction_Failure_Log_table_9());

        
        ps.executeUpdate();
        System.out.println("Value Inserted in `upiTransactionHistory` table");

        con.close();
    }
    private static void ManageBankAccountAuditingUpdation(Runnable callback) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bankingsystemsimulation";
        String username = "your_mysql_database_user_id";
        String password = "your_mysql_database_password";
        Connection con = DriverManager.getConnection(url, username, password);
        
        // Table 11 `bankAccountAudit` insertion :  

        String attributes = "`Serial Number`, `Customer Auto-Generated ID`, `Any Loan`, `Number Of Loans`, `Interest Percentage Per Annum`, `Any EMI`, `Number Of EMIs`, `EMI Charge Per Month`";
        String values = "?,?,?,?,?,?,?,?";
        String query = "insert into bankAccountAudit("+attributes+") values ("+values+")";
        
        PreparedStatement ps = con.prepareStatement(query);
        
        String countQuery = "select count(*) as maxCurrentRow from bankAccountAudit";
        Statement countStatement = con.createStatement();
        ResultSet countResultSet = countStatement.executeQuery(countQuery);
        int maxCurrentRow = 0;
        if (countResultSet.next()) {
            maxCurrentRow = countResultSet.getInt("maxCurrentRow");
        }

        ps.setInt(1, maxCurrentRow+1);
        ps.setString(2, ard.fetchUserGeneratedID());
        // ps.setString(3, ard.fetchAny_Loan_table_11()); // 0 for Yes, 1 for No -- based on calculations 
        ps.setInt(4, ard.fetchNumber_Of_Loans_table_11());
        ps.setFloat(5, ard.fetchInterest_Percentage_Per_Annum_table_11());
        // ps.setString(6, ard.fetchAny_EMI_table_11()); // 0 for Yes, 1 for No -- based on calculations 
        ps.setInt(7, ard.fetchNumber_Of_EMIs_table_11());
        ps.setFloat(8, ard.fetchEMI_Charge_Per_Month_table_11());

        
        ps.executeUpdate();
        System.out.println("Value Inserted in `bankAccountAudit` table");

        con.close();
    }
    private static void ManageLoanUpdation(Runnable callback) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bankingsystemsimulation";
        String username = "your_mysql_database_user_id";
        String password = "your_mysql_database_password";
        Connection con = DriverManager.getConnection(url, username, password);
        
        // Table 12 `loan` insertion :  

        String attributes = "`Serial Number`, `Customer Auto-Generated ID`, `Loan Reference ID`, `Loan Paid Back`, `Loan Remaining`, `Loan Recovered`";
        String values = "?,?   ,?,?,?,?";
        String query = "insert into loan("+attributes+") values ("+values+")";
        
        PreparedStatement ps = con.prepareStatement(query);
        
        String countQuery = "select count(*) as maxCurrentRow from loan";
        Statement countStatement = con.createStatement();
        ResultSet countResultSet = countStatement.executeQuery(countQuery);
        int maxCurrentRow = 0;
        if (countResultSet.next()) {
            maxCurrentRow = countResultSet.getInt("maxCurrentRow");
        }

        ps.setInt(1, maxCurrentRow+1);
        ps.setString(2, ard.fetchUserGeneratedID());
        ps.setString(3, ard.fetchLoan_Reference_ID_table_12());
        ps.setFloat(4, ard.fetchLoan_Paid_Back_table_12());
        ps.setFloat(5, ard.fetchLoan_Remaining_table_12());
        // ps.setString(6, ard.fetchLoan_Recovered_table_12()); // 0 for Yes, 1 for No -- based on calculations 
        
        ps.executeUpdate();
        System.out.println("Value Inserted in `loan` table");

        con.close();
    }
    private static void ManageEMIUpdation(Runnable callback) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bankingsystemsimulation";
        String username = "your_mysql_database_user_id";
        String password = "your_mysql_database_password";
        Connection con = DriverManager.getConnection(url, username, password);
        
        // Table 13 `emi` insertion :  

        String attributes = "`Serial Number`, `Customer Auto-Generated ID`, `EMI Reference ID`, `EMI Paid Back`, `EMI Remaining`, `EMI Recovered`";
        String values = "?,?,?,?,?,?";
        String query = "insert into emi("+attributes+") values ("+values+")";
        
        PreparedStatement ps = con.prepareStatement(query);
        
        String countQuery = "select count(*) as maxCurrentRow from emi";
        Statement countStatement = con.createStatement();
        ResultSet countResultSet = countStatement.executeQuery(countQuery);
        int maxCurrentRow = 0;
        if (countResultSet.next()) {
            maxCurrentRow = countResultSet.getInt("maxCurrentRow");
        }

        ps.setInt(1, maxCurrentRow+1);
        ps.setString(2, ard.fetchUserGeneratedID());
        ps.setString(3, ard.fetchEMI_Reference_ID_table_13());
        ps.setFloat(4, ard.fetchEMI_Paid_Back_table_13());
        ps.setFloat(5, ard.fetchEMI_Remaining_table_13());
        // ps.setString(6, ard.fetchEMI_Recovered_table_13()); // 0 for Yes, 1 for No -- based on calculations 

        ps.executeUpdate();
        System.out.println("Value Inserted in `emi` table");

        con.close();
    }
    private static void ManageNotificationUpdation(Runnable callback) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bankingsystemsimulation";
        String username = "your_mysql_database_user_id";
        String password = "your_mysql_database_password";
        Connection con = DriverManager.getConnection(url, username, password);
        
        // Table 14 `notification` insertion :  

        String attributes = "`Customer Auto-Generated ID`, `Notification Fill Till`, `Notification 1`, `Notification 2`, `Notification 3`, `Notification 4`, `Notification 5`, `Notification 6`, `Notification 7`, `Notification 8`, `Notification 9`, `Notification 10`, `Notification 11`, `Notification 12`, `Notification 13`, `Notification 14`, `Notification 15`, `Notification 16`, `Notification 17`, `Notification 18`, `Notification 19`, `Notification 20`, `Notification 21`, `Notification 22`, `Notification 23`, `Notification 24`, `Notification 25`, `Notification 26`, `Notification 27`, `Notification 28`, `Notification 29`, `Notification 30`, `Notification 31`, `Notification 32`, `Notification 33`, `Notification 34`, `Notification 35`, `Notification 36`, `Notification 37`, `Notification 38`, `Notification 39`, `Notification 40`, `Notification 41`, `Notification 42`, `Notification 43`, `Notification 44`, `Notification 45`, `Notification 46`, `Notification 47`, `Notification 48`, `Notification 49`, `Notification 50`, `Notification 51`, `Notification 52`, `Notification 53`, `Notification 54`, `Notification 55`, `Notification 56`, `Notification 57`, `Notification 58`, `Notification 59`, `Notification 60`, `Notification 61`, `Notification 62`, `Notification 63`, `Notification 64`, `Notification 65`, `Notification 66`, `Notification 67`, `Notification 68`, `Notification 69`, `Notification 70`, `Notification 71`, `Notification 72`, `Notification 73`, `Notification 74`, `Notification 75`, `Notification 76`, `Notification 77`, `Notification 78`, `Notification 79`, `Notification 80`, `Notification 81`, `Notification 82`, `Notification 83`, `Notification 84`, `Notification 85`, `Notification 86`, `Notification 87`, `Notification 88`, `Notification 89`, `Notification 90`, `Notification 91`, `Notification 92`, `Notification 93`, `Notification 94`, `Notification 95`, `Notification 96`, `Notification 97`, `Notification 98`, `Notification 99`, `Notification 100`";
        String values = "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";
        String query = "insert into notification("+attributes+") values ("+values+")";
        
        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, ard.fetchUserGeneratedID());
        ps.setInt(2, ard.fetchNotification_Fill_Till_table_14());
        ps.setString(3, ard.fetchNotification_table_14(0));
        ps.setString(4, ard.fetchNotification_table_14(1));
        ps.setString(5, ard.fetchNotification_table_14(2));
        ps.setString(6, ard.fetchNotification_table_14(3));
        ps.setString(7, ard.fetchNotification_table_14(4));
        ps.setString(8, ard.fetchNotification_table_14(5));
        ps.setString(9, ard.fetchNotification_table_14(6));
        ps.setString(10, ard.fetchNotification_table_14(7));
        ps.setString(11, ard.fetchNotification_table_14(8));
        ps.setString(12, ard.fetchNotification_table_14(9));
        ps.setString(13, ard.fetchNotification_table_14(10));
        ps.setString(14, ard.fetchNotification_table_14(11));
        ps.setString(15, ard.fetchNotification_table_14(12));
        ps.setString(16, ard.fetchNotification_table_14(13));
        ps.setString(17, ard.fetchNotification_table_14(14));
        ps.setString(18, ard.fetchNotification_table_14(15));
        ps.setString(19, ard.fetchNotification_table_14(16));
        ps.setString(20, ard.fetchNotification_table_14(17));
        ps.setString(21, ard.fetchNotification_table_14(18));
        ps.setString(22, ard.fetchNotification_table_14(19));
        ps.setString(23, ard.fetchNotification_table_14(20));
        ps.setString(24, ard.fetchNotification_table_14(21));
        ps.setString(25, ard.fetchNotification_table_14(22));
        ps.setString(26, ard.fetchNotification_table_14(23));
        ps.setString(27, ard.fetchNotification_table_14(24));
        ps.setString(28, ard.fetchNotification_table_14(25));
        ps.setString(29, ard.fetchNotification_table_14(26));
        ps.setString(30, ard.fetchNotification_table_14(27));
        ps.setString(31, ard.fetchNotification_table_14(28));
        ps.setString(32, ard.fetchNotification_table_14(29));
        ps.setString(33, ard.fetchNotification_table_14(30));
        ps.setString(34, ard.fetchNotification_table_14(31));
        ps.setString(35, ard.fetchNotification_table_14(32));
        ps.setString(36, ard.fetchNotification_table_14(33));
        ps.setString(37, ard.fetchNotification_table_14(34));
        ps.setString(38, ard.fetchNotification_table_14(35));
        ps.setString(39, ard.fetchNotification_table_14(36));
        ps.setString(40, ard.fetchNotification_table_14(37));
        ps.setString(41, ard.fetchNotification_table_14(38));
        ps.setString(42, ard.fetchNotification_table_14(39));
        ps.setString(43, ard.fetchNotification_table_14(40));
        ps.setString(44, ard.fetchNotification_table_14(41));
        ps.setString(45, ard.fetchNotification_table_14(42));
        ps.setString(46, ard.fetchNotification_table_14(43));
        ps.setString(47, ard.fetchNotification_table_14(44));
        ps.setString(48, ard.fetchNotification_table_14(45));
        ps.setString(49, ard.fetchNotification_table_14(46));
        ps.setString(50, ard.fetchNotification_table_14(47));
        ps.setString(51, ard.fetchNotification_table_14(48));
        ps.setString(52, ard.fetchNotification_table_14(49));
        ps.setString(53, ard.fetchNotification_table_14(50));
        ps.setString(54, ard.fetchNotification_table_14(51));
        ps.setString(55, ard.fetchNotification_table_14(52));
        ps.setString(56, ard.fetchNotification_table_14(53));
        ps.setString(57, ard.fetchNotification_table_14(54));
        ps.setString(58, ard.fetchNotification_table_14(55));
        ps.setString(59, ard.fetchNotification_table_14(56));
        ps.setString(60, ard.fetchNotification_table_14(57));
        ps.setString(61, ard.fetchNotification_table_14(58));
        ps.setString(62, ard.fetchNotification_table_14(59));
        ps.setString(63, ard.fetchNotification_table_14(60));
        ps.setString(64, ard.fetchNotification_table_14(61));
        ps.setString(65, ard.fetchNotification_table_14(62));
        ps.setString(66, ard.fetchNotification_table_14(63));
        ps.setString(67, ard.fetchNotification_table_14(64));
        ps.setString(68, ard.fetchNotification_table_14(65));
        ps.setString(69, ard.fetchNotification_table_14(66));
        ps.setString(70, ard.fetchNotification_table_14(67));
        ps.setString(71, ard.fetchNotification_table_14(68));
        ps.setString(72, ard.fetchNotification_table_14(69));
        ps.setString(73, ard.fetchNotification_table_14(70));
        ps.setString(74, ard.fetchNotification_table_14(71));
        ps.setString(75, ard.fetchNotification_table_14(72));
        ps.setString(76, ard.fetchNotification_table_14(73));
        ps.setString(77, ard.fetchNotification_table_14(74));
        ps.setString(78, ard.fetchNotification_table_14(75));
        ps.setString(79, ard.fetchNotification_table_14(76));
        ps.setString(80, ard.fetchNotification_table_14(77));
        ps.setString(81, ard.fetchNotification_table_14(78));
        ps.setString(82, ard.fetchNotification_table_14(79));
        ps.setString(83, ard.fetchNotification_table_14(80));
        ps.setString(84, ard.fetchNotification_table_14(81));
        ps.setString(85, ard.fetchNotification_table_14(82));
        ps.setString(86, ard.fetchNotification_table_14(83));
        ps.setString(87, ard.fetchNotification_table_14(84));
        ps.setString(88, ard.fetchNotification_table_14(85));
        ps.setString(89, ard.fetchNotification_table_14(86));
        ps.setString(90, ard.fetchNotification_table_14(87));
        ps.setString(91, ard.fetchNotification_table_14(88));
        ps.setString(92, ard.fetchNotification_table_14(89));
        ps.setString(93, ard.fetchNotification_table_14(90));
        ps.setString(94, ard.fetchNotification_table_14(91));
        ps.setString(95, ard.fetchNotification_table_14(92));
        ps.setString(96, ard.fetchNotification_table_14(93));
        ps.setString(97, ard.fetchNotification_table_14(94));
        ps.setString(98, ard.fetchNotification_table_14(95));
        ps.setString(99, ard.fetchNotification_table_14(96));
        ps.setString(100, ard.fetchNotification_table_14(97));
        ps.setString(101, ard.fetchNotification_table_14(98));
        ps.setString(102, ard.fetchNotification_table_14(99));


        
        ps.executeUpdate();
        System.out.println("Value Inserted in `notification` table");

        con.close();
    }
    private static void generateATMCardNumber() {
        long accountNumber = ard.fetchCustomer_Bank_Account_Number_table_2();
        int seconds = LocalTime.now().getSecond();
        String ATMCardNumber = String.valueOf(accountNumber) + String.valueOf(seconds);
        if(ATMCardNumber.length()!=16) {
            ATMCardNumber =  String.valueOf(accountNumber) + "0" + String.valueOf(seconds);
        }        
        ard.setATM_Card_Number_table_6(Long.parseLong(ATMCardNumber));
    }
    private static void generateATMCVVNumber() {
        int randomNumber = 111 + ((int) (new Random().nextDouble() * (999 - 111)));
        ard.setATM_Card_CVV_table_6(randomNumber);
    }
    private static void showLoadingScreen(String message, int duration) {
        JDialog loadingDialog = new JDialog((JFrame) null, true);
        loadingDialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        loadingDialog.setUndecorated(true);

        JLabel messageLabel = new JLabel(message);
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        messageLabel.setFont(new Font("Dialog", Font.BOLD, 15));

        loadingDialog.getContentPane().add(messageLabel);
        loadingDialog.setSize(200, 80);
        loadingDialog.setLocationRelativeTo(null);

        Timer timer = new Timer(duration, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadingDialog.dispose();
            }
        });

        timer.setRepeats(false);

        timer.start();

        loadingDialog.setVisible(true);
    }
    private static Boolean checkStatus(int TableNumber) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bankingsystemsimulation";
        String username = "your_mysql_database_user_id";
        String password = "your_mysql_database_password";
        Connection con = DriverManager.getConnection(url, username, password);
        if(TableNumber==6) {            
            String query = "select * from `atm` where `Customer Auto-Generated ID` = '"+ard.fetchUserIdWhileLogin()+"'";
        
            Statement st = con.createStatement();
    
            ResultSet rs =  st.executeQuery(query);

            String recievedValue = null;
            while(rs.next()) {
                recievedValue = rs.getString("ATM Card Facility Status");
            }
            return recievedValue.equals("Enabled");
        }
        con.close();
        return false;
    }
    private static void setGlassPaneView(JFrame parentFrame, Boolean setVisibility) {
        JPanel glassPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setColor(new Color(0, 0, 0, 100));
                g2d.fillRect(0, 0, getWidth(), getHeight());
                g2d.dispose();
            }
        };
        glassPane.setOpaque(false);

        parentFrame.setGlassPane(glassPane);
        glassPane.setVisible(setVisibility);
    }
    private static Double evaluateMonthlyTransaction(String uniqueUserId) throws ClassNotFoundException, SQLException {

        Connection con = new Connectivity().establishConnection();
        List<Double> transaction_amount = new ArrayList<>();
        String query = "select * from `nbTransactionHistory` where `Customer Auto-Generated ID` = '"+uniqueUserId+"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        LocalDate today = LocalDate.now();
        String mm_yyyy = null;
        if(today.getMonthValue()<10) {
            mm_yyyy = "0"+String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        } else {
            mm_yyyy = String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        }
        String dateExtractedFromTransactionTable5 = null;
        while(rs.next()) {
            dateExtractedFromTransactionTable5 = rs.getString("Transaction Date");
            if(dateExtractedFromTransactionTable5.substring(3, 10).equals(mm_yyyy) && rs.getString("Credit/Debit").equals("Debit") && rs.getString("Transaction Status").equals("Successful")) {
                transaction_amount.add(rs.getDouble("Transaction Amount"));
            }
        }

        query = "select * from `atmTransactionHistory` where `Customer Auto-Generated ID` = '"+uniqueUserId+"'";
        st = con.createStatement();
        rs = st.executeQuery(query);

        if(today.getMonthValue()<10) {
            mm_yyyy = "0"+String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        } else {
            mm_yyyy = String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        }

        while(rs.next()) {
            dateExtractedFromTransactionTable5 = rs.getString("Transaction Date");
            if(dateExtractedFromTransactionTable5.substring(3, 10).equals(mm_yyyy) && rs.getString("Withdraw/Deposit").equals("Withdraw") && rs.getString("Transaction Status").equals("Successful")) {
                transaction_amount.add(rs.getDouble("Transaction Amount"));
            }
        }

        query = "select * from `upiTransactionHistory` where `Customer Auto-Generated ID` = '"+uniqueUserId+"'";
        st = con.createStatement();
        rs = st.executeQuery(query);
                    
        if(today.getMonthValue()<10) {
            mm_yyyy = "0"+String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        } else {
            mm_yyyy = String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        }
        
        while(rs.next()) {
            dateExtractedFromTransactionTable5 = rs.getString("Transaction Date");
            if(dateExtractedFromTransactionTable5.substring(3, 10).equals(mm_yyyy) && rs.getString("Credit/Debit").equals("Debit") && rs.getString("Transaction Status").equals("Successful")) {
                transaction_amount.add(rs.getDouble("Transaction Amount"));
            }
        }
        
        Double transactionAmountTillDate = 0.0d;
        for(int i=0; i<transaction_amount.size(); i++) {
            transactionAmountTillDate += transaction_amount.get(i);
        }

        return transactionAmountTillDate;

    }

    private static Double evaluateDailyTransaction(String uniqueUserId) throws ClassNotFoundException, SQLException {

        Connection con = new Connectivity().establishConnection();
        List<Double> transaction_amount = new ArrayList<>();
        String query = "select * from `nbTransactionHistory` where `Customer Auto-Generated ID` = '"+uniqueUserId+"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        LocalDate today = LocalDate.now();
        String dd_mm_yyyy = null;

        if(today.getDayOfMonth()<10 && today.getMonthValue()<10) {
            dd_mm_yyyy = "0"+String.valueOf(today.getDayOfMonth())+"/0"+String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        }
        if(today.getDayOfMonth()<10 && today.getMonthValue()>9) {
            dd_mm_yyyy = "0"+String.valueOf(today.getDayOfMonth())+"/"+String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        }
        if(today.getDayOfMonth()>9 && today.getMonthValue()<10) {
            dd_mm_yyyy = String.valueOf(today.getDayOfMonth())+"/0"+String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        }
        if(today.getDayOfMonth()>9 && today.getMonthValue()>9) {
            dd_mm_yyyy = String.valueOf(today.getDayOfMonth())+"/"+String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        }
        
        String dateExtractedFromTransactionTable5 = null;
        while(rs.next()) {
            dateExtractedFromTransactionTable5 = rs.getString("Transaction Date");
            if(dateExtractedFromTransactionTable5.equals(dd_mm_yyyy) && rs.getString("Credit/Debit").equals("Debit") && rs.getString("Transaction Status").equals("Successful")) {
                transaction_amount.add(rs.getDouble("Transaction Amount"));
            }
        }

        query = "select * from `atmTransactionHistory` where `Customer Auto-Generated ID` = '"+uniqueUserId+"'";
        st = con.createStatement();
        rs = st.executeQuery(query);

        if(today.getDayOfMonth()<10 && today.getMonthValue()<10) {
            dd_mm_yyyy = "0"+String.valueOf(today.getDayOfMonth())+"/0"+String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        }
        if(today.getDayOfMonth()<10 && today.getMonthValue()>9) {
            dd_mm_yyyy = "0"+String.valueOf(today.getDayOfMonth())+"/"+String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        }
        if(today.getDayOfMonth()>9 && today.getMonthValue()<10) {
            dd_mm_yyyy = String.valueOf(today.getDayOfMonth())+"/0"+String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        }
        if(today.getDayOfMonth()>9 && today.getMonthValue()>9) {
            dd_mm_yyyy = String.valueOf(today.getDayOfMonth())+"/"+String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        }

        while(rs.next()) {
            dateExtractedFromTransactionTable5 = rs.getString("Transaction Date");
            if(dateExtractedFromTransactionTable5.equals(dd_mm_yyyy) && rs.getString("Withdraw/Deposit").equals("Withdraw") && rs.getString("Transaction Status").equals("Successful")) {
                transaction_amount.add(rs.getDouble("Transaction Amount"));
            }
        }

        query = "select * from `upiTransactionHistory` where `Customer Auto-Generated ID` = '"+uniqueUserId+"'";
        st = con.createStatement();
        rs = st.executeQuery(query);
                    
        if(today.getDayOfMonth()<10 && today.getMonthValue()<10) {
            dd_mm_yyyy = "0"+String.valueOf(today.getDayOfMonth())+"/0"+String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        }
        if(today.getDayOfMonth()<10 && today.getMonthValue()>9) {
            dd_mm_yyyy = "0"+String.valueOf(today.getDayOfMonth())+"/"+String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        }
        if(today.getDayOfMonth()>9 && today.getMonthValue()<10) {
            dd_mm_yyyy = String.valueOf(today.getDayOfMonth())+"/0"+String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        }
        if(today.getDayOfMonth()>9 && today.getMonthValue()>9) {
            dd_mm_yyyy = String.valueOf(today.getDayOfMonth())+"/"+String.valueOf(today.getMonthValue())+"/"+String.valueOf(today.getYear());
        }
        
        while(rs.next()) {
            dateExtractedFromTransactionTable5 = rs.getString("Transaction Date");
            if(dateExtractedFromTransactionTable5.equals(dd_mm_yyyy) && rs.getString("Credit/Debit").equals("Debit") && rs.getString("Transaction Status").equals("Successful")) {
                transaction_amount.add(rs.getDouble("Transaction Amount"));
            }
        }

        Double transactionAmountTillDate = 0.0d;
        for(int i=0; i<transaction_amount.size(); i++) {
            transactionAmountTillDate += transaction_amount.get(i);
        }
        
        return transactionAmountTillDate;

    }
    private static int checkBankStability(String uniqueUserId, String of) throws ClassNotFoundException, SQLException {
        Connection con = new Connectivity().establishConnection();
        if(of=="ATM") {
            String query = "select * from `userBankRelatedDetails` where `Customer Auto-Generated ID` = '"+uniqueUserId+"'";
            Statement st = con.createStatement();
            ResultSet rs =  st.executeQuery(query);
            Double userCurrentBalance = null, userMinimumBalanceCriteria = null, monthlyLimit = null, dailyLimit = null;
            while(rs.next()) {
                userCurrentBalance = rs.getDouble("Customer Bank Balance");
                userMinimumBalanceCriteria = rs.getDouble("Customer Bank Minimum Maintenance Balance");
                monthlyLimit = rs.getDouble("Customer Bank Monthly Limit");
                dailyLimit = rs.getDouble("Customer Bank Daily Limit");
            }

            if(monthlyLimit<evaluateMonthlyTransaction(uniqueUserId)) {
                return 0;
            }
            if(dailyLimit<evaluateDailyTransaction(uniqueUserId)) {
                return 1;
            }

            if(userCurrentBalance<userMinimumBalanceCriteria) {
                return 2;
            }

            query = "select * from `bankActions` where `Customer Auto-Generated ID` = '"+uniqueUserId+"'";
            st = con.createStatement();
            rs = st.executeQuery(query);
            String status = null;
            while(rs.next()) {
                status = rs.getString("ATM Card Facility Status");
            }
            if(status=="Frozen") {
                return 3;
            } else if(status=="Deactivated") {
                return 4;
            }

            // if all Good then Deduct

            return 5;
        }


        return 0;
    }
    private static String provideReferenceId(String of) throws ClassNotFoundException, SQLException {
        Connection con = new Connectivity().establishConnection();
        
        if(of.equals("ATM")) {
            String countQuery = "select count(*) as maxCurrentRow from `atmTransactionHistory`";
            Statement countStatement = con.createStatement();
            ResultSet countResultSet = countStatement.executeQuery(countQuery);
            int maxCurrentRow = 0;
            if (countResultSet.next()) {
                maxCurrentRow = countResultSet.getInt("maxCurrentRow");
            }
            
            String query = "select * from `atmTransactionHistory` where `Serial Number`="+String.valueOf(maxCurrentRow);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            String lastRefId = null;
            while(rs.next()) {
                lastRefId = rs.getString("Withdraw/Deposit Reference ID");
            }
            con.close();
            if(lastRefId!=null) {
                return "ATM" + String.format("%012d", Long.parseLong(new BigInteger(lastRefId.substring(3)).add(BigInteger.ONE).toString()));
            }
            return "ATM000000000001";

        } else if(of.equals("UPI")) {
            String countQuery = "select count(*) as maxCurrentRow from `upiTransactionHistory`";
            Statement countStatement = con.createStatement();
            ResultSet countResultSet = countStatement.executeQuery(countQuery);
            int maxCurrentRow = 0;
            if (countResultSet.next()) {
                maxCurrentRow = countResultSet.getInt("maxCurrentRow");
            }
            
            String query = "select * from `upiTransactionHistory` where `Serial Number`="+String.valueOf(maxCurrentRow);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            String lastRefId = null;
            while(rs.next()) {
                lastRefId = rs.getString("UPI Reference Number");
            }
            con.close();
            if(lastRefId!=null) {
                return "UPI" + String.format("%012d", Long.parseLong(new BigInteger(lastRefId.substring(3)).add(BigInteger.ONE).toString()));
            }
            return "UPI000000000001";
        } else if(of.equals("NB")) {
            String countQuery = "select count(*) as maxCurrentRow from `nbTransactionHistory`";
            Statement countStatement = con.createStatement();
            ResultSet countResultSet = countStatement.executeQuery(countQuery);
            int maxCurrentRow = 0;
            if (countResultSet.next()) {
                maxCurrentRow = countResultSet.getInt("maxCurrentRow");
            }
            
            String query = "select * from `nbTransactionHistory` where `Serial Number`="+String.valueOf(maxCurrentRow);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            String lastRefId = null;
            while(rs.next()) {
                lastRefId = rs.getString("Transaction Reference ID");
            }
            con.close();
            if(lastRefId!=null) {
                return "NET" + String.format("%012d", Long.parseLong(new BigInteger(lastRefId.substring(3)).add(BigInteger.ONE).toString()));
            }
            return "NET000000000001";
        }
        return of;
    }
}