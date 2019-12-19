package com.codegym.springbootjpacustomermanagement.repository;

import com.codegym.springbootjpacustomermanagement.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends PagingAndSortingRepository<Province,Long> {
}
