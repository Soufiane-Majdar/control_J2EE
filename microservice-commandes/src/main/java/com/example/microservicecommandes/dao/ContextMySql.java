package com.example.microservicecommandes.dao;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Data
@Service
public class ContextMySql {
    @Autowired
    CommandesDAO commandesDAO;
}
