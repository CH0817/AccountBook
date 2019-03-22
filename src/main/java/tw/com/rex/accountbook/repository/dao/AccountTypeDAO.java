package tw.com.rex.accountbook.repository.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import tw.com.rex.accountbook.repository.dao.base.BaseDAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account_type")
public class AccountTypeDAO extends BaseDAO {

    @NonNull
    @Column(name = "name", unique = true, nullable = false, length = 10)
    private String name;

}
