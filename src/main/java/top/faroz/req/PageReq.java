package top.faroz.req;

/**
 * @ClassName PageReq
 * @Description 分页查询父类
 * @Author FARO_Z
 * @Date 2021/6/8 下午8:15
 * @Version 1.0
 **/
public class PageReq {
    private Integer pageNum;
    private Integer pageSize;

    public PageReq(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public PageReq() {
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "PageReq{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}
