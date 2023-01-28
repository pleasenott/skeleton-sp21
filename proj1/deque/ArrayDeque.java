package deque;

public class ArrayDeque<T> {
    public T[] arr;
    public int size;
    public ArrayDeque()
    {
        arr =(T[])new Object[8];
        size=0;
    }
    public void addLast(T data)
    {
        if(arr.length<=size)
            resize(size*2);
        arr[size]=data;
        size++;
    }
    private void resize(int n)
    {
        T[] tmp=(T[])new Object[n];
        System.arraycopy(arr, 0, tmp, 0, size);
        arr=tmp;
    }
    public void addFirst(T data)
    {
        T[] tmp=(T[]) new Object[arr.length+1];
        System.arraycopy(arr, 0, tmp, 1, size);
        tmp[0]=data;
        arr=tmp;
        size++;
    }
    public T removeLast()
    {
        if(size==0)
            return null;
        T tmp=arr[size-1];
        size--;

        return tmp;
    }
    public T removeFirst()
    {
        if(size==0)
            return null;
        if(size<arr.length/4)
            resize(arr.length/4);
        T[] tmp=(T[]) new Object[arr.length-1];
        T s=arr[0];
        System.arraycopy(arr, 1, tmp, 0, size);
        arr=tmp;
        size--;
        return s;
    }
    public T get(int i)
    {
        if(i>size)
            return null;
        return arr[i-1];
    }
    public int size()
    {
        return this.size;
    }
    public boolean isEmpty()
    {
        if(size==0)
            return true;
        return false;
    }
    public void printDeque()
    {
        if(size==0)
            return;
        int i;
        for(i=0;i<size-1;i++)
            System.out.print(arr[i]+"->");
        System.out.println(arr[i]);
    }
}
