package tw.com.rex.accountbook.repository.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tw.com.rex.accountbook.repository.dao.base.BaseDAO;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transaction")
public class TransactionDAO extends BaseDAO {

    @Transient
    private AccountDAO accountDTO;
    @Transient
    private ItemDAO item;
    @Column(name = "note", length = 150)
    private String note;
    @Column(name = "transact_date", nullable = false)
    private Date transactDate;

}
