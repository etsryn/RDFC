package bms.utilities.centralizedstr;


public class FrameText {
    public String mainWindowHeadingTop() {
        return "<html><center><div style='font-size: 35px;'>RDFC</div></center><br><center><div style='margin-left: 220px; margin-right: 220px; margin-top: 0; font-size: 35px;'>RAYYAN DIGITAL FINANCE CORPORATION</div></center></html>";
    }
    public String mainWindowHeadingBottom() {
        return "<html><div style='margin-left: 0px; font-size: 25px;'>RDFC</div></html>";
    }
    public String verticalSpace(int vSpace) {
        return "<html><center><div style='height:"+vSpace+"px; width: 1536px; background-color:white;'></div></center></html>";
    }
    public String xySpaceSetter(int xVal, int yVal) {
        return "<html><center><div style='height:"+yVal+"px; width: "+xVal+"px; background-color:white;'></div></center></html>";

    }
    public String custID() {
        return "<html><div style='font-size: 20px; margin-left: 260px; margin-right: 890px;'>Customer ID *</div></html>";
    }
    public String passwordID() {
        return "<html><div style='font-size: 20px; margin-left: 260px; margin-right: 910px;'>Password *</div></html>";
    }
    public String shiftPixel(int pixel) {
        return "<html><div style='font-size: 18px; margin-left: 160px; margin-right: "+pixel+";'></div></html>";
    }
    public String accountRegistrationWindowHeadingTop() {
        return "<html><center><div style='margin-left: 220px; margin-right: 220px; margin-top: 0; font-size: 35px;'>USER DETAIL PANEL</div></center></html>";
    }
    public String regCustWindowIRowI() {
        return "<html><div style='font-size: 13px; margin-left: 850px; margin-right: 890px;'>Honorific *"+new FrameText().retNBSP(66)+"First Name *"+new FrameText().retNBSP(69)+"Middle Name  &nbsp;"+new FrameText().retNBSP(69)+"Last Name *</div></html>";
    }
    public String regCustWindowIRowII() {
        return "<html><div style='font-size: 13px; margin-left: 825px; margin-right: 890px;'>"+new FrameText().retNBSP(3)+"Date Of Birth *"+new FrameText().retNBSP(59)+"Aadhar Number *"+new FrameText().retNBSP(59)+"&nbsp;&nbsp;&nbsp;&nbsp;PAN Number *&nbsp;"+new FrameText().retNBSP(59)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Gender *</div></html>";
    }
    public String regCustWindowIRowIII() {
        return "<html><div style='font-size: 13px; margin-left: 870px; margin-right: 890px;'>Email *"+new FrameText().retNBSP(74)+"Contact Number 1 *"+new FrameText().retNBSP(57)+"Contact Number 2"+new FrameText().retNBSP(63)+"Marital Status *</div></html>";
    }
    public String regCustWindowIRowIV() {
        return "<html><div style='font-size: 10px; margin-left: 700px; margin-right: 700px;'>Page 1 of 3"+new FrameText().retNBSP(7)+"</div></html>";
    }
    private String retNBSP(int times) {
        String str = new String();
        for(int i=1; i<=times; i++) {
            str = str+"&nbsp;";
        }
        return str;
    }
    public String regCustWindowIITop() {
        return "<html><div style='font-size: 22px;'><b>Residential Address</b></div></html>";
    }
    public String regCustWindowIIRowI() {
        return "<html><div style='font-size: 13px; margin-left: 847px; margin-right: 890px;'>House Number *"+new FrameText().retNBSP(57)+"Ward Number *"+new FrameText().retNBSP(65)+"Area/Mohalla  &nbsp;"+new FrameText().retNBSP(69)+"City/Town *</div></html>";
    }
    public String regCustWindowIIRowII() {
        return "<html><div style='font-size: 13px; margin-left: 0px; margin-right: 41px;'>District *"+new FrameText().retNBSP(70)+"State *"+new FrameText().retNBSP(80)+"Country *&nbsp;"+new FrameText().retNBSP(77)+"Post Office *</div></html>";
    }
    public String regCustWindowIIRowIII() {
        return "<html><div style='font-size: 13px; margin-right: 345px;'>Police Station *"+new FrameText().retNBSP(59)+"Pincode *"+new FrameText().retNBSP(75)+"Landmark</div></html>";
    }
    public String regCustWindowIIRowIV() {
        return "<html><div style='font-size: 10px; margin-left: 700px; margin-right: 700px;'>Page 2 of 3"+new FrameText().retNBSP(7)+"</div></html>";
    }
    public String regCustWindowIIITop() {
        return "<html><div style='font-size: 22px;'><b>Permanent Address</b></div></html>";
    }
    public String regCustWindowIIIRowIV() {
        return "<html><div style='font-size: 10px; margin-left: 700px; margin-right: 700px;'>Page 3 of 3"+new FrameText().retNBSP(7)+"</div></html>";
    }


    public String regMinorWindowIVTop() {
        return "<html><div style='font-size: 22px;'><b>Minor's Parental Details</b></div></html>";
    }
    public String regMinorWindowIVRowI() {
        return "<html><div style='font-size: 13px; margin-left: 345px; margin-right: 890px;'>Parental Preference *"+new FrameText().retNBSP(50)+"Relation With The Same *</div></html>";
    }
    public String regMinorWindowIVRowII() {
        return "<html><div style='font-size: 13px; margin-left: 850px; margin-right: 890px;'>Honorific *"+new FrameText().retNBSP(66)+"First Name *"+new FrameText().retNBSP(69)+"Middle Name  &nbsp;"+new FrameText().retNBSP(69)+"Last Name *</div></html>";
    }
    public String regMinorWindowIVRowIII() {
        return "<html><div style='font-size: 13px; margin-right: 307px;'>Contact Number *"+new FrameText().retNBSP(148)+"Aadhar Number *</div></html>";
    }

    public String passwordIntakeWindowHeadingTop() {
        return "<html><center><div style='margin-left: 220px; margin-right: 220px; margin-top: 0; font-size: 35px;'>SECURITY LAYER PANEL</div></center></html>";
    }
    public String passwordIntakeWindowCustID() {
        return "<html><div style='font-size: 20px; margin-left: 260px; margin-right: 890px;'>Your Auto Generated 'Customer ID' is</div></html>";

    }

    public String passwordIntakeWindowPasswordIDI() {
        return "<html><div style='font-size: 20px; margin-left: 145px; margin-right: 910px;'>Set Your Password *</div></html>";
    }

    public String passwordIntakeWindowPasswordIDII() {
        return "<html><div style='font-size: 20px; margin-left: 192px; margin-right: 910px;'>Re-Enter Your Password *</div></html>";
    }

    public String passwordIntakeWindowNotice() {
        return "<html><li>Password Should Must be At Least of <strong>8 Charcaters</strong></li><br /><li>Password Should Not Be Common as '<strong>12345678</strong>' '<strong>111222333</strong>', '<strong>ABCDEFGH</strong>', '<strong>MyPassword</strong>', etc</li></html>";
    }
    
    public String afterLoginWelcomeUser(String side) {
        if(side=="left") {
            return "<html><div style='margin-left: 0px; font-size: 40px;'>Welcome <strong>";
        } else if(side=="right") {
            return  "</strong></div></html>";
        }
        return null;
    }

    public String afterLoginShowUniqueID(String side) {
        if(side=="left") {
            return "<html><div style='margin-left: 0px; width: 1180px; background-color: #adafb3; border: 1px solid black; padding: 5px; border-radius: 100px;'>"+retNBSP(330)+"<font size=5 color='black'>Cust Id : <strong>";
        } else if(side=="right") {
            return "</strong></font></div></html>";
        }
        return "<br />";

    }
    public String simple_adafb3_Color() {
        return "<html><div style='margin-left: 0px; width: 1180px; background-color: #adafb3; border: 1px solid black; padding: 10px; border-radius: 100px;'></div></html>";
    }
    public String afterClickingPayTmModuleShowUPIID(String side) {
        if(side=="left") {
            return "<html><div style='margin-left: 0px; width: 1180px; background-color: #adafb3; border: 1px solid black; padding: 5px; border-radius: 100px;'>"+retNBSP(320)+"<font size=5 color='black'>UPI Id : <strong>";
        } else if(side=="right") {
            return "</strong></font></div></html>";
        }
        return "<br />";
    }
    public String afterClickingPhonePeModuleShowUPIID(String side) {
        if(side=="left") {
            return "<html><div style='margin-left: 0px; width: 1180px; background-color: #adafb3; border: 1px solid black; padding: 5px; border-radius: 100px;'>"+retNBSP(320)+"<font size=5 color='black'>UPI Id : <strong>";
        } else if(side=="right") {
            return "</strong></font></div></html>";
        }
        return "<br />";
    }
    public String afterClickingGooglePayModuleShowUPIID(String side) {
        if(side=="left") {
            return "<html><div style='margin-left: 0px; width: 1180px; background-color: #adafb3; border: 1px solid black; padding: 5px; border-radius: 100px;'>"+retNBSP(320)+"<font size=5 color='black'>UPI Id : <strong>";
        } else if(side=="right") {
            return "</strong></font></div></html>";
        }
        return "<br />";
    }
    public String afterClickingBharatPeModuleShowUPIID(String side) {
        if(side=="left") {
            return "<html><div style='margin-left: 0px; width: 1180px; background-color: #adafb3; border: 1px solid black; padding: 5px; border-radius: 100px;'>"+retNBSP(320)+"<font size=5 color='black'>UPI Id : <strong>";
        } else if(side=="right") {
            return "</strong></font></div></html>";
        }
        return "<br />";
    }

    public String afterLoginFooter(String side, Integer notiCount) {
        if(side=="left") {
            return "<html><div style='margin-left: 0px; width: 1180px; background-color: #adafb3; border: 1px solid black; padding: 3px;'>"+retNBSP(15)+"<font size=4 color='black'>You have <strong>";
        } else if(side=="right") {
            if(notiCount==0) {
                return "No </strong>Notification(s)</font></div></html>";
            } else if(notiCount==1) {
                return notiCount+" </strong>Notification - <a href=\\\"runFunction:x\\\">Click me to View</a></font></div></html>";
            } else {
                return notiCount+" </strong>Notification(s) - <a href=\\\"runFunction:x\\\">Click me to View</a></font></div></html>";
            }
        }
        return null;
    }
    public String separator_I() {
        return "<html><div style='width: 1160px; font-size: 12px;'>-------------------------------------------------------------------------------------------------------------------- BASIC ACCOUNT DETAILS --------------------------------------------------------------------------------------------------------------------</div></html>";
    }
    public String textRow_I() {
        return "<html><div style='font-size: 12px;'>Account Type *"+retNBSP(223)+"NRI or Resident *"+retNBSP(23)+"</div></html>";
    }
    public String separator_II() {
        return "<html><div style='width: 1160px; font-size: 12px;'>-------------------------------------------------------------------------------------------------- SELECT THE FACILITY TO ADD INTO YOUR ACCOUNT --------------------------------------------------------------------------------------------------</div></html>";
    }
    public String textRow_III() {
        return "<html><div style='width: 915px;font-size: 12px;'>ATM Card PIN *"+retNBSP(50)+"ATM Card Type *"+retNBSP(50)+"ATM Card Association *"+retNBSP(50)+"UPI Transaction PIN *</div></html>";
    }
    public String separator_III() {
        return "<html><div style='width: 1160px; font-size: 12px;'>------------------------------------------------------------------------------ FILL UP THE DETAILS OF FACILITY(s) YOU REQUESTED ABOVE FOR YOUR ACCOUNT ------------------------------------------------------------------------------</div></html>";
    }
    public String separator_IV() {
        return "<html><div style='width: 1160px; font-size: 12px;'>----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</div></html>";
    }
    
    
    public String afterClickingATMModuleHeading() {
        return "<html><div style='margin-left: 0px; font-size: 40px;'><strong>ATM FACILITY</strong></div></html>";
    }
    public String afterClickingUPIModuleHeading() {
        return "<html><div style='margin-left: 0px; font-size: 40px;'><strong>UPI FACILITY</strong></div></html>";
    }
    public String afterClickingPaytmModuleHeading() {
        return "<html><div style='margin-left: 0px; font-size: 40px;'><strong>PayTm Facility</strong></div></html>";
    }
    public String afterClickingPhonePeModuleHeading() {
        return "<html><div style='margin-left: 0px; font-size: 40px;'><strong>PhonePe Facility</strong></div></html>";
    }
    public String afterClickingGooglePayModuleHeading() {
        return "<html><div style='margin-left: 0px; font-size: 40px;'><strong>GooglePay Facility</strong></div></html>";
    }
    public String afterClickingBharatPeModuleHeading() {
        return "<html><div style='margin-left: 0px; font-size: 40px;'><strong>BharatPe Facility</strong></div></html>";
    }
    public String inATMShowATMCardNumber(String side) {
        if(side=="left") {
            return "<html><div style='margin-left: 0px; width: 1180px; background-color: #000; border: 1px solid black; padding: 5px; border-radius: 100px;'>"+retNBSP(295)+"<font size=5 color='white'>ATM Card Number : <strong>";
        } else if(side=="right") {
            return "</strong></font></div></html>";
        }
        return "<br />";

    }
    public String inATMFooter() {
        return "<html><div style='margin-left: 0px; width: 1256px; height: 20px; background-color: #000; border: 1px solid black; padding: 3px;'></div></html>";
    }

    public String afterClickingWithdrawModuleHeading() {
        return "<html><div style='margin-left: 0px; font-size: 40px;'><strong>WITHDRAW FACILITY</strong></div></html>";
    }
    public String afterClickingDepositModuleHeading() {
        return "<html><div style='margin-left: 0px; font-size: 40px;'><strong>DEPOSIT FACILITY</strong></div></html>";
    }
    public String afterClickingBalanceEnquiryModuleHeading() {
        return "<html><div style='margin-left: 0px; font-size: 40px;'><strong>BALANCE ENQUIRY FACILITY</strong></div></html>";
    }
    public String afterClickingMiniStatementModuleHeading() {
        return "<html><div style='margin-left: 0px; font-size: 40px;'><strong>MINI-STATEMENT FACILITY</strong></div></html>";
    }
    public String afterClickingPINChangeModuleHeading() {
        return "<html><div style='margin-left: 0px; font-size: 40px;'><strong>ATM PIN CHANGING FACILITY</strong></div></html>";
    }
    public String enterAtmPinText() {
        return "<html><div style='margin-left: 0px; font-size: 30px;'><strong>ENTER ATM PIN</strong></div></html>";
    }
    public String confirmAtmPinText() {
        return "<html><div style='margin-left: 0px; font-size: 30px;'><strong>CONFIRM CURRENT ATM PIN</strong></div></html>";
    }
    public String enterNewAtmPinText() {
        return "<html><div style='margin-left: 0px; font-size: 20px;'><strong>Enter New ATM PIN</strong></div></html>";
    }
    public String confirmNewAtmPinText() {
        return "<html><div style='margin-left: 0px; font-size: 20px;'><strong>Confirm New ATM PIN</strong></div></html>";
    }
    public String balanceDisplayLabel() {
        return "<html><div style='margin-left: 0px; font-size: 30px;'><strong>YOUR BALANCE <i>`IN RUPEES`</i> IS</strong></div></html>";
    }
    public String miniStatementDisplayLabel() {
        return "<html><div style='margin-left: 0px; font-size: 30px;'><strong>Enter <i> `From Date` </i> and <i> `Till Date` </i></strong></div></html>";
    }
    public String miniStatementFromAndToLabel() {
        return "<html><div style='width: 1160px; margin-left: 0px; font-size: 20px;'><strong>"+retNBSP(75)+"From Date"+retNBSP(48)+"Till Date</strong></div></html>";
    }

    public String enterWithdrawlAmount() {
        return "<html><div style='margin-left: 0px; font-size: 30px;'><strong>ENTER AMOUNT TO BE WITHDRAWN</strong></div></html>";
        // <br /><center><font size='10px'><i>In The Multiple of 500 Only</i></font></center>
    }
    public String enterDepositAmount() {
        return "<html><div style='margin-left: 0px; font-size: 30px;'><strong>ENTER AMOUNT TO BE DEPOSITED</strong></div></html>";
        // <br /><center><font size='10px'><i>In The Multiple of 500 Only</i></font></center>
    }
    public String enterMultipleOf5K() {
        return "<html><div style='margin-left: 0px; font-size: 15px;'><i>(In The Multiple of INR 500 Only)</i></div></html>";
    }
    public String paytmCard(String upi) {                                                                            // db:#042e6f; lb:#00baf2;
        return "<html><body><div style='margin-left: 0px; width: 200px; height: 300px; background-color: #addce6; border: 15px double #fff; border-left: 15px solid black; border-right: 15px solid black; padding: 3px; border-radius :100px;'><center><font size=10><br /><b>PayTm</b></font><br /><br /><br /><img src='file:///D:/Engineering/Learning Java/Project Semester III/RDFC/bms/utilities/images/paytm.png' width='90'><br /><br /><br /><font size=5>UPI Id : "+upi+"</font></center></div></body></html>";
    }
    public String phonepeCard(String upi) {
        return "<html><body><div style='margin-left: 0px; width: 200px; height: 300px; background-color: #9370DB; border: 15px double #fff; border-left: 15px solid black; border-right: 15px solid black; padding: 3px; border-radius :100px;'><center><font size=10><br /><b>PhonePe</b></font><br /><br /><br /><img src='file:///D:/Engineering/Learning Java/Project Semester III/RDFC/bms/utilities/images/phonepe.png' width='92'><br /><br /><br /><font size=5>UPI Id : "+upi+"</font></center></div></body></html>";
    }
    public String googlepayCard(String upi) {
        return "<html><body><div style='margin-left: 0px; width: 200px; height: 300px; background-color: #90EE90; border: 15px double #fff; border-left: 15px solid black; border-right: 15px solid black; padding: 3px; border-radius :100px;'><center><font size=10><br /><b>GooglePay</b></font><br /><br /><br /><img src='file:///D:/Engineering/Learning Java/Project Semester III/RDFC/bms/utilities/images/googlepay.png' width='125'><br /><br /><br /><font size=5>UPI Id : "+upi+"</font></center></div></body></html>";
    }
    public String bharatpeCard(String upi) {
        return "<html><body><div style='margin-left: 0px; width: 200px; height: 300px; background-color: #FFB366; border: 15px double #fff; border-left: 15px solid black; border-right: 15px solid black; padding: 3px; border-radius :100px;'><center><font size=10><br /><b>BharatPe</b></font><br /><br /><br /><img src='file:///D:/Engineering/Learning Java/Project Semester III/RDFC/bms/utilities/images/bharatpe.png' width='95'><br /><br /><br /><font size=5>UPI Id : "+upi+"</font></center></div></body></html>";
    }
}
