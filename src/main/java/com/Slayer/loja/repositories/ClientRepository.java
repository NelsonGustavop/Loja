package com.Slayer.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Slayer.loja.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
