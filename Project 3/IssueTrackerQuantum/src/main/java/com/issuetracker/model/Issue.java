package com.issuetracker.model;

import java.time.LocalDate;

public class Issue
{
    private String issueId;
    private String issueDescription;
    private Unit IssueUnit;
    private LocalDate reportedOn;
    private LocalDate updatedOn;
    private String assignEmail;
    private IssueStatus status;
    
    public Issue(String issueId, String issueDescription, Unit issueUnit,LocalDate reportedOn, LocalDate updatedOn, String assignEmail, IssueStatus status)
    {
	super();
	this.issueId = issueId;
	this.issueDescription = issueDescription;
	IssueUnit = issueUnit;
	this.reportedOn = reportedOn;
	this.updatedOn = updatedOn;
	this.assignEmail = assignEmail;
	this.status = status;
    }

    public String getIssueId()
    {
        return issueId;
    }
    public void setIssueId(String issueId)
    {
        this.issueId = issueId;
    }

    public String getIssueDescription()
    {
        return issueDescription;
    }
    public void setIssueDescription(String issueDescription)
    {
        this.issueDescription = issueDescription;
    }

    public Unit getIssueUnit()
    {
        return IssueUnit;
    }
    public void setIssueUnit(Unit issueUnit)
    {
        IssueUnit = issueUnit;
    }

    public LocalDate getReportedOn()
    {
        return reportedOn;
    }
    public void setReportedOn(LocalDate reportedOn)
    {
        this.reportedOn = reportedOn;
    }

    public LocalDate getUpdatedOn()
    {
        return updatedOn;
    }
    public void setUpdatedOn(LocalDate updatedOn)
    {
        this.updatedOn = updatedOn;
    }

    public String getAssignEmail()
    {
        return assignEmail;
    }
    public void setAssignEmail(String assignEmail)
    {
        this.assignEmail = assignEmail;
    }

    public IssueStatus getStatus()
    {
        return status;
    }
    public void setStatus(IssueStatus status)
    {
        this.status = status;
    }
    
    
}
