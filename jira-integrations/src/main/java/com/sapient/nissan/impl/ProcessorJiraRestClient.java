package com.sapient.nissan.impl;

public interface ProcessorJiraRestClient extends JiraRestClient {
    /**
     * Gets Processor Search Client
     *
     * @return the com.atlassian.jira.rest.client.api handling search (e.g. JQL)
     */
    SearchRestClient getProcessorSearchClient();

    CustomAsynchronousIssueRestClient getCustomIssueClient();

    }
