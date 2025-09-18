package com.aischool.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aischool.web.domain.Cloudtest;

@Repository
public interface CloudtestRepository extends JpaRepository<Cloudtest, Long> {

}
