//+10次错误，关于 跳过空格，int_min的判断都有问题，还有while \0 判断。
//todo 练习2
#include <math.h>
//#define INT_MAX (2147483647)
//#define INT_MIN (-2147483648)
class Solution {
public:
    bool isdigit(char a)
    {
    //if( *str>='0' && *str<='9') {  
        if( (a>='0') && (a<='9'))//ascii 0x31
            return true;
        else
            return false;
        
    }

   
    int atoi(const char *str) {
        //[space][-][digit]
        
        if(str == NULL) return 0;
        //ignore the space
        
        //int len = strlen(str);//not \0 endding
        
        char *move = (char*)str;
        while( (*move) == ' ')
        move ++; //here 不同？？？？？？？
        ;//ignore spaces
        
        int flag_minus = 1;
        if(*move == '-')
        {
            flag_minus = -1;
            move ++;
        }
        else if(*move == '+')
         {
            flag_minus = 1;
            move ++;
        }
        
        
        int arrDigit[32]={0};
        int len = 0;
        long long ret = 0;
        
        //return *move;
        //return isdigit(*move);//debug 
        
        while( (*move) != '\0' )//deal all digit, else meet char // ==1  ''
        {
        	//if(isdigit(*move))(a>='0') && (a<='9')
            if( (*move >='0') && ( *move <='9'))
            {
            arrDigit[len++] = *move - '0';
            move++;
            }
            else
            {
            	break;
            }
            
        }
        
        if(len == 0)//|| len>10) 
            return 0;
        
        for(int j = len -1  ;j>=0; j--)
        {
            ret += arrDigit[j]*pow(10,len-1-j);
            if((ret>INT_MAX) && (flag_minus==1))
                return INT_MAX;
            if( (ret> 2147483648) && (flag_minus== -1) ) //(ret<INT_MIN))  //容易错
                return INT_MIN;
        }
        //judge
        ret = flag_minus*ret;
        return ret;
        //give 1 ,output 0
            
        
    }
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
