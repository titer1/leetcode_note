public class Solution {
    
    public boolean isOk(char ch)
        {
        if( ch>='0' && ch<='9')
            return true;
        else
            return false;
    }
    
    public int atoi(String str) {
        
        
         long ret = 0;
        
        
        
        //char * move = str // how pointer move ?? in java
        //space
        String str0 = str.trim();
        int len0= str0.length();
        if(len0 == 0)//not null
            return 0; //defualt ??
        int index = 0 ,flag = 1;

        if( str0.charAt(index) == '-')
        {
            flag = -1;
            index ++;
        }
        else  if( str0.charAt(index) == '+')
        {
            index ++;
        }            
        
        while(str0.charAt(index) != '\0')
            {
            
            if( isOk(str0.charAt(index)))
               {
                   ret = ret*10+ str0.charAt(index) - '0' ;
                   
                   if(ret>2147483647 && flag == 1)
                       return 2147483647;
                   //else if(ret> (long)147483648 && flag == -1) // integer number too large: 2147483648
                	else if(ret> Integer.MAX_VALUE && flag == -1)       
                		return Integer.MIN_VALUE;//-2147483648;
               	
                index ++;//move out?
                
                if(index >= str0.length())
                    break;//do not miss it
            
            	}
            else
                break;
               
               
            
        }
        ret = ret * flag;       
        
        
        return (int)ret ;// possible loss of precision
        /*
        testcase
        [space][-/+][123abc.]
        outside
        */
        
        /*
        api are
//万一case ------1啦 bad
Integer.MAX_VALUE
no long long 
.trim()
length()
long ?
charAt()
index ?

        */
    }
}
