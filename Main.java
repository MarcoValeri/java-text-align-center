public class Main {

    /*
    * Create a method that gets
    * @parameter String str
    * @parameter int space
    * @return String text align center 
    * consideringh the lenght of space
    * If str.length - space creates an odd number, the method 
    * add +1 to space
    */
    public static String textAlignCenter(String str, int space) {

            if (str.length() > space) throw new IndexOutOfBoundsException("Error: space is less than your string");

            double whiteSpace = space - str.length();
            whiteSpace = whiteSpace % 2 == 0 ? space - str.length() : space - str.length() + .5;
            String output = "";

            for (int i = 0; i < whiteSpace / 2; i++) {
                output+= "-";
            }

            output+= str;

            for (double i = (whiteSpace / 2 + str.length()); i < space; i++) {
                output+= "-";
            }

            return output;

    }


    public static void main(String[] args) {
        
        System.out.println(textAlignCenter("Caterina", 10));
        System.out.println(textAlignCenter("Marco", 10));
        System.out.println(textAlignCenter("RM", 10));

    }

}