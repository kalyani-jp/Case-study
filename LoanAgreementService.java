package com.homeloanapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloanapp.repositories.IHomeLoanAgreementRepository;
import com.homeloanapp.entity.LoanAgreement;
import com.homeloanapp.exception.InvalidLoanAgreementException;

@Service
public class LoanAgreementService implements ILoanAgreementService{

	@Autowired
	IHomeLoanAgreementRepository loanAgreementRepository;

	@Override
	public LoanAgreement addLoanAgreement(LoanAgreement loanAgreement) {
		//LoanAgreement loanAgreement = new LoanAgreement();
		return loanAgreementRepository.save(loanAgreement);
	}

	@Override
	public LoanAgreement updateLoanAgreement(long loanAgreementId, LoanAgreement loanAgreement)throws InvalidLoanAgreementException {
		loanAgreementRepository.findById(loanAgreementId).orElseThrow(() -> new InvalidLoanAgreementException("Loan Agreement Not Found!"));
        return loanAgreementRepository.save(loanAgreement);
 }
  

	@Override
	public LoanAgreement deleteLoanAgreement(long loanAgreementId) throws InvalidLoanAgreementException{
		LoanAgreement loanAgreement = retriveLoanAgreementById(loanAgreementId);
		loanAgreementRepository.deleteById(loanAgreementId);
		return loanAgreement;
	}

	@Override
	public LoanAgreement retriveLoanAgreementById(long loanAgreementId)throws InvalidLoanAgreementException {
		return loanAgreementRepository.findByLoanAgreementId(loanAgreementId).orElseThrow(() -> new InvalidLoanAgreementException("Loan Agreement Not Found!"));
	}

	@Override
	public List<LoanAgreement> retriveAllLoanAgreements() {
		return loanAgreementRepository.findAll();
	}

}
