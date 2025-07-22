package loops;

public class ForLoop1 {
    /*
    4 çeşit loop vardır.
    1-for loop
    2-while loop
    3-doWhile loop
    4-for each loop
     */
    public static void main(String[] args) {
       /* System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");*/


        //NOT : Döngünün kaç kez çalışacağı belli ise for loop kullanılır.
        // Ekrana 4 defa "merhaba" yazdırın
        for(int i =1 ;i<5 ; i=i+1 ){//1,2,3,4
            System.out.println("merhaba");
        }
        //continue;
        for(int i =1 ;i<5 ; i=i+1 ){//1,2,3,4
            if (i==2){
                continue;
            }
            System.out.println("hi-"+i);
        }
        //break
        for(int i =1 ;i<5 ; i=i+1 ){//1,2,3,4
            if (i==2){
                break;
            }
            System.out.println("selam-"+i);
        }



    }




}
