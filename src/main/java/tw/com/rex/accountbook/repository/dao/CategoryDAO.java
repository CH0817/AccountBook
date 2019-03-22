package tw.com.rex.accountbook.repository.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tw.com.rex.accountbook.repository.dao.base.BaseDAO;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category")
public class CategoryDAO extends BaseDAO {

    @Column(name = "name", unique = true, nullable = false, length = 10)
    private String name;
    @Column(name = "category_type", nullable = false)
    private Integer categoryType;

}
