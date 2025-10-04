package com.nitinkhandelwal.JournalApp.service;
import com.nitinkhandelwal.JournalApp.entity.User;
import com.nitinkhandelwal.JournalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserDetailsServiceImplTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

//    @ParameterizedTest
//    @ArgumentsSource(UserAgrumentsProvider.class)
//    public void testSaveNewUser(User user){
//    //    User user = userRepository.findByUserName("ram");
//        assertEquals(4,2+2);
//    //    assertNotNull(userRepository.findByUserName(name));
//    //    assertTrue(!user.getJournalEntries().isEmpty());
//        assertTrue(userService.saveNewUser(user));
//    }

    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,10,12",
            "3,4,9"
    })
    public void test(int a, int b, int expected){
        assertEquals(expected,a+b);
    }

}
