package ca.dal.cs.csci3130.a3.q4;

public class PhoneNumber {
    String unformattedNumber;
    String formattedPhoneNumber;
    String areaCode;
    String prefix;
    String number;

    public PhoneNumber(String unformattedNumber) {
        this.unformattedNumber = unformattedNumber;
        areaCode = unformattedNumber.substring(0, 3);
        prefix = unformattedNumber.substring(3, 6);
        number = unformattedNumber.substring(6, 10);
        formattedPhoneNumber = areaCode + "-" + prefix +
                "-" + number;
    }

    protected String getAreaCode() {
        return areaCode;
    }

    protected String getPrefix() {
        return prefix;
    }

    protected String getNumber() {
        return number;
    }

    protected String getFormattedPhoneNumber() {
        return formattedPhoneNumber;
    }
}