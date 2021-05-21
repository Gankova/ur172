package com.company;


import java.io.*;

public class Main3 {

    public static void main(String []args) throws IOException {
        // чтение текстового файлаF
        File f = new File("test.txt");
        if (!f.exists()){
            f.createNewFile();

        }
        FileReader fr = new FileReader(f);
        //чтение файла "за раз"
        char[] content = new char[(int)f.length()];
        fr.read(content);
        for (char c : content) {
            System.out.print(c);

        }
        fr.close();
        fr = new FileReader(f);
        StringBuffer buf = new StringBuffer((int)f.length());
        char c= 0;
        while (true){
            int ch = fr.read();// вернет код символа и -1,если конец файла
            if (ch==-1) {
                break;
            }
            buf.append((char)ch);
        }
        System.out.println();
        System.out.println(buf);


        //запись файла (с перезаписью предыдущего содержимого
        FileWriter fw = new FileWriter("test2.txt");
        fw.write("Helo\n");
        fw.write("world!");
        fw.close();


        // запись в файл с добавлением в конец
        FileWriter fw2 = new FileWriter("test2.txt",true);
        fw2.write("\nI love Java!");
        fw2.write("\nJavascript");
        fw2.close();

        //произвольный доступ к содержимому файла
        // mode : "r" - только для чтения
        // mode : "w" - только для записи
        // mode : "rw" -для чтения и для записи

        RandomAccessFile raf = new RandomAccessFile("test2.txt","rw");
        raf.seek(5); // перемещает курсор внутри файла
        raf.write("125".getBytes());
        byte [] cont = new byte[5];
        raf.seek(raf.getFilePointer()-3);
        raf.read(cont);
        String s = new String(cont);
        System.out.println(s);
        raf.close();
    }
}
