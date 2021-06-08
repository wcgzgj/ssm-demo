package top.faroz.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName PageReq
 * @Description 分页查询父类
 * @Author FARO_Z
 * @Date 2021/6/8 下午8:15
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PageReq {
    private Integer pageNum;
    private Integer pageSize;
}
