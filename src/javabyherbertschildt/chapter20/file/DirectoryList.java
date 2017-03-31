package javabyherbertschildt.chapter20.file;

import java.io.File;

public class DirectoryList {
    static void showDirecty(String path) {
        File dir = new File(path);

        if (dir.isDirectory()) {
            System.out.println(dir.getAbsolutePath());

            for(File file : dir.listFiles()) {
                if (file.isDirectory()) showDirecty(file.getAbsolutePath());
                else System.out.println(file.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {
        showDirecty("/Users/ibakhtin");
    }
}
