package Sessions;
public class Days2 {
    public static void main(String[] args) {
        String startDay = "Monday";
        int days = 45;

        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int startind = 0;
        switch (startDay) {
            case "Monday":
                startind = 0;
                break;
            case "Tuesday":
                startind = 1;
                break;
            case "Wednesday":
                startind = 2;
                break;
            case "Thursday":
                startind = 3;
                break;
            case "Friday":
                startind = 4;
                break;
            case "Saturday":
                startind = 5;
                break;
            case "Sunday":
                startind = 6;
                break;
        }

        
        int targetind = (startind + days - 1) % 7;
        String tarday = weekdays[targetind];

        System.out.println(tarday);
    }
}