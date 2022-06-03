package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository() ;


//   test할 때마다 데이터를 지워주는 방법법
   @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");
        repository.save(member);

        Member member1 = new Member();
        member1.setName("spring");
        repository.save(member1);


        Member result = repository.findById(member1.getId()).get()  ;
        System.out.println("result = " + (result == member1));
        Assertions.assertEquals(member1,result);
    }
}
