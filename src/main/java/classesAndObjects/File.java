package classesAndObjects;

import java.util.Date;

public class File {
    private String path;
    private double size;
    private Date dateOfCreation;
    private String content;

    /**
     * to maintain the no of object created for File class
     *
     * if we make this as private then we will need a getter method to access it outside the class and that can be static
     * or non-static and if its static then we can access it File.getCount() else we need a object File f = new File("path")
     * f.getCount()
     */
    public static int countOfObject; //get initialize in class loading step

    public File(String path) {
        this.path = path;
        this.size = 0;
        this.dateOfCreation = new Date();
        this.content = "";
        //everytime object created for this all args constructor we increment the count
        //if we use this.countOfObject then we get a warning that we are trying access it as instance reference which is not needed
        // and can be ignored since its class level variable and common for all object
        countOfObject++;
    }

    public String getPath() {
        return path;
    }

    public double getSize() {
        return size;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public String getContent() {
        return content;
    }
}
