package IteratorExercises;

import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args){
        MyVector<Integer> vector = new MyVector<Integer>();
        for(int i = 1; i <= 10; i++){
            vector.add(i);
        }

//        part1
        Functor<Integer> sumFunctor = new SumFunctor<>();
        vector.doAll(sumFunctor);
        System.out.println(sumFunctor.getValue());

//        part1.b

        Functor<Integer> avgFunctor = new AvgFunctor();
        vector.doAll(avgFunctor);
        System.out.println(avgFunctor.getValue());

        Predicate<Integer> greaterThan2 = i -> (i > 2);





//        part2 sum with external iterator

        System.out.println(vector.myVector.stream()
                .map(s->{return s.intValue();})
                .filter(s->(s.intValue() > 2))
                .reduce(0, (a, b) -> (a + b)  ) );

//        part2 avergage with internal iterator




        System.out.println(vector.myVector.stream()
                .filter(s->(s.intValue() > 2))
                .mapToDouble(s->{return s.intValue();})
                .average().getAsDouble() );


        //         part 3 internal iterator

        ((SumFunctor) sumFunctor).reset();

        vector.doAll(greaterThan2, sumFunctor);
        System.out.println(sumFunctor.getValue());


        ((AvgFunctor) avgFunctor).reset();

        vector.doAll(greaterThan2, avgFunctor);
        System.out.println(avgFunctor.getValue());


//        External Selective

        Iterator<Integer> iterator = vector.myVector.iterator();













    }


}
