package com.coviam.reimbursement.claims.service.api;

import com.coviam.reimbursement.claims.entity.Status;

public interface StatusService {

    Status findByStatusCode(String statusCode);
}