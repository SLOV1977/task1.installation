package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File dir = new File("Games");
        if (dir.mkdir());
        StringBuilder builder = new StringBuilder("1. Создан каталог Games\n");
        File dir1 = new File("Games/src");
        if (dir1.mkdir());
        builder.append("2. Создан каталог src\n");
        File dir2 = new File("Games/res");
        if (dir2.mkdir());
        builder.append("3. Создан каталог res\n");
        File dir3 = new File("Games/savegames");
        if (dir3.mkdir());
        builder.append("4. Создан каталог savegames\n");
        File dir4 = new File("Games/temp");
        if (dir4.mkdir());
        builder.append("5. Создан каталог temp\n");
        File dir5 = new File("Games/src/main");
        if (dir5.mkdir());
        builder.append("6. Создан каталог main\n");
        File dir6 = new File("Games/src/test");
        if (dir6.mkdir());
        builder.append("7. Создан каталог test\n");
        File file1 = new File(dir5, "Main.java");
        try {
            if (file1.createNewFile());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        builder.append("8. Создан файл Main.java\n");
        File file2 = new File(dir5, "Utils.java");
        try {
            if (file2.createNewFile());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        builder.append("9. Создан файл Utils.java\n");
        File dir7 = new File("Games/res/drawables");
        if (dir7.mkdir());
        builder.append("10. Создан каталог drawables\n");
        File dir8 = new File("Games/res/vectors");
        if (dir8.mkdir());
        builder.append("11. Создан каталог vectors\n");
        File dir9 = new File("Games/res/icons");
        if (dir9.mkdir());
        builder.append("12. Создан каталог icons\n");
        File file3 = new File(dir4, "temp.txt");
        try {
            if (file3.createNewFile());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        builder.append("13. Создан файл temp.txt\n");
        String text = builder.toString();
        try (FileWriter writer = new FileWriter("Games/temp/temp.txt", false)) {
            writer.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
