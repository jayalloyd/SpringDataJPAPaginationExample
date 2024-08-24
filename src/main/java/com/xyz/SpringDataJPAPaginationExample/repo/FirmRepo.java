package com.xyz.SpringDataJPAPaginationExample.repo;

import com.xyz.SpringDataJPAPaginationExample.model.Firm;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirmRepo extends PagingAndSortingRepository<Firm, Integer> {

    Firm save(Firm firm);
}
