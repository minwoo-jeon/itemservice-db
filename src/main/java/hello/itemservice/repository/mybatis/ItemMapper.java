package hello.itemservice.repository.mybatis;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;


import java.util.List;
import java.util.Optional;

//@Mapper // 붙여줘야 myBatis에서 인식을함
//public interface ItemMapper {
//    void save(Item item); //인터페이스의 메서드를 호출하면 xml의 해당 sql을 실행한다
//
//    void update(@Param("id") Long id , @Param("updateParam")ItemUpdateDto updateParam);
//
//    List<Item> findAll(ItemSearchCond itemSearchCond);
//
//    Optional<Item> findById(Long id);
//}
