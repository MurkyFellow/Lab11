/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 000728303
 */
public class FormatterTest {

    @Test
    public void testFormat1() throws Exception {
        String inFile = "T:\\Software Eng 2\\Lab11\\inFile2.txt";
        String outFile = "T:\\Software Eng 2\\Lab11\\outFile.txt";
        Formatter form = new Formatter();
        form.format(inFile, outFile);
        Path outPath = Paths.get(outFile);
        List<String> lines = Files.readAllLines(outPath);
        for(String output : lines){
            assertEquals("How now brown cow.", output);
        }
    }

    @Test
    public void testFormat2() throws Exception {
        String inFile = "T:\\Software Eng 2\\Lab11\\inFile3.txt";
        String outFile = "T:\\Software Eng 2\\Lab11\\outFile.txt";
        Formatter form = new Formatter();
        form.format(inFile, outFile);
        Path outPath = Paths.get(outFile);
        List<String> lines = Files.readAllLines(outPath);
        for(String output : lines){
            assertEquals("This is a really cool sentence.", output);
        }
    }
    
    @Test
    public void testFormat3() throws Exception {
        String inFile = "T:\\Software Eng 2\\Lab11\\inFile4.txt";
        String outFile = "T:\\Software Eng 2\\Lab11\\outFile.txt";
        Formatter form = new Formatter();
        form.format(inFile, outFile);
        Path outPath = Paths.get(outFile);
        List<String> lines = Files.readAllLines(outPath);
        for(String output : lines){
            assertEquals("Nothing Should happen to this sentence.", output);
        }
    }
    
    @Test
    public void testFormat4() throws Exception {
        String inFile = "T:\\Software Eng 2\\Lab11\\inFile5.txt";
        String outFile = "T:\\Software Eng 2\\Lab11\\outFile.txt";
        Formatter form = new Formatter();
        form.format(inFile, outFile);
        Path outPath = Paths.get(outFile);
        List<String> lines = Files.readAllLines(outPath);
        for(String output : lines){
            assertEquals("nothingwillhappeneither.", output);
        }
    }
    
    @Test
    public void testFormat5() throws Exception {
        String inFile = "T:\\Software Eng 2\\Lab11\\inFile6.txt";
        String outFile = "T:\\Software Eng 2\\Lab11\\outFile.txt";
        Formatter form = new Formatter();
        form.format(inFile, outFile);
        Path outPath = Paths.get(outFile);
        List<String> lines = Files.readAllLines(outPath);
        for(String output : lines){
            assertEquals("Happy Halloween!", output);
        }
    }
    
    @Test
    public void testFormat6() throws Exception {
        String inFile = "T:\\Software Eng 2\\Lab11\\inFile7.txt";
        String outFile = "T:\\Software Eng 2\\Lab11\\outFile.txt";
        Formatter form = new Formatter();
        form.format(inFile, outFile);
        Path outPath = Paths.get(outFile);
        List<String> lines = Files.readAllLines(outPath);
        for(String output : lines){
            assertEquals("Echo", output);
        }
    }
}
