package com.baconbao.e_commerce.responsitory;

import com.baconbao.e_commerce.model.Messenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessengerRepository extends JpaRepository<Messenger,Integer> {
}
