package tw.com.rex.accountbook.repository.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tw.com.rex.accountbook.repository.dao.base.BaseDTO;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class AccountDTO extends BaseDTO {

    @Column(name = "name", unique = true, nullable = false, length = 10)
    private String name;
    @Transient
    private AccountTypeDTO accountType;
    @Transient
    private CurrencyDTO currency;
    @Column(name = "init_money", nullable = false)
    private BigDecimal initMoney;
    @Column(name = "current_money", nullable = false)
    private BigDecimal currentMoney;
    @Column(name = "closing_date")
    private Date closingDate;
    @Column(name = "payment_due_date")
    private Date paymentDueDate;
    @Column(name = "note", length = 150)
    private String note;

}
