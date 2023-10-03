public class es15 {
    public static void main(String[] args) {
        char x = '*';
        getOperation(x);



    }


    public static void getOperation (char  op){

        switch(op){

            case '+': System.out.println("operation is sum");
                break;

            case '-': System.out.println("operation is subtraction");
                break;

            case '*': System.out.println("operation is multiplication");
                break;

            case '/': System.out.println("operation is division");
                break;

            default: System.out.println("error");
                break;
        }

    }
}

