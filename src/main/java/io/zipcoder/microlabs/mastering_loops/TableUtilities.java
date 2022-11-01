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

        String result = "";
        for(int i = 1; i<=10; i++) {
            for(int j =1;j <=10; j++){
                //result += i * j; without any spaces and pipe
                if ((i*j) < 10) {
                    result = result + "  " + (i*j) + " |";
                } else if((i*j)<=99){
                    result = result + " " + (i*j) + " |";
                }
               else{
                    result = result +(i*j) + " |";
                }
            }
            result += "\n";
        }
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";

        for(int i = 1; i<=tableSize; i++) {
            for(int j =1;j <=20; j++){
                //result += i * j; without any spaces and pipe
                if ((i*j) < 10) {
                    result = result + "  " + (i*j) + " |";
                } else if((i*j)<=99){
                    result = result + " " + (i*j) + " |";
                }
                else{
                    result = result +(i*j) + " |";
                }
            }
            result += "\n";
        }
        return result;

    }
}
