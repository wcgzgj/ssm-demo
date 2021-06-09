package top.faroz.req;

import java.util.Date;

/**
 * @ClassName TeamQueryReq
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/8 下午8:14
 * @Version 1.0
 **/

public class TeamQueryReq extends PageReq {
    /**
     * <h2>NBA球队列表</h2>
     * 			<div class="searchDiv">
     * 				<button class="btn btn-danger">批量删除</button>
     * 				<a href="/pages/team/add.html" class="btn btn-success">添加</a>
     * 				球队名称:<input name="teamName" placeholder="英文名称"/>
     * 				中文名称:<input name="chineseName" placeholder="中文名称"/>
     * 				教练:<input name="coach" placeholder="教练姓名"/>
     * 				创建时间:<input name="beginDate" type="date"/>-<input name="endDate" type="date"/>
     * 				所属联盟:<select name="area">
     * 					<option value="-1">请选择联盟</option>
     * 					<option value="0">东部联盟</option>
     * 					<option value="1">西部联盟</option>
     * 				</select>
     * 				<button type="button" onclick="loadData()" class="btn btn-info">查询</button>
     * 				<button type="reset" class="btn btn-warning">重置</button>
     * 			</div>
     */

    private Integer teamid;

    private String teamName;

    private String chineseName;

    private String coach;

    private Date beginDate;

    private Date endDate;

    // 所属联盟
    private Integer area;

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "TeamQueryReq{" +
                "teamid=" + teamid +
                ", teamName='" + teamName + '\'' +
                ", chineseName='" + chineseName + '\'' +
                ", coach='" + coach + '\'' +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", area=" + area +
                "} " + super.toString();
    }
}
