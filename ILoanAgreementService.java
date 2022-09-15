package com.homeloanapp.services;

import java.util.List;   

import com.homeloanapp.entity.LoanAgreement;
import com.homeloanapp.exception.InvalidLoanAgreementException;

public interface ILoanAgreementService{
	public LoanAgreement addLoanAgreement(LoanAgreement loanAgreement) ;
	public LoanAgreement updateLoanAgreement(long loanAgreementId, LoanAgreement loanAgreement) throws InvalidLoanAgreementException;;
	public LoanAgreement deleteLoanAgreement(long loanAgreementId) throws InvalidLoanAgreementException;
	public LoanAgreement retriveLoanAgreementById(long loanAgreementId) throws InvalidLoanAgreementException;
	public List<LoanAgreement> retriveAllLoanAgreements();
}
