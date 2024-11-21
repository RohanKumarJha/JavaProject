package com.issuetracker.service;

import java.util.List;

import com.issuetracker.model.Assignee;
import com.issuetracker.model.Unit;

public interface AssigneeService
{
    List<Assignee> fetchAssignee(Unit unit);
    void updateActiveIssueCount(String assigneeEmail,Character operation);
}
