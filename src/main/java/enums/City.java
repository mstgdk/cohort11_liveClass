package enums;

public enum City {
    BURSA(16,12000,"marmara"),
    ANTALYA(16,12000,"marmara"),
    ISTANBUL(16,12000,"marmara"),
    VAN(16,12000,"marmara"),
    KAYSERI(16,12000,"marmara");


    private final int plaka;
    private final int nufus;
    private final String bolge;

    City(int plaka, int nufus, String bolge) {
        this.plaka = plaka;
        this.nufus = nufus;
        this.bolge = bolge;
    }

    public int getPlaka() {
        return plaka;
    }

    public int getNufus() {
        return nufus;
    }

    public String getBolge() {
        return bolge;
    }
}
