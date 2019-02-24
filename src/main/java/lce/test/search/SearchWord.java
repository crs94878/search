package lce.test.search;

import lce.test.search.directorychoose.DirectoryChooser;
import lce.test.search.fileread.FilesRead;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class SearchWord {

    @Autowired
    private DirectoryChooser directoryChooser;

    @Autowired
    private FilesRead filesRead;

    public void search(){
        try {
            System.out.println("Введите слово для поиска");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Поиск файлов...");
            String word = scanner.nextLine();
            File[] files = directoryChooser.directoryChooser();
            List<File> currentFiles =  filesRead.getCurrentFiles(files, word);
            System.out.println("Найдено файлов: " + currentFiles.size());
            System.out.println("Найденые файлы:");
            for (File file : currentFiles){
                System.out.println(file.getPath());
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
            System.exit(0);
    }
}
