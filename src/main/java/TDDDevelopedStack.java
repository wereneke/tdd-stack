import java.lang.reflect.Array;

public class TDDDevelopedStack<T> {

    T[] stack;
    int capacity;

    public TDDDevelopedStack(int capacity) throws Exception {

        if (capacity <= 0) throw new Exception();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void push(T val) {

        Class c = val.getClass();
        if (stack == null) {
            stack = (T[]) Array.newInstance(c, capacity);
            stack[0] = val;
        }
    }
}
