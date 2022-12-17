package AdvJavaPractise.serialization;

import java.io.*;

public class SerializationPractise {
    public static void main(String[] args) {
        /* book tipinde nesneler uretip bu nesnelerin books isimli bir txt dosyasina
        kaydedin ve daha sonra bu dosyadan nesneleri okuyun
         */


      // writeObject();
        readObject();

    }
    public static void writeObject (){
        Book book1 = new Book("Sefiller","Victor Hogo",1945);
        Book book2 = new Book("Suc ve Ceza","Dostoyevski",1955);
        Book book3 = new Book("Savas ve Baris","Tolstoy",1948);

        //FOS=nesneleri yazdiracagimiz dosyayi olusturur
        //OOS=nesneleri yazdirmamizi saglayan method
        try {
            FileOutputStream fos =new FileOutputStream("books.txt");
            ObjectOutputStream write = new ObjectOutputStream(fos);
            write.writeObject(book1);
            write.writeObject(book2);
            write.writeObject(book3);

            write.close();
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static void readObject(){

        //nesneleri okuyacagimiz dosyaya gider
        try {
            FileInputStream fis =new FileInputStream("books.txt");
            //nesneleri okumak icinOIP kullaniyoruz
            ObjectInputStream ois =new ObjectInputStream(fis);
            Book book1=(Book)ois.readObject();
            Book book2=(Book)ois.readObject();
            Book book3=(Book)ois.readObject();
            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);

            fis.close();
            ois.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }


}
