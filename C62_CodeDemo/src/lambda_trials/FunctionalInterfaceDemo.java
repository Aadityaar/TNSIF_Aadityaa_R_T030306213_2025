//Using Inbuilt types of Functional Interfaces
package lambda_trials;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		//Using Supplier Interface
		Supplier<String> supplier;
		supplier=()->"Hello! How are you?";
		System.out.println(supplier.get());
		
		Supplier<Integer> intSupplier;
		intSupplier=()-> 1;
		System.out.println(intSupplier.get());

		//Using Consumer Interface
		Consumer<String> consumer;
		consumer=(s)-> System.out.println("You passed : "+s);
		consumer.accept("Java");
		
		//Print odd or even
		Consumer<Integer> intConsumer;
		intConsumer=(no)->{
			if (no%2==0)
				System.out.println(no+" is even ");
			else
				System.out.println(no+" is odd ");
		};
		intConsumer.accept(15);
		intConsumer.accept(22);
	
		//Print positive or negative
		intConsumer=(no)->{
			if (no>0)
				System.out.println(no+" is Positive ");
			else if (no<0)
				System.out.println(no+" is Negative ");
			else
				System.out.println(no+" is zero");
		};
		intConsumer.accept(55);
		intConsumer.accept(-41);
		intConsumer.accept(0);
		
		//Predicate Functional Interface
		Predicate<Integer> numPredicate;
		
		//Check for Prime
		numPredicate=(no)->
		{
			for(int i=2;i<no;i++)
			{
				if (no%i==0)
					return false;
			}
			return true;
		
		};
		
		System.out.println("15 is Prime? "+numPredicate.test(15));
		System.out.println("23 is Prime? "+numPredicate.test(23));
		
		//check for Armstrong number
		//153=1+125+27
		numPredicate=(no)->
		{
			int n=no;
			int sum=0, d;
			while(n!=0)
			{
				d=n%10;
				sum+=d*d*d;
				n=n/10;
			}
			if (no==sum)
				return true;
			else
				return false;
		};
		
		System.out.println("153 is Armstrong? "+numPredicate.test(153));
		System.out.println("45 is Armstrong? "+numPredicate.test(45));
		
		//Using Function Interface
		Function<String, Integer> lenFun;
		lenFun=(str)->str.length();
		System.out.println("Length of Hello is "+lenFun.apply("Hello"));
		
		//Using Bi-Function Interface
		BiFunction<Integer,Integer, Integer> opr;
		opr=(a,b)->a>b?a:b;
		System.out.println("Maximum of 10, 20 is "+opr.apply(10, 20));
		
	}
}
