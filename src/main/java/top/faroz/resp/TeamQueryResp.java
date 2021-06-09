package top.faroz.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName TeamQueryResp
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/8 下午8:15
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeamQueryResp {
    private Integer teamid;

    private String teamname;

    private String chinesename;

    private String coach;

    private String stadium;

    private String location;

    private Date createtime;

    private String teamlogo;

    private Integer area;

    private Integer isdel;


}
