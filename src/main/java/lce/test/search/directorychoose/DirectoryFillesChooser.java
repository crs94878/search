package lce.test.search.directorychoose;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

/**
 * Класс который открывает вспомогательное окно выбора директории
 */
public class DirectoryFillesChooser extends JFrame implements DirectoryChooser {

    private JFileChooser fileChooser;

    public DirectoryFillesChooser(JFileChooser fileChooser){
        this.fileChooser = fileChooser;
        this.fileChooser.showOpenDialog(this);
    }

    /**
     * Функция выбора директории
     * @return Все файлы в директории
     * @throws IOException
     */
    @Override
    public File[] directoryChooser() throws IOException {
        return fileChooser.getSelectedFile().listFiles();
    }
}
