import java.util.function.IntBinaryOperator; 

public  class  HighOrderFunctions_2 { 

    public  static IntBinaryOperator getSumFunction () { 
        return (a, b) -> a + b; 
    } 

    public  static  void  main (String[] args) { 
        IntBinaryOperator  sumFunction  = getSumFunction(); 
        int  result  = sumFunction.applyAsInt( 5 , 10 ); 
        System.out.println(result);
     } 
}