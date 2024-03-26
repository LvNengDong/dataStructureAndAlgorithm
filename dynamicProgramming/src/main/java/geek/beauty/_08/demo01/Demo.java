package geek.beauty._08.demo01;

/**
 * @Author lnd
 * @Description
 * @Date 2024/3/23 12:17
 */
public class Demo {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push(new Object());
        System.out.println(stack.getSize());
        Object pop = stack.pop();
        System.out.println(pop == null);
        System.out.println(stack.getSize());
    }
}
