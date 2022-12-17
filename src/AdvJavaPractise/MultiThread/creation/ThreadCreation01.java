package AdvJavaPractise.MultiThread.creation;

public class ThreadCreation01 {
    /*
    1: Multithreading Programlama nedir?
    ayni processde iki veya daha fazla is parcaciginin (thread) ayni anda calisma surecidir.

    2: Threadler 2 sekilde olusturulur
    - Thread sinifindan extend eden alt sinif olusturup,onun run methodeu override edilir
    -Runnable interfaceini implement eden bir alt sinif olusturup run methodu override edilir.
    ardindan Thread sinifinin constructorina nesne olarak gonderilir.
    --Hangi yontem daha kullanisli olur?
    genellikle runnable interfaceini implement ederek olusturmak daha cok tercih edilir cunku:
    sadece bir class extend edebiliriz bu hakkimizi thread ile harcamak istemeyiz.


    3: Run methodu Main methodundan cagirilabilir mi?
    Evet ancak thread olusturulmaz
    4: Java herhangi bir thread olusturmazsak uygulamalar nerede nasil calisir?
    Java varsayilan olarak tum uygulamalarda main threadini kullanilir

     */

    //Task1: Thread sınıfını extend eden Sayac isminde sınıf oluşturup
// bu sınıftan sayıları 1 den 100 e kadar yazdıran iki tane thread oluşturunuz.

    public static void main(String[] args) {

        Sayac thread1 = new Sayac("Ronaldo");
        Sayac thread2 = new Sayac("Messi");
        thread1.start();
        thread2.start();




    }






}
