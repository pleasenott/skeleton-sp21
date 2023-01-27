package deque;

public class LinkedListDeque <T>{
    public InsideList<T> head;
    public InsideList<T> end;
    int size;
    public InsideList<T> re;
    public LinkedListDeque()
    {
        head=new InsideList<T>();
        head.next=null;
        head.pre=null;
        end=head;
        size=0;
        re=head;

    }
    public void addLast(T data)
    {
        end.next=new InsideList<T>();
        end.next.item=data;
        end.next.pre=end;
        end=end.next;
        size++;
    }
    public void addFirst(T data)
    {
        head.item=data;
        head.pre=new InsideList<T>();
        head.pre.next=head;
        head=head.pre;
        size++;
    }
    public T removeFirst()
    {
        if(size==0)
            return null;
        InsideList<T> tmp=head.next;
        head.next.pre=null;
        head=head.next;
        size--;
        return tmp.item;
    }
    public T  removeLast()
    {
        if(size==0)
            return null;
        InsideList<T> tmp=end;
        end.pre.next=null;
        end=end.pre;
        size--;
        return tmp.item;
    }
    public int size()
    {
        return this.size;
    }
    public boolean isEmpty()
    {
        if(size==0)
            return  true;
        return false;
    }
    public void printDeque()
    {
        if(size==0)
            return;
        InsideList<T> tmp=head.next;
        for(int i=0;i<size-1;i++)
        {
            System.out.print(tmp.item+"->");
            tmp=tmp.next;
        }
        System.out.println(tmp.item);
    }
    public T get(int n)
    {
        if(n>size||n<=0)
            return null;
        int i;
        InsideList<T> tmp=head.next;
        for(i=0;i<n-1;i++)
            tmp=tmp.next;
        return tmp.item;
    }
    public T getRecursive(int index){
        if(index==1)
        {
            InsideList<T> tmpe=re;
            re=head;
            //System.out.println(re.next.item);
            return tmpe.next.item;

        }
        re=re.next;
        return getRecursive(index-1);
    }
}
