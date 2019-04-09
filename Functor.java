package IteratorExercises;

public interface Functor<T> {
     void compute(T element);
     T getValue();
}
