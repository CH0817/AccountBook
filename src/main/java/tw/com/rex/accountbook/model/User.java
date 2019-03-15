package tw.com.rex.accountbook.model;

import lombok.*;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor(staticName = "of")
public class User {

    private Long id;
    @NonNull
    private String email;
    @NonNull
    private String password;

}
