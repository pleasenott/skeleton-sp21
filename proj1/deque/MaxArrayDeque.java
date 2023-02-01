package deque;

import java.util.Comparator;
public class MaxArrayDeque<T> extends ArrayDeque<T>{
    private Comparator<T> Com;
    public MaxArrayDeque(Comparator<T> c)
    {
        super();
        Com=c;
    }
    public T max()
    {
       return max(Com);
    }
    public T max(Comparator<T> c)
    {
        if (isEmpty()) {
            return null;
        }
        int maxIndex = 0;
        for (int i = 1; i < size(); i++) {
            if (c.compare(get(i), get(maxIndex)) > 0) {
                maxIndex = i;
            }
        }
        return get(maxIndex);
    }
    public Boolean equal(T thefirst ,T thesecond)
    {
        if(Com.compare(thefirst,thesecond)==0)
            return true;
        return false;
    }
}
