package oop.interfacee;

public interface Test {
    default void calistir() {
        System.out.println("Motor calisiyor...");
        guvenlikKontrolu();
    }

    default void durdur() {
        System.out.println("Motor durdu...");
        guvenlikKontrolu();
    }

    private void guvenlikKontrolu() {
        System.out.println("Güvenlik sistemi aktif.");
    }
}
