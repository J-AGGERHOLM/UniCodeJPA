package org.example.unicodejpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {


    // http://localhost:8080/unicode/97
    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i){
        char c = (char)i;
        return "unicode =" + i + "char = " +c;

    }

    // http://localhost:8080/char/j
    @GetMapping("/char/{i}")
    public String charToUnicode(@PathVariable char i){
        int unicode = (char)i;
        return "char = " + i + " unicode = " + unicode;
    }

}
