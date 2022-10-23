package com.Slayer.loja.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Slayer.loja.repositories.ClientRepository;

@Service
public class ClientService {
	@Autowired
	private ClientRepository Repo;
}
