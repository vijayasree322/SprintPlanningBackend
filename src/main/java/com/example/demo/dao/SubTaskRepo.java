package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.SubTask;

public interface SubTaskRepo  extends CrudRepository<SubTask,Integer>{

//	public Iterable<PrimaryTask> deleteByTask_id(int task_id);
	
	
}