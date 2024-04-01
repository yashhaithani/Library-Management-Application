package com.Aithani.LibraryManagementApp.Repository;

import com.Aithani.LibraryManagementApp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{
}
