package tw.com.rex.accountbook.repository.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "email", unique = true, nullable = false, length = 30)
    private String email;
    @Column(name = "password", nullable = false, length = 32)
    private String password;
    @Column(name = "create_date", nullable = false)
    private Date createDate;
    @Column(name = "update_date", nullable = false)
    private Date updateDate;

}
