package Utilities;

import java.net.InetAddress;

public class ComputerInfo {

    public static String getComputerName() {

        try {
            String computername = InetAddress.getLocalHost().getHostName();
            return computername;

        } catch (Exception e) {
            return "Exception caught =" + e.getMessage();
        }
    }

    public static String computerNameForUbuntu() {
        return "caglar-Lenovo-ideapad-500-15ISK";
    }
    public static String computerNameForWindows() {
        return "M601102-0003";
    }
}