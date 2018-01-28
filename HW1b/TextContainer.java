package com.hw1b.veselov;

import java.io.FileWriter;
import java.io.IOException;

@SaveTo(text = "C:\\Users\\Janio\\text.txt")
public class TextContainer {

    String string = "Hello World";

    @Saver
    public void save (String text) throws IOException {

        FileWriter fw = new FileWriter(text);
        try {
            fw.write(string);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
