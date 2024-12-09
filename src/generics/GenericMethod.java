package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod <T>{

    public void printList(List<T> list){
        for(T obj : list){
            System.out.println(obj);
        }

    }

}
