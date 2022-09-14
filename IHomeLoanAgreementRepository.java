package com.homeloanapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeloanapp.entity.LoanAgreement;

public interface IHomeLoanAgreementRepository extends JpaRepository<LoanAgreement, Long> {

	LoanAgreement findByLoanAgreementId(long loanAgreementId);

}
