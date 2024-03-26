package geek.beauty._08.demo01;

/**
 * @Author lnd
 * @Description
 * @Date 2024/3/23 11:59
 */
public class ArrayStack {

    private final Object[] items;
    private int size; //栈中元素的个数（数组没办法直接获取元素个数，需要维护一个size，每次入栈/出栈操作就变动改值）
    private static final int DEFAULT_STACK_SIZE = Integer.SIZE;

    public ArrayStack(int length) {
        this.items = new Object[length];
        size = 0;
    }

    public ArrayStack() {
        this(DEFAULT_STACK_SIZE);
    }

    /**
     * 出栈
     * @return
     */
    public Object pop() {
        if (size <= 0) {
            System.out.println("Stack is empty, pop error");
            return null;
        }
        // 出栈
        Object res = items[size - 1];
        size--;
        return res;
    }

    /**
     * 入栈
     * @param obj
     * @return true 入栈成功  false 入栈失败
     */
    public boolean push(Object obj) {
        if (size == items.length) {
            System.out.println("Stack is full, push error");
            return false;
        }
        // 入栈
        items[size] = obj;
        size++;
        return true;
    }

    public int getSize() {
        return size;
    }
}
