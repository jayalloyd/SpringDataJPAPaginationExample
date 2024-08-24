package com.xyz.SpringDataJPAPaginationExample.controller;

import com.xyz.SpringDataJPAPaginationExample.model.Firm;
import com.xyz.SpringDataJPAPaginationExample.service.FirmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirmController {
    @Autowired
    private FirmService service;

    @PostMapping("/home")
    public Firm saveFirm(@RequestBody Firm firm){
        return service.saveData(firm);
    }

    @GetMapping("/firms")
    public Page<Firm> findAll(@RequestParam int page, @RequestParam int size) {
        PageRequest pr = PageRequest.of(page, size);
        return service.findAllFirms(pr);
    }
}
