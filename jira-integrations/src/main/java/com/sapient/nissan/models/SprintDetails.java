package com.sapient.nissan.models;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Document(collection = "sprint_details")
public class SprintDetails extends BasicModel {

	public static final String SPRINT_STATE_CLOSED = "CLOSED";
	public static final String SPRINT_STATE_ACTIVE = "ACTIVE";
	public static final String SPRINT_STATE_FUTURE = "FUTURE";

	private String sprintID;
	private String sprintName;
	private String originalSprintId;
	private String state;
	private String startDate;
	private String endDate;
	private String completeDate;
	private String activatedDate;
//	private List<String> originBoardId;
//	private String goal;
//	private ObjectId basicProjectConfigId;
//	private ObjectId processorId;
//	private Set<SprintIssue> completedIssues;
//	private Set<SprintIssue> notCompletedIssues;
//	private Set<SprintIssue> puntedIssues;
//	private Set<SprintIssue> completedIssuesAnotherSprint;
//	private Set<String> addedIssues;
//	private Set<SprintIssue> totalIssues;
//	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SprintDetails sprintDetails = (SprintDetails) o;
		return Objects.equals(sprintID, sprintDetails.sprintID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sprintID);
	}

}
