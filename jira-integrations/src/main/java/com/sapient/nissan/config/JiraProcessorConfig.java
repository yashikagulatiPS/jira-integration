package com.sapient.nissan.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * Bean to hold settings specific to the Feature collector.
 */

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "jira")
public class JiraProcessorConfig {

	private String cron;
	private int pageSize;
	private String startDate;
	private long minsToReduce;
	private String jiraBackLogStatusFlow;
	private String jsonFileName;
	private String customApiBaseUrl;
	private Integer socketTimeOut;
	private String estimationCriteria;
	private int threadPoolSize;
	@Value("${aesEncryptionKey}")
	private String aesEncryptionKey;
	private String jiraCloudGetUserApi;
	private String jiraServerGetUserApi;
	private boolean fetchMetadata;
	private List<String> excludeLinks;
	private String sprintJsonFileName;
	private List<String> rcaValuesForCodeIssue;
	private Integer sprintCountForCacheClean;
	private String jiraCloudSprintReportApi;
	private String jiraServerSprintReportApi;
	private String jiraDirectTicketLinkKey;
	private String jiraCloudDirectTicketLinkKey;
	private String jiraSprintByBoardUrlApi;
	private String jiraEpicApi;
	private Integer sprintReportCountToBeFetched;
	private boolean considerStartDate;

}
