package com.issuetracker.dao;

import java.util.List;

import com.issuetracker.model.Assignee;
import com.issuetracker.model.Unit;

public interface AssigneeDAO
{
    List<Assignee> fetchAssignees(Unit unit);
    Assignee getAssigneeByEmail(String assigneeEmail);
}
