package Uss_05.BaseDriver;

public class MyFunc {
    public static void Bekle(int saniye){

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
