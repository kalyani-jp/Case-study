package com.homeloanapp.services;

import java.util.List;   

import com.homeloanapp.entity.LoanAgreement;

public interface ILoanAgreementService{
	public LoanAgreement addLoanAgreement(LoanAgreement loanAgreement) ;
	public LoanAgreement updateLoanAgreement(long loanAgreementId, LoanAgreement loanAgreement);
	public LoanAgreement deleteLoanAgreement(long loanAgreementId);
	public LoanAgreement retriveLoanAgreementById(long loanAgreementId);
	public List<LoanAgreement> retriveAllLoanAgreements();
}
