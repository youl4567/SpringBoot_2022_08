package com.callor.data;

import com.callor.data.model.UserVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplV1 implements UserService {


    @Override
    public List<UserVO> selectAll() {
        return null;
    }

    @Override
    public UserVO findById(Long seq) {
        return null;
    }

    @Override
    public void insert(UserVO userVO) {

    }

    @Override
    public void update(UserVO userVO) {

    }

    @Override
    public void delete(Long seq) {

    }
}
