package OOPS.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class generics <T>{

        T value;
        ArrayList<T> arr= new ArrayList<>();
        void put(T value){
            this.value=value;
        }
        T getting(){
            System.out.println(value)
            ;
            System.out.println(arr);
            return value;
        }

}
