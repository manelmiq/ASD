package IteratorExercises;

import java.util.Vector;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyVector<T> {

    Vector<T> myVector;
    Functor<T> myIterator;

    public MyVector(Vector<T> myVector) {
        this.myVector = myVector;
    }

    public MyVector() {
        myVector = new Vector<>();

    }

    public void add(T i) {
        myVector.add(i);
    }
    public void doAll(Functor<T> functor){
        for (T i : myVector){
            functor.compute(i);
        }
    }

    public void doAll(Predicate<T> predicate, Functor<T> functor){
        for (T i : myVector){
            if(predicate.test(i)){
                functor.compute(i);
            }
        }
    }
}
