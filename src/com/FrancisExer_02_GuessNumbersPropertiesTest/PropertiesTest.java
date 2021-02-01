package com.FrancisExer_02_GuessNumbersPropertiesTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties prop=new Properties();

        FileReader fr=new FileReader("C:\\Users\\liume\\Desktop\\hrmup\\JavaPropertiesExer\\games.txt");
        prop.load(fr);
        fr.close();

        String count=prop.getProperty("count");
        int number=Integer.parseInt(count);

        if (number>=3){
            System.out.println("试玩结束");
        }else {
            GuessNumber.start();

            number++;
            prop.setProperty("count",String.valueOf(number));
            FileWriter fw=new FileWriter("C:\\Users\\liume\\Desktop\\hrmup\\JavaPropertiesExer\\games.txt");
            prop.store(fw,null);
            fw.close();
        }

    }
}
