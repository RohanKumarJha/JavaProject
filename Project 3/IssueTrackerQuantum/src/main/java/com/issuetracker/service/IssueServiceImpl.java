package com.issuetracker.service;

import java.util.List;
import java.util.Map;

import com.issuetracker.dao.IssueDAO;
import com.issuetracker.model.Issue;
import com.issuetracker.model.IssueReport;
import com.issuetracker.model.IssueStatus;
import com.issuetracker.validator.Validator;

public class IssueServiceImpl implements IssueService
{
    
    private AssigneeService assigneeService;
    private IssueDAO issueDAO;
    private Validator validator;

    @Override
    public String reportAnIssue(Issue issue)
    {
	return null;
    }

    @Override
    public Boolean updateStatus(String issueId, IssueStatus status)
    {
	return null;
    }

    @Override
    public List<IssueReport> showIssues(Map<Character, Object> filterCriteria)
    {
	return null;
    }
    
}
