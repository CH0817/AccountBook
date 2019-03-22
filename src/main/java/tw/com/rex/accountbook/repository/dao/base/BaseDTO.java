package tw.com.rex.accountbook.repository.dao.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseDTO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "create_date", nullable = false)
    private LocalDate createDate;
    @Column(name = "update_date")
    private LocalDate updateDate;

}
