package java1702.javase.collection;

import com.sun.org.apache.bcel.internal.generic.IfInstruction;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by $qiqi
 * on 2017/4/12.
 * java
 */
public class Staff  {
    public static void main(String[] args) {
        HashMap<String,Double>hashMap=new HashMap<>();
        hashMap.put("Tom",2008.0);
        hashMap.put("Jack",1050.0);
        hashMap.put("c",680.0);
        hashMap.put("d",500.0);
        hashMap.put("e",3000.6);
        for (String s : hashMap.keySet()) {
            System.out.println(s);

        }
        for (Map.Entry<String, Double> stringDoubleEntry : hashMap.entrySet()) {
            System.out.println(stringDoubleEntry);

        }
        hashMap.remove("Tom");
        hashMap.get("Jack");
        hashMap.put("Jack",1500.0);
        System.out.println(hashMap.get("Jack"));

        for (Double aDouble : hashMap.values()) {
            if(aDouble<=1000){
                aDouble=aDouble+aDouble*0.2;
                System.out.println(aDouble);
            }
            
        }

    }
}
