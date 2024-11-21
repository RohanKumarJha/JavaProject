package com.issuetracker.validator;

import java.time.LocalDate;

import com.issuetracker.exception.IssueTrackerException;
import com.issuetracker.model.Issue;
import com.issuetracker.model.IssueStatus;

public class Validator
{
    public void validate(Issue issue) throws IssueTrackerException {
	
    }
    
    public Boolean isValidIssueId(String issueId) 
    {
	String regex = "^MTI-I-\\d{3}(?!(000)$)[-](LS|MS|HS)$";
	if(issueId.matches(regex)) return true;
	return false;
    }
    
    public Boolean isValidIssueDescription(String issueDescription)
    {
//	String regex = "^(?!^[ \t]+$)[a-zA-Z]+([ ]+[a-zA-Z]+){0-49}$";
//	if(issueDescription.matches(regex)) return true;
   	return false;
    }

    public Boolean isValidReportedOn(LocalDate reportedOn)
    {
   	return null;
    }

    public Boolean isValidStatus(IssueStatus status)
    {
   	return null;
    }
}
