package net.thucydides.showcase.cucumber.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

public class TestDataSetup {
    public static int getTotalRow() {
        return totalRow;
    }

    public static void setTotalRow(int totalRow) {
        TestDataSetup.totalRow = totalRow;
    }

    private static int totalRow;
    private static String randomNumber;

    private static String baseName;

    private static Map<String, String> contractInfo;

    private static String startDate;
    private static String endDate;
    private static String dropoffAddress;
    private static String pickupAddress;
    private static String driverName;

    private static String loginId;
    public static String getBaseName() {
        return baseName;
    }

    public static void setBaseName(String baseName) {
        TestDataSetup.baseName = baseName;
    }

    public static String getRandomNumber() {
        return randomNumber;
    }

    public static void setRandomNumber(String randomNumber) {
        TestDataSetup.randomNumber = randomNumber;
    }

    public static Map<String, String> getContractInfo() {
        return contractInfo;
    }

    public static void setContractInfo(Map<String, String> contractInfo) {
        TestDataSetup.contractInfo = contractInfo;
    }

    public static String getStartDate() {
        return startDate;
    }

    public static void setStartDate(String startDate) {
        TestDataSetup.startDate = startDate;
    }


    public static String getEndDate() {
        return endDate;
    }

    public static void setEndDate(String endDate) {
        TestDataSetup.endDate = endDate;
    }


    public static String getUUID() {
        return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime());
    }
    public static String getPickupAddress() {
        return pickupAddress;
    }

    public static void setPickupAddress(String pickupAddress) {
        TestDataSetup.pickupAddress = pickupAddress;
    }



    public static String getDropoffAddress() {
        return dropoffAddress;
    }

    public static void setDropoffAddress(String dropoffAddress) {
        TestDataSetup.dropoffAddress = dropoffAddress;
    }

    public static String getLoginId() {
        return loginId;
    }

    public static void setLoginId(String loginId) {
        TestDataSetup.loginId = loginId;
    }

    public static void setDriverName(String driverName){
        TestDataSetup.driverName = driverName;
    }

    public static String getDriverName(){
        return driverName;
    }

}
