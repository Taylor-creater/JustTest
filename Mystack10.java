package Demo;

public class Mystack10 {
    Object[] object = new Object[10];
    int index = -1;

    public void push(Object obj) throws MyStackException {
        if (index >= object.length - 1) {
            throw new MyStackException("栈已满无法入栈！！！");
        } else {
            index++;
            object[index] = obj;
            System.out.print(object[index]);
            System.out.println("入栈成功，栈针指向+" + index);
        }
    }

    public void pop(Object obj) throws MyStackException {
        if (index < 0) {
            throw  new  MyStackException("栈是空的无法再出栈！！");
        } else {
            System.out.print(object[index] + "成功出栈");
            object[index] = null;
            index--;
            System.out.println("栈针指向" + index);
        }
    }

}

