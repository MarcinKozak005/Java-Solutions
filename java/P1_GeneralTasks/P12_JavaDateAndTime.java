public class P12_JavaDateAndTime {
    static String[] daysOfTheWeek = new String[]{"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, month - 1);
        c.set(Calendar.DAY_OF_MONTH, day);
        c.set(Calendar.YEAR, year);
        return daysOfTheWeek[c.get(Calendar.DAY_OF_WEEK) - 1];
    }
}
