package tw.com.rex.accountbook.repository.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", unique = true, nullable = false, length = 10)
    private String name;
    @Transient
    private AccountType accountType;
    @Transient
    private Currency currency;
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
