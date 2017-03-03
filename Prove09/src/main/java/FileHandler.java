/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileHandler{

    private String fileName;
    private String username;

    public FileHandler(String fileName, String username) { this.fileName = fileName; this.username = username; }

    public String getFileName() { return fileName; }

    public void setFileName(String fileName) { this.fileName = fileName; }
    
    public String getUserName() { return username;}
    
    public void setUserName(String username) {this.username = username;}

public void addPost(String post, String user) {
    try {
        Date now = new Date();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(getFileName(), true))) {
            writer.write(now.toString() + " " + user + ": " + post + "\n");
        }
    } catch (IOException e) {
    }
}

public List<String> getPosts() {

    List<String> list = new ArrayList<String>();

    try {
        BufferedReader reader = new BufferedReader(new FileReader(getFileName()));

        String line;
        while ((line = reader.readLine()) != null) {
            list.add(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    return list;
    }

}