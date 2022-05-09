/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Fatih
 */
public class DosyaOkuYaz {
    public static void DosyayaYaz(String metin,File file){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] yazilacak=metin.getBytes();
            fileOutputStream.write(yazilacak);
            fileOutputStream.close();
            
        }catch(IOException ioexp){
            ioexp.printStackTrace();
        }
    }
    public static String dosyadanOku(File file){
            String okunanMetin="";        
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] okunan=new byte[fileInputStream.available()];
            fileInputStream.read(okunan);
            fileInputStream.close();
            okunanMetin=Arrays.toString(okunan);
            
        } catch (IOException ioExp) {
            ioExp.printStackTrace();
        }
            return okunanMetin;
    }
}
