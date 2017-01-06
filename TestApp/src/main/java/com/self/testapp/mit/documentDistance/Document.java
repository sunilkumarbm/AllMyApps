/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.testapp.mit.documentDistance;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author sunil
 */
public class Document {
    private String content;
//    private String []words;
    
    public Document (String content) {
        if (content != null) {
            this.content = content;
//            this.words = content.split(" ");
        }
    }
    
    public Document (File file) {
        if (file != null) {
            
        }
    }
    
    public String getContent () {
        return this.content;
    }
    
    public List<String> getWords () {
        return Arrays.asList(this.content.split("\\s+"));
    }
    
    public Map getWordCount () {
        return this.getWords().stream().collect(Collectors.groupingBy(String::toLowerCase,
                                                 Collectors.summingInt(s -> 1)));
        
//        return wordCount;
    }
    
    public int compare (Document document2) {
        int distance = 0;
        
        Map <String, Integer>m1 = this.getWordCount();
        Map <String, Integer>m2 = document2.getWordCount();
        
        for(String word: m1.keySet()) {
            distance += (int)m1.getOrDefault(word, 0) * (int)m2.getOrDefault(word, 0);
        }
        
//        m1.keySet().stream().map(word -> distance += (int)m1.get(word) * (int)m2.get(word));
        
//        distance = m1.keySet().stream().map(word -> (int)m1.get(word) * (int)m2.get(word)).reduce(0, (a,b) -> (int)a+(int)b);
        
        return distance;
    }
}
