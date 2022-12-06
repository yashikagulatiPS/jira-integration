package com.sapient.nissan.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
public class JiraInfo {
	   private String username;
	    private String password;
	    private String jiraConfigBaseUrl;
	    private String jiraConfigProxyUrl;
	    private String jiraConfigProxyPort;
	    private String jiraConfigAccessToken;
}
