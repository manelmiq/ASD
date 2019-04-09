package IteratorExercises;






public class SumFunctor<T> implements Functor {

    Integer sum ;

    public SumFunctor() {
        sum = 0;

    }

    public void reset(){
        sum = 0;
    }


    @Override
    public void compute(Object element) {
        sum += (Integer)element;
    }

    @Override
    public Object getValue() {
        return sum;
    }
}
