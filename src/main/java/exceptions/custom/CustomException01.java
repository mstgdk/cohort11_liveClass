package exceptions.custom;

public class CustomException01 {
    public static void main(String[] args) {
        checkName("mesut");
    }
    public static void checkName(String name){
        if (name.charAt(0)>='A' && name.charAt(0)<='Z'){
            System.out.println("isim uygun");
        }else {
            throw new InvalidNameException("isim uygun değil");
        }
        System.out.println("uygulama çalışmaya devam ediyor mu??");
    }
}
