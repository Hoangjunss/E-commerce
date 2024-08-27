package com.baconbao.e_commerce.services.service;

import com.baconbao.e_commerce.dto.UserDTO;
import com.baconbao.e_commerce.model.User;

public interface UserService {
    UserDTO findByEmail(String email);
    UserDTO findById(Integer id);
    UserDTO deleteUser(Integer id);
    UserDTO updateUser(UserDTO userDTO);

}
