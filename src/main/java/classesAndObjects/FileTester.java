package classesAndObjects;

public class FileTester {
    public static void main(String [] args){
        System.out.println(File.countOfObject);// o/p : 0
        
        File f = new File("/file.txt");
        System.out.println(File.countOfObject);// o/p : 1

        File f1 = new File("/file.txt");
        //accessing static variable for class File
        System.out.println(File.countOfObject);// o/p : 2

    }
}
