package com.consultitnow.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consultitnow.app.entity.Client;

public interface IClientDao extends JpaRepository<Client, Long> {

}
