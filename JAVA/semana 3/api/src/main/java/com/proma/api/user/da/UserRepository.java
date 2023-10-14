package com.proma.api.user.da;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proma.api.user.dto.UserDto;

public interface UserRepository extends JpaRepository<UserDto, Long> {}