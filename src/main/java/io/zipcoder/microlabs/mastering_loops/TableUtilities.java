package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
   public static String getSmallMultiplicationTable() {
          String result = "";
        for(int i = 1; i<=5; i++) {
            for(int j =1;j <=5; j++){
                //result += i * j; without any spaces and pipe
                if ((i*j) < 10) {
                    result = result + "  " + (i*j) + " |";
                } else {
                    result = result + " " + (i*j) + " |";
                }
            }
            result += "\n";
        }
        return result;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
