package tk.etl.mapper;

import tk.etl.entry.Person;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapper {

    @Select("select * from Person where name=#{name}")
    Person selectPerson(String name);
}
