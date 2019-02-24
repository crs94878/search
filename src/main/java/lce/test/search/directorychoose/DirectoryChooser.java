package lce.test.search.directorychoose;

import java.io.File;
import java.io.IOException;

public interface DirectoryChooser {

    File[] directoryChooser() throws IOException;
}
