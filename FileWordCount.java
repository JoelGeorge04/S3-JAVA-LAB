import java.io.*;
class MyFile 
{
    public static void main(String[] args) {
        int i, wordcount = 0, linecount = 0, charcount = 0;
        char ch;
        try {
            FileInputStream fin = new FileInputStream("file1.txt");
            do {
                i = fin.read();
                ch = (char) i;
                if (i != -1)
                {
                    if (ch == '\n' | ch == ' ') 
                    {
                        wordcount++;
                    }
                    if (ch == '\n') 
                    {
                        linecount++;
                    }
                    if (ch >= 'a' & ch <= 'z' | ch >= 'A' & ch <= 'Z') 
                    {
                        charcount++;
                    }
                }
            } while (i != -1);
            fin.close();
        } catch (Exception e) 
        {
            System.out.println(e);
        }
        System.out.println("The no.of lines is " + ++linecount);
        System.out.println("The no.of word is " + wordcount);
        System.out.println("The no.of characters is " + charcount);
    }
}