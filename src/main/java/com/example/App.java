package com.example;

import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        File source = new File("source.txt");
        File dest = new File("dest.txt");
        
        try{
        	FileUtils.copyFile(source,dest);
        	System.out.println("successful");
        }
        catch(IOException e){
        	System.out.println("error");
        }
        
    }
}
