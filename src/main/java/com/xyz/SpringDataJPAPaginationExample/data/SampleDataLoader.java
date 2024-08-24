package com.xyz.SpringDataJPAPaginationExample.data;

import com.xyz.SpringDataJPAPaginationExample.model.Firm;
import com.xyz.SpringDataJPAPaginationExample.service.FirmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleDataLoader implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(SampleDataLoader.class);

    @Autowired
    private FirmService service;

    @Override
    public void run(String... args) throws Exception {
        logger.info("loading sample data");
        Firm firm = new Firm();
        firm.setCompanyName("Rooney");
        firm.setPhoneNumber(1234555);
        service.saveData(firm);
    }
}
