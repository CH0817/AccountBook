package tw.com.rex.accountbook.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tw.com.rex.accountbook.model.User;
import tw.com.rex.accountbook.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Override
    public Long register(User user) throws Exception {
        return null;
    }

}
