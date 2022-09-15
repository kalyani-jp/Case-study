package com.homeloanapp.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeloanapp.entity.LoanAgreement;

public interface IHomeLoanAgreementRepository extends JpaRepository<LoanAgreement, Long> {

	 public Optional<LoanAgreement> findByLoanAgreementId(long loanAgreementId);

}
