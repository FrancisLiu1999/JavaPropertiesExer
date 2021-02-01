package com.FrancisExer_01_PropertiesExer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
/*
        //Properties作为Map集合的使用
        Properties prop=new Properties();

        prop.put("001","a");
        prop.put("002","b");
        prop.setProperty("003","c");
        Set<Object> keySet=prop.keySet();
        for (Object key:keySet){
            Object value=prop.get(key);
            System.out.println(key+","+value);
        }
        System.out.println(prop.getProperty("001"));

        Set<String> names = prop.stringPropertyNames();
        for (String key:names){
            String value=prop.getProperty(key);
            System.out.println(key+","+value);
        }*/


        myStore();
        myLoad();

    }

    private static void myLoad() throws IOException {
        Properties prop=new Properties();

        FileReader fr=new FileReader("C:\\Users\\liume\\Desktop\\hrmup\\JavaPropertiesExer\\fw.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop=new Properties();

        prop.setProperty("001","a");
        prop.setProperty("002","b");

        FileWriter fw=new FileWriter("C:\\Users\\liume\\Desktop\\hrmup\\JavaPropertiesExer\\fw.txt");

        prop.store(fw,null);
        fw.close();

    }
}
