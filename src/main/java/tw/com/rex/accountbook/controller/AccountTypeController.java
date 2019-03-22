package tw.com.rex.accountbook.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.com.rex.accountbook.repository.dao.AccountTypeDAO;
import tw.com.rex.accountbook.service.AccountTypeService;

@RestController
@RequestMapping("/accountType")
public class AccountTypeController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private AccountTypeService accountTypeService;

    @Autowired
    public AccountTypeController(AccountTypeService accountTypeService) {
        this.accountTypeService = accountTypeService;
    }

    @GetMapping("/find/name/{name}")
    public AccountTypeDAO findByName(@PathVariable String name) {
        logger.info("input name: {}", name);
        return accountTypeService.findByName(name);
    }

}
