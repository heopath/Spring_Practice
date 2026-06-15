package org.example.sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dell")
public class Computer {

    // 필드 주입
    @Autowired
    private CPU cpu;

    private RAM ram;
    private SSD ssd;

    // 생성자 주입
    @Autowired
    public Computer(RAM ram){
        this.ram = ram;
    }

    @Autowired
    public void setSsd(SSD ssd){
        this.ssd = ssd;
    }

    public void show(){
        cpu.show();
        ram.show();
        ssd.show();
    }
}
