/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab11;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author 000728303
 */
public class Formatter {
    
    public void format(String inFile, String outFile) throws IOException{
        Charset cs = Charset.forName("UTF-8");
        Path inPath = Paths.get(inFile);
        PrintWriter emptyFile = new PrintWriter(outFile);
        emptyFile.close();
        List<String> lines = Files.readAllLines(inPath,cs);
        
        for(String line : lines){
            
            line = line.replaceAll("\\s+", " ");
            line = line.strip();
            try(PrintWriter out = new PrintWriter(new FileWriter(outFile,true))){
                out.println(line);
            }
        }

    }
}
