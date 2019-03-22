package tw.com.rex.accountbook.repository.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tw.com.rex.accountbook.repository.dao.base.BaseDAO;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transaction")
public class TransactionDAO extends BaseDAO {

    @ManyToOne(targetEntity = AccountDAO.class)
    @JoinColumn(name = "account_id", nullable = false)
    private AccountDAO accountDTO;
    @ManyToOne(targetEntity = ItemDAO.class)
    @JoinColumn(name = "item_id", nullable = false)
    private ItemDAO item;
    @Column(name = "note", length = 150)
    private String note;
    @Column(name = "transact_date", nullable = false)
    private LocalDate transactDate;

}
