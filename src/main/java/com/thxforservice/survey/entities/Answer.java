package com.thxforservice.survey.entities;

import com.thxforservice.global.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import com.thxforservice.survey.constants.SurveyType;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@Entity
@Builder
@AllArgsConstructor @NoArgsConstructor
public class Answer extends BaseEntity {

    @Id @GeneratedValue
    private Long resultId; // 검사 결과 일련번호

    @Column(length = 80)
    private String email; //km 추가

    @Column(length=30)
    private String username; //km 추가

    @Column(length = 10)
    private Long score; // 검사 점수

    private LocalDateTime testDate; // 검사 날짜

    @Enumerated(EnumType.STRING)
    @Column(length=30)
    private SurveyType testType;

    @Lob
    private String questionAndAnswer; // 질문번호+응답번호(객관식)을 JSON으로 받음

    @Transient
    private Map<Long, Integer> _questionAndAnswer;

    @Transient
    private Map<String, String> result;
}