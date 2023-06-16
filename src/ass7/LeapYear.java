package ass7;

public class LeapYear {
    public static void main(String[] args) {
        int year=2023;
        if(year % 400 == 0)
            System.out.println("it's a leap  year:" +year);
        else if(year %4 == 0 && year %100!=0)
            System.out.println("its a leap year:" +year);
        else
            System.out.println("its not a leap year:" +year);
    }
}
