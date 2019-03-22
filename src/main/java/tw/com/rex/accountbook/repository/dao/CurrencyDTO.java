package tw.com.rex.accountbook.repository.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tw.com.rex.accountbook.repository.dao.base.BaseDTO;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "currency")
public class CurrencyDTO extends BaseDTO {

    @Column(name = "name", unique = true, nullable = false, length = 10)
    private String name;

}
