package com.company;

import java.io.File;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        // путь к файлу может быть указан как относительный, так и абсолютный
        File f = new File("1.txt");
        if (!f.exists()){// проверяет , существует ли файл
            f.createNewFile();
        }
        System.out.println(f.canExecute());
        System.out.println(f.canWrite());

        //кол-во секунд, прошедших с 1 января 1970 г
        //Unix Timestamp
        System.out.println(f.lastModified());
        f.setLastModified(0);
        f.isHidden(); // true если файл скрытый
        f.setWritable(false);// false файл только для чтения; true -для чтения и записи
        System.out.println(f.getAbsolutePath());
        File dir = new File("date\\bin\\org");
        if (!dir.exists()){
            dir.mkdirs();// соз-ся все папки из пути, которых не существует
            //dir.mkdir() -создаст только первую папку из указанного пути, котор. не существует
        }


        // вывести на экран название всех текстовых файлов, которые являются скрытыми
        File [] list = dir.listFiles();
        for (File file: list){
            if (file.isDirectory()){
                continue;//идем дальше, если это папка
            }
            if (!file.isHidden()){
                continue;// идем дальше если файл не скрытый
            }
            if (!file.getName().endsWith(".txt")){
                continue;// идем дальше , если файл не заканчивается на txt
            }
            System.out.println(file.getName());
        }
        File dir2 = new File("exampl\\");
        printFiles(dir2);

    }
    public static void printFiles(File dir) {
        File[] list = dir.listFiles();
        for (File f : list) {
            if (f.isFile()){
                System.out.println(f.getName());
                continue;

            }
            printFiles(f);
        }
    }

}
