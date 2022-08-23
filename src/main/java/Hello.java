import java.io.FileNotFoundException;

public class Hello {
    public static void main(String[] args) {
//        starting point of our program
//    Class is the blueprint for its respective objects,
//        Objects are the actual manifestations of the Class

//      ReferenceType referenceName = new ConstructorCallThatMakesObject();
//        Scanner myScanner = new Scanner(System.in);
//        String input = myScanner.nextLine();
//        System.out.println("Hello, " + input);
//        myScanner.close();
        // Can also scan files.

        String line = "default value";
        try {
            StoryReader reader = new StoryReader("src/story.txt");
            while(reader.storyHasTextLeft()) {
                System.out.println(reader.readNextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.err.println(e);
        }
    }
}
