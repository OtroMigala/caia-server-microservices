package com.solidos.caia.reviewers.presentation.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solidos.caia.reviewers.application.dtos.SendInvitationDto;
import com.solidos.caia.reviewers.application.services.ReviewInvitationService;
import com.solidos.caia.reviewers.utils.CommonResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/invitations")
public class ReviewInvitationController {
  private final ReviewInvitationService reviewInvitationService;

  public ReviewInvitationController(ReviewInvitationService reviewInvitationService) {
    this.reviewInvitationService = reviewInvitationService;
  }

  @PostMapping("send")
  public ResponseEntity<CommonResponse<Void>> sendInvitaion(
      @RequestBody @Validated SendInvitationDto sendInvitationDto) {
    reviewInvitationService.sendInvitaion(sendInvitationDto);

    return ResponseEntity.ok(CommonResponse.success("Invitation sent successfully"));
  }

}
