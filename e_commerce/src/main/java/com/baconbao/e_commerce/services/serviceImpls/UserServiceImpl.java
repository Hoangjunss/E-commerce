package com.baconbao.e_commerce.services.serviceImpls;

import com.baconbao.e_commerce.dto.UserDTO;
import com.baconbao.e_commerce.model.User;
import com.baconbao.e_commerce.responsitory.UserRepository;
import com.baconbao.e_commerce.services.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;



    @Override
    public UserDTO findByEmail(String email) {
        return covertToDTO(userRepository.findByEmail(email));
    }

    @Override
    public UserDTO findById(Integer id) {
        return covertToDTO(userRepository.findById(id).orElseThrow());
    }

    @Override
    public UserDTO deleteUser(Integer id) {
        return covertToDTO(userRepository.findById(id).orElseThrow());
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        return covertToDTO(userRepository.save(covertToModel(userDTO)));
    }

    public UserDTO covertToDTO(User user) {
        return modelMapper.map(user, UserDTO.class);
    }

    public User covertToModel(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }

}
