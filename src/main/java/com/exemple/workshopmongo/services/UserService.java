package com.exemple.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.workshopmongo.domain.User;
import com.exemple.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll(){ // Retorna do BD todos os objetos do tipo usuário
		return repo.findAll();
	}
}
