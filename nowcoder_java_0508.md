 

#001 nowcoder_java_class_diagram
list/set is son of collection
map
iterator different
![](https://uploadfiles.nowcoder.com/images/20170214/2193220_1487038875892_072774B6B658B3603E1AA7198722775C)

#2 java final
final用于可以声明属性和方法，分别表示属性的不可变及方法的不可覆盖。不是方法的不可继承 

#3（新认识） java 自动拆装箱的考题(自动拆装箱JDK需在1.5上）integer 比较

 1、基本型和基本型封装型进行“==”运算符的比较，基本型封装型将会自动拆箱变为基本型后再进行比较，因此Integer(0)会自动拆箱为int类型再进行比较，显然返回true；
 2、两个Integer类型进行“==”比较，如果其值在-128至127，那么返回true，否则返回false, 这跟Integer.valueOf()的缓冲对象有关，这里不进行赘述。
 3、两个基本型的封装型进行equals()比较，首先equals()会比较类型，如果类型相同，则继续比较值，如果值也相同，返回true
 4、基本型封装类型调用equals(),但是参数是基本类型，这时候，先会进行自动装箱，基本型转换为其封装类型，再进行3中的比较。

int a=257;
 Integer b=257;
 Integer c=257;
 Integer b2=57;
 Integer c2=57;
 System.out.println(a==b);
 //System.out.println(a.equals(b));  编译出错，基本型不能调用equals()
 System.out.println(b.equals(257.0));
 System.out.println(b==c);
 System.out.println(b2==c2);

因此上面的代码的结果因此为 true, false, false, true


#4 java ctor修饰 nothing

构造方法不能被子类继承，所以用final修饰没有意义。
构造方法用于创建一个新的对象，不能作为类的静态方法，所以用static修饰没有意义。
此外，Java语言不支持native或synchronized的构造方法


#5 java默认小数格式 double

在Java中，如果你输入一个小数，系统默认的是double类型的，这个式子相当于 float f=double 11.1，明显错误
，如果想要表达11.1为float类型的，需要在11.1末尾加一个f标识你输入的是float类型即可 

#6 java args
 java Test one two three
 args[0] = one
 
#7 java抽象类
抽象类不仅可以被继承，还可以直接拿来使用的，当然，这个使用是拿来声明，而不是实例化

#8 基础 java传值
指出下列程序运行的结果： 
```
public class Example{ 

    String str=new String("tarena"); 

    char[]ch={'a','b','c'}; 

    public static void main(String args[]){ 

        Example ex=new Example(); 

        ex.change(ex.str,ex.ch); 

        System.out.print(ex.str+" and "); 

        System.out.print(ex.ch); 

    } 

    public void change(String str,char ch[]){  //引用类型变量，传递的是地址，属于引用传递。 

        str="test ok"; 

        ch[0]='g'; 

    } 

} 
```
