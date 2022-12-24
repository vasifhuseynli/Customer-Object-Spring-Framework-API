package com.orient.customerobjectbalance.repository;

import com.orient.customerobjectbalance.model.CustomerObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerObjectRepository extends JpaRepository<CustomerObject,Long> {
}
