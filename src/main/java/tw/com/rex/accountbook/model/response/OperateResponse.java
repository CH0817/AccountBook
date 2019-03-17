package tw.com.rex.accountbook.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperateResponse<T> {

    private T object;
    private List<String> messages;
    private boolean operateResult;

}
