package bms.utilities.centralizedstr;

public class FinalStrings {
    public String bankAbbr() {
        return "RDFC";
    }
    public String bankNameNull() {
        return "Rayyan Digital Finance Corporation";
    }
    public String bankNamePre() {
        return new FinalStrings().bankAbbr()+" - "+new FinalStrings().bankNameNull();
    }
    public String bankNamePost() {
        return new FinalStrings().bankNameNull()+" - "+new FinalStrings().bankAbbr();
    }
}