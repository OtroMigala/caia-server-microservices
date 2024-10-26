package com.solidos.caia.reviewers.application.mappers;

import com.solidos.caia.reviewers.application.dtos.SendInvitationDto;
import com.solidos.caia.reviewers.domain.entities.ReviewInvitation;
import com.solidos.caia.reviewers.domain.valueobjects.InvitationId;

public class ReviewInvitationMapper {
  public static ReviewInvitation dtoToDomain(SendInvitationDto dto) {
    InvitationId id = InvitationId.builder()
        .userId(dto.getUserId())
        .conferenceId(dto.getConferenceId())
        .build();

    return ReviewInvitation.builder()
        .id(id)
        .message(dto.getMessage())
        .build();
  }
}
