package com.rhyno.club.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rhyno.club.document.Account;
import com.rhyno.club.repository.AccountRepository;

@RestController
@RequestMapping("/club")
public class ClubController {

	@Autowired
	public AccountRepository accountRepository;

	@GetMapping(value = "/all")
	public ResponseEntity<List<Account>> getAllClubs() {
		List<Account> result = (List<Account>) accountRepository.findAll();
		//Account findItemByClubId = accountRepository.findItemByClubId("B231");
//		System.out.println(findItemByClubId.toString());
		return new ResponseEntity<List<Account>>(result, HttpStatus.ACCEPTED);
	}
}
