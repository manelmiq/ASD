package IteratorExercises;

public class AvgFunctor implements Functor {

    Double total;
    Integer count;

    AvgFunctor() {
        total = .0;
        count = 0;
    }


    @Override
    public void compute(Object element) {
        total += (Integer) element;
        count++;
    }

    @Override
    public Object getValue() {
        return total / count;
    }

    public void reset() {
        total = .0;
        count = 0;
    }
}
