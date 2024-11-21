package com.issuetracker.dao;

import java.util.List;

import com.issuetracker.model.Assignee;
import com.issuetracker.model.Unit;

public class AssigneeDAOImpl implements AssigneeDAO
{
    private List<Assignee> assigneeList;

    public AssigneeDAOImpl()
    {
	super();
    }

    @Override
    public List<Assignee> fetchAssignees(Unit unit)
    {
	return null;
    }

    @Override
    public Assignee getAssigneeByEmail(String assigneeEmail)
    {
	return null;
    }

}
