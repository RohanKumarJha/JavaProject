package com.issuetracker.dao;

import java.util.List;

import com.issuetracker.model.Issue;
import com.issuetracker.model.IssueStatus;

public class IssueDAOImpl implements IssueDAO
{
    
    private List<Issue> issueList;

    @Override
    public String reportAnIssue(Issue issue)
    {
	return null;
    }

    @Override
    public void updateStatus(Issue issue, IssueStatus status)
    {
	
    }

    @Override
    public Issue getIssueById(String issueId)
    {
	return null;
    }

    @Override
    public List<Issue> getIssueList()
    {
	return null;
    }

    @Override
    public void setIssueList(List<Issue> issueList)
    {
	
    }

}
