package com.issuetracker.service;

import java.util.List;
import java.util.Map;

import com.issuetracker.model.Issue;
import com.issuetracker.model.IssueReport;
import com.issuetracker.model.IssueStatus;

public interface IssueService
{
    String reportAnIssue(Issue issue);
    Boolean updateStatus(String issueId,IssueStatus status);
    List<IssueReport> showIssues(Map<Character,Object> filterCriteria);
}
