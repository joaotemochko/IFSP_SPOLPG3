import java.util.List ; 
import java.util.function.Function ; 
public class HigherOrderFunctions { 
    public static void processList ( List <Integer> numbers, Function < Integer , Integer> operation ) { 
        for ( Integer number : numbers) { 
            Integer result = operation.apply ( number ) ; 
            System.out.print ( result + " " ) ; 
        }             
    } 
    public static void main ( String [] args ) { 
        List <Integer> numbers = List.of ( 1 , 2 , 3 , 4 , 5 ) ;
        System.out.println(numbers);
    }
    }