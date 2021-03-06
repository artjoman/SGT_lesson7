public class Lesson7 {

    public static void main(String[] args) {

        short time = 8;
        short day = 5;
        short month = 11;
        short year = 2019;

        if ( (time > 16 && time< 24 && month ==12) || year < 2020 ) {
            System.out.println("Something in December");
        }

        System.out.println(day + "/" + month + "/" + year);

        boolean isVaccinated = true;
        boolean hasTested = true;
        boolean hadCovid = false;

        if( isVaccinated ) {
            System.out.println("You are vaccinated");
        }
        if( isVaccinated && hasTested ) {
            System.out.println("You are vcaccinated and TESTED");
        }

        if ( (isVaccinated && hasTested) || hadCovid ) {
            System.out.println("you are able to go to the restaurant");
        }

        // Alarm clock application
        String dayOfWeek;

        // initialization
        dayOfWeek = "Holiday";

        if( dayOfWeek == "Tuesday" || dayOfWeek == "Monday" ) {
            System.out.println("Alarm is set to 7 o'clock");
        } else if( dayOfWeek == "Wednesday") {
            System.out.println("Alarm is set to 8 o'clock");
        } else if(dayOfWeek == "Thursday" || dayOfWeek == "Friday") {
            System.out.println("Alarm is set to 7:30");
        } else if ( dayOfWeek == "Saturday" || dayOfWeek == "Sunday" ) {
            System.out.println("No alarm is set");
        } else {
            System.out.println("No such day of Week exists");
        }

        // Example with float type
        float randomFloatNumber = 1.5f;
        double randomDoubleNumber = 1.5d;

        // If you go to office
        // working day - high heels
        // Casual Fridays - you can wear flats
        // Holidays - you stay at home
        // Halloween - you can wear any costume
        String officeDay = "Working day";
        if (officeDay == "Working day") {
            System.out.println("You have to wear heels");
        }  else if (officeDay == "Casual Fridays") {
            System.out.println("You can wear flats");
        } else if (officeDay == "Holidays") {
            System.out.println("You can stay at home");
        } else if (officeDay == "Halloween") {
            System.out.println("You can come to work in a costume. Booo!");
        } else {
            System.out.println("Such day does not exist");
        }

        // Implement the same office wear activity
        // Using Switch operator
        switch(officeDay) {
            case "Working day":
                System.out.println("You must wear high heels");
                break;
            case "Casual Fridays":
                System.out.println("You can wear flats");
                break;
            case "Halloween":
                System.out.println("You can come to work in a costume");
                break;
            case "Holidays":
                System.out.println("You can stay at home");
                break;
            default:
                System.out.println("No such day");
        }


        // Intervals of ages
//        Calculate price for a ticket in museum
        // 0 - 7 - Free
        // 8 - 12 - 1eur
        // 13 - 18 - 2eur
        // 18 - 64 - 5 eur
        // 65 - 120 - free
        short age = 31;
        if( (age >= 0 && age < 8) || (age >= 64 && age < 120) ) {
            System.out.println("you can go for free");
        } else if( age >= 8 && age < 12) {
            System.out.println("Price is 1 euro");
        } else if ( age >= 12 && age < 18 ) {
            System.out.println("Price is 2 euro");
        } else if ( age >= 18 && age < 64 ) {
            System.out.println("Price is 5 euro");
        } else {
            System.out.println("Seems that your age is incorrect");
        }

    }
}
