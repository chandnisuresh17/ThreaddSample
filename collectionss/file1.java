package collectionss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class file1 {
     public static void main(String[] args) {
        System.out.println("List");
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);
        li.add(7);
        System.out.println(li);
        for(int i:li){
            System.out.println(i*3);
        }


        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        s.add(7);
        System.out.println(s);
        // for(int i:s){
        //     System.out.println(i*3);
        // }
        Set<Integer> t = new TreeSet<>();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        t.add(6);
        t.add(7);
        System.out.println(t);
        // for(int i:li){
        //     System.out.println(i*3);
        // }
        Map<String,Integer> M = new HashMap<>();
        M.put("jhfwh",4000);
        M.put("asfv",5463);
        System.out.println(M);


        
    }
    
}
