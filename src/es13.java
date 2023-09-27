public class es13 {
    public static void main(String[] args) {
        String filmTitle = "Oppenheimer";
        printLength(filmTitle);
    }

    public static void printLength(String filmTitle) {
        if (filmTitle.length() > 10) {
            System.out.println(filmTitle + " length is longer than 10");
        }else if (filmTitle.length() < 10) {
            System.out.println(filmTitle + " length is shorter than 10");
        } else {System.out.println(filmTitle + " length is 10");}
    }
}

