package lce.test.search.fileread;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс открывает файлы в выбранной дирректориии
 * И ищет в файлах слово
 */
public class FilesRead {

    /**
     * Функция возвращает список файлов в котором былло найдено слово
     * @param files Все файлы в директории
     * @param word Слово поиска
     * @return Список файлов в которых найдено слово
     * @throws IOException
     */
    public List<File> getCurrentFiles(File[] files, String word)throws IOException {
        List<File> findFiles =  new ArrayList<>();
        for (File file : files){
            if(file.getName().contains(".txt")) {
                try(InputStreamReader fileReader = new InputStreamReader(new FileInputStream(file), "UTF8")) {
                    if (fileParser(fileReader, word)) {
                        findFiles.add(file);
                    }
                }
            }
        }
        return findFiles;
    }

    /**
     *Функция поиска слова в строках в конкретном файле
     * @param file Один файл в директории выбранной дирректории
     * @param word Слово поиска
     * @return Логическое значение - найдено слово в файле или нет
     * @throws IOException
     */
    private boolean fileParser(InputStreamReader file, String word) throws IOException{
        int symbol;
        StringBuilder fileStr = new StringBuilder();
        while((symbol = file.read()) != -1){
            fileStr.append((char) symbol);
        }
        if(fileStr.toString().contains(word)){
            return true;
        }
        return false;
    }
}
