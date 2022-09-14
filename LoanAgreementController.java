package com.homeloanapp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  

import com.homeloanapp.entity.LoanAgreement;
import com.homeloanapp.services.LoanAgreementService;

@RestController
public class LoanAgreementController {
	@Autowired  
	LoanAgreementService loanAgreementService;
	
	@GetMapping("/loanAgreements")  
	private List<LoanAgreement> retriveAllLoanAgreements()  
	{  
	return loanAgreementService.retriveAllLoanAgreements();  
	}  
	
	@GetMapping("/loanAgreements/{loanAgreementid}")  
	private LoanAgreement retriveLoanAgreementById(@PathVariable("loanAgreementid") long loanAgreementid)   
	{  
	return loanAgreementService.retriveLoanAgreementById(loanAgreementid); 
	} 
	
	@DeleteMapping("/loanAgreements/{loanAgreementid}")  
	private void deleteLoanAgreement(@PathVariable("loanAgreementid") long loanAgreementid)   
	{  
		loanAgreementService.deleteLoanAgreement(loanAgreementid);  
	}  
	
	@PostMapping("/loanAgreements")  
	private long addLoanAgreement(@RequestBody LoanAgreement loanAgreement)   
	{  
	loanAgreementService.addLoanAgreement(loanAgreement);  
	return loanAgreement.getLoanAgreementId();  
	} 
	
	@PutMapping("/loanAgreements")  
	private LoanAgreement updateLoanAgreement(@RequestBody LoanAgreement loanAgreement, long loanAgreementid)   
	{  
	loanAgreementService.updateLoanAgreement(loanAgreementid, loanAgreement);  
	return loanAgreement ;  
	}  

}
