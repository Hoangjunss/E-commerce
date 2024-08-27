package com.baconbao.e_commerce.services.serviceImpls;

import com.baconbao.e_commerce.dto.MessengerDTO;
import com.baconbao.e_commerce.model.Messenger;
import com.baconbao.e_commerce.responsitory.MessengerRepository;
import com.baconbao.e_commerce.services.service.MessengerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class MessengerServiceImpl implements MessengerService {
    @Autowired
    private MessengerRepository messengerRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<MessengerDTO> getAllMessages() {
        return null;
    }
    private MessengerDTO convertToDTO(Messenger messenger){
        return modelMapper.map(messenger, MessengerDTO.class);
    }
    private List<MessengerDTO> convertToDTOList(List<Messenger> messengers){
        return messengers.stream()
                .map(messenger -> convertToDTO(messenger))
                .collect(Collectors.toList());
    }
}
