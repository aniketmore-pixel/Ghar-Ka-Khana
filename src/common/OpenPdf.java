///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package common;
//
//import javax.swing.JOptionPane;
//import java.io.File;
//
///**
// *
// * @author admin
// */
//public class OpenPdf {
//    public static void openById(String id) {
//        try{
//            if((new File("C:\\"+id+".pdf")).exists()) {
//                Process p = Runtime
//                        .getRuntime()
//                        .exec("rundll32 url.dll.FileProtocolHandler C:\\"+id+".pdf");
//            }
//            else
//                JOptionPane.showMessageDialog(null,"File does not exist.");       
//        }
//        catch(Exception e) {
//            JOptionPane.showMessageDialog(null,e);
//        }
//    }
//    
//}
//

package common;

import java.awt.Desktop;
import javax.swing.JOptionPane;
import java.io.File;

public class OpenPdf {
    public static void openById(String id) {
        try {
            File file = new File("C:\\" + id + ".pdf");
            if (file.exists()) {
                // Use Desktop class to open the PDF file in the default application
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    JOptionPane.showMessageDialog(null, "Desktop is not supported.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "File does not exist.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
