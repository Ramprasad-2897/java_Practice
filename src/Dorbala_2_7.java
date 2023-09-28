public class Dorbala_2_7 {
    public static void main(String[] args) {
        long minutes = 1000000000L; // 1 billion minutes

        //Calculate the number of minutes in a year
        long MinutesinYear = 365*24*60;
        long years = minutes/MinutesinYear;
        long days = (minutes%MinutesinYear)/(24*60);


        // Display the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}
