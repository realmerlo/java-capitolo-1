public class es15 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        char x = '*';
        int operation = getOperation(a, b, x);
        System.out.println(operation);


    }


    public static int getOperation (int num1, int num2, char  op){
        int operation = 0;

        switch(op){

            case '+': operation = num1 + num2;
                break;

            case '-': operation = num1 - num2;
                break;

            case '*': operation = num1 * num2;
                break;

            case '/': operation = num1 / num2;
                break;

            default: System.out.println("error");
                break;
        }
        return operation;
    }
}

