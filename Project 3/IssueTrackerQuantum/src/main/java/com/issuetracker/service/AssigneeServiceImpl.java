package com.issuetracker.service;

import java.util.List;

import com.issuetracker.dao.AssigneeDAO;
import com.issuetracker.model.Assignee;
import com.issuetracker.model.Unit;

public class AssigneeServiceImpl implements AssigneeService 
{
    private AssigneeDAO assigneeDAO;

    @Override
    public List<Assignee> fetchAssignee(Unit unit)
    {
	return null;
    }

    @Override
    public void updateActiveIssueCount(String assigneeEmail, Character operation)
    {
	
    }

}
