package com.finacialsys.service;

import java.util.List;

import com.finacialsys.model.dto.Page;
import com.finacialsys.model.entity.ExpandGroup;

public interface ExpandGroupService {

	int establishExpandGroup(ExpandGroup expandGroup);
	
	int removeExpandGroup(int outgroupID);
	
	int editExpandGroup(ExpandGroup expandGroup);
	
	List<ExpandGroup> getExpandGroup(String userID);
	
	Page getItems(int current, String userID);
	
	ExpandGroup getOtherGroup(String userID);
}
