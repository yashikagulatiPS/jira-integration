package com.sapient.nissan.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author yasbano
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDetails {
    private String boardId;
    private String boardName;
    private String projectKey;
}