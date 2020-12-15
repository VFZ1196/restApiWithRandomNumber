package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.MultipleParam;
@Repository
public interface MultipleParamRepository extends JpaRepository<MultipleParam, Long>{

}
