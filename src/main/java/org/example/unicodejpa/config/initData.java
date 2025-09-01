package org.example.unicodejpa.config;

import org.example.unicodejpa.model.Unicode;
import org.example.unicodejpa.repository.unicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class initData implements CommandLineRunner {

    @Autowired
    private unicodeRepository unicodeRepository;

    public void saveUnitCode(char letter) {
        Unicode unicode = new Unicode();
        unicode.setLetter(letter);
        unicode.setDescription("the letter "+letter);
        unicode.setUnicode(letter);
        unicodeRepository.save(unicode);
    }


    @Override
    public void run(String... args) throws Exception {

        saveUnitCode('A');
        saveUnitCode('B');
        saveUnitCode('C');
        saveUnitCode('D');


    }
}
