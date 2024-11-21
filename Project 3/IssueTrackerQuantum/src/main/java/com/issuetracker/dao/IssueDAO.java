package com.issuetracker.dao;

import java.util.List;

import com.issuetracker.model.Issue;
import com.issuetracker.model.IssueStatus;

public interface IssueDAO
{
    String reportAnIssue(Issue issue);
    void updateStatus(Issue issue,IssueStatus status);
    Issue getIssueById(String issueId);
    List<Issue>getIssueList();
    void setIssueList(List<Issue> issueList);
}
