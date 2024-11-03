package com.aljosasolak.clientwebapp.repository;

import com.aljosasolak.clientwebapp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    public Client findByEmail(String email);
}
