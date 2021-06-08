package top.faroz.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTeamidIsNull() {
            addCriterion("teamId is null");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNotNull() {
            addCriterion("teamId is not null");
            return (Criteria) this;
        }

        public Criteria andTeamidEqualTo(Integer value) {
            addCriterion("teamId =", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotEqualTo(Integer value) {
            addCriterion("teamId <>", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThan(Integer value) {
            addCriterion("teamId >", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("teamId >=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThan(Integer value) {
            addCriterion("teamId <", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThanOrEqualTo(Integer value) {
            addCriterion("teamId <=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidIn(List<Integer> values) {
            addCriterion("teamId in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotIn(List<Integer> values) {
            addCriterion("teamId not in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidBetween(Integer value1, Integer value2) {
            addCriterion("teamId between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotBetween(Integer value1, Integer value2) {
            addCriterion("teamId not between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamnameIsNull() {
            addCriterion("teamName is null");
            return (Criteria) this;
        }

        public Criteria andTeamnameIsNotNull() {
            addCriterion("teamName is not null");
            return (Criteria) this;
        }

        public Criteria andTeamnameEqualTo(String value) {
            addCriterion("teamName =", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotEqualTo(String value) {
            addCriterion("teamName <>", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThan(String value) {
            addCriterion("teamName >", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThanOrEqualTo(String value) {
            addCriterion("teamName >=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThan(String value) {
            addCriterion("teamName <", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThanOrEqualTo(String value) {
            addCriterion("teamName <=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLike(String value) {
            addCriterion("teamName like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotLike(String value) {
            addCriterion("teamName not like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameIn(List<String> values) {
            addCriterion("teamName in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotIn(List<String> values) {
            addCriterion("teamName not in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameBetween(String value1, String value2) {
            addCriterion("teamName between", value1, value2, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotBetween(String value1, String value2) {
            addCriterion("teamName not between", value1, value2, "teamname");
            return (Criteria) this;
        }

        public Criteria andChinesenameIsNull() {
            addCriterion("chineseName is null");
            return (Criteria) this;
        }

        public Criteria andChinesenameIsNotNull() {
            addCriterion("chineseName is not null");
            return (Criteria) this;
        }

        public Criteria andChinesenameEqualTo(String value) {
            addCriterion("chineseName =", value, "chinesename");
            return (Criteria) this;
        }

        public Criteria andChinesenameNotEqualTo(String value) {
            addCriterion("chineseName <>", value, "chinesename");
            return (Criteria) this;
        }

        public Criteria andChinesenameGreaterThan(String value) {
            addCriterion("chineseName >", value, "chinesename");
            return (Criteria) this;
        }

        public Criteria andChinesenameGreaterThanOrEqualTo(String value) {
            addCriterion("chineseName >=", value, "chinesename");
            return (Criteria) this;
        }

        public Criteria andChinesenameLessThan(String value) {
            addCriterion("chineseName <", value, "chinesename");
            return (Criteria) this;
        }

        public Criteria andChinesenameLessThanOrEqualTo(String value) {
            addCriterion("chineseName <=", value, "chinesename");
            return (Criteria) this;
        }

        public Criteria andChinesenameLike(String value) {
            addCriterion("chineseName like", value, "chinesename");
            return (Criteria) this;
        }

        public Criteria andChinesenameNotLike(String value) {
            addCriterion("chineseName not like", value, "chinesename");
            return (Criteria) this;
        }

        public Criteria andChinesenameIn(List<String> values) {
            addCriterion("chineseName in", values, "chinesename");
            return (Criteria) this;
        }

        public Criteria andChinesenameNotIn(List<String> values) {
            addCriterion("chineseName not in", values, "chinesename");
            return (Criteria) this;
        }

        public Criteria andChinesenameBetween(String value1, String value2) {
            addCriterion("chineseName between", value1, value2, "chinesename");
            return (Criteria) this;
        }

        public Criteria andChinesenameNotBetween(String value1, String value2) {
            addCriterion("chineseName not between", value1, value2, "chinesename");
            return (Criteria) this;
        }

        public Criteria andCoachIsNull() {
            addCriterion("coach is null");
            return (Criteria) this;
        }

        public Criteria andCoachIsNotNull() {
            addCriterion("coach is not null");
            return (Criteria) this;
        }

        public Criteria andCoachEqualTo(String value) {
            addCriterion("coach =", value, "coach");
            return (Criteria) this;
        }

        public Criteria andCoachNotEqualTo(String value) {
            addCriterion("coach <>", value, "coach");
            return (Criteria) this;
        }

        public Criteria andCoachGreaterThan(String value) {
            addCriterion("coach >", value, "coach");
            return (Criteria) this;
        }

        public Criteria andCoachGreaterThanOrEqualTo(String value) {
            addCriterion("coach >=", value, "coach");
            return (Criteria) this;
        }

        public Criteria andCoachLessThan(String value) {
            addCriterion("coach <", value, "coach");
            return (Criteria) this;
        }

        public Criteria andCoachLessThanOrEqualTo(String value) {
            addCriterion("coach <=", value, "coach");
            return (Criteria) this;
        }

        public Criteria andCoachLike(String value) {
            addCriterion("coach like", value, "coach");
            return (Criteria) this;
        }

        public Criteria andCoachNotLike(String value) {
            addCriterion("coach not like", value, "coach");
            return (Criteria) this;
        }

        public Criteria andCoachIn(List<String> values) {
            addCriterion("coach in", values, "coach");
            return (Criteria) this;
        }

        public Criteria andCoachNotIn(List<String> values) {
            addCriterion("coach not in", values, "coach");
            return (Criteria) this;
        }

        public Criteria andCoachBetween(String value1, String value2) {
            addCriterion("coach between", value1, value2, "coach");
            return (Criteria) this;
        }

        public Criteria andCoachNotBetween(String value1, String value2) {
            addCriterion("coach not between", value1, value2, "coach");
            return (Criteria) this;
        }

        public Criteria andStadiumIsNull() {
            addCriterion("stadium is null");
            return (Criteria) this;
        }

        public Criteria andStadiumIsNotNull() {
            addCriterion("stadium is not null");
            return (Criteria) this;
        }

        public Criteria andStadiumEqualTo(String value) {
            addCriterion("stadium =", value, "stadium");
            return (Criteria) this;
        }

        public Criteria andStadiumNotEqualTo(String value) {
            addCriterion("stadium <>", value, "stadium");
            return (Criteria) this;
        }

        public Criteria andStadiumGreaterThan(String value) {
            addCriterion("stadium >", value, "stadium");
            return (Criteria) this;
        }

        public Criteria andStadiumGreaterThanOrEqualTo(String value) {
            addCriterion("stadium >=", value, "stadium");
            return (Criteria) this;
        }

        public Criteria andStadiumLessThan(String value) {
            addCriterion("stadium <", value, "stadium");
            return (Criteria) this;
        }

        public Criteria andStadiumLessThanOrEqualTo(String value) {
            addCriterion("stadium <=", value, "stadium");
            return (Criteria) this;
        }

        public Criteria andStadiumLike(String value) {
            addCriterion("stadium like", value, "stadium");
            return (Criteria) this;
        }

        public Criteria andStadiumNotLike(String value) {
            addCriterion("stadium not like", value, "stadium");
            return (Criteria) this;
        }

        public Criteria andStadiumIn(List<String> values) {
            addCriterion("stadium in", values, "stadium");
            return (Criteria) this;
        }

        public Criteria andStadiumNotIn(List<String> values) {
            addCriterion("stadium not in", values, "stadium");
            return (Criteria) this;
        }

        public Criteria andStadiumBetween(String value1, String value2) {
            addCriterion("stadium between", value1, value2, "stadium");
            return (Criteria) this;
        }

        public Criteria andStadiumNotBetween(String value1, String value2) {
            addCriterion("stadium not between", value1, value2, "stadium");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andTeamlogoIsNull() {
            addCriterion("teamLogo is null");
            return (Criteria) this;
        }

        public Criteria andTeamlogoIsNotNull() {
            addCriterion("teamLogo is not null");
            return (Criteria) this;
        }

        public Criteria andTeamlogoEqualTo(String value) {
            addCriterion("teamLogo =", value, "teamlogo");
            return (Criteria) this;
        }

        public Criteria andTeamlogoNotEqualTo(String value) {
            addCriterion("teamLogo <>", value, "teamlogo");
            return (Criteria) this;
        }

        public Criteria andTeamlogoGreaterThan(String value) {
            addCriterion("teamLogo >", value, "teamlogo");
            return (Criteria) this;
        }

        public Criteria andTeamlogoGreaterThanOrEqualTo(String value) {
            addCriterion("teamLogo >=", value, "teamlogo");
            return (Criteria) this;
        }

        public Criteria andTeamlogoLessThan(String value) {
            addCriterion("teamLogo <", value, "teamlogo");
            return (Criteria) this;
        }

        public Criteria andTeamlogoLessThanOrEqualTo(String value) {
            addCriterion("teamLogo <=", value, "teamlogo");
            return (Criteria) this;
        }

        public Criteria andTeamlogoLike(String value) {
            addCriterion("teamLogo like", value, "teamlogo");
            return (Criteria) this;
        }

        public Criteria andTeamlogoNotLike(String value) {
            addCriterion("teamLogo not like", value, "teamlogo");
            return (Criteria) this;
        }

        public Criteria andTeamlogoIn(List<String> values) {
            addCriterion("teamLogo in", values, "teamlogo");
            return (Criteria) this;
        }

        public Criteria andTeamlogoNotIn(List<String> values) {
            addCriterion("teamLogo not in", values, "teamlogo");
            return (Criteria) this;
        }

        public Criteria andTeamlogoBetween(String value1, String value2) {
            addCriterion("teamLogo between", value1, value2, "teamlogo");
            return (Criteria) this;
        }

        public Criteria andTeamlogoNotBetween(String value1, String value2) {
            addCriterion("teamLogo not between", value1, value2, "teamlogo");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("isDel is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("isDel is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(Integer value) {
            addCriterion("isDel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(Integer value) {
            addCriterion("isDel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(Integer value) {
            addCriterion("isDel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(Integer value) {
            addCriterion("isDel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(Integer value) {
            addCriterion("isDel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<Integer> values) {
            addCriterion("isDel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<Integer> values) {
            addCriterion("isDel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(Integer value1, Integer value2) {
            addCriterion("isDel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(Integer value1, Integer value2) {
            addCriterion("isDel not between", value1, value2, "isdel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}