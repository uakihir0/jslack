package com.github.seratch.jslack.app_backend.dialogs.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * see https://api.slack.com/dialogs
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DialogSubmissionErrorResponse {

    private List<Error> errors;

}
