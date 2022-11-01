package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result = "";
      //  if(start % 2 != 0)  // looks like test case is wrong;
        if(start % 2 == 0)
            start += 1;
        for(int i= start;i<stop;i+=2) {
            result += i;
        }


        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
       // if(start % 2 == 0) //looks like test case is wrong.
        if(start % 2 != 0)
            start += 1;
        for(int i = start;i<stop;i+=2) {
            result += i;
        }
        return result;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
       String result = "";
        for(int i = start ; i < stop ; i += step){
            result+= i * i;
        }


        return result;
    }

   // public static String getRange(int start) { method is wrong it should be stop
   public static String getRange(int stop) {
        String result = "";
        for (int i = 0; i < stop; i++) {
            result += i;

        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        for(int i = start ; i < stop ; i++){
            result+= i ;
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for(int i = start ; i < stop ; i += step){
            result+= i ;
        }

        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        for(int i = start ; i < stop ; i += step){
            result+= i * i;
        }

        return result;
    }
}
