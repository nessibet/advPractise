package AdvJavaPractise.MultiThread.creation;

public class ThreadCreation02 {
    //Task2:Runnable interfaceni implement eden Counter isminde sınıf oluşturup
    // bu sınıftan harfleri a dan z ye kadar yazdıran iki tane thread oluşturunuz.

//Task3: Threadler başlamadan önce Yarış başlasın ve bitince Yarış bitti
    //yazdırın.

    public static void main(String[] args) {
        System.out.println("Yaris baslasin");

        Counter c1 = new Counter("RoadRunner");
        Counter c2 = new Counter("SpeedyGonzales");

        Thread thread1= new Thread(c1);
        Thread thread2= new Thread(c2);

        thread1.start();
        thread2.start();

        //thread 1 ve thread 2 bitene kadar bekle
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


     /*
       thread1 ve 2 bitirene kadar thredi uyutmak isstedik yemedi

       try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        System.out.println("Yaris bitti");
    }
}
