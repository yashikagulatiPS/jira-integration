package com.sapient.nissan.adapter;

import java.util.List;

import com.atlassian.jira.rest.client.api.domain.Field;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.jira.rest.client.api.domain.IssueType;
import com.atlassian.jira.rest.client.api.domain.IssuelinksType;
import com.atlassian.jira.rest.client.api.domain.SearchResult;
import com.atlassian.jira.rest.client.api.domain.Status;
import com.atlassian.jira.rest.client.api.domain.Version;
//import com.publicissapient.kpidashboard.common.model.jira.SprintDetails;
//import com.publicissapient.kpidashboard.jira.model.ProjectConfFieldMapping;
import com.sapient.nissan.models.BoardDetails;

public interface JiraAdapter {
	/**
	 * Gets all issues from JIRA
	 *
	 * @param boardDetails
	 * 			  boardDetails
	 * @param projectConfig
	 *            projectConfig Object
	 * @param startDateTimeByIssueType
	 *            map of start dataTime of issue types
	 * @param userTimeZone
	 *            user timezone
	 * @param pageStart
	 *            page start
	 * @param dataExist
	 *            data exist in db or not
	 * @return list of issues
	 */
//	SearchResult getIssues(BoardDetails boardDetails, ProjectConfFieldMapping projectConfig, String startDateTimeByIssueType,
//						   String userTimeZone, int pageStart, boolean dataExist);
//	/**
//	 * Gets page size from feature settings
//	 *
//	 * @return pageSize
//	 */
//	int getPageSize();
//
//	/**
//	 * Gets the timeZone of user who is logged in jira
//	 *
//	 * @param projectConfig
//	 *            user provided project configuration
//	 * @return String of UserTimeZone
//	 */
//
//	String getUserTimeZone(ProjectConfFieldMapping projectConfig);
//
//	/**
//	 * Gets the project versions for user who is logged in jira
//	 *
//	 * @param projectKey
//	 *            the project key
//	 * @return list of versions
//	 */
//	List<Version> getVersions(String projectKey);
//
//	/**
//	 * Gets the field used on a jira instance.
//	 *
//	 * @return the field
//	 */
//	public List<Field> getField();
//
//	/**
//	 * Gets the issue type.
//	 *
//	 * @return the issue type
//	 */
//	public List<IssueType> getIssueType();
//
//	/**
//	 * Gets the status.
//	 *
//	 * @return the status
//	 */
//	public List<Status> getStatus();
//
//	/**
//	 * Gets the issue link types.
//	 *
//	 * @return the issue link types
//	 */
//	public List<IssuelinksType> getIssueLinkTypes();
//
//	/*
//	 * Gets Sprint report data
//	 * 
//	 * @param ProjectConfFieldMapping projectConfig object
//	 * 
//	 * @param String sprintId
//	 * 
//	 * @param String boardId
//	 * 
//	 * @param SprintDetails sprintdetails object
//	 */
//	public void getSprintReport(ProjectConfFieldMapping projectConfig, String sprintId, String boardId,
//			SprintDetails sprint, SprintDetails dbSprintDetails);
//
//	List<Issue> getEpic(ProjectConfFieldMapping projectConfig, String boardId);
//
//
}
