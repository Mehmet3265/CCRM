package com.CCRM.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static{
        try{
            properties=new Properties();
            FileInputStream configFile=new FileInputStream("configuration.properties");
            properties.load(configFile);
            configFile.close();
        }catch (Exception e){
            System.out.println("ConfigFile is not found in the Properties");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
