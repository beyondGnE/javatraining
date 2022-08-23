import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StoryReader {
    // Application.run()
    // A recognized framework, to be used later.

    /*
    An object usually contains STATES and BEHAVIORS
     */
    private String filepath;
    public void setFilePath(String filepath) {
        this.filepath = filepath;
    }
    public String getFilePath() {
        return filepath;
    }

    private File file;
    public void setFile(File file) {
        this.file = file;
    }
    public File getFile() {
        return file;
    }

    private Scanner storyScanner;

    public StoryReader(String filepath) throws FileNotFoundException {
        this.setFilePath(filepath);
        file = new File(this.getFilePath());
        storyScanner = new Scanner(file);
    }

    // A method is a reusable block of code.
    // So if we have repetitive code, we typically separate that out
    // and reuse that method whenever we want to use that code.
    // The idea is that the behavior of the method may change depending
    // on the state of the object.
    // IN this case, the behavior of storyreader will change depending on
    // filepath and file
    // Therefore, each object will have unique behavior.

    // This is a method stub.
    public String readNextLine() throws FileNotFoundException {
        return storyScanner.nextLine();
    }

    public boolean storyHasTextLeft() throws FileNotFoundException {
        return storyScanner.hasNext();
    }

}
