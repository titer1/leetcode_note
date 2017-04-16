#include <math.h>
//#define INT_MAX (2147483647)
//#define INT_MIN (-2147483648)
class Solution {
public:
    int isdigit(char a)
    {
        if( (a>='0') && (a<='9'))//ascii 0x31
            return 1;
        else
            return 0;
        
    }

   
    int atoi(const char *str) {
        //[space][-][digit]
        
        if(str == NULL) return 0;
        //ignore the space
        
        //int len = strlen(str);//not \0 endding
        
        char *move = (char*)str;
        while( (*move++) != ' ');//ignore spaces
        
        int flag_minus = 1;
        if(*move == '-')
        {
            flag_minus = -1;
            move ++;
        }
        
        int arrDigit[32]={0};
        int len = 0;
        long long ret = 0;
        while( isdigit(*move) )//deal all digit, else meet char
        {
            arrDigit[len++] = *move - '0';
            move++;
            
        }
        if(len == 0)//|| len>10) 
            return 0;
        for(int j = len -1  ;j>=0; j--)
        {
            ret += arrDigit[j]*pow(10,len-1-j);
            if((flag_minus==1)&& (ret>INT_MAX))
                return INT_MAX;
            if((flag_minus!=1)&& (ret<INT_MIN))
                return INT_MIN;
        }
        //judge
        ret = flag_minus*ret;
        return ret;

            
        
    }
        //geek tips 2147483647 only 10 digits
    //您的程序发生段错误，可能是数组越界，堆栈溢出（比如，递归调用层数太多）等情况引起
        //while dead loop
    
    	// 100
    // >bigger int32 2^32 INT_MAX (2147483647) 
    // -100
    	// 100.1 //endwith charcater
    // abc123
    // 123abc   0 
    // 空格123
    //
};
