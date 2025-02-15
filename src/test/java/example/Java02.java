
package example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Java02 {
 String str=" I have a some car.No car right is perfect.Every no,car may have a have some some issues,right? ";


 public static void main(String[] args) {
        Java02 obj=new Java02();
        String a="";
        a=obj.str.trim().toLowerCase().replaceAll("[.,?]"," ");
        System.out.println(a);
        String[] arr=a.split(" ");

        Map<String,Integer> map=new LinkedHashMap<String,Integer>();
        for(String s:arr){
            if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                map.put(s,map.get(s)+1);
            }
        }

        Set<String> set=map.keySet();
        for(String s:set){
            System.out.println(s+"-"+map.get(s));
        }


    }
}
