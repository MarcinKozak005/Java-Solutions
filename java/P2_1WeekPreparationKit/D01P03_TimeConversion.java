public class D01P03_TimeConversion {
    class Result {
        //My code start
        public static String timeConversion(String s) {
            int hours = Integer.parseInt(s.substring(0,2));
            if(s.endsWith("PM")){
                hours = (hours != 12) ? (hours+12) : 12;
            } else {
                hours = (hours != 12) ? hours : 0;
            }
            return String.format("%02d%s",hours,s.substring(2,s.length()-2));
        }
        // My code end
    }
    
}
