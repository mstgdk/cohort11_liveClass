package ifElse_switch_ternary;

public class Switch {
    public static void main(String[] args) {
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            default:
                System.out.println("geçersiz gün numarası");
        }
        //multiple

                int day2 = 6;
                switch (day2) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("hafta içi");
                        break;
                    case 6:
                    case 7:
                        System.out.println("hafta sonu");
                        break;
                    default:
                        System.out.println("geçersiz gün numarası");


                }
        //
        String x = "a";
        switch (x) {
            case "1":
                System.out.println("pazartesi");
                break;
            case "2":
                System.out.println("salı");
                break;
            case "a":
                System.out.println("çarşamba");
                break;
            default:
                System.out.println("geçersiz gün numarası");
        }

        // yeni yazım
        int status = 8;

        String message = switch (status) {
            case 1 -> "sistem çalışıyor";
            case 0 -> "çalışmıyor";
            default -> "geçersiz";
        };
        System.out.println(message);

        int day3 = 55;
        String weekOrWeekEnd = switch (day3){
            case 1,2,3,4,5 -> "hafta içi";
            case 6,7 -> "hafta sonu";
            default -> "geçersiz gün";
        };
        System.out.println("weekOrWeekEnd = " + weekOrWeekEnd);
    }
}
