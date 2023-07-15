package com.rhyno.club.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.rhyno.club.document.Account;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {

	@Query("{club_id:'?0'}")
	public Account findItemByClubId(String name);

	@Query(value = "{club_id:'?0'}", fields = "{'pwd' : 'kiran'}")
	public List<Account> findAll(String category);
}
