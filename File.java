// Reading input from a file and writing uppercase and lowercase character to different files.
import java.io.*;

class Lower extends Thread {
    public void run() {
        int i;
        char ch;
        try {
            FileInputStream fis = new FileInputStream("f1.txt");
            FileOutputStream fos = new FileOutputStream("f2.txt");
            do {
                i = fis.read();
                if (i != -1) {
                    ch = (char) i;
                    if (ch >= 'a' & ch <= 'z')
                        fos.write(i);
                }
            } while (i != -1);
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

class Upper extends Thread {
    public void run() {
        int i;
        char ch;
        try {
            FileInputStream fis = new FileInputStream("f1.txt");
            FileOutputStream fos = new FileOutputStream("f3.txt");
            do {
                i = fis.read();
                if (i != -1) {
                    ch = (char) i;
                    if (ch >= 'A' & ch <= 'Z')
                        fos.write(i);
                }
            } while (i != -1);
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

class File {

    public static void main(String arg[]) {
        Lower l = new Lower();
        l.start();
        Upper u = new Upper();
        u.start();
    }
}