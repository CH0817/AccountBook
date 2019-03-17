package tw.com.rex.accountbook.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tw.com.rex.accountbook.dao.UserRepository;
import tw.com.rex.accountbook.model.User;
import tw.com.rex.accountbook.service.UserService;

import java.util.Date;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User register(User user) throws Exception {
        if (!isEmailExists(user.getEmail())) {
            Date today = new Date();
            user.setCreateDate(today);
            user.setUpdateDate(today);
            user = userRepository.save(user);
            logger.info("saved user: {}", user);
            return user;
        }
        return user;
    }

    private boolean isEmailExists(String email) {
        return userRepository.countByEmail(email) > 0;
    }

}
