package stack;


public class Main {
    public static void main(String[] args) {
        StackX stackX = new StackX(5);
        char els[] = {'A', 'B', 'C', 'D', 'E', 'F'};

        try{
            for (char el : els) {
                stackX.push(el);
            }

        } catch(StackOverflowException e){
            System.out.println(e.getMessage());
        }

        System.out.println("El at top: " + stackX.peek());

        while (!stackX.isEmpty()){
            System.out.println(stackX.pop());
        }
    }
}
