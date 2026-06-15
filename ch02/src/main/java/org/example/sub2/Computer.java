package org.example.sub2;

import org.springframework.stereotype.Component;

@Component("dell")
public class Computer {
    private CPU cpu;
    private RAM ram;
    private SSD ssd;

    public void show(){
        cpu.show();
        ram.show();
        ssd.show();
    }
}
