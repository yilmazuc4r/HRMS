package HRMSBackend.HRMS.Core.Utilities.CandidateValidations;

import org.springframework.stereotype.Service;

import HRMSBackend.HRMS.Entities.concrete.Candidate;
@Service
public class EmailValidator {
	public boolean IsEmailVerified(Candidate candidates) {

		return true;

	}
}
