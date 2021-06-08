package top.faroz.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CommonResp
 * @Description 通用返回值
 * @Author FARO_Z
 * @Date 2021/6/8 下午7:29
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResp<T> {
    private String message;
    private boolean success = true;
    private T content;
}
