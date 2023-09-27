public class es15 {
    public static void main(String[] args) {

        char x = '*';
        String operation = getOperation(x);
        System.out.println(operation);

    }
    public static String getOperation (char x) {
        String operation;

        switch(x){

            case '+': operation = "sum";
                break;

            case '-': operation = "subtraction";
                break;

            case '*': operation = "multiplication";
                break;

            case '/': operation = "division";
                break;

            default: operation = "Error";
                break;
        }
        return operation;
    }
}

