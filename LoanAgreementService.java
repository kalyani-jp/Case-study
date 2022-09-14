package com.homeloanapp.services;

import java.util.List;    
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloanapp.repositories.IHomeLoanAgreementRepository;
import com.homeloanapp.entity.LoanAgreement;

@Service
public class LoanAgreementService implements ILoanAgreementService{

	@Autowired
	IHomeLoanAgreementRepository loanAgreementRepository;

	@Override
	public LoanAgreement addLoanAgreement(LoanAgreement loanAgreement) {
		// TODO Auto-generated method stub
		//LoanAgreement loanAgreement = new LoanAgreement();
		return loanAgreementRepository.save(loanAgreement);
	}

	@Override
	public LoanAgreement updateLoanAgreement(long loanAgreementId, LoanAgreement loanAgreement) {
		// TODO Auto-generated method stub
		loanAgreementRepository.findById(loanAgreementId);
		return loanAgreementRepository.save(loanAgreement);
	}

	@Override
	public LoanAgreement deleteLoanAgreement(long loanAgreementId) {
		LoanAgreement loanAgreement = retriveLoanAgreementById(loanAgreementId);
		loanAgreementRepository.deleteById(loanAgreementId);
		return loanAgreement;
	}

	@Override
	public LoanAgreement retriveLoanAgreementById(long loanAgreementId) {
		// TODO Auto-generated method stub
		return loanAgreementRepository.findByLoanAgreementId(loanAgreementId);
	}

	@Override
	public List<LoanAgreement> retriveAllLoanAgreements() {
		// TODO Auto-generated method stub
		return loanAgreementRepository.findAll();
	}

}