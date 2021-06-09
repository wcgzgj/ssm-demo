package top.faroz.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName PageResp
 * @Description 分页返回值
 *          返回的内容包括：页码，每页条数，总条数，和查出的所有数据
 * @Author FARO_Z
 * @Date 2021/6/9 上午11:56
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PageResp<T> {
    private int pageNum;
    private int pageSize;
    private int total;
    private List<T> list;
}
