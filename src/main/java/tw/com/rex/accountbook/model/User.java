package tw.com.rex.accountbook.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
// @RequiredArgsConstructor(staticName = "of")
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "email", length = 30, nullable = false)
    private String email;
    @Column(name = "password", length = 12, nullable = false)
    private String password;
    @Column(name = "create_date", nullable = false)
    private Date createDate;
    @Column(name = "update_date", nullable = false)
    private Date updateDate;

}
