package lce.test.search.cofiguration;

import lce.test.search.SearchWord;
import lce.test.search.directorychoose.DirectoryFillesChooser;
import lce.test.search.fileread.FilesRead;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import javax.swing.*;

@Configuration
public class AppConfigurations {

    @Bean
    public DirectoryFillesChooser directoryFillesChooser(JFileChooser fileChooser){
        return new DirectoryFillesChooser(fileChooser);
    }

    @Bean
    public FilesRead getFileRead(){
        return new FilesRead();
    }

    @Bean
    public SearchWord searchWord(){
        return new SearchWord();
    }

    @Bean
    @Lazy
    public JFileChooser getFileChooser(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setDialogTitle("Выберите директорию");
        fileChooser.setApproveButtonText("Выбрать");
        fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
        fileChooser.setVisible(true);
        return fileChooser;
    }
}
