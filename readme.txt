/*
feb 18

constructor:-we can chair in constructor
this() without parameter it call default constructor  and it will always at top and it will not call 2 time
in  same class...
this(name)= this.name=name --it call the parameter with string
used in 
intilizing instance variable
method chaining
constructor chaining
INTILIZAR BLOCK:- write some statement that execute even before object created
type:--a) static intilizar block...
            when ever class envoke
            static{
                System.out.println("static init block")
            }
       b) normal intilizar block...
          it envoke always when new class call or 
private constructor:-

20feb..
string (java):- is a class and immutable object
immutable object:- we can not change the value of string after create it
create string:-
string literal:- in double quote "satyarth"
string constant pool:- it is a memory location where string literal store
benefits of string constant pool:-
1) save memory
2) fast performance 
3) security 
4) thread safety
string object:- we can create string object by using new keyword

constructor of string class:-
1) default constructor:- create empty string
2) parameterized constructor:- create string with value 
3) copy constructor:- create string with another string value
4) bit array constructor:- create string with byte array value (range -128 to 127)
     example:- new string(byte[] b={65,66,67})---> ABC 
     ascii value of A=65, Z=90, a=97, z=122
5) char array constructor:- create string with char array value

character set:- it is a collection of character and their corresponding value
types of character set:- 
1)byte character set:- it is a collection of character and their corresponding byte value (range -128 to 127)
2)unicode character set:- it is a collection of character and their corresponding unicode value (range 0 to 65535)
3)printtable characer set:-
4)string builder class object:- it is a mutable class and it is not thread safe it is faster then buffer
                                by default size = 16
5)string buffer class object:- it is a mutable class and it is thread safe have synchronized method
                      it is slower then builder class
syntax:-


23feb
string builder class:-
1)allow index based access
2)it is mutable class
3)it is not thread safe

various constructor of string builder class:-
1) default constructor:- create empty string builder object and size is 16 char
ex:- initialy 16 char then * 2+2 char then * 2+2 char and so on

2) parameterized constructor:- create string builder object with string value and size is 16+string length 
ex:-paraeterized(int 20) then size is 16+20=36 char
3) copy constructor:- create string builder object with another string builder value 


REVISION:- for ca
string methods are:- length, charAt, indexOf, lastIndexOf, substring, toUpperCase, toLowerCase, concat
stringbuilder method are:- append,reverse,charAt,touppercase,tolowercase,concat,lastindexof,indexof,capacity,substring,delete

intifier:- name that give to class, method, variable, object, package, interface, constructor
variable:- it is a name that give to memory location where we store data
default asses modifier:- inside same class , same package
static :- belong to class not object.. it can access by class and by instance..
instance :- belong to object not class
auto boxing:- directly convert primitive data type to wrapper class object
unboxing:- directly convert wrapper class object to primitive data type

bitwise operator:- 
signed right shift- 5>>2=1 trick:- 5/2^2=5/4=1 (2^given number)
unsigned right shift- 5>>>2=1 trick:- 5/2^2=5/4=1 (2^given number)
left shift- 5<<2=20 trick:- 5*2^2=5*4=20 (multiply by 2^given number)
right shift- 5>>2=1 trick:- 5/2^2=5/4=1 (multiply by 2^given number)
bitwise and- 5&2=0 (5=0101 and 2=0010) (1&0=0, 0&1=0, 1&1=1, 0&0=0)
bitwise or- 5|2=7 (5=0101 and 2=0010) (1|0=1, 0|1=1, 1|1=1, 0|0=0)
bitwise xor- 5^2=7 (5=0101 and 2=0010) (1^0=1, 0^1=1, 1^1=0, 0^0=0)
bitwise not - ~5=-6 (5=0101) (1's complement=1010) (2's complement=1011) (-6 in binary is 1011)





*/