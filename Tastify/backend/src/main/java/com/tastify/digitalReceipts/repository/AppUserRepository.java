package com.tastify.digitalReceipts.repository;

import com.tastify.digitalReceipts.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
