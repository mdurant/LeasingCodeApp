package com.netcode.leasingcode.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netcode.leasingcode.model.Empresa;

@Repository
public interface EmpresaRepoInterface extends JpaRepository<Empresa, Long> {

}
