package com.muo.commuciate.comm.dto;

import com.muo.commuciate.comm.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private String viewCount;
    private String commentCount;
    private String likeCount;
    private User user;
}
