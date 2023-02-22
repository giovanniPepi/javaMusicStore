package org.example.controller;

import org.example.model.Instrument;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/catalog")
@RestController
public class InstrumentController {
    @GetMapping("/oi")
    public String teste() {
        return "oi";
    }
    @GetMapping("/oi2")
    public String teste2() {
        return "oi2";
    }

    @PostMapping
    public String create(@RequestBody Instrument blabla) {
        System.out.println(blabla.toString());
        return "oi";
    }
}                    
