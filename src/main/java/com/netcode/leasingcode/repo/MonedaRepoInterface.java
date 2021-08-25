package com.netcode.leasingcode.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netcode.leasingcode.model.Moneda;

@Repository
public interface MonedaRepoInterface extends JpaRepository<Moneda, Long> {

}
