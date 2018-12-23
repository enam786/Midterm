package datastructure;

import javax.naming.ldap.SortKey;
import java.security.Key;
import java.util.*;

public class CollectionView {

        public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
                HashMap<Integer, String> map = new HashMap<Integer, String>();
                map.put(1, "NYC");
                map.put(2, "LA");
                map.put(3, "Denver");
                map.put(4, "Boston");
                map.put(5, "San Jose");
                map.put(6, "Seattle");

                String str1 = map.get("1");  // No need downcast
                System.out.println(str1);
                String str2 = map.get("2");
                System.out.println(str2);
                String str3 = map.get("3");
                System.out.println(str3);

                //Set<String> keys = map.keySet();
               // for (String str : keys) {
                 //       System.out.print(str);
                  //      System.out.print(":");
                   //     System.out.println(map.get(str));


                }

        }

