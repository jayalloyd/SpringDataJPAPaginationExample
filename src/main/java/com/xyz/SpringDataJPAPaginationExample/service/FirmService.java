package com.xyz.SpringDataJPAPaginationExample.service;

import com.xyz.SpringDataJPAPaginationExample.model.Firm;
import com.xyz.SpringDataJPAPaginationExample.repo.FirmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class FirmService {
    @Autowired
    private FirmRepo repo;

    public Firm saveData(Firm firm) {
        return repo.save(firm);
    }

    public Page<Firm> findAllFirms(PageRequest pageRequest) {
        //pagination support  PageRequest pr = PageRequest.of(page,size);
//sample  code public Page<Person> findAll(@RequestParam int page, @RequestParam int size) {
//        PageRequest pr = PageRequest.of(page,size);
//        return repository.findAll(pr);
//    }
        return repo.findAll(pageRequest);
    }
}
