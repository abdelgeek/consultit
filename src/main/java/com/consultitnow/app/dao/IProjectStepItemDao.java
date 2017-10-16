package com.consultitnow.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consultitnow.app.entity.ProjectStepItem;

public interface IProjectStepItemDao extends JpaRepository<ProjectStepItem, Long> {

}
