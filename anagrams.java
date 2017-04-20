


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
 
        if(strs == null || strs.length == 0) 
            return null;
        
        //list hold same kind
        //map hold list   // not map ,but HashMap
        ArrayList<String> listRet = new ArrayList<String>();
  
        HashMap<String, ArrayList<String> >  map = new HashMap<String, ArrayList<String> >();
        
        //foreach string[]
        for( String str: strs)
            {
            char [] ch0 = str.toCharArray();
            Arrays.sort(ch0); // not array, but Arrays.sort
            String str0 = new String(ch0);
            
            if( map.containsKey( str0))
            {
                if(  map.get(str0).size() == 1)
                    listRet.add( map.get(str0).get(0) );//list first postion : get(0)
                
                map.get(str0).add(str0);
                listRet.add(str);
            }
            else // first commout
            {
                      ArrayList<String> listIn = new ArrayList<String>();
                listIn.add(str);  // not ordered,but before !!!
                map.put(str0 , listIn);//key also ordered
                
                
            }
            //list 不添加修改过的
            //map是ordered过的
            
        }

        
        return listRet;
    }
}
