package generics.methods;

import java.util.Arrays;

public class GenericMethod {
    public static void main(String[] args) {

        String[] stdList={"Rafael","Donatello","Leonardo","Michelangelo"};
        Double[] pointList={95.5,70.0,65.6,58.0};
        Character[] gradeList={'A','B','C','B'};

        //1-tüm listeleri yazdır

        prinArray(stdList);
        prinArray(pointList);
        prinArray(gradeList);


        //2-öğrencileri isimlerine göre sıralayınız

        System.out.println("orderArr(stdList) = " + Arrays.toString(orderArr(stdList)));

        //3-öğrenci notlarını sıralayınız

        System.out.println("orderArr(pointList) = " + Arrays.toString(orderArr(pointList)));


        //4-öğrenci harf notlarını sıralayınız

        System.out.println("orderArr(gradeList) = " + Arrays.toString(orderArr(gradeList)));

    }
    //-diziyi yazdıran bir method yazınız.

    public static <T> void prinArray (T[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");

        }
        System.out.println("******");

    }


    //-diziyi artan sıralayan bir method yazınız.

    public static <T extends Comparable<T>> T[]orderArr(T[]array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[i].compareTo(array[j])>0){
                    T temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }

            }

        }



        return array;
    }


}
