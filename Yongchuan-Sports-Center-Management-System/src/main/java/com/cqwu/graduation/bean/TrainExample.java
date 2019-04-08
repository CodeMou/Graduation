package com.cqwu.graduation.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNull() {
            addCriterion("teacher is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNotNull() {
            addCriterion("teacher is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEqualTo(String value) {
            addCriterion("teacher =", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotEqualTo(String value) {
            addCriterion("teacher <>", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThan(String value) {
            addCriterion("teacher >", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("teacher >=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThan(String value) {
            addCriterion("teacher <", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThanOrEqualTo(String value) {
            addCriterion("teacher <=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLike(String value) {
            addCriterion("teacher like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotLike(String value) {
            addCriterion("teacher not like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherIn(List<String> values) {
            addCriterion("teacher in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotIn(List<String> values) {
            addCriterion("teacher not in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherBetween(String value1, String value2) {
            addCriterion("teacher between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotBetween(String value1, String value2) {
            addCriterion("teacher not between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andSurplusIsNull() {
            addCriterion("surplus is null");
            return (Criteria) this;
        }

        public Criteria andSurplusIsNotNull() {
            addCriterion("surplus is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusEqualTo(Integer value) {
            addCriterion("surplus =", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotEqualTo(Integer value) {
            addCriterion("surplus <>", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusGreaterThan(Integer value) {
            addCriterion("surplus >", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusGreaterThanOrEqualTo(Integer value) {
            addCriterion("surplus >=", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusLessThan(Integer value) {
            addCriterion("surplus <", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusLessThanOrEqualTo(Integer value) {
            addCriterion("surplus <=", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusIn(List<Integer> values) {
            addCriterion("surplus in", values, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotIn(List<Integer> values) {
            addCriterion("surplus not in", values, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusBetween(Integer value1, Integer value2) {
            addCriterion("surplus between", value1, value2, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotBetween(Integer value1, Integer value2) {
            addCriterion("surplus not between", value1, value2, "surplus");
            return (Criteria) this;
        }

        public Criteria andQuotaIsNull() {
            addCriterion("quota is null");
            return (Criteria) this;
        }

        public Criteria andQuotaIsNotNull() {
            addCriterion("quota is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaEqualTo(Integer value) {
            addCriterion("quota =", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotEqualTo(Integer value) {
            addCriterion("quota <>", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaGreaterThan(Integer value) {
            addCriterion("quota >", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaGreaterThanOrEqualTo(Integer value) {
            addCriterion("quota >=", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLessThan(Integer value) {
            addCriterion("quota <", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLessThanOrEqualTo(Integer value) {
            addCriterion("quota <=", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaIn(List<Integer> values) {
            addCriterion("quota in", values, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotIn(List<Integer> values) {
            addCriterion("quota not in", values, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaBetween(Integer value1, Integer value2) {
            addCriterion("quota between", value1, value2, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotBetween(Integer value1, Integer value2) {
            addCriterion("quota not between", value1, value2, "quota");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTotalHoursIsNull() {
            addCriterion("total_hours is null");
            return (Criteria) this;
        }

        public Criteria andTotalHoursIsNotNull() {
            addCriterion("total_hours is not null");
            return (Criteria) this;
        }

        public Criteria andTotalHoursEqualTo(Integer value) {
            addCriterion("total_hours =", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursNotEqualTo(Integer value) {
            addCriterion("total_hours <>", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursGreaterThan(Integer value) {
            addCriterion("total_hours >", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_hours >=", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursLessThan(Integer value) {
            addCriterion("total_hours <", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursLessThanOrEqualTo(Integer value) {
            addCriterion("total_hours <=", value, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursIn(List<Integer> values) {
            addCriterion("total_hours in", values, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursNotIn(List<Integer> values) {
            addCriterion("total_hours not in", values, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursBetween(Integer value1, Integer value2) {
            addCriterion("total_hours between", value1, value2, "totalHours");
            return (Criteria) this;
        }

        public Criteria andTotalHoursNotBetween(Integer value1, Integer value2) {
            addCriterion("total_hours not between", value1, value2, "totalHours");
            return (Criteria) this;
        }

        public Criteria andHoursIsNull() {
            addCriterion("hours is null");
            return (Criteria) this;
        }

        public Criteria andHoursIsNotNull() {
            addCriterion("hours is not null");
            return (Criteria) this;
        }

        public Criteria andHoursEqualTo(Integer value) {
            addCriterion("hours =", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotEqualTo(Integer value) {
            addCriterion("hours <>", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThan(Integer value) {
            addCriterion("hours >", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("hours >=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThan(Integer value) {
            addCriterion("hours <", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThanOrEqualTo(Integer value) {
            addCriterion("hours <=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursIn(List<Integer> values) {
            addCriterion("hours in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotIn(List<Integer> values) {
            addCriterion("hours not in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursBetween(Integer value1, Integer value2) {
            addCriterion("hours between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotBetween(Integer value1, Integer value2) {
            addCriterion("hours not between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andEverydayHoursIsNull() {
            addCriterion("everyday_hours is null");
            return (Criteria) this;
        }

        public Criteria andEverydayHoursIsNotNull() {
            addCriterion("everyday_hours is not null");
            return (Criteria) this;
        }

        public Criteria andEverydayHoursEqualTo(Integer value) {
            addCriterion("everyday_hours =", value, "everydayHours");
            return (Criteria) this;
        }

        public Criteria andEverydayHoursNotEqualTo(Integer value) {
            addCriterion("everyday_hours <>", value, "everydayHours");
            return (Criteria) this;
        }

        public Criteria andEverydayHoursGreaterThan(Integer value) {
            addCriterion("everyday_hours >", value, "everydayHours");
            return (Criteria) this;
        }

        public Criteria andEverydayHoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("everyday_hours >=", value, "everydayHours");
            return (Criteria) this;
        }

        public Criteria andEverydayHoursLessThan(Integer value) {
            addCriterion("everyday_hours <", value, "everydayHours");
            return (Criteria) this;
        }

        public Criteria andEverydayHoursLessThanOrEqualTo(Integer value) {
            addCriterion("everyday_hours <=", value, "everydayHours");
            return (Criteria) this;
        }

        public Criteria andEverydayHoursIn(List<Integer> values) {
            addCriterion("everyday_hours in", values, "everydayHours");
            return (Criteria) this;
        }

        public Criteria andEverydayHoursNotIn(List<Integer> values) {
            addCriterion("everyday_hours not in", values, "everydayHours");
            return (Criteria) this;
        }

        public Criteria andEverydayHoursBetween(Integer value1, Integer value2) {
            addCriterion("everyday_hours between", value1, value2, "everydayHours");
            return (Criteria) this;
        }

        public Criteria andEverydayHoursNotBetween(Integer value1, Integer value2) {
            addCriterion("everyday_hours not between", value1, value2, "everydayHours");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIsNull() {
            addCriterion("raw_add_time is null");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIsNotNull() {
            addCriterion("raw_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeEqualTo(Date value) {
            addCriterion("raw_add_time =", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotEqualTo(Date value) {
            addCriterion("raw_add_time <>", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeGreaterThan(Date value) {
            addCriterion("raw_add_time >", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raw_add_time >=", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeLessThan(Date value) {
            addCriterion("raw_add_time <", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("raw_add_time <=", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIn(List<Date> values) {
            addCriterion("raw_add_time in", values, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotIn(List<Date> values) {
            addCriterion("raw_add_time not in", values, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeBetween(Date value1, Date value2) {
            addCriterion("raw_add_time between", value1, value2, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("raw_add_time not between", value1, value2, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIsNull() {
            addCriterion("raw_update_time is null");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIsNotNull() {
            addCriterion("raw_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeEqualTo(Date value) {
            addCriterion("raw_update_time =", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotEqualTo(Date value) {
            addCriterion("raw_update_time <>", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeGreaterThan(Date value) {
            addCriterion("raw_update_time >", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raw_update_time >=", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeLessThan(Date value) {
            addCriterion("raw_update_time <", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("raw_update_time <=", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIn(List<Date> values) {
            addCriterion("raw_update_time in", values, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotIn(List<Date> values) {
            addCriterion("raw_update_time not in", values, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("raw_update_time between", value1, value2, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("raw_update_time not between", value1, value2, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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