package com.callor.data.persistence;

import com.callor.data.model.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserVO, Long> {


}
