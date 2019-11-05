package tk.etl.service;

import tk.etl.entry.Person;
import tk.etl.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonMapper personMapper;

    public Person selectMapper(String name){
        return personMapper.selectPerson(name);
    }
}
