package enums;

public class RunnerEnums {
    public static void main(String[] args) {
        System.out.println("Days.SALI = " + Days.SALI);
        System.out.println("Days.CARSAMBA.name() = " + Days.CARSAMBA.name());


        System.out.println("City.ANTALYA.getNufus() = " + City.ANTALYA.getNufus());

        for (City c : City.values()){
            System.out.println(c);
            System.out.println("c.getNufus() = " + c.getNufus());
        }
        //
       int result = Operation.ADD.add(3,9);
        System.out.println("result = " + result);

    }
}
